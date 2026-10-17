package r4f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f251445a;

    public a(hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f251445a = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f251445a == ((a) obj2).f251445a;
    }

    public final int hashCode() {
        return this.f251445a.hashCode();
    }
}
