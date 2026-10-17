package fpa;

import aw0.w2;
import com.revolut.feature.profile_card.BaseProfileCardScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseProfileCardScreen f137073w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BaseProfileCardScreen baseProfileCardScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f137073w = baseProfileCardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f137073w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f137073w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            default:
                b bVar3 = new b(this.f137073w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((w2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BaseProfileCardScreen baseProfileCardScreen = this.f137073w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVarD3 = baseProfileCardScreen.d3();
                Intrinsics.h(str);
                eVarD3.Z0(str);
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVarD32 = baseProfileCardScreen.d3();
                Intrinsics.h(aVar2);
                eVarD32.y(aVar2);
                break;
            default:
                w2 w2Var = (w2) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVarD33 = baseProfileCardScreen.d3();
                Intrinsics.h(w2Var);
                eVarD33.t0(w2Var);
                break;
        }
        return Unit.f186387a;
    }
}
