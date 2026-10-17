package x9b;

import aii.q;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nd.m;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f303656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f303656w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, this.f303656w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.f303656w;
        if (i == 0) {
            o.b(obj2);
            String value = this.v.f303651a;
            Intrinsics.checkNotNullParameter(value, "value");
            m mVar = jVar.f303657p;
            i9b.a aVar2 = i9b.a.UserSwitch;
            this.u = 1;
            if (mVar.f(value, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        jVar.C1(u0.c(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)));
        jVar.C2(q.f5292a);
        return Unit.f186387a;
    }
}
