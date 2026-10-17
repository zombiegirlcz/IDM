package n8a;

import com.revolut.feature.pix.impl.data.network.PixQrCodeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l8a.g0;
import l8a.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f213292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f213293x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213292w = b0Var;
        this.f213293x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f213292w, this.f213293x, continuation, 0);
            default:
                return new a0(this.f213292w, this.f213293x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f213293x;
        b0 b0Var = this.f213292w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PixQrCodeService pixQrCodeService = b0Var.f213297a;
                    h0 h0Var = new h0(str, null);
                    this.v = 1;
                    PixQrCodeService.Companion aVar2 = PixQrCodeService.INSTANCE;
                    obj2 = pixQrCodeService.decodeQrCode(h0Var, new wj0.b("QR_DECODE_IDEMPOTENCY_KEY"), this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return g4i.a.z((g0) obj2);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    PixQrCodeService pixQrCodeService2 = b0Var.f213297a;
                    this.v = 1;
                    PixQrCodeService.Companion aVar4 = PixQrCodeService.INSTANCE;
                    obj2 = pixQrCodeService2.getDecodedQrCode(str, new wj0.b("GET_DECODED_QR_IDEMPOTENCY_KEY"), this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return g4i.a.z((g0) obj2);
        }
    }
}
