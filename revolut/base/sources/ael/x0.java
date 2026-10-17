package ael;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import vdl.u1;
import vdl.v1;
import vdl.w1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class x0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f3680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3681c;

    public /* synthetic */ x0(b1 b1Var, String str, int i) {
        this.f3679a = i;
        this.f3680b = b1Var;
        this.f3681c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f3679a;
        String id10 = this.f3681c;
        b1 b1Var = this.f3680b;
        switch (i) {
            case 0:
                w1 w1Var = b1Var.f3598a;
                w1Var.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                efm.d0<rdl.a> tradeStatementConfirmationStatus = w1Var.f288055a.getTradeStatementConfirmationStatus(id10);
                v1 v1Var = v1.f;
                uyd.y yVar = new uyd.y(11);
                tradeStatementConfirmationStatus.getClass();
                ufm.i iVar = new ufm.i(tradeStatementConfirmationStatus, yVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return te0.w.i0(iVar);
            default:
                w1 w1Var2 = b1Var.f3598a;
                w1Var2.getClass();
                Intrinsics.checkNotNullParameter(id10, "accountId");
                efm.d0<rdl.a> suitabilityStatementStatus = w1Var2.f288055a.getSuitabilityStatementStatus(id10);
                u1 u1Var = u1.f;
                uyd.y yVar2 = new uyd.y(8);
                suitabilityStatementStatus.getClass();
                ufm.i iVar2 = new ufm.i(suitabilityStatementStatus, yVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return te0.w.i0(iVar2);
        }
    }
}
