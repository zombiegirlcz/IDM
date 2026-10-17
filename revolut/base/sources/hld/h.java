package hld;

import aw0.o9;
import aw0.x4;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.u6;
import com.revolut.core.ui_kit.delegates.v6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TrackableClause;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.slot_manager.impl.R$string;
import com.revolut.tracking.v3.SlotTileMessageMetadataContext;
import ekd.e0;
import ekd.h0;
import ekd.n0;
import ekd.q;
import ekd.q0;
import ekd.t;
import ekd.z;
import hhd.n;
import ip0.am;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(ArrayList arrayList) {
        aim.e eVarB = u.b();
        hg hgVar = new hg("SlotSuggestionsMapper_SCROLLER_ID_PREFIX", arrayList, 1, x4.c.f10604a, null, new gg.b(arrayList.size() > 1, 2), false, false, null, null, 0, 0, 0, 0, 32720);
        int i = R$attr.uikit_dp0;
        yp0.b.r(hgVar, 0, 0, i, i, 3);
        eVarB.add(hgVar);
        return u.a(eVarB);
    }

    public static List b(List items) {
        am amVar;
        HeroBannerDelegate.Model model;
        HeroBannerDelegate.b v6Var;
        am amVar2;
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            return f0.f322471a;
        }
        List<q0> list = items;
        String strK0 = d0.k0(list, ",", null, null, 0, new n(23), 30);
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (q0 q0Var : list) {
            if (q0Var instanceof z) {
                z zVar = (z) q0Var;
                q qVar = zVar.f127029a;
                String strQ = j6.a.q("INCENTIVE_LIST_ID_PREFIX ", qVar.f127019a);
                int i = R$string.communication_banner_hero_title;
                ekd.n nVar = zVar.f127030b;
                TrackableClause trackableClause = new TrackableClause(new TextClause(nVar.f127012a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i);
                TextClause textClause = new TextClause(nVar.f127013b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                UrlMedia urlMedia = new UrlMedia(nVar.d);
                ekd.u uVar = nVar.e;
                if (uVar != null) {
                    t tVar = uVar.f127023a;
                    double d = uVar.f127025c;
                    double d5 = uVar.f127024b;
                    int i2 = i.f153449c[tVar.ordinal()];
                    if (i2 == 1) {
                        v6Var = new v6((int) d5, (int) d);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        v6Var = new u6((int) Math.rint((d5 / d) * ((double) 100)));
                    }
                } else {
                    v6Var = null;
                }
                HeroBannerDelegate.b bVar = v6Var;
                int i3 = i.f153448b[nVar.f.f127028a.ordinal()];
                if (i3 == 1) {
                    amVar2 = am.LIGHT;
                } else if (i3 == 2) {
                    amVar2 = am.DARK;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    amVar2 = am.AUTO;
                }
                am amVar3 = amVar2;
                SlotTileMessageMetadataContext.a aVarNewBuilder = SlotTileMessageMetadataContext.newBuilder();
                aVarNewBuilder.h(qVar.f127019a);
                aVarNewBuilder.c();
                ((SlotTileMessageMetadataContext) aVarNewBuilder.f49761b).setAllCampaignIds(strK0);
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                w0 w0VarA = aVarNewBuilder.a();
                companion.getClass();
                model = new HeroBannerDelegate.Model(strQ, (Clause) trackableClause, (Clause) textClause, (Media) urlMedia, bVar, false, amVar3, (Object) zVar, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), 352);
            } else {
                if (!(q0Var instanceof n0)) {
                    throw new NoWhenBranchMatchedException();
                }
                n0 n0Var = (n0) q0Var;
                h0 h0Var = n0Var.f127015a;
                String strQ2 = j6.a.q("SUGGESTED_FOR_YOU_KEY_LIST_ID ", h0Var.f127001a);
                int i5 = R$string.communication_banner_hero_title;
                e0 e0Var = n0Var.f127016b;
                TrackableClause trackableClause2 = new TrackableClause(new TextClause(e0Var.f126993a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i5);
                TextClause textClause2 = new TextClause(e0Var.f126994b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                UrlMedia urlMedia2 = new UrlMedia(e0Var.d);
                int i6 = i.f153447a[e0Var.e.f127011a.ordinal()];
                if (i6 == 1) {
                    amVar = am.DARK;
                } else if (i6 == 2) {
                    amVar = am.LIGHT;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    amVar = am.AUTO;
                }
                am amVar4 = amVar;
                SlotTileMessageMetadataContext.a aVarNewBuilder2 = SlotTileMessageMetadataContext.newBuilder();
                aVarNewBuilder2.h(h0Var.f127001a);
                aVarNewBuilder2.c();
                ((SlotTileMessageMetadataContext) aVarNewBuilder2.f49761b).setAllCampaignIds(strK0);
                AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                w0 w0VarA2 = aVarNewBuilder2.a();
                companion2.getClass();
                model = new HeroBannerDelegate.Model(strQ2, (Clause) trackableClause2, (Clause) textClause2, (Media) urlMedia2, (HeroBannerDelegate.b) null, false, amVar4, (Object) n0Var, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2)), 368);
            }
            arrayList.add(model);
        }
        return a(arrayList);
    }
}
