package maa;

import com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.PixAddTrustedAccountScreen;
import g8a.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixAddTrustedAccountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PixAddTrustedAccountScreen pixAddTrustedAccountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixAddTrustedAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixAddTrustedAccountScreen pixAddTrustedAccountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = pixAddTrustedAccountScreen.d();
                sVarE3.getClass();
                sVarE3.l2(new q(sVarE3, null, 0), new yi5.b(26));
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE32 = pixAddTrustedAccountScreen.d();
                sVarE32.getClass();
                sVarE32.C2(new k(t.ADD_TRUSTED));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pixAddTrustedAccountScreen.d().B2();
                break;
        }
        return Unit.f186387a;
    }
}
