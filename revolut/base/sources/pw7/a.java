package pw7;

import com.revolut.kompot.common.ParcelableDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q06.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f240338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jf0.c f240339x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, jf0.c cVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240338w = cVar;
        this.f240339x = cVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f240338w, this.f240339x, continuation, 0);
            default:
                return new a(this.f240338w, this.f240339x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f240338w;
                boolean z = true;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = c.b(cVar, this);
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
                if (parcelableDestination == null) {
                    z = false;
                } else {
                    cVar.f240341a.c(u0.e(parcelableDestination));
                }
                return Boolean.valueOf(z);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = c.b(this.f240338w, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ParcelableDestination parcelableDestination2 = (ParcelableDestination) obj2;
                if (parcelableDestination2 != null) {
                    return new h(parcelableDestination2, null);
                }
                return null;
        }
    }
}
