package tea;

import com.revolut.feature.pockets.impl.new_pocket_details.NewPocketDetailsScreen;
import gim.i;
import ip0.an0;
import ip0.t5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ NewPocketDetailsScreen f270093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(NewPocketDetailsScreen newPocketDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f270093w = newPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f270093w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f270093w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f270093w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((c) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 1:
                ((c) create((an0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                ((c) create((an0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        NewPocketDetailsScreen newPocketDetailsScreen = this.f270093w;
        switch (i) {
            case 0:
                t5 t5Var = (t5) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                newPocketDetailsScreen.e3();
                Intrinsics.h(t5Var);
                throw null;
            case 1:
                an0 an0Var = (an0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                newPocketDetailsScreen.e3();
                Intrinsics.h(an0Var);
                throw null;
            default:
                an0 an0Var2 = (an0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                newPocketDetailsScreen.e3();
                Intrinsics.h(an0Var2);
                throw null;
        }
    }
}
