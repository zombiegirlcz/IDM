package rnd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uib.c f255600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f255601c;
    public final dj0.d d;
    public final ncd.j e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ncd.g f255602g;

    public d(String name, uib.c umbrellaNameType, dj0.d balance, dj0.d dVar, ncd.j displayRate, boolean z, ncd.g gVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(umbrellaNameType, "umbrellaNameType");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(displayRate, "displayRate");
        this.f255599a = name;
        this.f255600b = umbrellaNameType;
        this.f255601c = balance;
        this.d = dVar;
        this.e = displayRate;
        this.f = z;
        this.f255602g = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f255599a, dVar.f255599a) && this.f255600b == dVar.f255600b && Intrinsics.f(this.f255601c, dVar.f255601c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && this.f255602g == dVar.f255602g;
    }

    public final int hashCode() {
        int iC = v7.c((this.f255600b.hashCode() + (this.f255599a.hashCode() * 31)) * 31, 31, this.f255601c);
        dj0.d dVar = this.d;
        int iC2 = j6.a.c((this.e.hashCode() + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31, this.f);
        ncd.g gVar = this.f255602g;
        return iC2 + (gVar != null ? gVar.hashCode() : 0);
    }
}
