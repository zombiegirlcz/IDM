package d27;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.j {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s f110771l = s.TITLE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f110772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f110773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f110774c;
    public final CatalogueProduct d;
    public final q e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f110775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f110776h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f110777j;
    public final String k;

    public u(Set allowedCurrencies, n amount, o banner, CatalogueProduct catalogueProduct, q customField, boolean z, r expiryDate, s focusedField, Data legalEntityContext, t reusablePaymentLink, String title) {
        Intrinsics.checkNotNullParameter(allowedCurrencies, "allowedCurrencies");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(customField, "customField");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(reusablePaymentLink, "reusablePaymentLink");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f110772a = allowedCurrencies;
        this.f110773b = amount;
        this.f110774c = banner;
        this.d = catalogueProduct;
        this.e = customField;
        this.f = z;
        this.f110775g = expiryDate;
        this.f110776h = focusedField;
        this.i = legalEntityContext;
        this.f110777j = reusablePaymentLink;
        this.k = title;
    }

    public static u a(u uVar, Set set, n nVar, o oVar, CatalogueProduct catalogueProduct, q qVar, boolean z, r rVar, s sVar, Data data, t tVar, String str, int i) {
        if ((i & 1) != 0) {
            set = uVar.f110772a;
        }
        Set allowedCurrencies = set;
        if ((i & 2) != 0) {
            nVar = uVar.f110773b;
        }
        n amount = nVar;
        if ((i & 4) != 0) {
            oVar = uVar.f110774c;
        }
        o banner = oVar;
        CatalogueProduct catalogueProduct2 = (i & 8) != 0 ? uVar.d : catalogueProduct;
        q customField = (i & 16) != 0 ? uVar.e : qVar;
        boolean z3 = (i & 32) != 0 ? uVar.f : z;
        r expiryDate = (i & 64) != 0 ? uVar.f110775g : rVar;
        s focusedField = (i & 128) != 0 ? uVar.f110776h : sVar;
        Data legalEntityContext = (i & 256) != 0 ? uVar.i : data;
        t reusablePaymentLink = (i & 512) != 0 ? uVar.f110777j : tVar;
        String title = (i & 1024) != 0 ? uVar.k : str;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(allowedCurrencies, "allowedCurrencies");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(customField, "customField");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(reusablePaymentLink, "reusablePaymentLink");
        Intrinsics.checkNotNullParameter(title, "title");
        return new u(allowedCurrencies, amount, banner, catalogueProduct2, customField, z3, expiryDate, focusedField, legalEntityContext, reusablePaymentLink, title);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f110772a, uVar.f110772a) && Intrinsics.f(this.f110773b, uVar.f110773b) && Intrinsics.f(this.f110774c, uVar.f110774c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && this.f == uVar.f && Intrinsics.f(this.f110775g, uVar.f110775g) && this.f110776h == uVar.f110776h && Intrinsics.f(this.i, uVar.i) && Intrinsics.f(this.f110777j, uVar.f110777j) && Intrinsics.f(this.k, uVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f110774c.hashCode() + ((this.f110773b.hashCode() + (this.f110772a.hashCode() * 31)) * 31)) * 31;
        CatalogueProduct catalogueProduct = this.d;
        return this.k.hashCode() + ((this.f110777j.hashCode() + kii.e.c(this.i, (this.f110776h.hashCode() + ((this.f110775g.hashCode() + j6.a.c((this.e.hashCode() + ((iHashCode + (catalogueProduct == null ? 0 : catalogueProduct.hashCode())) * 31)) * 31, 31, this.f)) * 31)) * 31, 31)) * 31);
    }
}
