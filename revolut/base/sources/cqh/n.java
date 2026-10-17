package cqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.util.List;
import kotlin.jvm.functions.Function1;
import uqh.t;
import uqh.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f108121b;

    public /* synthetic */ n(z zVar, int i) {
        this.f108120a = i;
        this.f108121b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        switch (this.f108120a) {
            case 0:
                return g.a((g) obj2, this.f108121b, null, null, null, 14);
            case 1:
                return eqh.f.a((eqh.f) obj2, this.f108121b, null, 2);
            case 2:
                jph.f fVar = (jph.f) obj2;
                z zVar = this.f108121b;
                t tVar = zVar.f282183a;
                return jph.f.a(fVar, zVar, (tVar != null && (list = tVar.f282176b) != null && (list.isEmpty() ^ true)) || (zVar.f != null), null, 4);
            case 3:
                nqh.d dVar = (nqh.d) obj2;
                ScreenerSelectedSorting screenerSelectedSorting = dVar.f218453b;
                z zVar2 = this.f108121b;
                if (screenerSelectedSorting == null) {
                    ScreenerSortingOptions screenerSortingOptions = zVar2.e;
                    screenerSelectedSorting = screenerSortingOptions != null ? new ScreenerSelectedSorting(screenerSortingOptions.f105173b, screenerSortingOptions.f105174c) : null;
                }
                return nqh.d.a(dVar, zVar2, screenerSelectedSorting, null, 4);
            default:
                return tph.f.a((tph.f) obj2, this.f108121b, null, null, 6);
        }
    }

    public /* synthetic */ n(z zVar, com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.a aVar) {
        this.f108120a = 2;
        this.f108121b = zVar;
    }
}
