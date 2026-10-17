package uge;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jf0.c f280026w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, jf0.c cVar2, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f280026w = cVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f280026w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommandA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jf0.c cVar2 = this.f280026w;
            ProductAccountDescriptor$Value.Main mainB = c.b(cVar2.e(3), cVar2.e(4));
            if (mainB == null) {
                featureCommandA = jbb.a.a(ibb.c.f160140a, null, null, null, 14);
                cVar.f280028a.c(featureCommandA);
                return Boolean.TRUE;
            }
            she.g gVar = cVar.f280029b;
            this.u = 1;
            zfe.f fVar = zfe.g.Companion;
            obj2 = gVar.c(mainB, null, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        featureCommandA = ((MainContainerScreenDestination.JustShow) obj2).e;
        cVar.f280028a.c(featureCommandA);
        return Boolean.TRUE;
    }
}
