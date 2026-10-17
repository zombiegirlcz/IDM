package n7j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.e f213160a;

    public a(wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f213160a = exchangeMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f213160a == ((a) obj2).f213160a;
    }

    public final int hashCode() {
        return this.f213160a.hashCode();
    }
}
