package nv7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.cfac_coverage_selection.CfacCoverageSelectionScreen;
import gu7.a4;
import gu7.e3;
import gu7.h3;
import gu7.k3;
import gu7.n3;
import gu7.q3;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CfacCoverageSelectionScreen f219542w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CfacCoverageSelectionScreen cfacCoverageSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219542w = cfacCoverageSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f219542w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f219542w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q3 q3Var;
        int i = this.u;
        CfacCoverageSelectionScreen cfacCoverageSelectionScreen = this.f219542w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE3 = cfacCoverageSelectionScreen.d();
                Intrinsics.h(listId);
                lVarE3.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                com.revolut.feature.insurance_embedded.impl.data.model.g gVar = (com.revolut.feature.insurance_embedded.impl.data.model.g) ((g) ((j2) lVarE3.f219556s.f22677a).getValue()).f219543a.getContent();
                Continuation continuation = null;
                e3 e3Var = (gVar == null || (q3Var = gVar.f75991c) == null) ? null : q3Var.d;
                if (e3Var instanceof h3) {
                    lVarE3.n2(new n0(lVarE3, ((h3) e3Var).f146759b, continuation, 24), new whi.b(6));
                } else if (e3Var instanceof k3) {
                    ou7.a.b(lVarE3, ((k3) e3Var).f146780b);
                } else if (e3Var instanceof n3) {
                    n3 n3Var = (n3) e3Var;
                    ou7.a.c(lVarE3, n3Var.f146802b, n3Var.f146803c);
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
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE32 = cfacCoverageSelectionScreen.d();
                String str = aVar2.f275446b;
                lVarE32.I2(new a4(aVar2.d, str, aVar2.f275445a), str);
                return Unit.f186387a;
        }
    }
}
