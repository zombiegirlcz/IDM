package qbf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"Lqbf/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "Lqbf/f;", "b", "Lqbf/f;", "()Lqbf/f;", "code", "", "Lqbf/d;", "c", "Ljava/util/List;", "()Ljava/util/List;", "billing", "Lqbf/t;", ib.b.Features, "Lqbf/p;", "e", "f", "products", "pricingPlanProducts", "g", "termsUrl", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final f code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billing")
    @NotNull
    private final List<d> billing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b(ib.b.Features)
    @NotNull
    private final List<t> features;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("products")
    @NotNull
    private final List<p> products;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pricingPlanProducts")
    @NotNull
    private final List<p> pricingPlanProducts;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsUrl")
    private final String termsUrl;

    public o(String id10, f code, ArrayList billing, ArrayList features, ArrayList products, ArrayList pricingPlanProducts, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(pricingPlanProducts, "pricingPlanProducts");
        this.id = id10;
        this.code = code;
        this.billing = billing;
        this.features = features;
        this.products = products;
        this.pricingPlanProducts = pricingPlanProducts;
        this.termsUrl = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBilling() {
        return this.billing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getPricingPlanProducts() {
        return this.pricingPlanProducts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && this.code == oVar.code && Intrinsics.f(this.billing, oVar.billing) && Intrinsics.f(this.features, oVar.features) && Intrinsics.f(this.products, oVar.products) && Intrinsics.f(this.pricingPlanProducts, oVar.pricingPlanProducts) && Intrinsics.f(this.termsUrl, oVar.termsUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(p.a.d((this.code.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.billing), 31, this.features), 31, this.products), 31, this.pricingPlanProducts);
        String str = this.termsUrl;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
