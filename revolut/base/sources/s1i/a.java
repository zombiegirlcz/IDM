package s1i;

import a0.d;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$string;
import ip0.ck0;
import ip0.yj0;
import ip0.yt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.h;
import wi0.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C1433a Companion = new C1433a();

    /* JADX INFO: renamed from: s1i.a$a, reason: collision with other inner class name */
    public static final class C1433a {
        private C1433a() {
        }
    }

    public static ListCellDelegate.Model a(List list, int i, int i2, int i3) {
        return new ListCellDelegate.Model(d.n("RISKS_ITEM_ID_PREFIX_", i2), new j8(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, list, null, 12), false, null, null, 0, 0, 0, 0, 4064);
    }

    public final List b(b countryCode, boolean z) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TextDelegate.Model model = null;
        if (z) {
            b.Companion.getClass();
            model = new TextDelegate.Model("FOOTER_NOTE_CRYPTO_LIST_ID", new TextLocalisedClause(Intrinsics.f(countryCode, b.f297756l) ? R$string.fx_orders_confirmation_crypto_au_note : R$string.fx_orders_confirmation_crypto_note, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
        }
        return v.l(model);
    }

    public final List c(boolean z, h orderType, dj0.d dVar, dj0.d dVar2, b countryCode, boolean z3) {
        ListCellDelegate.Model modelA;
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (dVar == null || dVar2 == null) {
            modelA = dVar != null ? a(u.c(new MoneyClause(dVar, new MoneyClause.Format.Asset(0), null, o9.NON_SENSITIVE, 4)), R$string.stoplimit_order_disclaimer_crypto_order_title, R$string.stoplimit_order_disclaimer_crypto_transaction_subtitle, R$drawable.uikit_icn_24_limit) : null;
        } else {
            int i = R$string.stoplimit_order_disclaimer_crypto_order_title;
            int i2 = R$string.stoplimit_order_disclaimer_crypto_order_subtitle;
            int i3 = R$drawable.uikit_icn_24_limit;
            MoneyClause.Format.Asset asset = new MoneyClause.Format.Asset(0);
            o9 o9Var = o9.NON_SENSITIVE;
            modelA = a(v.k(new MoneyClause(dVar2, asset, null, o9Var, 4), new MoneyClause(dVar, new MoneyClause.Format.Asset(0), null, o9Var, 4)), i, i2, i3);
        }
        if (orderType == h.MARKET) {
            modelA = null;
        }
        List listL = v.l(modelA);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return i2b.a.o(i2b.a.o(v.l(listL.isEmpty() ? null : new ListSubheaderDelegate.Model("SECTION_HEADER_RISKS_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(z ? R$string.market_order_disclosure_header_buying : R$string.market_order_disclosure_header_selling, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)), listL), b(countryCode, z3));
    }
}
