package wm1;

import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qua.p;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends i implements Function2 {
    public h u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f298592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f298593x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, p pVar, Continuation continuation) {
        super(2, continuation);
        this.f298592w = hVar;
        this.f298593x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f298592w, this.f298593x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar2 = this.f298592w;
            nm1.c cVar = hVar2.f298594p;
            this.u = hVar2;
            this.v = 1;
            Object objA = ((qm1.f) cVar).a(this.f298593x, this);
            if (objA == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = this.u;
            o.b(obj2);
        }
        return hVar.C1(u0.b((NaviCommand) obj2));
    }
}
