package hw1;

import com.revolut.feature.apm.breb.impl.ui.new_contact.BrebNewContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BrebNewContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(BrebNewContactScreen brebNewContactScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = brebNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BrebNewContactScreen brebNewContactScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) brebNewContactScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) brebNewContactScreen.d();
                uVar.getClass();
                uVar.l2(new gvc.m(uVar, null, 28), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
