package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005*\f\b\u0000\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"", "obj", "", "name", "simpleIdentityToString", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class JvmActuals_jvmKt {
    @NotNull
    public static final String simpleIdentityToString(@NotNull Object obj2, String str) {
        if (str == null) {
            str = obj2.getClass().isAnonymousClass() ? obj2.getClass().getName() : obj2.getClass().getSimpleName();
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append('@');
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj2))}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        sb6.append(str2);
        return sb6.toString();
    }
}
