package bba;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f14216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, RowDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f14216w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f14216w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        s sVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s8a.l lVar = sVar.f14218q;
            String strValueOf = String.valueOf(this.f14216w.u);
            this.u = 1;
            obj2 = lVar.a(strValueOf, this);
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
        sVar.C2(new g(pixQrCodeDecodeResult.f80459a, sVar.f14219r.a(pixQrCodeDecodeResult)));
        return Unit.f186387a;
    }
}
