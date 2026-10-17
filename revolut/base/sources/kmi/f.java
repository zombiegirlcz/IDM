package kmi;

import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import ard.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f185892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f185893x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f185893x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f185893x, continuation, 0);
                fVar.f185892w = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f185893x, continuation, 1);
                fVar2.f185892w = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f185893x, continuation, 2);
                fVar3.f185892w = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                ProducerScope producerScope = (ProducerScope) this.f185892w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    g gVar = this.f185893x;
                    c49.c cVar = new c49.c(producerScope, gVar, 2);
                    gVar.f185894a.registerReceiver(cVar, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"), null, null);
                    k8e.a aVar2 = new k8e.a(gVar, cVar, 19);
                    this.f185892w = null;
                    this.v = 1;
                    if (com.bumptech.glide.d.d(producerScope, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector = (FlowCollector) this.f185892w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    NfcAdapter nfcAdapterB = this.f185893x.b();
                    h hVar = (nfcAdapterB == null || !nfcAdapterB.isEnabled()) ? h.DISABLED : h.ENABLED;
                    this.f185892w = null;
                    this.v = 1;
                    if (flowCollector.emit(hVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                ProducerScope producerScope2 = (ProducerScope) this.f185892w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    g gVar2 = this.f185893x;
                    gVar2.f185896c = null;
                    gVar2.b();
                    gVar2.a();
                    gVar2.e = new h0(producerScope2, 1);
                    k98.a aVar5 = new k98.a(gVar2, 25);
                    this.f185892w = null;
                    this.v = 1;
                    if (com.bumptech.glide.d.d(producerScope2, aVar5, this) == aVar4) {
                        return aVar4;
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
