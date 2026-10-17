package rd1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.lr;
import ip0.u8;
import java.util.List;
import java.util.Locale;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import u80.t;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f253315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f253316b;

    public d(qd0.b languageProvider, t ratesMoneyUtils) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        this.f253315a = languageProvider;
        this.f253316b = ratesMoneyUtils;
    }

    public final u8 a(int i) {
        u8 u8Var = new u8("QUANTITY_LIST_ID", new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_edit_product_quantity_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_flow_shopping_cart_edit_product_quantity_subtitle, null, null, 14), new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_24_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, i > 1, null, 64386);
        yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
        return u8Var;
    }

    public final IconNavBarMenuItem b() {
        return new IconNavBarMenuItem("DELETE_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.product_catalogue_common_action_delete, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final j c(String rateString) {
        Intrinsics.checkNotNullParameter(rateString, "rateString");
        boolean z = (d0.W(rateString) || a.a.O(this.f253316b.d(rateString))) ? false : true;
        TextClause textClause = new TextClause(rateString, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.product_catalogue_common_title_tax_rate, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.product_catalogue_common_error_validation_percent_value_not_in_open_range, null, null, 14) : null;
        lr lrVar = new lr(8194);
        Locale localeB = ((s80.b) this.f253315a).b();
        xi0.b.Companion.getClass();
        InputTextDelegate.Model model = new InputTextDelegate.Model("TAX_RATE_INPUT_ID", textClause, textLocalisedClause, null, false, null, false, textLocalisedClause2, null, null, null, null, null, false, null, null, z, false, false, false, lrVar, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, new od1.a(localeB, xi0.b.f306271c), null, null, 0, 0, 0, 0, -539099272, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final j d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        InputTextDelegate.Model model = new InputTextDelegate.Model("TAX_RATE_NAME_INPUT_ID", new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_new_tax_rate_name_input_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final TextImage e(CartItem cartItem) {
        Intrinsics.checkNotNullParameter(cartItem, "cartItem");
        return new TextImage(f0.U0(2, cartItem.f60665c), 0, cartItem.i, 0, 16, 40, 202);
    }
}
