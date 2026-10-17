package uc4;

import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ju3.e eVar;
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = n1Var instanceof l1;
        i iVar = this.v;
        if (z) {
            iVar.v2(new b(iVar.f278986q.f67816a.f66363c.f66365b));
        } else if (n1Var instanceof m1) {
            KontomatikPopupScreenConfig.Button button = iVar.f278986q.f67816a.d;
            if (button == null || (eVar = button.f66365b) == null) {
                eVar = ju3.e.CLOSE_SCREEN;
            }
            iVar.v2(new b(eVar));
        } else {
            iVar.v2(c.f278982a);
        }
        return Unit.f186387a;
    }
}
