package wo5;

import com.revolut.feature.crypto.withdraw.api.models.SupportedSendRecipientInput;
import com.revolut.kompot.common.ParcelableDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lo5.p;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f298887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f298887w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f298887w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar = this.f298887w;
        xi0.b bVar = dVar.f298882a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            p pVar = this.v.e;
            this.u = 1;
            obj2 = ((fp5.f) pVar).b(bVar, SupportedSendRecipientInput.Default.f71115a, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ParcelableDestination parcelableDestination = (ParcelableDestination) obj2;
        q06.b bVar2 = null;
        if (dVar.f298883b == c.WITHDRAW && bVar == null) {
            bVar2 = new q06.b(ibb.c.d, null);
        }
        return new q06.h(parcelableDestination, bVar2);
    }
}
