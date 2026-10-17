package pjf;

import ahe.m0;
import akg.n;
import blj.t;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.retail.savings.api.SavingsAccountApi$Toggles;
import go.g;
import kkf.r6;
import klf.l1;
import klf.w1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.v;
import mjf.q;
import pcd.j;
import pj9.m;
import rnb.w;
import vkm.q0;
import vkm.y;
import w4l.h;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ohf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f236742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f236743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f236744c;

    public b(q calculatedBalanceInteractor, w savingsVaultInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(calculatedBalanceInteractor, "calculatedBalanceInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f236742a = calculatedBalanceInteractor;
        this.f236743b = savingsVaultInteractor;
        this.f236744c = featureToggleInteractor;
    }

    public static y b(Flow flow) {
        h0 h0Var = h0.f322473a;
        return new y(new w1(2, 15, null), rd0.e.e(mo3.a.g(rd0.e.n(flow, h0Var), null, new m(4), 1), h0Var, new otd.a(3, 6, null)));
    }

    @Override // eo0.b
    public final Object a(Continuation continuation) {
        Object objCollect;
        pcd.e eVar = new pcd.e(j.d.f234867a);
        w wVar = this.f236743b;
        bo8.w wVar2 = new bo8.w(yh5.b.e(b(wVar.d(eVar)), b(wVar.d(new pcd.e(j.b.f234865a))), !((jte.d) this.f236744c).c(SavingsAccountApi$Toggles.SavingsUnder18NewFetchingApi.f83074c) ? new g(f0.f322471a, 2) : b(wVar.d(new pcd.e(j.a.f234864a)))), 7);
        q qVar = this.f236742a;
        if (qVar.e.compareAndSet(false, true)) {
            n nVarB = qVar.d.b(h.f294642c);
            h0 h0Var = h0.f322473a;
            objCollect = t1.E(new r6(new v(t1.e0(yh5.b.d(new q0(new m0(rd0.e.e(mo3.a.g(rd0.e.n(nVarB, h0Var), null, new mh1.e(10), 1), h0Var, new l1(3, 23, null)), 12), new mjf.j(qVar, null, 0), 1), new q0(wVar2, new mjf.j(qVar, null, 1), 1))), qVar, 14), 25)).collect(new t(qVar, 14), continuation);
            if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                objCollect = Unit.f186387a;
            }
        } else {
            objCollect = Unit.f186387a;
        }
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    @Override // eo0.b
    public final /* bridge */ /* synthetic */ eo0.a c() {
        return eo0.a.f127858a;
    }
}
