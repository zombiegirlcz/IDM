package vfg;

import hfg.b0;
import java.util.Set;
import jsl.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;
import zh9.u0;
import zhm.d0;
import zhm.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lfg.i f288615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfg.e f288616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final svb.a f288617c;
    public final b6c.c d;

    public e(lfg.i airlinesRepository, lfg.e accountRepository, svb.a revPointsGiftcardsFeatureInteractor, b6c.c revolutPayInfoInteractor) {
        Intrinsics.checkNotNullParameter(airlinesRepository, "airlinesRepository");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revolutPayInfoInteractor, "revolutPayInfoInteractor");
        this.f288615a = airlinesRepository;
        this.f288616b = accountRepository;
        this.f288617c = revPointsGiftcardsFeatureInteractor;
        this.d = revolutPayInfoInteractor;
    }

    public static akg.n a(e eVar, String airlineId) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        lfg.e eVar2 = eVar.f288616b;
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = rd0.e.b(eVar2.e.e(Unit.f186387a, loadingStrategy));
        v1 v1Var = new v1(new t0((jwb.c) eVar.f288617c, (Continuation) null, 7));
        lfg.i iVar = eVar.f288615a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(airlineId, "airlineId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(dVarB, nim.a.v(u0.m(v1Var, rd0.e.b(iVar.f.e(airlineId, loadingStrategy))), new vf0.p(11))), new vdl.a(eVar, 15));
    }

    public final akg.n b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        b0 b0Var = b0.MILES;
        b0 b0Var2 = b0.GIFT_CARDS;
        jwb.c cVar = (jwb.c) this.f288617c;
        Continuation continuation = null;
        if (!cVar.a()) {
            b0Var2 = null;
        }
        b0 b0Var3 = b0.REV_PAY;
        if (!((q7c.p) this.d).f242829b.g()) {
            b0Var3 = null;
        }
        Set allowedRedemptionTypes = z0.i(b0Var, b0Var2, b0Var3);
        lfg.e eVar = this.f288616b;
        eVar.getClass();
        w4l.h loadingStrategy2 = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        vkm.d dVarB = rd0.e.b(eVar.e.e(Unit.f186387a, loadingStrategy2));
        v1 v1Var = new v1(new t0(cVar, continuation, 7));
        lfg.i iVar = this.f288615a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(allowedRedemptionTypes, "allowedRedemptionTypes");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(nim.a.v(u0.m(dVarB, nim.a.v(u0.m(v1Var, rd0.e.b(iVar.e.e(d0.d1(allowedRedemptionTypes), loadingStrategy))), new vf0.p(10))), new vf0.p(this, 9)), new vf0.p(8));
    }
}
