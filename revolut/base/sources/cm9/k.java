package cm9;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_with_smile.impl.ui.settings.PayWithSmileSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_with_smile.impl.ui.settings.a f25173w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25173w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f25173w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f25173w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar = this.f25173w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f78986s, new ck2.c(data, 4));
                break;
            default:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(popupMenuItem.getK(), "MORE_MENU_OPT_OUT")) {
                    oki.h.v2(aVar.f78985r, PayWithSmileSettingsScreenContract$ModalStep.ConfirmOptOut.f78982a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
