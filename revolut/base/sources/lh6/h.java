package lh6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f195165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f195166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f195167c;
    public final boolean d;
    public final boolean e;
    public final dj0.d f;

    public h(dj0.d limitPerTransfer, dj0.d limitPerMonth, dj0.d dVar, boolean z, boolean z3, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        this.f195165a = limitPerTransfer;
        this.f195166b = limitPerMonth;
        this.f195167c = dVar;
        this.d = z;
        this.e = z3;
        this.f = dVar2;
    }

    public static h a(h hVar, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, int i) {
        if ((i & 1) != 0) {
            dVar = hVar.f195165a;
        }
        dj0.d limitPerTransfer = dVar;
        if ((i & 2) != 0) {
            dVar2 = hVar.f195166b;
        }
        dj0.d limitPerMonth = dVar2;
        dj0.d dVar4 = hVar.f195167c;
        boolean z = (i & 8) != 0 ? hVar.d : false;
        boolean z3 = (i & 16) != 0 ? hVar.e : false;
        if ((i & 32) != 0) {
            dVar3 = hVar.f;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        return new h(limitPerTransfer, limitPerMonth, dVar4, z, z3, dVar3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f195165a, hVar.f195165a) && Intrinsics.f(this.f195166b, hVar.f195166b) && Intrinsics.f(this.f195167c, hVar.f195167c) && this.d == hVar.d && this.e == hVar.e && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iC = v7.c(this.f195165a.hashCode() * 31, 31, this.f195166b);
        dj0.d dVar = this.f195167c;
        int iC2 = j6.a.c(j6.a.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d), 31, this.e);
        dj0.d dVar2 = this.f;
        return iC2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
