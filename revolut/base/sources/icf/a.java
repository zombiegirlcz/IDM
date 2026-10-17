package icf;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f160263w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160263w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f160263w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f160263w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((a) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((a) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw null;
            default:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                throw null;
        }
    }
}
