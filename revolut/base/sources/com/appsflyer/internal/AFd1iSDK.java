package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.internal.AFe1wSDK;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1iSDK implements AFd1hSDK {

    @NotNull
    private final AFd1nSDK AFKeystoreWrapper;

    public AFd1iSDK(@NotNull AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.AFKeystoreWrapper = aFd1nSDK;
    }

    private final File AFInAppEventParameterName() {
        Context context = this.AFKeystoreWrapper.AFKeystoreWrapper;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    @NotNull
    public final List<AFd1jSDK> AFInAppEventType() {
        List<AFd1jSDK> listU;
        File[] fileArrListFiles;
        ArrayList arrayList;
        File[] fileArrListFiles2;
        synchronized (this) {
            try {
                File fileAFInAppEventParameterName = AFInAppEventParameterName();
                listU = null;
                if (fileAFInAppEventParameterName != null && (fileArrListFiles = fileAFInAppEventParameterName.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            fileArrListFiles2 = file.listFiles();
                        } catch (Throwable th10) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1bSDK aFg1bSDK = AFg1bSDK.EXCEPTION_MANAGER;
                            StringBuilder sb6 = new StringBuilder("Could not get stored exceptions\n ");
                            sb6.append(th10.getMessage());
                            AFg1cSDK.v$default(aFLogger, aFg1bSDK, sb6.toString(), false, 4, null);
                        }
                        if (fileArrListFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                AFd1jSDK.Companion companion = AFd1jSDK.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                AFd1jSDK aFd1jSDKValues = AFd1jSDK.Companion.values(lim.m.f(file2, Charsets.UTF_8));
                                if (aFd1jSDKValues != null) {
                                    arrayList.add(aFd1jSDKValues);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listU = w.u(arrayList2);
                }
                if (listU == null) {
                    listU = f0.f322471a;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
        return listU;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean AFKeystoreWrapper() {
        return AFKeystoreWrapper(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final int valueOf() {
        Iterator<T> it8 = AFInAppEventType().iterator();
        int i = 0;
        while (it8.hasNext()) {
            i += ((AFd1jSDK) it8.next()).AFKeystoreWrapper;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean AFKeystoreWrapper(@NotNull String... strArr) {
        boolean zM;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File fileAFInAppEventParameterName = AFInAppEventParameterName();
                zM = true;
                if (fileAFInAppEventParameterName != null) {
                    if (strArr.length == 0) {
                        AFg1cSDK.v$default(AFLogger.INSTANCE, AFg1bSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zM = lim.o.m(fileAFInAppEventParameterName);
                    } else {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1bSDK aFg1bSDK = AFg1bSDK.EXCEPTION_MANAGER;
                        StringBuilder sb6 = new StringBuilder("delete all exceptions except for: ");
                        sb6.append(kotlin.collections.d.d0(strArr, ", ", null, null, null, 62));
                        AFg1cSDK.v$default(aFLogger, aFg1bSDK, sb6.toString(), false, 4, null);
                        File[] fileArrListFiles = fileAFInAppEventParameterName.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!kotlin.collections.d.I(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(lim.o.m(file2)));
                            }
                            Set setI1 = d0.i1(arrayList2);
                            if (setI1.isEmpty()) {
                                setI1 = y0.b(Boolean.TRUE);
                            }
                            Set set = setI1;
                            if (set.size() != 1 || !((Boolean) d0.a0(set)).booleanValue()) {
                                zM = false;
                            }
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zM;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void valueOf(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File fileAFInAppEventParameterName = AFInAppEventParameterName();
                if (fileAFInAppEventParameterName != null && (fileArrListFiles = fileAFInAppEventParameterName.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int iAFInAppEventParameterName = AFc1sSDK.AFInAppEventParameterName(name);
                        if (i > iAFInAppEventParameterName || iAFInAppEventParameterName > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(lim.o.m(file2)));
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final String AFInAppEventParameterName(@NotNull Throwable th10, @NotNull String str) {
        String str2;
        File file;
        AFd1jSDK aFd1jSDKValues;
        Intrinsics.checkNotNullParameter(th10, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File fileAFInAppEventParameterName = AFInAppEventParameterName();
            str2 = null;
            if (fileAFInAppEventParameterName != null) {
                file = new File(fileAFInAppEventParameterName, "6.14.2");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    Intrinsics.checkNotNullParameter(th10, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    StringBuilder sb6 = new StringBuilder();
                    Intrinsics.checkNotNullParameter(th10, "");
                    String name = th10.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    sb6.append(name);
                    sb6.append(": ");
                    sb6.append(str);
                    String string = sb6.toString();
                    Intrinsics.checkNotNullParameter(th10, "");
                    Intrinsics.checkNotNullParameter(th10, "");
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(th10);
                    sb9.append('\n');
                    sb9.append(d0.k0(AFe1wSDK.AFInAppEventParameterName(th10), "\n", null, null, 0, AFe1wSDK.AnonymousClass1.AFInAppEventParameterName, 30));
                    String string2 = sb9.toString();
                    Intrinsics.checkNotNullParameter(string2, "");
                    AFd1jSDK aFd1jSDK = new AFd1jSDK(string, AFe1ySDK.valueOf(string2, "SHA-256"), yhm.f.b(th10), 0, 8, null);
                    String str3 = aFd1jSDK.AFInAppEventParameterName;
                    File file2 = new File(file, str3);
                    if (file2.exists() && (aFd1jSDKValues = AFd1jSDK.Companion.values(lim.m.f(file2, Charsets.UTF_8))) != null) {
                        aFd1jSDKValues.AFKeystoreWrapper++;
                        aFd1jSDK = aFd1jSDKValues;
                    }
                    StringBuilder sb10 = new StringBuilder("label=");
                    String str4 = aFd1jSDK.valueOf;
                    Intrinsics.checkNotNullParameter(str4, "");
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = str4.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    sb10.append(Base64.encodeToString(bytes, 2));
                    sb10.append("\nhashName=");
                    String str5 = aFd1jSDK.AFInAppEventParameterName;
                    Intrinsics.checkNotNullParameter(str5, "");
                    byte[] bytes2 = str5.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    sb10.append(Base64.encodeToString(bytes2, 2));
                    sb10.append("\nstackTrace=");
                    String str6 = aFd1jSDK.values;
                    Intrinsics.checkNotNullParameter(str6, "");
                    byte[] bytes3 = str6.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "");
                    sb10.append(Base64.encodeToString(bytes3, 2));
                    sb10.append("\nc=");
                    sb10.append(aFd1jSDK.AFKeystoreWrapper);
                    lim.m.h(file2, sb10.toString(), Charsets.UTF_8);
                    str2 = str3;
                } catch (Exception e) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1bSDK aFg1bSDK = AFg1bSDK.EXCEPTION_MANAGER;
                    StringBuilder sb11 = new StringBuilder("Could not cache exception\n ");
                    sb11.append(e.getMessage());
                    AFg1cSDK.v$default(aFLogger, aFg1bSDK, sb11.toString(), false, 4, null);
                }
            }
        }
        return str2;
    }
}
