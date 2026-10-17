package j68;

import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob.EditBirthDateController;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditBirthDateController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(EditBirthDateController editBirthDateController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editBirthDateController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EditBirthDateController editBirthDateController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) editBirthDateController.O.getValue();
                LocalDate localDate = ((e) ((j2) iVar.f171695q.f22677a).getValue()).f171688b;
                if (localDate == null) {
                    throw new IllegalStateException("EditBirthDateControllerModel - birthDate should be not null on continue button click");
                }
                iVar.C2(new f(localDate));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                editBirthDateController.m2().onBackPressed();
                return Unit.f186387a;
        }
    }
}
