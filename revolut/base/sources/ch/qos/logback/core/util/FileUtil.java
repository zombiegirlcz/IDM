package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil extends ContextAwareBase {
    static final int BUF_SIZE = 32768;

    public FileUtil(Context context) {
        setContext(context);
    }

    public static boolean createMissingParentDirectories(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return true;
        }
        parentFile.mkdirs();
        return parentFile.exists();
    }

    public static URL fileToURL(File file) {
        try {
            return file.toURI().toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException("Unexpected exception on file [" + file + "]", e);
        }
    }

    public static String prefixRelativePath(String str, String str2) {
        return (str == null || OptionHelper.isEmpty(str.trim()) || new File(str2).isAbsolute()) ? str2 : com.google.android.gms.internal.mlkit_vision_face.a.o(str, "/", str2);
    }

    public void copy(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        IOException e;
        BufferedInputStream bufferedInputStream;
        IOException iOException;
        byte[] bArr;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    try {
                        bArr = new byte[32768];
                    } catch (IOException e2) {
                        e = e2;
                        String str3 = "Failed to copy [" + str + "] to [" + str2 + "]";
                        addError(str3, e);
                        throw new RolloverFailure(str3);
                    }
                } catch (Throwable th10) {
                    th = th10;
                    bufferedInputStream2 = bufferedInputStream;
                }
            } catch (IOException e4) {
                iOException = e4;
                bufferedOutputStream = null;
            } catch (Throwable th11) {
                th = th11;
                bufferedOutputStream = null;
                bufferedInputStream2 = bufferedInputStream;
            }
        } catch (IOException e5) {
            bufferedOutputStream = null;
            e = e5;
            bufferedInputStream = null;
        } catch (Throwable th12) {
            th = th12;
            bufferedOutputStream = null;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i != -1) {
                bufferedOutputStream.write(bArr, 0, i);
            } else {
                bufferedInputStream.close();
                try {
                    bufferedOutputStream.close();
                    return;
                } catch (IOException e6) {
                    iOException = e6;
                    bufferedInputStream = null;
                    e = iOException;
                    String str32 = "Failed to copy [" + str + "] to [" + str2 + "]";
                    addError(str32, e);
                    throw new RolloverFailure(str32);
                } catch (Throwable th13) {
                    th = th13;
                }
            }
            th = th10;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused) {
                }
            }
            if (bufferedOutputStream == null) {
                throw th;
            }
            try {
                bufferedOutputStream.close();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }
}
