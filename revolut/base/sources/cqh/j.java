package cqh;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108112a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ryc.a f108113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5d.d f108114c;

    public j(a filtersMapper, ryc.a instrumentsMapper, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(instrumentsMapper, "instrumentsMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f108113b = instrumentsMapper;
        this.f108114c = swipeAssetTradeActionsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        switch (this.f108112a) {
            case 0:
                g domainState = (g) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                List filters = domainState.f108107c.f238003c;
                Map selections = domainState.f108106b;
                Intrinsics.checkNotNullParameter(filters, "filters");
                Intrinsics.checkNotNullParameter(selections, "selections");
                mx0.l lVar = mx0.l.SCROLLABLE;
                List list = filters;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    poh.l lVar2 = (poh.l) obj2;
                    poh.k kVarB = (poh.k) selections.get(lVar2);
                    if (kVarB == null) {
                        kVarB = lVar2.b();
                    }
                    arrayList.add(new ActionsView.Item(a0.d.n("meta_collection_filter_", i), mx0.d.SEMIBLACK, false, e4.EnabledClickable, null, kVarB.a(), lVar2.getIcon(), null, null, null, false, null, null, new b(i), null, 24468));
                    i = i2;
                }
                ArrayList arrayListE0 = d0.E0(this.f108114c.c(domainState.d, ryc.a.g(this.f108113b, domainState.f108105a, false, false, false, 2)), u.c(new z("meta_collection_filters", arrayList, null, lVar, R$attr.uikit_dp0, R$attr.uikit_dp24, 68)));
                poh.i iVar = domainState.f108107c;
                return new i(iVar.f238001a, iVar.f238002b, arrayListE0);
            default:
                eqh.f domainState2 = (eqh.f) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return new eqh.i(this.f108114c.c(domainState2.f128461b, ryc.a.g(this.f108113b, domainState2.f128460a, false, false, true, 14)));
        }
    }

    public j(ryc.a extensionMapper, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(extensionMapper, "extensionMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f108113b = extensionMapper;
        this.f108114c = swipeAssetTradeActionsMapper;
    }
}
