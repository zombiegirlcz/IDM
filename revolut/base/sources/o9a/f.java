package o9a;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.api.model.PixQrCodeImplementation;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.x10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nya.i0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixAuthorisationRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PixAuthorisationRequestScreen pixAuthorisationRequestScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixAuthorisationRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            default:
                return new f(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        PixAuthorisationRequestScreen pixAuthorisationRequestScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) pixAuthorisationRequestScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar3 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) pixAuthorisationRequestScreen.d();
                PixQrCodeDecodeData pixQrCodeDecodeData = ((j) ((j2) aVar3.f80599t.f22677a).getValue()).f223156c;
                Continuation continuation = null;
                if (pixQrCodeDecodeData == null) {
                    aVar3.l2(new w(aVar3, continuation, 0), new yi5.b(26));
                } else {
                    PixQrCodeImplementation pixQrCodeImplementation = pixQrCodeDecodeData.f80446b;
                    int i2 = pixQrCodeImplementation == null ? -1 : t.f223171a[pixQrCodeImplementation.ordinal()];
                    if (i2 == 1) {
                        aVar3.l2(new i0(aVar3, pixQrCodeDecodeData, null, 14), new yi5.b(26));
                    } else if (i2 != 2) {
                        int i3 = jli.h.f175850a;
                    } else {
                        oki.h.v2(aVar3.u, PixAuthorisationRequestScreenContract$ModalStep.AuthorisationRequestedForDownPayment.f80590a, bottom_dialog);
                    }
                }
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar5 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) pixAuthorisationRequestScreen.d();
                if (((j) ((j2) aVar5.f80599t.f22677a).getValue()).f223156c != null) {
                    aVar5.C2(m.f223160a);
                } else {
                    oki.h.v2(aVar5.u, PixAuthorisationRequestScreenContract$ModalStep.RejectionReason.f80592a, bottom_dialog);
                }
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar7 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) pixAuthorisationRequestScreen.d();
                io3.d dVar = ((j) ((j2) aVar7.f80599t.f22677a).getValue()).f223155b;
                if (dVar != null) {
                    xi0.a aVar8 = xi0.b.Companion;
                    String str = dVar.f163147c;
                    aVar8.getClass();
                    aVar7.C2(new k(xi0.a.a(str)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
