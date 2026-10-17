package gyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    @NotNull
    public static final a Companion = new a();

    static {
        Intrinsics.checkNotNullParameter("account-statements", "value");
        Intrinsics.checkNotNullParameter("pnl", "value");
        Intrinsics.checkNotNullParameter("proofs", "value");
        Intrinsics.checkNotNullParameter("statement-of-fees", "value");
    }
}
