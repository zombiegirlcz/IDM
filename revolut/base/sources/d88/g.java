package d88;

import cam.o;
import com.revolut.data.model.Data;
import com.revolut.feature.junior.accounts.impl.ui.switcher.mapper.JuniorDiscoveryProductAccountMapper;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import fmc.z;
import g88.i;
import io3.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.b0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pie.v;
import r10.w;
import sf8.m;
import vkm.q;
import wsg.n;
import zf8.k;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f112149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m78.d f112150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g88.g f112151c;
    public final l93.f d;
    public final ic8.b e;
    public final x79.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f112152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f112153h;
    public final ang.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gte.a f112154j;
    public final wsg.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f112155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f112156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f78.a f112157n;
    public final JuniorDiscoveryProductAccountMapper o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final te8.e f112158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i88.b f112159q;

    public g(k juniorAccountInfoProvider, m78.d juniorTransactionsInteractor, g88.g juniorAccountSwitcherProductMapper, l93.f revolutCardsInteractor, ic8.b juniorCardRequestInteractor, x79.a onHoldAccountInteractor, z graduationInteractor, b0 juniorPartnershipsActionInteractor, ang.f userInteractor, gte.a featureToggleInteractor, wsg.b walletInteractor, i juniorMulticurrencyAccountSwitcherProductMapper, n legacyWalletInteractor, f78.a juniorAccountDataSourceAggregatorDelegate, ag8.f juniorActionsProvider, JuniorDiscoveryProductAccountMapper juniorDiscoveryProductAccountMapper, te8.e juniorAccountInteractor, i88.b juniorMulticurrencyDiscoverContentProvider) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorTransactionsInteractor, "juniorTransactionsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountSwitcherProductMapper, "juniorAccountSwitcherProductMapper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(juniorCardRequestInteractor, "juniorCardRequestInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(graduationInteractor, "graduationInteractor");
        Intrinsics.checkNotNullParameter(juniorPartnershipsActionInteractor, "juniorPartnershipsActionInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorMulticurrencyAccountSwitcherProductMapper, "juniorMulticurrencyAccountSwitcherProductMapper");
        Intrinsics.checkNotNullParameter(legacyWalletInteractor, "legacyWalletInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDataSourceAggregatorDelegate, "juniorAccountDataSourceAggregatorDelegate");
        Intrinsics.checkNotNullParameter(juniorActionsProvider, "juniorActionsProvider");
        Intrinsics.checkNotNullParameter(juniorDiscoveryProductAccountMapper, "juniorDiscoveryProductAccountMapper");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorMulticurrencyDiscoverContentProvider, "juniorMulticurrencyDiscoverContentProvider");
        this.f112149a = juniorAccountInfoProvider;
        this.f112150b = juniorTransactionsInteractor;
        this.f112151c = juniorAccountSwitcherProductMapper;
        this.d = revolutCardsInteractor;
        this.e = juniorCardRequestInteractor;
        this.f = onHoldAccountInteractor;
        this.f112152g = graduationInteractor;
        this.f112153h = juniorPartnershipsActionInteractor;
        this.i = userInteractor;
        this.f112154j = featureToggleInteractor;
        this.k = walletInteractor;
        this.f112155l = juniorMulticurrencyAccountSwitcherProductMapper;
        this.f112156m = legacyWalletInteractor;
        this.f112157n = juniorAccountDataSourceAggregatorDelegate;
        this.o = juniorDiscoveryProductAccountMapper;
        this.f112158p = juniorAccountInteractor;
        this.f112159q = juniorMulticurrencyDiscoverContentProvider;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((io3.d) obj2).e == l.CURRENT) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final Flow b(String juniorId, v subSpaceIdentifier, w4l.k loadingStrategy, w wVar) {
        Flow gVar;
        w wVar2;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = 2;
        if (d.f112147a[subSpaceIdentifier.ordinal()] == 1) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            boolean zEquals = loadingStrategy.equals(w4l.i.f294643c);
            f78.a aVar = this.f112157n;
            wVar2 = wVar;
            gVar = nim.a.v(rd0.e.n(xam.a.h(new o(aVar, juniorId, loadingStrategy, wVar2, zEquals, null), q.r(new f5g.l(i), rd0.e.b(((n) aVar.k).e0(juniorId, loadingStrategy)))), h0.f322473a), new b(this, i));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(subSpaceIdentifier + " is not expected");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            gVar = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
            wVar2 = wVar;
        }
        return cj9.c.B(gVar, wVar2);
    }

    public final m c(f78.b bVar) {
        String str = bVar.f132572b;
        String str2 = bVar.f132571a;
        JuniorBankingProfile juniorBankingProfile = bVar.f132573c;
        String str3 = juniorBankingProfile.f77099b;
        String str4 = juniorBankingProfile.f77100c;
        sf8.h hVar = bVar.d;
        dj0.d dVar = bVar.f;
        io3.d dVar2 = bVar.e;
        psg.a aVar = bVar.f132574g;
        return new m(str, str2, str3, str4, hVar, dVar, dVar2, ag8.f.a(hVar, aVar, dVar), ta6.a.A(aVar), juniorBankingProfile.f77106n, juniorBankingProfile.i, juniorBankingProfile.f77101g, juniorBankingProfile.f77104l);
    }
}
