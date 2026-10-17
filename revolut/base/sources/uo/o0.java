package uo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281497b;

    public o0(String value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f281496a = value;
        this.f281497b = str;
    }

    public final String a() {
        return this.f281497b;
    }

    public final String b() {
        return this.f281496a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f281496a, o0Var.f281496a) && Intrinsics.f(this.f281497b, o0Var.f281497b);
    }

    public final int hashCode() {
        int iHashCode = this.f281496a.hashCode() * 31;
        String str = this.f281497b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
