package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1qSDK {
    String AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    private byte[] valueOf;
    public AFf1ySDK values;

    public AFb1qSDK(String str, byte[] bArr, String str2, AFf1ySDK aFf1ySDK) {
        this.AFKeystoreWrapper = str;
        this.valueOf = bArr;
        this.AFInAppEventParameterName = str2;
        this.values = aFf1ySDK;
    }

    public final byte[] AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && AFb1qSDK.class == obj2.getClass()) {
            AFb1qSDK aFb1qSDK = (AFb1qSDK) obj2;
            String str = this.AFInAppEventParameterName;
            if (str == null ? aFb1qSDK.AFInAppEventParameterName != null : !str.equals(aFb1qSDK.AFInAppEventParameterName)) {
                return false;
            }
            if (!Arrays.equals(this.valueOf, aFb1qSDK.valueOf)) {
                return false;
            }
            String str2 = this.AFKeystoreWrapper;
            if (str2 == null ? aFb1qSDK.AFKeystoreWrapper != null : !str2.equals(aFb1qSDK.AFKeystoreWrapper)) {
                return false;
            }
            String str3 = this.AFInAppEventType;
            if (str3 == null ? aFb1qSDK.AFInAppEventType != null : !str3.equals(aFb1qSDK.AFInAppEventType)) {
                return false;
            }
            if (this.values == aFb1qSDK.values) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFInAppEventParameterName;
        int iB = ehe.n.b((str != null ? str.hashCode() : 0) * 31, 31, this.valueOf);
        String str2 = this.AFKeystoreWrapper;
        int iHashCode = (iB + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFInAppEventType;
        int iHashCode2 = (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFf1ySDK aFf1ySDK = this.values;
        return iHashCode2 + (aFf1ySDK != null ? aFf1ySDK.hashCode() : 0);
    }

    public AFb1qSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String strNextLine = scanner.nextLine();
            if (strNextLine.startsWith("url=")) {
                this.AFKeystoreWrapper = strNextLine.substring(4).trim();
            } else if (strNextLine.startsWith("version=")) {
                this.AFInAppEventParameterName = strNextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFInAppEventParameterName);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (strNextLine.startsWith("data=")) {
                String strTrim = strNextLine.substring(5).trim();
                this.valueOf = (i > 4 || i2 >= 11) ? Base64.decode(strTrim, 2) : strTrim.getBytes(Charset.defaultCharset());
            } else if (strNextLine.startsWith("type=")) {
                String strTrim2 = strNextLine.substring(5).trim();
                try {
                    this.values = AFf1ySDK.valueOf(strTrim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(strTrim2)), e);
                }
            }
        }
        scanner.close();
    }
}
