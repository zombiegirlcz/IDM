package v7e;

import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SubaccountInfoPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SubaccountInfoPickerScreen subaccountInfoPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = subaccountInfoPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        String str;
        int i = this.u;
        SubaccountInfoPickerScreen subaccountInfoPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                subaccountInfoPickerScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) subaccountInfoPickerScreen.T2();
                uVar.getClass();
                em2.b.Companion.getClass();
                uVar.f2(uVar.e1(new cm2.c(em2.a.a())), ModalDestination.Style.POPUP.f98311a, new n(uVar, 0));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar2 = (u) subaccountInfoPickerScreen.T2();
                SubaccountType subaccountType = uVar2.f286615p.f89047a;
                String str2 = ((g) uVar2.t2()).f286591b;
                f fVar = (f) ((g) uVar2.t2()).e.getContent();
                if (fVar == null || (bVar = fVar.f286587a) == null) {
                    throw new IllegalStateException("Currency can't be null");
                }
                ChosenBackground chosenBackground = ((g) uVar2.t2()).f286592c;
                if (chosenBackground == null || (str = chosenBackground.f63741a) == null) {
                    throw new IllegalStateException("Image can't be null");
                }
                uVar2.v2(new i(subaccountType, str2, str, bVar));
                return Unit.f186387a;
        }
    }
}
