package xy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SendFromClipboardType.PixType.QrCode f309659w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, SendFromClipboardType.PixType.QrCode qrCode, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f309659w = qrCode;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f309659w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        SendFromClipboardType.PixType.QrCode qrCode = this.f309659w;
        o oVar = this.v;
        h hVar = new h(oVar, qrCode, null);
        this.u = 1;
        Object objY2 = oVar.Y2(this, hVar);
        return objY2 == aVar ? aVar : objY2;
    }
}
