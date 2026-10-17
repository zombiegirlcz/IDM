package lxd;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$InputData;
import com.revolut.feature.topup_screen.api.destination.ExternalCardDetailsDestination;
import com.revolut.feature.topup_screen.api.destination.StoredMethodDestination;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import oxd.i;
import oxd.j;
import yte.m;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b f200554b;

    public /* synthetic */ c(com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b bVar, int i) {
        this.f200553a = i;
        this.f200554b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f200553a;
        com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.b bVar = this.f200554b;
        switch (i) {
            case 0:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                h.D2(bVar.u);
                return Boolean.TRUE;
            case 1:
                AutoTopUpFlowContract$InputData autoTopUpFlowContract$InputData = bVar.o;
                j result = (j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof i) {
                    nxd.c cVar = bVar.f88194s;
                    TopupMethod.StoredMethod method = ((i) result).f230775a;
                    nxd.d dVar = (nxd.d) cVar;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(method, "method");
                    dVar.f220557a.k(method);
                } else {
                    if (!(result instanceof oxd.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TopupMethod.StoredMethod storedMethod = ((oxd.h) result).f230774a;
                    if (storedMethod instanceof TopupMethod.StoredMethod.Card) {
                        bVar.C1(new ExternalCardDetailsDestination(((TopupMethod.StoredMethod.Card) storedMethod).f60455a, autoTopUpFlowContract$InputData.f88179b));
                    } else if (storedMethod instanceof TopupMethod.StoredMethod.PayTo) {
                        bVar.C1(new StoredMethodDestination(((TopupMethod.StoredMethod.PayTo) storedMethod).f60490a, m.PAY_TO, autoTopUpFlowContract$InputData.f88179b));
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected stored method type: " + storedMethod);
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                    }
                }
                return Unit.f186387a;
            default:
                com.revolut.domain.models.topup.methods.b it8 = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.f60525a;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (com.revolut.domain.models.topup.methods.a.a((TopupMethod.StoredMethod) it9.next(), bVar.o.f88179b)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
