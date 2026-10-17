package bka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16306b;

    public d1(String str, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f16305a = str;
        this.f16306b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f16305a, d1Var.f16305a) && Intrinsics.f(this.f16306b, d1Var.f16306b);
    }

    public final int hashCode() {
        String str = this.f16305a;
        return this.f16306b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
