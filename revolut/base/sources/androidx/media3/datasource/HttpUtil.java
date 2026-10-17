package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.util.Log;
import com.google.common.base.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class HttpUtil {
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String buildRangeRequestHeader(long j2, long j3) {
        if (j2 == 0 && j3 == -1) {
            return null;
        }
        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "bytes=", "-");
        if (j3 != -1) {
            sbV.append((j2 + j3) - 1);
        }
        return sbV.toString();
    }

    public static long getContentLength(String str, String str2) {
        long j2;
        if (TextUtils.isEmpty(str)) {
            j2 = -1;
        } else {
            try {
                j2 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.e("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j2 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j2;
        }
        Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
        if (!matcher.matches()) {
            return j2;
        }
        try {
            long j3 = (Long.parseLong((String) Preconditions.checkNotNull(matcher.group(2))) - Long.parseLong((String) Preconditions.checkNotNull(matcher.group(1)))) + 1;
            if (j2 < 0) {
                return j3;
            }
            if (j2 == j3) {
                return j2;
            }
            Log.w("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j2, j3);
        } catch (NumberFormatException unused2) {
            Log.e("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j2;
        }
    }

    public static long getDocumentSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) Preconditions.checkNotNull(matcher.group(1)));
        }
        return -1L;
    }
}
