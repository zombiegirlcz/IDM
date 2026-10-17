package pu5;

import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import prl.n;
import ufm.i;
import wsg.k;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239825a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f239826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f239827c;

    public /* synthetic */ b(d dVar, boolean z) {
        this.f239827c = dVar;
        this.f239826b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f239825a) {
            case 0:
                Boolean deeplinkWasHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkWasHandled, "deeplinkWasHandled");
                if (deeplinkWasHandled.booleanValue()) {
                    ufm.b bVarM = d0.m(Boolean.TRUE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                d dVar = this.f239827c;
                d0 d0VarC = ((ji5.e) ((xh5.a) dVar.f239831c.f282889b)).c();
                k kVar = new k(new wsg.a(14), 4);
                d0VarC.getClass();
                i iVar = new i(d0VarC, kVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                i iVar2 = new i(new ufm.f(iVar, new n(7, new b(this.f239826b, dVar)), 3), new n(8, new psl.e(20)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return ue0.e.F(iVar2, Boolean.TRUE);
            default:
                d dVar2 = this.f239827c;
                NaviCommand naviCommandC = dVar2.d;
                if (((Boolean) obj2).booleanValue()) {
                    FeatureCommand featureCommandF = gc0.c.f(new KompotOverlayFeatureConfig(CryptoInvestmentsFeatureConfig.TaxReportDestination.f71406a, yhi.b.SOLID, (Integer) null, 12));
                    naviCommandC = this.f239826b ? com.revolut.retail.core.navigation.a.c(naviCommandC, featureCommandF) : featureCommandF;
                }
                dVar2.f239830b.c(naviCommandC);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(boolean z, d dVar) {
        this.f239826b = z;
        this.f239827c = dVar;
    }
}
