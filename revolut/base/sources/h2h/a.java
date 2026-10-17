package h2h;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.retail.wealth.resources.R$string;
import ip0.zj;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C0858a Companion = new C0858a();

    /* JADX INFO: renamed from: h2h.a$a, reason: collision with other inner class name */
    public static final class C0858a {
        private C0858a() {
        }
    }

    public static List a(String str) {
        List listC = u.c(new FullScreenStateDelegate.Model("ASSET_SELECTION_EMPTY_SEARCH_ITEM_LIST_ID", new TextLocalisedClause(R$string.wealth_trading_assets_placeholder_title, null, null, 14), str != null ? new TextLocalisedClause(R$string.wealth_trading_assets_placeholder_subtitle, u.c(str), null, 12) : null, new ComplexImage.Regular(b.c("3D086", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1984));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
