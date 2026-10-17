package wj8;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends oki.h implements s {

    @NotNull
    public static final w Companion = new w();
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f297999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kge.d f298000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nj8.a f298001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jvh.a f298002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f298003t;
    public final vii.b u;

    public c0(v stateMapper, i inputData, hj8.a juniorProfileInteractor, kge.d juniorWorkflowBasedProfileInteractor, nj8.a juniorPersonalDataManageableConsentInteractor, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorWorkflowBasedProfileInteractor, "juniorWorkflowBasedProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorPersonalDataManageableConsentInteractor, "juniorPersonalDataManageableConsentInteractor");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = inputData;
        this.f297999p = juniorProfileInteractor;
        this.f298000q = juniorWorkflowBasedProfileInteractor;
        this.f298001r = juniorPersonalDataManageableConsentInteractor;
        this.f298002s = workflowInteractor;
        this.f298003t = mra.d.b(this, new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.u, new w2a.q(continuation, this, 15)), null, null, new x(this, continuation, 1), 3);
        i iVar = this.o;
        String juniorId = iVar.f298008a;
        kge.d dVar = this.f298000q;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        qj8.l lVar = (qj8.l) dVar.f183974b;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = lVar.d.b(juniorId, loadingStrategy);
        String juniorId2 = iVar.f298008a;
        nj8.a aVar = this.f298001r;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
        yji.l.a1(this, yh5.b.d(boh.f.e(rd0.e.b(osg.b.a(aVar.f216380a, juniorId2, false, 6)), new nc1.j(aVar, juniorId2, 13)), dVarB), null, null, new x(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f298003t;
    }
}
