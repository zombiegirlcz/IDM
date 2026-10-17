package androidx.compose.runtime.retain.impl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "message", "", "throwIllegalStateException", "(Ljava/lang/String;)V", "runtime-retain"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PreconditionsKt {
    public static final void throwIllegalStateException(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
