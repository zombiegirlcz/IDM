package bi8;

import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.creation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15444w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.junior_onboarding.impl.ui.creation.a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f15444w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f15444w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.junior_onboarding.impl.ui.creation.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            q78.e eVar = aVar2.f76995t;
            this.u = 1;
            obj2 = u68.b.b(eVar, this.f15444w, null, null, this, 14);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return aVar2.C1(u0.b((NaviCommand) obj2));
    }
}
