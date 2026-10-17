package jyk;

import com.revolut.retail.core.navigation.NaviCommand;
import ip0.yc0;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jsl.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f179485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f179486c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ j(jf0.c cVar, r rVar, boolean z) {
        this.f179484a = 0;
        this.f179486c = cVar;
        this.f179485b = rVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f179484a;
        r rVar = this.f179485b;
        int i2 = 3;
        boolean z = this.d;
        jf0.c cVar = this.f179486c;
        int i3 = 1;
        switch (i) {
            case 0:
                Boolean tradingEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(tradingEnabled, "tradingEnabled");
                if (!tradingEnabled.booleanValue()) {
                    return efm.d0.m(Boolean.FALSE);
                }
                String strE = cVar.e(3);
                boolean zF = Intrinsics.f(strE, "TAX_ADVANTAGED:YOUTH_TAX_ADVANTAGED");
                r rVar2 = this.f179485b;
                if (zF) {
                    ufm.i iVar = new ufm.i(rVar2.c(), new jy2.a(new j(rVar2, cVar, z, i3), 15), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    return iVar;
                }
                if (strE.length() <= 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "TradingAccountOnboardingDeeplinkActionPerformerImpl", "Trading onboarding deeplink received with empty accountId", null, null, 16);
                    ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                n nVarG = rVar2.g(cVar);
                if (!(nVarG instanceof m)) {
                    if (!(nVarG instanceof l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ufm.b bVarM2 = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                int i5 = 16;
                ufm.i iVar2 = new ufm.i(new ufm.i(te0.w.o0(p0.f264003c, new ix6.l0(rVar2, strE, ((m) nVarG).f179493a, (Continuation) null, 27)), new jy2.a(new jud.d(rVar2, i5), i5), 0), new jy2.a(new j(rVar2, cVar, z, 2), 17), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 1:
                HashMap map = cVar.d;
                Boolean jisaAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(jisaAvailable, "jisaAvailable");
                if (!jisaAvailable.booleanValue()) {
                    return efm.d0.m(Boolean.FALSE);
                }
                int i6 = 13;
                ufm.i iVar3 = new ufm.i(te0.w.o0(p0.f264003c, new t0((String) map.get("beneficiaryId"), rVar, null, i6)), new jy2.a(new ay2.k(Intrinsics.f(map.get("presentation_type"), "inline"), z, rVar, i2), i6), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return new ufm.i(new ufm.f(iVar3, new jy2.a(new yc0(1, rVar.e, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 19), 11), i2), new jy2.a(new jxb.g(27), 12), 1);
            default:
                NaviCommand targetCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
                sri.m mVar = rVar.e;
                if (cVar.l() && z) {
                    targetCommand = com.revolut.retail.core.navigation.a.c(r.b(), targetCommand);
                }
                mVar.c(targetCommand);
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ j(r rVar, jf0.c cVar, boolean z, int i) {
        this.f179484a = i;
        this.f179485b = rVar;
        this.f179486c = cVar;
        this.d = z;
    }
}
