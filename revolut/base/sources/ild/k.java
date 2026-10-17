package ild;

import aw0.o9;
import aw0.x4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.l;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import com.revolut.feature.slot_manager.impl.R$string;
import com.revolut.tracking.v3.SlotTileMessageMetadataContext;
import com.youTransactor.uCube.rpc.Constants;
import fkd.c0;
import fkd.e0;
import fkd.f0;
import fkd.j0;
import fkd.n0;
import fkd.o;
import fkd.p;
import fkd.q0;
import fkd.r;
import fkd.r0;
import fkd.v0;
import fkd.w0;
import fkd.x;
import ip0.b90;
import ip0.f90;
import ip0.j90;
import ip0.k90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;
import zhm.k0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f162229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f162230b;

    public k(d slotDefaultTodoTileProvider, i slotProgressTodoTileProvider, h slotNoButtonsTodoTileProvider, a slotCustomerRatingTileProvider, e slotFincrimeNpsTodoTileProvider) {
        Intrinsics.checkNotNullParameter(slotDefaultTodoTileProvider, "slotDefaultTodoTileProvider");
        Intrinsics.checkNotNullParameter(slotProgressTodoTileProvider, "slotProgressTodoTileProvider");
        Intrinsics.checkNotNullParameter(slotNoButtonsTodoTileProvider, "slotNoButtonsTodoTileProvider");
        Intrinsics.checkNotNullParameter(slotCustomerRatingTileProvider, "slotCustomerRatingTileProvider");
        Intrinsics.checkNotNullParameter(slotFincrimeNpsTodoTileProvider, "slotFincrimeNpsTodoTileProvider");
        this.f162229a = slotDefaultTodoTileProvider;
        this.f162230b = slotNoButtonsTodoTileProvider;
    }

    public final qv0.i a(w0 w0Var, Map customRatingSelection) {
        Image urlImage;
        Enum r112;
        ActionWidgetDelegate.Model.a kVar;
        Image urlImage2;
        ActionWidgetDelegate.Model.a kVar2;
        boolean z = w0Var instanceof r;
        ActionWidgetDelegate.Model.a iVar = ActionWidgetDelegate.Model.a.C0393a.f51604a;
        int i = 0;
        ActionWidgetDelegate.Model.b aVar = ActionWidgetDelegate.Model.b.C0394b.f51606a;
        if (z) {
            r tile = (r) w0Var;
            v0 v0Var = tile.f135789a;
            Intrinsics.checkNotNullParameter(tile, "tile");
            String strS = a0.d.s("SlotTodoTile Default ", v0Var.f135798b, " _targetId_", v0Var.f135799c);
            o oVar = tile.f135790b;
            TextClause textClause = new TextClause(oVar.f135778a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(oVar.f135779b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            SlotIconAsset slotIconAsset = oVar.f135781g;
            d dVar = this.f162229a;
            if (slotIconAsset == null || (urlImage2 = dVar.f162224a.a(slotIconAsset)) == null) {
                urlImage2 = new UrlImage(oVar.f, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            }
            SlotIconAsset slotIconAsset2 = oVar.f135782h;
            m mVar = new m(urlImage2, (NewBadgeContent.WithNumber) null, slotIconAsset2 != null ? dVar.f162225b.a(slotIconAsset2) : null, 10);
            if (oVar.f135780c) {
                aVar = new ActionWidgetDelegate.Model.b.a(null);
            }
            ActionWidgetDelegate.Model.b bVar = aVar;
            List list = oVar.e;
            int size = list.size();
            if (size == 0) {
                kVar2 = iVar;
            } else if (size != 1) {
                kVar2 = new com.revolut.core.ui_kit.delegates.k(new TextClause(((fkd.j) list.get(0)).f135768a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(((fkd.j) list.get(1)).f135768a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, Constants.TAG_OS_VERSION);
            } else {
                fkd.j jVar = (fkd.j) d0.b0(list);
                fkd.k kVar3 = jVar.f135770c;
                int i2 = kVar3 == null ? -1 : c.f162223b[kVar3.ordinal()];
                if (i2 == -1) {
                    iVar = new com.revolut.core.ui_kit.delegates.i(14, new TextClause(jVar.f135768a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false);
                    kVar2 = iVar;
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = new com.revolut.core.ui_kit.delegates.i(14, new TextClause(jVar.f135768a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false);
                    kVar2 = iVar;
                } else {
                    iVar = new com.revolut.core.ui_kit.delegates.j(new TextClause(jVar.f135768a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 14);
                    kVar2 = iVar;
                }
            }
            p pVar = oVar.d;
            r112 = pVar != null ? pVar.f135785a : null;
            q qVar = (r112 != null ? c.f162222a[r112.ordinal()] : -1) == 1 ? q.HIGH_ALERT : q.REGULAR;
            SlotTileMessageMetadataContext.a aVarNewBuilder = SlotTileMessageMetadataContext.newBuilder();
            aVarNewBuilder.h(v0Var.f135798b);
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(strS, textClause, textClause2, mVar, bVar, kVar2, qVar, tile, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), false, 7680);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            return model;
        }
        if (w0Var instanceof r0) {
            r0 tile2 = (r0) w0Var;
            v0 v0Var2 = tile2.f135791a;
            Intrinsics.checkNotNullParameter(tile2, "tile");
            String strQ = j6.a.q("SlotTodoTile Progress ", v0Var2.f135798b);
            n0 n0Var = tile2.f135792b;
            String str = n0Var.f135775a;
            q0 q0Var = n0Var.e;
            TextClause textClause3 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause4 = new TextClause(n0Var.f135776b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i3 = R$string.adoption_journey_progress_text;
            int i5 = q0Var.f135787a;
            int i6 = q0Var.f135788b;
            l lVar = new l(new TextLocalisedClause(i3, v.k(Integer.valueOf(i5), Integer.valueOf(i6)), null, 12), i6, q0Var.f135787a, R$attr.uikit_colorAccent, R$attr.uikit_colorPerformancePositive, R$attr.uikit_colorGreyTone10);
            if (n0Var.f135777c) {
                aVar = new ActionWidgetDelegate.Model.b.a(null);
            }
            ActionWidgetDelegate.Model.b bVar2 = aVar;
            List list2 = n0Var.d;
            int size2 = list2.size();
            if (size2 == 0) {
                kVar = iVar;
            } else if (size2 != 1) {
                kVar = new com.revolut.core.ui_kit.delegates.k(new TextClause(((j0) list2.get(0)).f135771a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(((j0) list2.get(1)).f135771a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 44);
            } else {
                iVar = new com.revolut.core.ui_kit.delegates.i(6, new TextClause(((j0) d0.b0(list2)).f135771a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false);
                kVar = iVar;
            }
            q qVar2 = q.REGULAR;
            SlotTileMessageMetadataContext.a aVarNewBuilder2 = SlotTileMessageMetadataContext.newBuilder();
            aVarNewBuilder2.h(v0Var2.f135798b);
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            com.google.protobuf.w0 w0VarA2 = aVarNewBuilder2.a();
            companion2.getClass();
            ActionWidgetDelegate.Model model2 = new ActionWidgetDelegate.Model(strQ, textClause3, textClause4, lVar, bVar2, kVar, qVar2, tile2, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2)), false, 7680);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            return model2;
        }
        if (!(w0Var instanceof f0)) {
            if (!(w0Var instanceof fkd.f)) {
                if (!(w0Var instanceof x)) {
                    throw new NoWhenBranchMatchedException();
                }
                x tile3 = (x) w0Var;
                v0 v0Var3 = tile3.f135802a;
                Intrinsics.checkNotNullParameter(tile3, "tile");
                String strQ2 = j6.a.q("SlotTodoTile FincrimeNps ", v0Var3.f135798b);
                TextClause textClause5 = new TextClause(tile3.f135803b.f135800a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = v0Var3.f135798b;
                f90 f90Var = new f90(strQ2, new j90(v.k(new k90(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_poor, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_social_dislike, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), a0.d.r(str2, "_RATE_ONE_CLICK_POOR_LIST_ID")), new k90(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_ok, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_social_like, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), a0.d.r(str2, "_RATE_ONE_CLICK_OK_LIST_ID")), new k90(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_wow, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_double_thumbs, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), a0.d.r(str2, "_RATE_ONE_CLICK_WOW_LIST_ID"))), null), textClause5, tile3, 16);
                yp0.b.l(f90Var, 0, 0, 0, 0, null, false, 63);
                return f90Var;
            }
            fkd.f tile4 = (fkd.f) w0Var;
            Intrinsics.checkNotNullParameter(tile4, "tile");
            Intrinsics.checkNotNullParameter(customRatingSelection, "customRatingSelection");
            String strQ3 = j6.a.q("SlotTodoTile CustomerRating ", tile4.f135760a.f135798b);
            TextClause textClause6 = new TextClause(tile4.f135761b.f135758a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ArrayList arrayList = new ArrayList(5);
            while (i < 5) {
                i++;
                arrayList.add(new k90(new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, a0.d.n("rating_", i)));
            }
            bld.o oVar2 = (bld.o) customRatingSelection.get(tile4);
            f90 f90Var2 = new f90(strQ3, new j90(arrayList, oVar2 != null ? Integer.valueOf(oVar2.f16549a - 1) : null), textClause6, true, new b90(new TextLocalisedClause(R$string.rate_nps_unlikely, null, null, 14), new TextLocalisedClause(R$string.rate_nps_likely, null, null, 14)), tile4);
            yp0.b.l(f90Var2, 0, 0, 0, 0, null, false, 63);
            return f90Var2;
        }
        f0 tile5 = (f0) w0Var;
        v0 v0Var4 = tile5.f135762a;
        Intrinsics.checkNotNullParameter(tile5, "tile");
        String strQ4 = j6.a.q("SlotTodoTile NoButtons ", v0Var4.f135798b);
        c0 c0Var = tile5.f135763b;
        String str3 = c0Var.f135750a;
        fkd.d0 d0Var = c0Var.d;
        TextClause textClause7 = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause8 = new TextClause(c0Var.f135751b, (Style) null, (d0Var != null ? d0Var.f135756a : null) == e0.WARNING ? Integer.valueOf(R$attr.uikit_colorOrange) : null, false, (o9) null, (List) null, 122);
        SlotIconAsset slotIconAsset3 = c0Var.f;
        h hVar = this.f162230b;
        if (slotIconAsset3 == null || (urlImage = hVar.f162227a.a(slotIconAsset3)) == null) {
            urlImage = new UrlImage(c0Var.e, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        }
        SlotIconAsset slotIconAsset4 = c0Var.f135753g;
        m mVar2 = new m(urlImage, (NewBadgeContent.WithNumber) null, slotIconAsset4 != null ? hVar.f162228b.a(slotIconAsset4) : null, 10);
        if (c0Var.f135752c) {
            aVar = new ActionWidgetDelegate.Model.b.a(null);
        }
        r112 = d0Var != null ? d0Var.f135756a : null;
        q qVar3 = (r112 != null ? g.f162226a[r112.ordinal()] : -1) == 1 ? q.HIGH_ALERT : q.REGULAR;
        SlotTileMessageMetadataContext.a aVarNewBuilder3 = SlotTileMessageMetadataContext.newBuilder();
        aVarNewBuilder3.h(v0Var4.f135798b);
        AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
        com.google.protobuf.w0 w0VarA3 = aVarNewBuilder3.a();
        companion3.getClass();
        ActionWidgetDelegate.Model model3 = new ActionWidgetDelegate.Model(strQ4, textClause7, textClause8, mVar2, aVar, iVar, qVar3, tile5, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA3)), true, 5632);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        return model3;
    }

    public final List b(List tiles, Map customRatingSelection, mkd.f presentation) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        Intrinsics.checkNotNullParameter(customRatingSelection, "customRatingSelection");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        if (tiles.isEmpty()) {
            return zhm.f0.f322471a;
        }
        if (presentation == mkd.f.SCROLLER) {
            if (tiles.size() > 1) {
                List list = tiles;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (!(((w0) it8.next()) instanceof r)) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(a((w0) it9.next(), customRatingSelection));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (linkedHashSet.add(((qv0.i) obj2).getF52903a())) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList.size() != arrayList2.size()) {
                    Map mapA = k0.a(new ebf.b(1, arrayList));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapA.entrySet()) {
                        if (((Number) entry.getValue()).intValue() > 1) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Duplicate todo tile listIds in CAROUSEL: ", d0.k0(linkedHashMap.keySet(), null, null, null, 0, null, 63)));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                hg hgVar = new hg("SlotTodoTilesMapper_SCROLLER_ID", arrayList2, 1, x4.c.f10604a, null, new gg.b(arrayList2.size() > 1, 2), false, false, null, null, 0, 0, 0, 0, 32720);
                int i = R$attr.uikit_dp0;
                yp0.b.r(hgVar, 0, 0, i, i, 3);
                return u.c(hgVar);
            }
        }
        return u.c(a((w0) d0.b0(tiles), customRatingSelection));
    }
}
