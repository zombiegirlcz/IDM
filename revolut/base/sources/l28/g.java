package l28;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f191707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f191708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f191709c;

    public g(h hVar, String str, int i) {
        this.f191707a = hVar;
        this.f191708b = str;
        this.f191709c = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Iterable iterableE0;
        int i;
        Clause textLocalisedQuantityClause;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List screenerCollections = (List) pair.f186385a;
        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
        hph.c cVar = this.f191707a.f191711c.f191712a;
        String id10 = this.f191708b;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(screenerCollections, "screenerCollections");
        List list = screenerCollections;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (((ScreenerCollection) obj5).f105158h == zel.d.USER) {
                arrayList.add(obj5);
            }
        }
        int size = arrayList.size();
        int i2 = this.f191709c;
        if (size >= i2) {
            iterableE0 = d0.V0(arrayList, i2);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : list) {
                if (((ScreenerCollection) obj6).f105158h == zel.d.REVOLUT) {
                    arrayList2.add(obj6);
                }
            }
            iterableE0 = d0.E0(d0.V0(arrayList2, i2 - arrayList.size()), arrayList);
        }
        Iterable<ScreenerCollection> iterable = iterableE0;
        ArrayList arrayList3 = new ArrayList(w.t(iterable, 10));
        for (ScreenerCollection collection : iterable) {
            String str = collection.f105154a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(cVar.a(collection), null, null, false, null, false, 62);
            TextClause textClause = new TextClause(collection.f105156c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(collection, "collection");
            if (collection.f105158h == zel.d.USER) {
                textLocalisedQuantityClause = new TextLocalisedClause(R$string.wealth_invest_widget_collections_custom_subtitle, null, null, 14);
            } else {
                String str2 = collection.d;
                String str3 = (str2 == null || kotlin.text.d0.W(str2)) ? null : str2;
                if (str3 != null) {
                    textLocalisedQuantityClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                } else {
                    ooh.d dVar = cVar.f154536b;
                    ArrayList arrayList4 = collection.f105157g;
                    int i3 = collection.e;
                    int i5 = hph.b.f154534a[dVar.a(arrayList4).ordinal()];
                    if (i5 == 1) {
                        i = R$plurals.screener_collections_section_collection_stocks_description;
                    } else if (i5 == 2) {
                        i = zBooleanValue ? R$plurals.screener_collections_section_collection_etps_description : R$plurals.screener_collections_section_collection_etfs_description;
                    } else if (i5 == 3) {
                        i = R$plurals.screener_collections_section_collection_bonds_description;
                    } else {
                        if (i5 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$plurals.screener_collections_section_collection_cfds_description;
                    }
                    textLocalisedQuantityClause = new TextLocalisedQuantityClause(i, Integer.valueOf(i3), u.c(Integer.valueOf(i3)), (Style) null, 24);
                }
            }
            arrayList3.add(new RowDelegate.Model(str, image40, textClause, null, 0, textLocalisedQuantityClause, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, collection, null, 0, 0, 0, 0, 532675544));
        }
        return RowsWidgetDelegate.Model.Companion.d(RowsWidgetDelegate.Model.INSTANCE, id10, new BaseDynamicWidgetDelegate.BigHeaderModel("collections-list-id", new TextLocalisedClause(R$string.wealth_invest_widget_collections_header_title, null, null, 14), null, false, null, 56), arrayList3, i2 < screenerCollections.size() ? new n3(new TextLocalisedClause(R$string.wealth_home_widget_subheader_action_see_all, null, null, 14), null) : null, null, null, null, 112);
    }
}
