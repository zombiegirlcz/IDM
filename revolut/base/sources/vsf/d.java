package vsf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ttf.a f291777a;

    public d(ttf.a transactionTransferReasons) {
        Intrinsics.checkNotNullParameter(transactionTransferReasons, "transactionTransferReasons");
        this.f291777a = transactionTransferReasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f291777a, ((d) obj2).f291777a);
    }

    public final int hashCode() {
        return this.f291777a.hashCode();
    }
}
