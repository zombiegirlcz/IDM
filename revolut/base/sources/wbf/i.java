package wbf;

import efm.d0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qbf.r;
import retrofit2.Response;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbf.d f296150a;

    public i(rbf.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f296150a = repository;
    }

    public final ufm.n a(String billingCycleId, qbf.i iVar, String description) {
        Intrinsics.checkNotNullParameter(billingCycleId, "billinbCycleId");
        Intrinsics.checkNotNullParameter(description, "feedback");
        rbf.d dVar = this.f296150a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(billingCycleId, "billingCycleId");
        Intrinsics.checkNotNullParameter(description, "description");
        d0<Response<Unit>> d0VarSendDowngradeSurvey = dVar.f253043a.sendDowngradeSurvey(new qbf.k(billingCycleId, new r(0), iVar != null ? new qbf.g(iVar) : null, new qbf.h(description)));
        r83.d dVar2 = new r83.d(26, new r7i.r(22));
        d0VarSendDowngradeSurvey.getClass();
        ufm.i iVar2 = new ufm.i(d0VarSendDowngradeSurvey, dVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return w.i0(iVar2);
    }
}
