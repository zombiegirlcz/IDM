package glh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f144695a;

    public c(kel.b cashHolding) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f144695a = cashHolding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f144695a, ((c) obj2).f144695a);
    }

    public final int hashCode() {
        return this.f144695a.hashCode();
    }
}
