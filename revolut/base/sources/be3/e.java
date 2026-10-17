package be3;

import a2g.p;
import a82.r;
import aw0.f4;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CashbackWithdrawMetalScreen f14655w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14655w = cashbackWithdrawMetalScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f14655w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f14655w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CashbackWithdrawMetalScreen cashbackWithdrawMetalScreen = this.f14655w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar = (g) cashbackWithdrawMetalScreen.Z.getValue();
                String amountString = charSequence.toString();
                m mVar = (m) gVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                mVar.x2(new r(mVar.f14671t.b(amountString, ((f) mVar.t2()).f14656a.f278974b.f163147c), 5));
                break;
            default:
                f4 f4Var = (f4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar2 = (g) cashbackWithdrawMetalScreen.Z.getValue();
                boolean z = f4Var.f10304b;
                m mVar2 = (m) gVar2;
                mVar2.getClass();
                mVar2.x2(new p(z, 18));
                break;
        }
        return Unit.f186387a;
    }
}
