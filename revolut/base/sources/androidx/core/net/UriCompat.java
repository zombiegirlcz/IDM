package androidx.core.net;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import v0.a;

/* JADX INFO: loaded from: classes15.dex */
public abstract class UriCompat {
    public static String toSafeString(Uri uri2) {
        String scheme = uri2.getScheme();
        String schemeSpecificPart = uri2.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb6 = new StringBuilder(64);
                sb6.append(scheme);
                sb6.append(CoreConstants.COLON_CHAR);
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char cCharAt = schemeSpecificPart.charAt(i);
                        if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                            sb6.append(cCharAt);
                        } else {
                            sb6.append('x');
                        }
                    }
                }
                return sb6.toString();
            }
            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb9 = new StringBuilder("//");
                sb9.append(uri2.getHost() != null ? uri2.getHost() : "");
                schemeSpecificPart = a.i(sb9, uri2.getPort() != -1 ? ":" + uri2.getPort() : "", "/...");
            }
        }
        StringBuilder sb10 = new StringBuilder(64);
        if (scheme != null) {
            sb10.append(scheme);
            sb10.append(CoreConstants.COLON_CHAR);
        }
        if (schemeSpecificPart != null) {
            sb10.append(schemeSpecificPart);
        }
        return sb10.toString();
    }
}
