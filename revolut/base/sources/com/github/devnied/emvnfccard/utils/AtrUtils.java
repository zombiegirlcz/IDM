package com.github.devnied.emvnfccard.utils;

import com.revolut.ProtectedRevolutApplication;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import omm.b;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import smm.f;
import tmm.c;
import ymm.g;

/* JADX INFO: loaded from: classes16.dex */
public final class AtrUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) AtrUtils.class);
    private static final b MAP = new f();

    static {
        InputStream inputStreamA;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        String strReplaceAll = null;
        bufferedReader2 = null;
        bufferedReader2 = null;
        InputStream inputStream = null;
        try {
            inputStreamA = ProtectedRevolutApplication.a(AtrUtils.class, "/smartcard_list.txt");
            try {
                inputStreamReader = new InputStreamReader(inputStreamA, "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    int i = 0;
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                c.a(bufferedReader);
                                c.a(inputStreamReader);
                                c.a(inputStreamA);
                                return;
                            }
                            i++;
                            if (!line.startsWith("#") && line.trim().length() != 0 && !line.contains("http")) {
                                if (line.startsWith("\t") && strReplaceAll != null) {
                                    ((smm.c) MAP).a(strReplaceAll, line.replace("\t", "").trim());
                                } else if (line.startsWith("3")) {
                                    strReplaceAll = g.a(line.toUpperCase()).replaceAll("9000$", "");
                                } else {
                                    LOGGER.error("Encountered unexpected line in atr list: currentATR=" + strReplaceAll + " Line(" + i + ") = " + line);
                                }
                            }
                        } catch (IOException e) {
                            e = e;
                            inputStream = inputStreamA;
                            try {
                                throw new RuntimeException(e);
                            } catch (Throwable th10) {
                                th = th10;
                                inputStreamA = inputStream;
                                bufferedReader2 = bufferedReader;
                                c.a(bufferedReader2);
                                c.a(inputStreamReader);
                                c.a(inputStreamA);
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            bufferedReader2 = bufferedReader;
                            c.a(bufferedReader2);
                            c.a(inputStreamReader);
                            c.a(inputStreamA);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = null;
                } catch (Throwable th12) {
                    th = th12;
                    c.a(bufferedReader2);
                    c.a(inputStreamReader);
                    c.a(inputStreamA);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                inputStreamReader = null;
                bufferedReader = null;
            } catch (Throwable th13) {
                th = th13;
                inputStreamReader = null;
            }
        } catch (IOException e5) {
            e = e5;
            inputStreamReader = null;
            bufferedReader = null;
        } catch (Throwable th14) {
            th = th14;
            inputStreamA = null;
            inputStreamReader = null;
        }
    }

    private AtrUtils() {
    }

    public static final Collection<String> getDescription(String str) {
        if (g.c(str)) {
            return null;
        }
        String upperCase = g.a(str).toUpperCase();
        for (String str2 : ((smm.c) MAP).f264461b.keySet()) {
            if (upperCase.matches("^" + str2 + "$")) {
                smm.c cVar = (smm.c) MAP;
                cVar.getClass();
                return new smm.b(cVar, str2);
            }
        }
        return null;
    }

    public static final Collection<String> getDescriptionFromAts(String str) {
        ArrayList arrayList = new ArrayList();
        if (!g.c(str)) {
            String strReplaceAll = g.a(str).replaceAll("9000$", "");
            for (String str2 : ((smm.c) MAP).f264461b.keySet()) {
                int length = strReplaceAll.length() - 1;
                int length2 = str2.length() - 1;
                while (true) {
                    if (length2 < 0) {
                        break;
                    }
                    if (str2.charAt(length2) == '.' || str2.charAt(length2) == strReplaceAll.charAt(length)) {
                        length--;
                        length2--;
                        if (length < 0) {
                            if (!str2.substring(str2.length() - strReplaceAll.length(), str2.length()).replace(".", "").isEmpty()) {
                                smm.c cVar = (smm.c) MAP;
                                cVar.getClass();
                                arrayList.addAll(new smm.b(cVar, str2));
                            }
                        }
                    } else if (length != strReplaceAll.length() - 1) {
                        length = strReplaceAll.length() - 1;
                    } else {
                        if (length2 == str2.length() - 1) {
                            break;
                        }
                        length2--;
                    }
                }
            }
        }
        return arrayList;
    }
}
