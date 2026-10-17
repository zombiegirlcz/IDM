package rrc;

import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ShareSalaryDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(ShareSalaryDetailsScreen shareSalaryDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = shareSalaryDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.v, continuation, 0);
            case 1:
                return new t(this.v, continuation, 1);
            default:
                return new t(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        ShareSalaryDetailsScreen shareSalaryDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                shareSalaryDetailsScreen.R2().C2(wpc.g.f299221a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarE3 = shareSalaryDetailsScreen.R2();
                wpc.f fVar = f0VarE3.f256766p;
                if (fVar instanceof wpc.d) {
                    if (((v) ((j2) f0VarE3.f256772x.f22677a).getValue()).f256801b) {
                        f0VarE3.l2(new e0(f0VarE3, continuation, 1), new yi5.b(26));
                    } else {
                        f0VarE3.l2(new e0(f0VarE3, continuation, 0), new yi5.b(26));
                    }
                } else {
                    if (!(fVar instanceof wpc.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f0VarE3.C2(wpc.h.f299222a);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarE32 = shareSalaryDetailsScreen.R2();
                wpc.f fVar2 = f0VarE32.f256766p;
                if (fVar2 instanceof wpc.d) {
                    f0VarE32.l2(new e0(f0VarE32, continuation, 2), new yi5.b(26));
                } else {
                    if (!(fVar2 instanceof wpc.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f0VarE32.C2(wpc.i.f299223a);
                }
                return Unit.f186387a;
        }
    }
}
