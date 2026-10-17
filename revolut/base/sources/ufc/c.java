package ufc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0015"}, d2 = {"Lufc/c;", "", "", "toString", "()Ljava/lang/String;", "Lufc/f;", "a", "Lufc/f;", "b", "()Lufc/f;", "shopify", "Lufc/g;", "Lufc/g;", "c", "()Lufc/g;", "wooCommerce", "Lufc/e;", "Lufc/e;", "()Lufc/e;", "prestaShop", "Companion", "feature_revpro_pro_merchant_toggles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("shopify")
    @NotNull
    private final f shopify;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("wooCommerce")
    private final g wooCommerce;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("prestaShop")
    private final e prestaShop;

    public c(f shopify, g gVar, e eVar) {
        Intrinsics.checkNotNullParameter(shopify, "shopify");
        this.shopify = shopify;
        this.wooCommerce = gVar;
        this.prestaShop = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getPrestaShop() {
        return this.prestaShop;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getShopify() {
        return this.shopify;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getWooCommerce() {
        return this.wooCommerce;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.shopify, cVar.shopify) && Intrinsics.f(this.wooCommerce, cVar.wooCommerce) && Intrinsics.f(this.prestaShop, cVar.prestaShop);
    }

    public final int hashCode() {
        int iHashCode = this.shopify.hashCode() * 31;
        g gVar = this.wooCommerce;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        e eVar = this.prestaShop;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }
}
