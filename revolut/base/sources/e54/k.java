package e54;

import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import dx4.z2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditAmountInputScreen f122747w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(CreditAmountInputScreen creditAmountInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122747w = creditAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f122747w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f122747w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((z2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditAmountInputScreen creditAmountInputScreen = this.f122747w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarR2 = creditAmountInputScreen.R2();
                Intrinsics.h(charSequence);
                ((com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) lVarR2).I2(charSequence);
                break;
            default:
                z2 infoItem = (z2) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) creditAmountInputScreen.R2();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(infoItem, "infoItem");
                oki.h.v2(bVar.u, new CreditAmountInputScreenContract$ModalStep.Info(infoItem), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
