package wbf;

import efm.d0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r7i.r;
import retrofit2.Response;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbf.d f296157a;

    public o(rbf.d tradingAddOnListRepository) {
        Intrinsics.checkNotNullParameter(tradingAddOnListRepository, "tradingAddOnListRepository");
        this.f296157a = tradingAddOnListRepository;
    }

    public final ufm.n a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "addOnId");
        rbf.d dVar = this.f296157a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        d0<Response<Unit>> d0VarUnsubscribeFromAddOn = dVar.f253043a.unsubscribeFromAddOn(id10);
        r83.d dVar2 = new r83.d(25, new r(24));
        d0VarUnsubscribeFromAddOn.getClass();
        ufm.i iVar = new ufm.i(d0VarUnsubscribeFromAddOn, dVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }
}
