package tfc;

import kf1.b;
import kf1.f;
import kf1.h;
import kf1.j;
import kf1.l;
import kf1.n;
import kotlin.jvm.internal.Intrinsics;
import ufc.c;
import ufc.d;
import ufc.e;
import ufc.g;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static j a(d dto) {
        f fVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        b bVar = new b(dto.getCardPresent().getAllowTerminalPayments(), dto.getCardPresent().getMobileCatalogEnabled());
        boolean modularKymEnabled = dto.getModularKymEnabled();
        c ecommerce = dto.getEcommerce();
        if (ecommerce != null) {
            l lVar = new l(ecommerce.getShopify().getEnabled(), ecommerce.getShopify().getInstalled());
            g wooCommerce = ecommerce.getWooCommerce();
            boolean z = false;
            boolean z3 = wooCommerce != null && wooCommerce.getEnabled();
            g wooCommerce2 = ecommerce.getWooCommerce();
            n nVar = new n(z3, wooCommerce2 != null && wooCommerce2.getInstalled());
            e prestaShop = ecommerce.getPrestaShop();
            boolean z4 = prestaShop != null && prestaShop.getEnabled();
            e prestaShop2 = ecommerce.getPrestaShop();
            if (prestaShop2 != null && prestaShop2.getInstalled()) {
                z = true;
            }
            fVar = new f(lVar, nVar, new h(z4, z));
        } else {
            fVar = null;
        }
        return new j(bVar, modularKymEnabled, fVar);
    }
}
