package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f215695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215697c;

    public a1(boolean z, String str, String str2) {
        this.f215695a = z;
        this.f215696b = str;
        this.f215697c = str2;
    }

    public final String a() {
        return this.f215696b;
    }

    public final boolean b() {
        return this.f215695a;
    }

    public final String c() {
        return this.f215697c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f215695a == a1Var.f215695a && Intrinsics.f(this.f215696b, a1Var.f215696b) && Intrinsics.f(this.f215697c, a1Var.f215697c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f215695a) * 31;
        String str = this.f215696b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215697c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
