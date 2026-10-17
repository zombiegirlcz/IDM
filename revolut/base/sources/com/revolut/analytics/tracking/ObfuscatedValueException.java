package com.revolut.analytics.tracking;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00060\u0001j\u0002`\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/analytics/tracking/ObfuscatedValueException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "a", "analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ObfuscatedValueException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f50295a;

    /* JADX INFO: renamed from: com.revolut.analytics.tracking.ObfuscatedValueException$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static boolean a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            int length = value.length();
            return length == 1 || (2 <= length && length < 4 && !ObfuscatedValueException.f50295a.contains(value)) || (4 <= length && length < 6 && d0.K(value, CoreConstants.DOT));
        }
    }

    static {
        String[] elements = {"add", "buy", "do", "eye", "go", "me", "my", "no", "ok", "on", "pdf", "pix", "qr", "row", "tab", "to", "up", "yes"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f50295a = d.y0(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObfuscatedValueException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
