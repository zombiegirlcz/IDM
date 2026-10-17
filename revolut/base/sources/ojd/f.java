package ojd;

import com.revolut.data.network.models.security.SecuritySettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ojd.c;
import pfm.t;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f225762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f225762w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f225762w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            y21.c cVar = gVar.f225763p;
            cVar.getClass();
            t tVarC = cVar.c(SecuritySettings.PERSONALIZED_THIRD_PARTY_PROMOTION, this.f225762w);
            this.u = 1;
            if (nim.a.a(tVarC, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        gVar.C2(c.a.f225760a);
        return Unit.f186387a;
    }
}
