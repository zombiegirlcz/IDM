package ko8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.enter_qr_data.EnterQrDataController;
import k7c.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EnterQrDataController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EnterQrDataController enterQrDataController, Continuation continuation) {
        super(2, continuation);
        this.v = enterQrDataController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.O.getValue();
        String qrData = textData.f52598b.toString();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(qrData, "qrData");
        iVar.H2(iVar.f186275p, new n(qrData, 14));
        return Unit.f186387a;
    }
}
