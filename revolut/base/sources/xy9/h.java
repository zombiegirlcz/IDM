package xy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import com.revolut.feature.pix.api.navigation.PixQrNavigation$Destination;
import com.revolut.feature.pix.api.navigation.PixQrNavigation$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SendFromClipboardType.PixType.QrCode f309658w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, SendFromClipboardType.PixType.QrCode qrCode, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f309658w = qrCode;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f309658w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s8a.l lVar = oVar.f309672m;
            String str = this.f309658w.f79709a;
            this.u = 1;
            obj2 = lVar.a(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        PixQrCodeDecodeResult pixQrCodeDecodeResult = (PixQrCodeDecodeResult) obj2;
        return oVar.A2(new PixQrNavigation$Destination(new PixQrNavigation$InputData.Send(pixQrCodeDecodeResult.f80459a, oVar.o.a(pixQrCodeDecodeResult))));
    }
}
