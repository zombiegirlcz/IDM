package so1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ro1.c f264677a;

    public g(ro1.c billPayResult) {
        Intrinsics.checkNotNullParameter(billPayResult, "billPayResult");
        this.f264677a = billPayResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f264677a, ((g) obj2).f264677a);
    }

    public final int hashCode() {
        return this.f264677a.hashCode();
    }
}
