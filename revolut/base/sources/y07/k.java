package y07;

import au6.k2;
import com.revolut.feature.freelancer.impl.network.models.b0;
import com.revolut.feature.freelancer.impl.network.models.m0;
import com.revolut.feature.freelancer.impl.network.services.FreelancerService;
import et6.h1;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lr6.g0;
import lr6.y;
import lr6.z;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b0 b0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        l lVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            boolean z = ((g) lVar.t2()).d;
            z.a aVar2 = z.a.f199424a;
            z yVar = z ? aVar2 : new y(((g) lVar.t2()).f310156a);
            h1 h1Var = lVar.f310163p;
            g0 profileSettings = new g0(yVar, 15);
            h1Var.getClass();
            Intrinsics.checkNotNullParameter(profileSettings, "profileSettings");
            k2 k2Var = (k2) h1Var.f129237b;
            k2Var.getClass();
            Intrinsics.checkNotNullParameter(profileSettings, "profileSettings");
            FreelancerService freelancerService = k2Var.f9553a;
            Map map = ft6.k.f137948a;
            Intrinsics.checkNotNullParameter(profileSettings, "<this>");
            b0 b0Var2 = null;
            z zVar = profileSettings.f199403a;
            if (zVar != null) {
                if (zVar instanceof y) {
                    b0Var = new b0("SET", ((y) zVar).f199423a);
                } else {
                    if (!zVar.equals(aVar2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b0Var = new b0("UNSET", null);
                }
                b0Var2 = b0Var;
            }
            efm.b bVarJ = efm.b.j(w.g0(freelancerService.updateProfileSettings(new m0(b0Var2))), k2Var.i.g(Unit.f186387a, true));
            Intrinsics.checkNotNullExpressionValue(bVarJ, "concatArray(...)");
            this.u = 1;
            if (nim.a.a(bVarJ, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        lVar.v2(new h(true));
        return Unit.f186387a;
    }
}
