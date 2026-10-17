package ks6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f189204b;

    public k0(String id10, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f189203a = id10;
        this.f189204b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f189203a, k0Var.f189203a) && Intrinsics.f(this.f189204b, k0Var.f189204b);
    }

    public final int hashCode() {
        return this.f189204b.hashCode() + (this.f189203a.hashCode() * 31);
    }
}
