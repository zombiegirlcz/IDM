package com.revolut.feature.shops.impl.ui.map_view;

import aw0.x4;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsOutlet;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.map_view.a;
import com.revolut.feature.shops.impl.ui.map_view.c;
import cr0.h;
import hjd.z;
import ip0.tc0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jb3.l;
import jid.t;
import kjd.k;
import kjd.q;
import kjd.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ljd.b;
import ljd.g;
import org.jetbrains.annotations.NotNull;
import yv0.i;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f87239a;

    public f(z tagViewDataMapper, g outletLabelMapper, ljd.b mapper) {
        Intrinsics.checkNotNullParameter(tagViewDataMapper, "tagViewDataMapper");
        Intrinsics.checkNotNullParameter(outletLabelMapper, "outletLabelMapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f87239a = outletLabelMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0117, code lost:
    
        throw new java.lang.IllegalStateException(("Unknown day " + r11).toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03be  */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.revolut.core.ui_kit.models.Clause[], java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.List r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.map_view.f.a(java.util.List, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r47v0, types: [com.revolut.feature.shops.impl.ui.map_view.f] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    @Override // cli.n
    public final o c(j jVar) {
        b bVar;
        ah0.b bVar2;
        ?? arrayList;
        ?? arrayList2;
        h hVar;
        String str;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f186409a = f0.f322471a;
        Data data = domainState.f87230h;
        boolean z = domainState.f87227b;
        a bottomSheetState = domainState.f87229g;
        ah0.b bVar3 = domainState.e;
        iii.c.f(data, new e1.f(ref$BooleanRef, 3), new fb.c(ref$BooleanRef, ref$BooleanRef2, 28), new joa.j(ref$BooleanRef, ref$ObjectRef, 23));
        ShopsOutlet shopsOutlet = domainState.i;
        String str2 = shopsOutlet != null ? shopsOutlet.f87056a : null;
        if (bVar3 != null) {
            List listP0 = d0.P0((Iterable) ref$ObjectRef.f186409a, new r());
            ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
            Iterator it8 = listP0.iterator();
            while (it8.hasNext()) {
                arrayList3.add((ShopsOutlet) ((Pair) it8.next()).f186385a);
            }
            Companion.getClass();
            GmsLatLngBounds gmsLatLngBounds = (GmsLatLngBounds) bVar3;
            double d = gmsLatLngBounds.b().f4847a;
            bVar2 = bVar3;
            double d5 = gmsLatLngBounds.c().f4848b;
            co3.a aVar = new co3.a(d, d5);
            double d6 = gmsLatLngBounds.c().f4847a;
            ah0.a aVarB = gmsLatLngBounds.b();
            bVar = domainState;
            double d10 = aVarB.f4848b;
            bo3.a boundaries = new bo3.a(aVar, new co3.a(d6, d10));
            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
            Intrinsics.checkNotNullParameter(boundaries, "boundaries");
            double d15 = d10 - d5;
            if (d15 < 0.0d) {
                d15 += 360.0d;
            }
            double d41 = d15 * 0.08d;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List listP02 = d0.P0(arrayList3, new lid.e());
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listP02) {
                ShopsOutlet shopsOutlet2 = (ShopsOutlet) obj2;
                double d51 = d41;
                String strI = a0.d.i(rim.d.b(shopsOutlet2.d.f25487b / d51), ",", rim.d.b(shopsOutlet2.d.f25486a / d51));
                if (!linkedHashSet.contains(strI)) {
                    linkedHashSet.add(strI);
                    arrayList4.add(obj2);
                }
                d41 = d51;
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it9 = arrayList4.iterator();
            while (it9.hasNext()) {
                linkedHashSet2.add(((ShopsOutlet) it9.next()).f87056a);
            }
            if (str2 != null) {
                linkedHashSet2.add(str2);
            }
            Iterable iterable = (Iterable) ref$ObjectRef.f186409a;
            arrayList = new ArrayList();
            for (Object obj3 : iterable) {
                if (linkedHashSet2.contains(((ShopsOutlet) ((Pair) obj3).f186385a).f87056a)) {
                    arrayList.add(obj3);
                }
            }
        } else {
            bVar = domainState;
            bVar2 = bVar3;
            arrayList = (List) ref$ObjectRef.f186409a;
        }
        if (bVar2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj4 : (Iterable) arrayList) {
                ShopsOutlet shopsOutlet3 = (ShopsOutlet) ((Pair) obj4).f186385a;
                if (Intrinsics.f(shopsOutlet3.f87056a, str2)) {
                    str = str2;
                } else {
                    co3.a aVar2 = shopsOutlet3.d;
                    str = str2;
                    ah0.a point = new ah0.a(aVar2.f25486a, aVar2.f25487b);
                    Intrinsics.checkNotNullParameter(point, "point");
                    if (((GmsLatLngBounds) bVar2).f51395a.contains(l.M(point))) {
                    }
                    str2 = str;
                }
                arrayList2.add(obj4);
                str2 = str;
            }
        } else {
            arrayList2 = arrayList;
        }
        boolean z3 = (ref$BooleanRef2.f186407a || arrayList.isEmpty()) && !ref$BooleanRef.f186407a;
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        boolean zF = Intrinsics.f(bottomSheetState, a.C0547a.f87222a);
        a.d dVar = a.d.f87225a;
        if (zF) {
            hVar = h.ANCHORED;
        } else if (Intrinsics.f(bottomSheetState, dVar)) {
            hVar = h.EXPANDED;
        } else if (Intrinsics.f(bottomSheetState, a.b.f87223a)) {
            hVar = h.COLLAPSED;
        } else {
            if (!Intrinsics.f(bottomSheetState, a.c.f87224a)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = h.DRAGGING;
        }
        if (z3) {
            hVar = null;
        }
        if (hVar == null) {
            hVar = h.HIDDEN;
        }
        h hVar2 = hVar;
        ArrayList arrayListA = a(arrayList, z);
        ArrayList arrayListA2 = a(arrayList2, z);
        boolean zF2 = Intrinsics.f(bottomSheetState, dVar);
        kjd.g gVar = bVar.f87228c;
        boolean z4 = (gVar != null || bVar.f == null || zF2) ? false : true;
        float f = gVar != null ? gVar.f184375c : bVar.d;
        boolean z6 = bVar2 == null;
        t tVar = bVar.f87226a;
        List listC = arrayListA2.isEmpty() ? f0.f322471a : u.c(new hg("SHOPS_MAP_VIEW_HORIZONTAL_LIST", arrayListA2, 1, x4.c.f10604a, new tc0(shopsOutlet != null ? shopsOutlet.f87056a : null, true, 2), new gg.b(false, 3), true, false, null, null, 0, 0, 0, 0, 32640));
        String str3 = shopsOutlet != null ? shopsOutlet.f87056a : null;
        boolean z11 = bVar.f87227b;
        Iterable<Pair> iterable2 = (Iterable) arrayList;
        ArrayList<i> arrayList5 = new ArrayList(w.t(iterable2, 10));
        for (Pair pair : iterable2) {
            boolean z12 = z11;
            arrayList5.add(ljd.b.b(b.AbstractC1105b.a.f195652a, (ShopsCampaignOffer) pair.f186386b, (ShopsOutlet) pair.f186385a, str3, f, z12));
            z11 = z12;
        }
        ArrayList arrayList6 = new ArrayList();
        for (i iVar : arrayList5) {
            if (iVar == null) {
                iVar = null;
            }
            if (iVar != null) {
                arrayList6.add(iVar);
            }
        }
        kjd.g gVar2 = bVar.f87228c;
        c cVar = ref$BooleanRef.f186407a ? c.b.f87232a : z4 ? c.C0548c.f87233a : c.a.f87231a;
        TextLocalisedClause textLocalisedClause = !zF2 ? new TextLocalisedClause(R$string.shops_screens_map_in_store_title, null, null, 14) : null;
        boolean z29 = !zF2;
        String str4 = shopsOutlet != null ? shopsOutlet.f87057b : null;
        NotificationCentreItemDelegate.Model model = new NotificationCentreItemDelegate.Model("SHOPS_MAP_VIEW_EMPTY_BANNER", new TextLocalisedClause(R$string.shops_screens_map_no_results_card_title, null, null, 14), new TextLocalisedClause(R$string.shops_screens_map_no_results_card_subtitle, null, null, 14), null, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_map_point, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, null, 259440);
        yp0.b.l(model, 0, R$attr.uikit_dp0, 0, 0, null, false, 61);
        if (!z3) {
            model = null;
        }
        return new k(tVar, arrayListA, listC, arrayList6, z6, gVar2, textLocalisedClause, cVar, zF2, z29, hVar2, str4, model);
    }
}
