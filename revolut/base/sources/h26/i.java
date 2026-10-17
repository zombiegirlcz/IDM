package h26;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f148718l = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gx2.a(22)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d26.f f148719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f148721c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f148722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f148723h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f148724j;
    public final k k;

    public i(int i, d26.f fVar, String str, List list, String str2, String str3, String str4, n nVar, n nVar2, n nVar3, n nVar4, k kVar) {
        if (3 != (i & 3)) {
            j1.f(g.f148717a.getDescriptor(), i, 3);
            throw null;
        }
        this.f148719a = fVar;
        this.f148720b = str;
        if ((i & 4) == 0) {
            this.f148721c = f0.f322471a;
        } else {
            this.f148721c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.f148722g = null;
        } else {
            this.f148722g = nVar;
        }
        if ((i & 128) == 0) {
            this.f148723h = null;
        } else {
            this.f148723h = nVar2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = nVar3;
        }
        if ((i & 512) == 0) {
            this.f148724j = null;
        } else {
            this.f148724j = nVar4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f148719a, iVar.f148719a) && Intrinsics.f(this.f148720b, iVar.f148720b) && Intrinsics.f(this.f148721c, iVar.f148721c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f148722g, iVar.f148722g) && Intrinsics.f(this.f148723h, iVar.f148723h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f148724j, iVar.f148724j) && Intrinsics.f(this.k, iVar.k);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f148719a.hashCode() * 31, 31, this.f148720b), 31, this.f148721c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        n nVar = this.f148722g;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.f148723h;
        int iHashCode5 = (iHashCode4 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n nVar3 = this.i;
        int iHashCode6 = (iHashCode5 + (nVar3 == null ? 0 : nVar3.hashCode())) * 31;
        n nVar4 = this.f148724j;
        int iHashCode7 = (iHashCode6 + (nVar4 == null ? 0 : nVar4.hashCode())) * 31;
        k kVar = this.k;
        return iHashCode7 + (kVar != null ? kVar.hashCode() : 0);
    }

    public i(d26.f asset, String assetRepresentations, ArrayList chains, String str, String str2, String str3, n nVar, n nVar2, n nVar3, n nVar4, k kVar) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(assetRepresentations, "assetRepresentations");
        Intrinsics.checkNotNullParameter(chains, "chains");
        this.f148719a = asset;
        this.f148720b = assetRepresentations;
        this.f148721c = chains;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f148722g = nVar;
        this.f148723h = nVar2;
        this.i = nVar3;
        this.f148724j = nVar4;
        this.k = kVar;
    }
}
