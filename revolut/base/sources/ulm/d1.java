package ulm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class d1 {
    public static void a(String key, StringBuilder sb6) {
        Intrinsics.checkNotNullParameter(sb6, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        int length = key.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = key.charAt(i);
            if (cCharAt == '\n') {
                sb6.append("%0A");
            } else if (cCharAt == '\r') {
                sb6.append("%0D");
            } else if (cCharAt != '\"') {
                sb6.append(cCharAt);
            } else {
                sb6.append("%22");
            }
        }
        sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
    }
}
