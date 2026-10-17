package ux0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f283734b;

    public a0(String selectedPage, int i) {
        Intrinsics.checkNotNullParameter(selectedPage, "selectedPage");
        this.f283733a = selectedPage;
        this.f283734b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f283733a, a0Var.f283733a) && this.f283734b == a0Var.f283734b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f283734b) + (this.f283733a.hashCode() * 31);
    }
}
