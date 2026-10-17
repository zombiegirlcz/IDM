package f7l;

import e7l.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f132658w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f132658w = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f132658w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.b bVarG;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Object obj3 = g.b.f123407a;
            boolean zEquals = obj3.equals(obj3);
            boolean z = this.f132658w;
            k kVar = this.v;
            if (zEquals) {
                bVarG = kVar.f132663h.g(Unit.f186387a, z);
            } else {
                if (!obj3.equals(g.a.f123406a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarG = kVar.i.g(Unit.f186387a, z);
            }
            this.u = 1;
            if (nim.a.a(bVarG, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
