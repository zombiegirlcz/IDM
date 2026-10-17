package pv7;

import com.revolut.feature.insurance_embedded.impl.data.model.l0;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreen;
import gu7.e3;
import gu7.h3;
import gu7.k3;
import gu7.n3;
import gu7.q3;
import gu7.z3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InsuranceDetailsLayoutScreen f239985w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239985w = insuranceDetailsLayoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f239985w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f239985w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        z3 z3Var;
        int i = this.u;
        InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen = this.f239985w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE3 = insuranceDetailsLayoutScreen.d();
                String str = aVar.f275445a;
                ((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) qVarE3).J2(new nr7.c(str), str);
                return Unit.f186387a;
            default:
                String listId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarE32 = insuranceDetailsLayoutScreen.d();
                Intrinsics.h(listId);
                com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) qVarE32;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                l0 l0Var = (l0) ((m) ((j2) bVar.v.f22677a).getValue()).f239986a.getContent();
                List list = (l0Var == null || (z3Var = l0Var.f76007b) == null) ? null : z3Var.f146878c;
                if (list == null) {
                    list = f0.f322471a;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(uc0.b.k((q3) next), listId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                q3 q3Var = (q3) next;
                e3 e3Var = q3Var != null ? q3Var.d : null;
                if (e3Var instanceof h3) {
                    bVar.I2(((h3) e3Var).f146759b);
                } else if (e3Var instanceof k3) {
                    ou7.a.b(bVar, ((k3) e3Var).f146780b);
                } else if (e3Var instanceof n3) {
                    n3 n3Var = (n3) e3Var;
                    ou7.a.c(bVar, n3Var.f146802b, n3Var.f146803c);
                } else {
                    if (e3Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Action cannot be null for listId: ".concat(listId));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
