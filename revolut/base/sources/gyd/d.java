package gyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147844a;

    static {
        Intrinsics.checkNotNullParameter("account-statements", "value");
        Intrinsics.checkNotNullParameter("pnl", "value");
        Intrinsics.checkNotNullParameter("proofs", "value");
        Intrinsics.checkNotNullParameter("statement-of-fees", "value");
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof d) {
            return Intrinsics.f(this.f147844a, ((d) obj2).f147844a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f147844a.hashCode();
    }

    public final String toString() {
        return this.f147844a;
    }
}
