package v25;

import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uyh.s;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f285650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f285650w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f285650w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f285650w;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVarG = m70.a.g(((y45.f) oVar.f285664m).l(str, w4l.j.f294644c), null, new s(28), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        LoanBackupCard loanBackupCard = (LoanBackupCard) obj2;
        Intrinsics.h(loanBackupCard);
        oVar.A2(new LoanKompotFeatureConfig.SelectBackupCardFlowNavigationDestination(str, loanBackupCard, false));
        return Unit.f186387a;
    }
}
