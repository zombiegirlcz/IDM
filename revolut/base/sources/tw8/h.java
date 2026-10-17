package tw8;

import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.kyc.impl.ondemand.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.kyc.impl.ondemand.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
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
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = n1Var instanceof l1;
        com.revolut.feature.kyc.impl.ondemand.a aVar2 = this.v;
        if (z) {
            aVar2.J2(TransitionAnimation.FADE.f98392a);
        } else if ((n1Var instanceof m1) || (n1Var instanceof k1)) {
            aVar2.C2(d.f274949a);
        } else {
            if (!(n1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
            j1 j1Var = (j1) n1Var;
            String simpleName = j1Var.f216179a.getClass().getSimpleName();
            ty0.a aVar3 = j1Var.f216180b;
            String str = aVar3.f275445a;
            String str2 = aVar3.f275446b;
            StringBuilder sbM = v0.a.m("Unexpected OnDemandFeatureInstallFlow error dialog result configurationType=", simpleName, " clauseClickId=", str, " clauseClickText=");
            sbM.append(str2);
            IllegalStateException illegalStateException = new IllegalStateException(sbM.toString());
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
