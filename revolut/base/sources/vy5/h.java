package vy5;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ gim.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f293156w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Function1 function1, w wVar, Continuation continuation) {
        super(1, continuation);
        this.v = (gim.i) function1;
        this.f293156w = wVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f293156w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = this.v.invoke(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        io3.d dVar = (io3.d) obj2;
        if (dVar == null) {
            return Unit.f186387a;
        }
        TopUpConfig.Companion companion = TopUpConfig.INSTANCE;
        xi0.b bVarL = z92.f.l(dVar);
        companion.getClass();
        this.f293156w.A2(new InitTopUpDestination(TopUpConfig.Companion.b(bVarL, TopUpTarget.Main.f90573a)));
        return Unit.f186387a;
    }
}
