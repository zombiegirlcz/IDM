package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dz implements koi.j, qv0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f163977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f163978c;
    public final cz d;
    public final Object e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f163980h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f163981j;
    public final int k;

    public dz(boolean z, Image frontImage, Image backImage, cz czVar, Image image, Image image2, boolean z3, int i, int i2) {
        int i3 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("NUMBERLESS_CARD_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(frontImage, "frontImage");
        Intrinsics.checkNotNullParameter(backImage, "backImage");
        this.f163976a = z;
        this.f163977b = frontImage;
        this.f163978c = backImage;
        this.d = czVar;
        this.e = image;
        this.f = image2;
        this.f163979g = z3;
        this.f163980h = i;
        this.i = i2;
        this.f163981j = i3;
        this.k = i3;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52973a() {
        return "NUMBERLESS_CARD_LIST_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj2;
        return this.f163976a == dzVar.f163976a && this.f163977b.equals(dzVar.f163977b) && this.f163978c.equals(dzVar.f163978c) && Intrinsics.f(this.d, dzVar.d) && Intrinsics.f(this.e, dzVar.e) && Intrinsics.f(this.f, dzVar.f) && this.f163979g == dzVar.f163979g && this.f163980h == dzVar.f163980h && this.i == dzVar.i && this.f163981j == dzVar.f163981j && this.k == dzVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.f163980h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f163980h = i;
    }

    public final int hashCode() {
        int iB = p.a.b(p.a.b(j6.a.c(404536918, 31, this.f163976a), 31, this.f163977b), 31, this.f163978c);
        cz czVar = this.d;
        int iHashCode = (iB + (czVar == null ? 0 : czVar.hashCode())) * 31;
        Object obj2 = this.e;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Image image = this.f;
        return Integer.hashCode(this.k) + j6.a.b(this.f163981j, j6.a.b(this.i, j6.a.b(this.f163980h, j6.a.c(j6.a.c((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31, 31, this.f163979g), 31, true), 31), 31), 31);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.f163981j;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof dz ? (dz) oldItem : null) == null) {
            return null;
        }
        dz dzVar = (dz) oldItem;
        boolean z3 = false;
        if (dzVar.f163976a != this.f163976a) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        return new ez(z3, !dzVar.f163977b.equals(this.f163977b), !dzVar.f163978c.equals(this.f163978c), !Intrinsics.f(dzVar.f, this.f), !Intrinsics.f(dzVar.d, this.d), !Intrinsics.f(dzVar.e, this.e), dzVar.f163979g != this.f163979g ? true : z);
    }
}
