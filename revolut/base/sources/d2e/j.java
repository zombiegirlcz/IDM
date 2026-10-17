package d2e;

import com.revolut.feature.store.api.model.StoreExclusivesOffer;
import com.revolut.feature.store.api.model.StoreGiftcardsOffer;
import com.revolut.feature.store.api.model.StoreLogoBadge;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.model.StoreShopsOffer;
import f2e.a3;
import f2e.a5;
import f2e.d3;
import f2e.g2;
import f2e.g3;
import f2e.h3;
import f2e.i1;
import f2e.x1;
import f2e.x2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j {
    public static final StoreMegaOffer a(h3 h3Var) {
        StoreMegaOffer.StoreEarn storeEarn;
        StoreMegaOffer.StoreRedeem storeRedeem;
        StoreMegaOffer.StoreMsi storeMsi;
        StoreGiftcardsOffer storeGiftcardsOffer;
        StoreExclusivesOffer storeExclusivesOffer;
        Intrinsics.checkNotNullParameter(h3Var, "<this>");
        String str = h3Var.f131613a;
        String str2 = h3Var.f131614b;
        String str3 = h3Var.f131615c;
        String str4 = h3Var.d;
        g2 g2Var = h3Var.e;
        StoreMegaOffer.StoreDiscount storeDiscount = null;
        StoreLogoBadge storeLogoBadgeB = g2Var != null ? g4i.a.B(g2Var) : null;
        a3 a3Var = h3Var.f;
        if (a3Var != null) {
            a5 a5Var = a3Var.f131536a;
            StoreShopsOffer storeShopsOfferU = a5Var != null ? hx7.a.u(a5Var) : null;
            a5 a5Var2 = a3Var.f131537b;
            StoreShopsOffer storeShopsOfferU2 = a5Var2 != null ? hx7.a.u(a5Var2) : null;
            a5 a5Var3 = a3Var.f131538c;
            storeEarn = new StoreMegaOffer.StoreEarn(storeShopsOfferU, storeShopsOfferU2, a5Var3 != null ? hx7.a.u(a5Var3) : null);
        } else {
            storeEarn = null;
        }
        g3 g3Var = h3Var.f131616g;
        if (g3Var != null) {
            x1 x1Var = g3Var.f131601a;
            if (x1Var != null) {
                Intrinsics.checkNotNullParameter(x1Var, "<this>");
                storeGiftcardsOffer = new StoreGiftcardsOffer(x1Var.f131762a);
            } else {
                storeGiftcardsOffer = null;
            }
            i1 i1Var = g3Var.f131602b;
            if (i1Var != null) {
                Intrinsics.checkNotNullParameter(i1Var, "<this>");
                storeExclusivesOffer = new StoreExclusivesOffer(i1Var.f131621a);
            } else {
                storeExclusivesOffer = null;
            }
            a5 a5Var4 = g3Var.f131603c;
            storeRedeem = new StoreMegaOffer.StoreRedeem(storeGiftcardsOffer, storeExclusivesOffer, a5Var4 != null ? hx7.a.u(a5Var4) : null);
        } else {
            storeRedeem = null;
        }
        d3 d3Var = h3Var.f131617h;
        if (d3Var != null) {
            a5 a5Var5 = d3Var.f131568a;
            storeMsi = new StoreMegaOffer.StoreMsi(a5Var5 != null ? hx7.a.u(a5Var5) : null);
        } else {
            storeMsi = null;
        }
        x2 x2Var = h3Var.i;
        if (x2Var != null) {
            a5 a5Var6 = x2Var.f131763a;
            storeDiscount = new StoreMegaOffer.StoreDiscount(a5Var6 != null ? hx7.a.u(a5Var6) : null);
        }
        return new StoreMegaOffer(str, str2, str3, str4, storeLogoBadgeB, storeEarn, storeRedeem, storeMsi, storeDiscount, h3Var.f131618j);
    }

    public static final h3 b(StoreMegaOffer storeMegaOffer) {
        a3 a3Var;
        g3 g3Var;
        d3 d3Var;
        x1 x1Var;
        i1 i1Var;
        Intrinsics.checkNotNullParameter(storeMegaOffer, "<this>");
        String str = storeMegaOffer.f88547a;
        String str2 = storeMegaOffer.f88548b;
        String str3 = storeMegaOffer.f88549c;
        String str4 = storeMegaOffer.d;
        StoreLogoBadge storeLogoBadge = storeMegaOffer.e;
        x2 x2Var = null;
        g2 g2VarG = storeLogoBadge != null ? g4i.a.G(storeLogoBadge) : null;
        StoreMegaOffer.StoreEarn storeEarn = storeMegaOffer.f;
        if (storeEarn != null) {
            StoreShopsOffer storeShopsOffer = storeEarn.f88554a;
            a5 a5VarY = storeShopsOffer != null ? hx7.a.y(storeShopsOffer) : null;
            StoreShopsOffer storeShopsOffer2 = storeEarn.f88555b;
            a5 a5VarY2 = storeShopsOffer2 != null ? hx7.a.y(storeShopsOffer2) : null;
            StoreShopsOffer storeShopsOffer3 = storeEarn.f88556c;
            a3Var = new a3(a5VarY, a5VarY2, storeShopsOffer3 != null ? hx7.a.y(storeShopsOffer3) : null);
        } else {
            a3Var = null;
        }
        StoreMegaOffer.StoreRedeem storeRedeem = storeMegaOffer.f88550g;
        if (storeRedeem != null) {
            StoreGiftcardsOffer storeGiftcardsOffer = storeRedeem.f88558a;
            if (storeGiftcardsOffer != null) {
                Intrinsics.checkNotNullParameter(storeGiftcardsOffer, "<this>");
                x1Var = new x1(storeGiftcardsOffer.f88527a);
            } else {
                x1Var = null;
            }
            StoreExclusivesOffer storeExclusivesOffer = storeRedeem.f88559b;
            if (storeExclusivesOffer != null) {
                Intrinsics.checkNotNullParameter(storeExclusivesOffer, "<this>");
                i1Var = new i1(storeExclusivesOffer.f88511a);
            } else {
                i1Var = null;
            }
            StoreShopsOffer storeShopsOffer4 = storeRedeem.f88560c;
            g3Var = new g3(x1Var, i1Var, storeShopsOffer4 != null ? hx7.a.y(storeShopsOffer4) : null);
        } else {
            g3Var = null;
        }
        StoreMegaOffer.StoreMsi storeMsi = storeMegaOffer.f88551h;
        if (storeMsi != null) {
            StoreShopsOffer storeShopsOffer5 = storeMsi.f88557a;
            d3Var = new d3(storeShopsOffer5 != null ? hx7.a.y(storeShopsOffer5) : null);
        } else {
            d3Var = null;
        }
        StoreMegaOffer.StoreDiscount storeDiscount = storeMegaOffer.i;
        if (storeDiscount != null) {
            StoreShopsOffer storeShopsOffer6 = storeDiscount.f88553a;
            x2Var = new x2(storeShopsOffer6 != null ? hx7.a.y(storeShopsOffer6) : null);
        }
        return new h3(str, str2, str3, str4, g2VarG, a3Var, g3Var, d3Var, x2Var, storeMegaOffer.f88552j);
    }
}
