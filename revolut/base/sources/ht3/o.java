package ht3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f155295c;
    public final String d;
    public final n e;
    public final k0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f155296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f155297h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f155298j;
    public final List k;

    public o(String title, String description, i iVar, String str, n media, k0 k0Var, Double d, c cVar, c cVar2, boolean z, ArrayList arrayList, int i) {
        iVar = (i & 4) != 0 ? null : iVar;
        str = (i & 8) != 0 ? null : str;
        k0Var = (i & 32) != 0 ? null : k0Var;
        d = (i & 64) != 0 ? null : d;
        z = (i & 512) != 0 ? false : z;
        arrayList = (i & 1024) != 0 ? null : arrayList;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(media, "media");
        this.f155293a = title;
        this.f155294b = description;
        this.f155295c = iVar;
        this.d = str;
        this.e = media;
        this.f = k0Var;
        this.f155296g = d;
        this.f155297h = cVar;
        this.i = cVar2;
        this.f155298j = z;
        this.k = arrayList;
    }

    @Override // ht3.l0
    public final c T() {
        return this.i;
    }

    @Override // ht3.l0
    public final c W() {
        return this.f155297h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f155293a, oVar.f155293a) && Intrinsics.f(this.f155294b, oVar.f155294b) && Intrinsics.f(this.f155295c, oVar.f155295c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && this.f == oVar.f && Intrinsics.f(this.f155296g, oVar.f155296g) && Intrinsics.f(this.f155297h, oVar.f155297h) && Intrinsics.f(this.i, oVar.i) && this.f155298j == oVar.f155298j && Intrinsics.f(this.k, oVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f155293a.hashCode() * 31, 31, this.f155294b);
        i iVar = this.f155295c;
        int iHashCode = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        k0 k0Var = this.f;
        int iHashCode3 = (iHashCode2 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        Double d = this.f155296g;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        c cVar = this.f155297h;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.i;
        int iC2 = j6.a.c((iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, this.f155298j);
        List list = this.k;
        return iC2 + (list != null ? list.hashCode() : 0);
    }
}
