package oqe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.teen_dashboard.impl.ui.dashboard.TeenDashboardScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TeenDashboardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TeenDashboardScreen teenDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = teenDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Continuation continuation;
        int i;
        f fVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarF3 = this.v.R2();
        Intrinsics.h(model);
        t tVar = (t) hVarF3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            continuation = null;
            i = 1;
            if (i3 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i3];
            if (a0.z(fVar.name(), str, true)) {
                break;
            }
            i3++;
        }
        int i5 = fVar == null ? -1 : o.f227898a[fVar.ordinal()];
        if (i5 != -1) {
            int i6 = 2;
            if (i5 == 1) {
                tVar.n2(new q(tVar, continuation, i6), new whi.b(6));
            } else if (i5 == 2) {
                tVar.n2(new q(tVar, continuation, i), new whi.b(6));
            } else if (i5 != 3) {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                tVar.l2(new q(tVar, continuation, i2), new yi5.b(26));
            }
        } else {
            hx7.e.n(new IllegalArgumentException(j6.a.q("Unsupported listId: ", str)));
        }
        return Unit.f186387a;
    }
}
