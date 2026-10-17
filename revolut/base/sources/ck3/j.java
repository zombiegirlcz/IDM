package ck3;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public n u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f24764w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Continuation continuation) {
        super(1, continuation);
        this.f24764w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f24764w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVar2 = this.f24764w;
            mre.c cVar = nVar2.f24767p;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.f90371l, null);
            this.u = nVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar) {
                return aVar;
            }
            nVar = nVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return nVar.C1(u0.b((NaviCommand) obj2));
    }
}
