package wbf;

import efm.d0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qbf.s;
import r7i.r;
import retrofit2.Response;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbf.d f296149a;

    public h(rbf.d tradingAddOnListRepository) {
        Intrinsics.checkNotNullParameter(tradingAddOnListRepository, "tradingAddOnListRepository");
        this.f296149a = tradingAddOnListRepository;
    }

    public final ufm.n a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "addOnId");
        rbf.d dVar = this.f296149a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        d0<Response<Unit>> d0VarSubscribeToAddOn = dVar.f253043a.subscribeToAddOn(id10, new s());
        rbf.c cVar = new rbf.c(new r(23), 1);
        d0VarSubscribeToAddOn.getClass();
        ufm.i iVar = new ufm.i(d0VarSubscribeToAddOn, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }
}
