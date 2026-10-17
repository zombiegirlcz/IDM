package g0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f139383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f139384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MessageItem f139385y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, String str, MessageItem messageItem, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f139383w = gVar;
        this.f139384x = str;
        this.f139385y = messageItem;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f139383w, this.f139384x, this.f139385y, continuation, 0);
            default:
                return new d(this.f139383w, this.f139384x, this.f139385y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MessageItem messageItem = this.f139385y;
        String str = this.f139384x;
        g gVar = this.f139383w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    c cVar = new c(gVar, str, messageItem, null);
                    p0 p0Var = p0.f264001a;
                    elm.f fVar = elm.f.f127540b;
                    this.v = 1;
                    if (e0.J(fVar, cVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    f fVar2 = new f(gVar, str, messageItem, null);
                    p0 p0Var2 = p0.f264001a;
                    elm.f fVar3 = elm.f.f127540b;
                    this.v = 1;
                    if (e0.J(fVar3, fVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
