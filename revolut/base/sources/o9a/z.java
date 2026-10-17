package o9a;

import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a f223180w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f223180w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f223180w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            default:
                z zVar2 = new z(this.f223180w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((PixAuthorisationRequestScreenContract$InputData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 0;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar2 = this.f223180w;
                aVar2.H2(aVar2.f80599t, new y(data, 0));
                break;
            default:
                PixAuthorisationRequestScreenContract$InputData pixAuthorisationRequestScreenContract$InputData = (PixAuthorisationRequestScreenContract$InputData) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                PixQrCodeDecodeData pixQrCodeDecodeData = pixAuthorisationRequestScreenContract$InputData.f80589b;
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar4 = this.f223180w;
                if (pixQrCodeDecodeData == null) {
                    yji.l.a1(aVar4, aVar4.f80597r.a(((PixAuthorisationRequestScreenContract$InputData) aVar4.o.getValue()).f80588a), null, null, new z(aVar4, null, i), 3);
                }
                aVar4.H2(aVar4.f80599t, new o3k.a(pixAuthorisationRequestScreenContract$InputData, 23));
                break;
        }
        return Unit.f186387a;
    }
}
