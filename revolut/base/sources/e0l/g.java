package e0l;

import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import dt4.p;
import efm.r;
import ip0.og;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import pfm.m;
import te0.s;
import te0.w;
import tx0.t3;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f121729b;

    public /* synthetic */ g(l lVar, int i) {
        this.f121728a = i;
        this.f121729b = lVar;
    }

    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121728a) {
            case 0:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                l lVar = this.f121729b;
                return (List) iii.c.f(data, new g(lVar, 5), new p(lVar, 19), new dbg.b(lVar, 19));
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                efm.b bVar = (efm.b) this.f121729b.f121741r.getValue();
                Intrinsics.checkNotNullExpressionValue(bVar, "<get-forwardCompletable>(...)");
                return bVar;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xel.a documentValue = (xel.a) pair.f186386b;
                xzk.g gVar = this.f121729b.f121734h;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(documentValue, "documentValue");
                xzk.i iVar = (xzk.i) gVar.f310043a;
                pfm.a aVar = new pfm.a(w.H0(w.C(iVar.x0()), w.C(iVar.w0())), new xy7.j(14, new xyc.j(gVar, documentValue, 6)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 3:
                xel.c document = (xel.c) obj2;
                Intrinsics.checkNotNullParameter(document, "document");
                String url2 = document.f304710j;
                if (url2 == null) {
                    m mVar = m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                xzk.h hVar = (xzk.h) this.f121729b.i;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "infoLink");
                ln.a aVar2 = hVar.f310046b;
                hVar.f.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                return aVar2.a(u0.e(new ExternalDestination.Browser(url2, null)));
            case 4:
                od0.i nextDocumentPosition = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(nextDocumentPosition, "nextDocumentPosition");
                boolean zD = nextDocumentPosition.d();
                l lVar2 = this.f121729b;
                if (zD) {
                    xzk.b bVar2 = lVar2.i;
                    xzk.h hVar2 = (xzk.h) bVar2;
                    pfm.a aVarE = w.z0(((xzk.i) hVar2.d).w0(), Integer.valueOf(((Number) nextDocumentPosition.c()).intValue())).e(hVar2.j3(true));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    return aVarE.C();
                }
                xzk.g gVar2 = lVar2.f121734h;
                r rVarA = gVar2.a();
                r map = ((xzk.i) gVar2.f310043a).x0().c(s.f270018a).map(new xy7.j(11, new xx9.f(21)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return pd.b.r(mo3.a.n(pd.b.r(nim.a.w(u1.d(rVarA, map), new xzk.f(gVar2, 2)), new xzk.f(gVar2, 3))), new g(lVar2, 6));
            case 5:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                l lVar3 = this.f121729b;
                xpi.g gVar3 = lVar3.f121738n;
                t3 loadingType = t3.TWO_LINES;
                xpi.c cVar = (xpi.c) gVar3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(loadingType, "loadingType");
                NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
                if (navBarWithToolbar == null) {
                    Intrinsics.r("navBarWithToolbarView");
                    throw null;
                }
                navBarWithToolbar.I0(loadingType, true);
                ((f) lVar3.f121735j).getClass();
                return u.c(new og("NATIONAL_IDENTIFIER_DOCUMENT_LOADING_ID"));
            case 6:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                l lVar4 = this.f121729b;
                xzk.b bVar3 = lVar4.i;
                TradingOnboardingFeatureConfig onboardingLaunchingConfig = lVar4.o.f104206a;
                xzk.h hVar3 = (xzk.h) bVar3;
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
                r rVarC = ((pfm.h) hVar3.f310047c.c0(myk.a.a(onboardingLaunchingConfig, OnboardingPart.KycDocuments.f104079a, false, false))).C();
                Intrinsics.checkNotNullExpressionValue(rVarC, "toObservable(...)");
                return rVarC;
            default:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                l lVar5 = this.f121729b;
                xzk.g gVar4 = lVar5.f121734h;
                if (Intrinsics.f(it11, "READ_MORE")) {
                    r rVarS = mo3.a.s(nim.a.w(gVar4.b(lVar5.o), new dz7.k(24)), lVar5.f121736l);
                    Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
                    efm.b bVarSwitchMapCompletable = m70.a.g(rVarS, null, new e07.k(5), 1).switchMapCompletable(new e0f.k(new g(lVar5, 3), 19));
                    Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
                    return ue0.e.v(bVarSwitchMapCompletable);
                }
                if (!Intrinsics.f(it11, "SKIP")) {
                    throw new UnsupportedOperationException(j6.a.q("No action found for menu item ", it11));
                }
                xzk.i iVar2 = (xzk.i) gVar4.f310043a;
                pfm.a aVar3 = new pfm.a(w.H0(w.C(iVar2.x0()), w.C(iVar2.w0())), new xy7.j(10, new xzk.f(gVar4, 1)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                pfm.a aVarE2 = aVar3.e((efm.b) lVar5.f121741r.getValue());
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
        }
    }
}
