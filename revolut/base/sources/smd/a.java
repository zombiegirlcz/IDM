package smd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f264408a;

    public a(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f264408a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f264408a, ((a) obj2).f264408a);
    }

    public final int hashCode() {
        return this.f264408a.hashCode();
    }
}
