package pqg;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements jki.i {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f238749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f238751c;
    public final l0 d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xi0.b f238752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f238753h;
    public final SavingsProductData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final acb.b f238754j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Image f238755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f238756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f238757n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ncd.c f238758p;

    public o(xi0.b topUpAmountCurrency, String topUpAmount, long j2, l0 vaultType, String str, long j3, xi0.b pocketCurrency, boolean z, SavingsProductData savingsProductData, acb.b bVar, List validationErrors, Image image, boolean z3, boolean z4, boolean z6, ncd.c cVar) {
        Intrinsics.checkNotNullParameter(topUpAmountCurrency, "topUpAmountCurrency");
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        Intrinsics.checkNotNullParameter(vaultType, "vaultType");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        this.f238749a = topUpAmountCurrency;
        this.f238750b = topUpAmount;
        this.f238751c = j2;
        this.d = vaultType;
        this.e = str;
        this.f = j3;
        this.f238752g = pocketCurrency;
        this.f238753h = z;
        this.i = savingsProductData;
        this.f238754j = bVar;
        this.k = validationErrors;
        this.f238755l = image;
        this.f238756m = z3;
        this.f238757n = z4;
        this.o = z6;
        this.f238758p = cVar;
    }

    public static o b(o oVar, String str, String str2, long j2, xi0.b bVar, SavingsProductData savingsProductData, acb.b bVar2, List list, Image image, boolean z, boolean z3, ncd.c cVar, int i) {
        xi0.b topUpAmountCurrency = oVar.f238749a;
        String topUpAmount = (i & 2) != 0 ? oVar.f238750b : str;
        long j3 = oVar.f238751c;
        l0 vaultType = oVar.d;
        String str3 = (i & 16) != 0 ? oVar.e : str2;
        long j5 = (i & 32) != 0 ? oVar.f : j2;
        xi0.b pocketCurrency = (i & 64) != 0 ? oVar.f238752g : bVar;
        boolean z4 = (i & 128) != 0 ? oVar.f238753h : true;
        SavingsProductData savingsProductData2 = (i & 256) != 0 ? oVar.i : savingsProductData;
        acb.b bVar3 = (i & 512) != 0 ? oVar.f238754j : bVar2;
        List validationErrors = (i & 1024) != 0 ? oVar.k : list;
        Image image2 = (i & 2048) != 0 ? oVar.f238755l : image;
        String str4 = str3;
        boolean z6 = oVar.f238756m;
        boolean z11 = (i & 8192) != 0 ? oVar.f238757n : z;
        boolean z12 = (i & 16384) != 0 ? oVar.o : z3;
        ncd.c cVar2 = (i & 32768) != 0 ? oVar.f238758p : cVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(topUpAmountCurrency, "topUpAmountCurrency");
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        Intrinsics.checkNotNullParameter(vaultType, "vaultType");
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        return new o(topUpAmountCurrency, topUpAmount, j3, vaultType, str4, j5, pocketCurrency, z4, savingsProductData2, bVar3, validationErrors, image2, z6, z11, z12, cVar2);
    }

    public final long a(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        return amountFormatter.b(this.f238750b, this.f238749a.f306286a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f238749a, oVar.f238749a) && Intrinsics.f(this.f238750b, oVar.f238750b) && this.f238751c == oVar.f238751c && this.d == oVar.d && Intrinsics.f(this.e, oVar.e) && this.f == oVar.f && Intrinsics.f(this.f238752g, oVar.f238752g) && this.f238753h == oVar.f238753h && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f238754j, oVar.f238754j) && Intrinsics.f(this.k, oVar.k) && Intrinsics.f(this.f238755l, oVar.f238755l) && this.f238756m == oVar.f238756m && this.f238757n == oVar.f238757n && this.o == oVar.o && Intrinsics.f(this.f238758p, oVar.f238758p);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a0.d.c(p.a.c(this.f238749a.hashCode() * 31, 31, this.f238750b), 31, this.f238751c)) * 31;
        String str = this.e;
        int iC = j6.a.c(h30.l.j(this.f238752g, a0.d.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31), 31, this.f238753h);
        SavingsProductData savingsProductData = this.i;
        int iHashCode2 = (iC + (savingsProductData == null ? 0 : savingsProductData.hashCode())) * 31;
        acb.b bVar = this.f238754j;
        int iD = p.a.d((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.k);
        Image image = this.f238755l;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iD + (image == null ? 0 : image.hashCode())) * 31, 31, this.f238756m), 31, this.f238757n), 31, this.o);
        ncd.c cVar = this.f238758p;
        return iC2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
