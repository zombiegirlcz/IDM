package wzh;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public e u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f301424w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(1, continuation);
        this.f301424w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.f301424w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar2 = this.f301424w;
            mre.c cVar = eVar2.o;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.o, null);
            this.u = eVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.u;
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return eVar.C1(u0.b((NaviCommand) obj2));
    }
}
