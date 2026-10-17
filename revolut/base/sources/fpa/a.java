package fpa;

import com.revolut.feature.profile_card.BaseProfileCardScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BaseProfileCardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BaseProfileCardScreen baseProfileCardScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = baseProfileCardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, continuation, 0);
            case 1:
                return new a(this.v, continuation, 1);
            default:
                return new a(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BaseProfileCardScreen baseProfileCardScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                baseProfileCardScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                baseProfileCardScreen.d3().N();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                baseProfileCardScreen.d3().q();
                break;
        }
        return Unit.f186387a;
    }
}
