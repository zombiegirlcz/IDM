package mbi;

import com.revolut.feature_retail_user_declarations.gender.GenderScreen;
import com.revolut.feature_retail_user_declarations.gender.GenderScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GenderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(GenderScreen genderScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = genderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GenderScreen genderScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature_retail_user_declarations.gender.a) genderScreen.e3()).C2(g.f204223a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature_retail_user_declarations.gender.a) genderScreen.e3()).f97654q, GenderScreenContract$ModalStep.InfoDialog.f97652a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature_retail_user_declarations.gender.a aVar4 = (com.revolut.feature_retail_user_declarations.gender.a) genderScreen.e3();
                aVar4.C2(new h((bj0.b) ((f) ((j2) aVar4.f97653p.f22677a).getValue()).f204222a.c()));
                break;
        }
        return Unit.f186387a;
    }
}
