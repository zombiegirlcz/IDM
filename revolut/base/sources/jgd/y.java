package jgd;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.qf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import com.youTransactor.uCube.rpc.Constants;
import ip0.pb0;
import ip0.xh0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements jki.p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f173992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FullScreenStateDelegate.Model f173993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model f173994c;

    public static final class a {
        private a() {
        }
    }

    public y() {
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("LIST_ID_LOADING_ITEM_", it8.nextInt())));
        }
        this.f173992a = arrayList;
        this.f173993b = new FullScreenStateDelegate.Model("LIST_ID_EMPTY_STATE", new TextLocalisedClause(R$string.shared_converter_converter_screen_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D179", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.shared_converter_converter_screen_empty_state_action, null, null, 14), false, Integer.valueOf(R$drawable.uikit_icn_16_plus), null, false, 0, 0, 32580);
        this.f173994c = new RowDelegate.Model("LIST_ID_ITEM_ADD_TO_CONVERTER", LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, new TextLocalisedClause(R$string.shared_converter_converter_screen_item_add_to_converter, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804);
    }

    public static wh b(SharedConverterItem sharedConverterItem, int i, boolean z) {
        String strQ = j6.a.q("LIST_ID_ITEM_", sharedConverterItem.f86893b.f306286a);
        xi0.b bVar = sharedConverterItem.f86893b;
        String strQ2 = j6.a.q("LIST_ID_ITEM_", bVar.f306286a);
        String str = sharedConverterItem.f86894c;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new wh(strQ, new RowDelegate.Model(strQ2, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), null, null, 0, new qf(sharedConverterItem.d, null, z && i == 0, false, 26), false, false, null, null, null, null, null, sharedConverterItem, null, 0, 0, 0, 0, 1056958316), zhm.u.c(new SwipeToActionDelegate.SwipeAction("LIST_ID_DELETE_ACTION", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_item_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, sharedConverterItem.f86893b, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r19) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jgd.y.a(jki.i):jki.m");
    }
}
