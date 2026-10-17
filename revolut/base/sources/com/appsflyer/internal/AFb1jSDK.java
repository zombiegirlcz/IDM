package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1jSDK {
    private static String values;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static String AFInAppEventType(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        ?? r110 = 0;
        byte[] bArr2 = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (IOException e) {
            e = e;
            bArr = null;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
                r110 = bArr2;
            } catch (IOException e2) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e2);
                r110 = bArr2;
            }
        } catch (IOException e4) {
            e = e4;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e5) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
                }
            }
            r110 = bArr;
        } catch (Throwable th11) {
            th = th11;
            r110 = randomAccessFile;
            if (r110 != 0) {
                try {
                    r110.close();
                } catch (IOException e6) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e6);
                }
            }
            throw th;
        }
        ?? r111 = r110;
        if (r110 == 0) {
            r111 = new byte[0];
        }
        return new String((byte[]) r111, Charset.defaultCharset());
    }

    public static synchronized String AFInAppEventType(AFd1nSDK aFd1nSDK, AFd1pSDK aFd1pSDK) {
        if (aFd1nSDK.AFKeystoreWrapper == null) {
            return values;
        }
        if (values == null) {
            String strAFKeystoreWrapper = aFd1pSDK.AFKeystoreWrapper("AF_INSTALLATION", (String) null);
            if (strAFKeystoreWrapper != null) {
                values = strAFKeystoreWrapper;
            } else {
                try {
                    File file = new File(aFd1nSDK.AFKeystoreWrapper.getFilesDir(), "AF_INSTALLATION");
                    if (!file.exists()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(jCurrentTimeMillis);
                        sb6.append("-");
                        sb6.append(Math.abs(new SecureRandom().nextLong()));
                        values = sb6.toString();
                    } else {
                        values = AFInAppEventType(file);
                        file.delete();
                    }
                    aFd1pSDK.AFInAppEventParameterName("AF_INSTALLATION", values);
                } catch (Exception e) {
                    AFLogger.afErrorLog("Error getting AF unique ID", e);
                }
            }
            if (values != null) {
                AppsFlyerProperties.getInstance().set("uid", values);
            }
        }
        return values;
    }
}
