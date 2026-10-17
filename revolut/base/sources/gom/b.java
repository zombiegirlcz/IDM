package gom;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b extends d {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final int MAX_TAG_LENGTH = 23;

    @NotNull
    private final List<String> fqcnIgnore = v.k(e.class.getName(), c.class.getName(), d.class.getName(), b.class.getName());

    @NotNull
    public static final a Companion = new a();
    private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

    public String createStackElementTag(StackTraceElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        String strW0 = d0.w0(CoreConstants.DOT, className, className);
        Matcher matcher = ANONYMOUS_CLASS.matcher(strW0);
        if (matcher.find()) {
            strW0 = matcher.replaceAll("");
            Intrinsics.checkNotNullExpressionValue(strW0, "m.replaceAll(\"\")");
        }
        strW0.getClass();
        return strW0;
    }

    @Override // gom.d
    public String getTag$timber_release() {
        String tag$timber_release = super.getTag$timber_release();
        if (tag$timber_release != null) {
            return tag$timber_release;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                return createStackElementTag(stackTraceElement);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // gom.d
    public void log(int i, String str, @NotNull String message, Throwable th10) {
        int iMin;
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() < MAX_LOG_LENGTH) {
            if (i == 7) {
                return;
            } else {
                return;
            }
        }
        int length = message.length();
        int i2 = 0;
        while (i2 < length) {
            int iS = d0.S(message, '\n', i2, 4);
            if (iS == -1) {
                iS = length;
            }
            while (true) {
                iMin = Math.min(iS, i2 + MAX_LOG_LENGTH);
                Intrinsics.checkNotNullExpressionValue(message.substring(i2, iMin), "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (i == 7) {
                }
                if (iMin >= iS) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }
}
