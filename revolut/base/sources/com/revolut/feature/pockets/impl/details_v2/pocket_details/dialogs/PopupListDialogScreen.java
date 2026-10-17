package com.revolut.feature.pockets.impl.details_v2.pocket_details.dialogs;

import a0.d;
import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jea.a;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import vc.s;
import yp0.b;
import z4l.j;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/dialogs/PopupListDialogScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PopupListDialogScreen extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PopupListDialogScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final String N;
    public final ArrayList O;
    public final h P;
    public final LargeActionButtonDelegate Q;
    public final j R;
    public final int S;

    public PopupListDialogScreen(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.N = title;
        this.O = items;
        this.P = s.t(this, a.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Q = largeActionButtonDelegate;
        this.R = new j(7, v.k(rowDelegate, largeActionButtonDelegate), false);
        this.S = R$layout.screen_bottom_sheet_list;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = T;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.P;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(new lw0.a(new TextClause(this.N, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView screenContentRecyclerView = ((f) value2).f174520c;
        j jVar = this.R;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        ArrayList arrayList = this.O;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            RowDelegate.Model.MainImage.Image24 image24 = null;
            if (!it8.hasNext()) {
                b.k(arrayList2, 0, 0, 0, 0, 31);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain plain = LargeActionButton.ButtonStyle.e;
                int i2 = R$attr.uikit_dp16;
                jVar.c(d0.E0(u.c(new LargeActionButtonDelegate.Model("GOT_IT_BTN", plain, null, textLocalisedClause, false, null, null, i2, R$attr.uikit_dp8, i2, i2, 496)), arrayList2));
                return;
            }
            Object next = it8.next();
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            PocketDetailsScreenContract$ModalStep.PopupListDialog.PopupListItem popupListItem = (PocketDetailsScreenContract$ModalStep.PopupListDialog.PopupListItem) next;
            String strN = d.n("POPUP_LIST_ITEM_", i);
            Integer num = popupListItem.f80856a;
            if (num != null) {
                image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(num.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
            }
            arrayList2.add(new RowDelegate.Model(strN, image24, new TextClause(popupListItem.f80857b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
            i = i3;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e.b(this.Q.d.f121375b), new jea.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.S;
    }
}
