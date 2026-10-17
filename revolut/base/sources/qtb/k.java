package qtb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev10_main_screen.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ptb.g gVar = domainState.f249070a;
        boolean z = false;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_title, null, null, 14), null, null, null, false, 30);
        s0 s0Var = new s0(5);
        Boolean bool = gVar.f239649c;
        int i = 6;
        s0Var.a(bool != null ? new RowDelegate.Model("CUSTOMIZATION_ITEM_ID_BOTTOM_BAR_HIDEABLE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bottom_tab, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_hideable_tab_bar_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_hideable_tab_bar_subtitle, null, null, 14), null, null, 0, new vf(bool.booleanValue(), true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848) : null);
        Boolean bool2 = gVar.d;
        s0Var.a(bool2 != null ? new RowDelegate.Model("CUSTOMIZATION_ITEM_ID_BOTTOM_BAR_LABELS_HIDEABLE", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_roboto_regular, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_hideable_tab_bar_labels_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_hideable_tab_bar_labels_subtitle, null, null, 14), null, null, 0, new vf(bool2.booleanValue(), true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848) : null);
        List list = gVar.f;
        ArrayList<ptb.f> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ptb.f) obj2).f239645g) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ptb.f fVar : arrayList) {
            arrayList2.add(new RowDelegate.Model(fVar.f239642a, new RowDelegate.Model.MainImage.Image24(fVar.e, z, z, i), fVar.d, null, 0, fVar.f, null, null, 0, new vf(fVar.f239646h, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        }
        s0Var.b(arrayList2.toArray(new RowDelegate.Model[0]));
        s0Var.a(gVar.f239647a ? new RowDelegate.Model("CUSTOMIZATION_ITEM_ID_PLAY_TAB", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_entertainment, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R$string.tab_bar_tab_organiser_items_play_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.tab_bar_tab_organiser_items_play_subtitle, null, null, 14), null, null, 0, new vf(gVar.f239648b, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848) : null);
        s0Var.a(gVar.e ? new RowDelegate.Model("CUSTOMIZATION_ITEM_ID_TAB_REORDER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_carousel, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, i), new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null);
        ArrayList arrayList3 = s0Var.f186433a;
        List listM = v.m(arrayList3.toArray(new RowDelegate.Model[arrayList3.size()]));
        yp0.b.k(listM, 0, R$attr.uikit_dp32, 0, 0, 29);
        return new cii.b(null, listM, aVar);
    }
}
