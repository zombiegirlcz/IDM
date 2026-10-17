package srd;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetCategoryDefinition;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition;
import com.revolut.retail.feature.api.custom_assets.models.ValueHistoryEntry;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Collection collection;
        CellDetailsDelegate.Model model;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CustomAsset asset = domainState.f265160a;
        CustomAssetCategoryDefinition customAssetCategoryDefinition = domainState.f265161b;
        dj0.d dVar = asset.f99218c;
        vzi.b bVar = asset.f99217b;
        Map map = asset.i;
        if (dVar == null) {
            dVar = new dj0.d(0L, domainState.f265162c);
        }
        dj0.d dVar2 = dVar;
        aim.e eVarB = u.b();
        List listC = u.c(new CellDetailsDelegate.Model("current_value_row", new t0((Clause) new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_current_value, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), null, dVar2, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, false, null, null, 29624));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        ArrayList<ValueHistoryEntry> arrayList = asset.d;
        boolean z = domainState.d;
        if (arrayList.isEmpty()) {
            collection = f0.f322471a;
        } else {
            aim.e eVarB2 = u.b();
            eVarB2.add(new ExpandableCellDelegate.Model("historical_header", new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_historical_value, null, null, 14), null, null, z, null, null, LDSFile.EF_DG12_TAG));
            if (z) {
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (ValueHistoryEntry valueHistoryEntry : arrayList) {
                    String strS = h30.l.s("historical_header_", valueHistoryEntry.f99233a);
                    com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                    LocalDate localDate = valueHistoryEntry.f99233a;
                    LocalDateClause$DateFormat.INSTANCE.getClass();
                    arrayList2.add(new CellDetailsDelegate.Model(strS, new t0((Clause) com.revolut.core.ui_kit.models.j.b(jVar2, localDate, LocalDateClause$DateFormat.Companion.f57815b), (Image) null, 0, false, 30), new MoneyClause(valueHistoryEntry.f99234b, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), null, valueHistoryEntry, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, false, null, null, 29624));
                }
                eVarB2.addAll(arrayList2);
            }
            aim.e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            collection = eVarA;
        }
        eVarB.addAll(collection);
        Set set = domainState.e;
        Set set2 = domainState.f;
        ArrayList<CustomAssetFieldDefinition> arrayList3 = customAssetCategoryDefinition.f99225b;
        ArrayList arrayList4 = new ArrayList();
        for (CustomAssetFieldDefinition customAssetFieldDefinition : arrayList3) {
            Clause clauseD = rrd.d.d(customAssetFieldDefinition, map);
            if (clauseD == null) {
                model = null;
            } else {
                Object obj2 = map.get("country");
                model = new CellDetailsDelegate.Model(customAssetFieldDefinition.f99227a, new t0((Clause) rrd.d.c(customAssetFieldDefinition, obj2 instanceof String ? (String) obj2 : null, set, set2), (Image) null, 0, false, 30), clauseD, null, null, null, null, 0, null, false, false, null, null, 30712);
            }
            if (model != null) {
                arrayList4.add(model);
            }
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList4);
        RowDelegate.Model model2 = new RowDelegate.Model("remove_asset_button", null, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_button_remove_asset, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        Intrinsics.checkNotNullParameter(asset, "asset");
        eVarB.add(rrd.g.a(!asset.k ? rrd.i.NOTE_WONT_VERIFY : bVar == vzi.b.PROPERTY ? rrd.i.VALUES_NOT_VERIFIED_PROPERTY : rrd.i.VALUES_NOT_VERIFIED));
        aim.e eVarA2 = u.a(eVarB);
        Object obj3 = map.get("assetName");
        String str = obj3 instanceof String ? (String) obj3 : null;
        LayeredImage layeredImageA = rrd.b.a(bVar, false);
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause[] elements = {new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), rrd.f.a(asset)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        return new f(eVarA2, new b(layeredImageA, textClause, new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), v.k(new ActionsView.Item("adjust_value_button", null, false, null, null, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_button_adjust_current_value, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670), new ActionsView.Item("edit_asset_button", null, false, null, null, new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_button_edit_asset, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)));
    }
}
