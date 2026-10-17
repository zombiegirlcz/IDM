package n33;

import com.revolut.core.model.account.AccountId;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211753a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r2 f211754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e13.a f211755c;

    public /* synthetic */ k2(e13.a aVar, r2 r2Var) {
        this.f211755c = aVar;
        this.f211754b = r2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211753a) {
            case 0:
                r2 r2Var = this.f211754b;
                r rVar = r2Var.d;
                f73.b bVar = r2Var.f211794b;
                AccountId.Joint jointAccountId = (AccountId.Joint) obj2;
                Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
                int i = o2.f211777b[this.f211755c.ordinal()];
                if (i == 1) {
                    return bVar.f(xfa.b.CARDS_TAB_FULL_SCREEN, jointAccountId, ((t0) rVar).c(), null);
                }
                if (i == 2) {
                    return bVar.h(xfa.b.CARDS_TAB_FULL_SCREEN, jointAccountId, null, ((t0) rVar).c(), e93.v.GET_PHYSICAL_CARD, r2Var.d(), null);
                }
                if (i == 3) {
                    return n63.i.a(bVar, xfa.b.CARDS_TAB_FULL_SCREEN, jointAccountId, null, ((t0) rVar).c(), r2Var.d(), null, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE);
                }
                throw new NoWhenBranchMatchedException();
            default:
                r2 r2Var2 = this.f211754b;
                r2Var2.getClass();
                pfm.h hVar = new pfm.h(new ly2.d(r2Var2, 10, this.f211755c, (n2) obj2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
        }
    }

    public /* synthetic */ k2(r2 r2Var, e13.a aVar) {
        this.f211754b = r2Var;
        this.f211755c = aVar;
    }
}
