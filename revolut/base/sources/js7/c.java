package js7;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.content.compose.NavHostKt;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$FlowState;
import d67.p;
import d67.q;
import d67.s;
import d67.t;
import do3.n;
import efm.r;
import gd1.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kkf.z4;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lk0.g;
import pc1.c;
import pfm.h;
import qc0.u;
import qc4.e;
import rfm.o;
import rx6.m;
import te0.w;
import tof.a3;
import y7a.v;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f178151b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f178150a = i;
        this.f178151b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        int i = this.f178150a;
        boolean z = false;
        int i2 = 2;
        Object obj2 = null;
        Function1 block = this.f178151b;
        switch (i) {
            case 0:
                List list = (List) it8;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (((Boolean) block.invoke((xr7.f) it9.next())).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                return w.g(block.invoke(it8));
            case 2:
                g pagedData = (g) it8;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                h hVar = new h(new hc7.a(block, pagedData, 17), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 3:
                a3 it10 = (a3) it8;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(z4.c(it10, block));
            case 4:
                n user = (n) it8;
                Intrinsics.checkNotNullParameter(user, "user");
                return (r) block.invoke(user.f116408a);
            case 5:
                Object updateState = (ax4.b) it8;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return (ax4.b) block.invoke(updateState);
            case 6:
                Object it11 = (File) it8;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Data(block.invoke(it11), null, false, 6, null);
            case 7:
                z3d.a it12 = (z3d.a) it8;
                Intrinsics.checkNotNullParameter(it12, "it");
                Iterator it13 = it12.f319245a.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next = it13.next();
                        if (((Boolean) block.invoke((z3d.d) next)).booleanValue()) {
                            obj2 = next;
                        }
                    }
                }
                z3d.d dVar = (z3d.d) obj2;
                if (dVar != null) {
                    return dVar;
                }
                throw new IllegalStateException("Requested watchlist not found");
            case 8:
                List accounts = (List) it8;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List list2 = accounts;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it14 = list2.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            if (((Boolean) block.invoke(it14.next())).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                Object update = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) it8;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) block.invoke(update);
            case 10:
                j model = (j) it8;
                Intrinsics.checkNotNullParameter(model, "model");
                if ("positive".equals(model.getF51938a())) {
                    block.invoke(Boolean.TRUE);
                } else if ("negative".equals(model.getF51938a())) {
                    block.invoke(Boolean.FALSE);
                }
                return Unit.f186387a;
            case 11:
                return NavHostKt.NavHost$lambda$65$lambda$64(block, (AnimatedContentTransitionScope) it8);
            case 12:
                pc1.c result = (pc1.c) it8;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, c.C1301c.f234783a)) {
                    block.invoke(b.a.f143030a);
                } else if (Intrinsics.f(result, c.b.f234782a)) {
                    block.invoke(b.C0826b.f143031a);
                } else if (!Intrinsics.f(result, c.a.f234781a)) {
                    if (!(result instanceof pc1.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    block.invoke(new gd1.c(((pc1.d) result).f234784a));
                }
                return Unit.f186387a;
            case 13:
                igk.c it15 = (igk.c) it8;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (it15 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                block.invoke(new phk.j(it15.f161238b, it15.d, it15.f161239c));
                return Unit.f186387a;
            case 14:
                ti1.c output = (ti1.c) it8;
                Intrinsics.checkNotNullParameter(output, "output");
                block.invoke(output.f271399a);
                return Unit.f186387a;
            case 15:
                Data data = (Data) it8;
                Intrinsics.checkNotNullParameter(data, "data");
                pd5.d dVar2 = (pd5.d) data.getContent();
                if (dVar2 == null) {
                    return f0.f322471a;
                }
                ArrayList arrayList = dVar2.f235097c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!((pd5.g) obj3).d.isEmpty()) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (((Boolean) block.invoke(obj4)).booleanValue()) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it16 = arrayList3.iterator();
                while (it16.hasNext()) {
                    arrayList4.add(((pd5.g) it16.next()).f235102a);
                }
                return arrayList4;
            case 16:
                FormScreen currentScreen = (FormScreen) it8;
                Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
                return new rfm.f(new o(new pu9.a(block, currentScreen, 6)), new u(new jb0.f(currentScreen, i2), 21), i2);
            case 17:
                TabCryptoFlowContract$FlowState update2 = (TabCryptoFlowContract$FlowState) it8;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return TabCryptoFlowContract$FlowState.a(update2, (ake.a) block.invoke(update2.f89789a), null, 2);
            case 18:
                TabCryptoFlowContract$FlowState update3 = (TabCryptoFlowContract$FlowState) it8;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return TabCryptoFlowContract$FlowState.a(update3, null, (qje.o) block.invoke(update3.f89790b), 1);
            case 19:
                qk.a aVar = (qk.a) it8;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(block, "block");
                if (!aVar.f246924b) {
                    aVar.f246924b = true;
                    block.invoke(aVar.f246923a);
                }
                return Unit.f186387a;
            case 20:
                v outputData = (v) it8;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                y7a.w wVar = outputData.f311454a;
                zp7.d dVar3 = wVar instanceof zp7.d ? (zp7.d) wVar : null;
                if (dVar3 != null) {
                    block.invoke(dVar3.f324185a);
                }
                return Unit.f186387a;
            case 21:
                d67.u data2 = (d67.u) it8;
                Intrinsics.checkNotNullParameter(data2, "data");
                if (Intrinsics.f(data2, s.f111464a)) {
                    block.invoke(new qog.c(true, "TRACKING_PRIMARY_BUTTON_LOADING_TAG"));
                } else if (Intrinsics.f(data2, t.f111465a)) {
                    block.invoke(new qog.c(false, "TRACKING_SECONDARY_BUTTON_LOADING_TAG"));
                } else if (Intrinsics.f(data2, q.f111462a)) {
                    block.invoke(qog.a.f248207a);
                } else if (Intrinsics.f(data2, d67.r.f111463a)) {
                    block.invoke(qog.b.f248208a);
                } else {
                    if (!(data2 instanceof p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unknown click action " + data2);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 22:
                m update4 = (m) it8;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return m.a(update4, (FreelancerSalesFilters$CompoundFreelancerSalesFilter) block.invoke(update4.f258045b), false, null, null, false, 61);
            case 23:
                Data data3 = (Data) it8;
                Intrinsics.checkNotNullParameter(data3, "data");
                if (data3.getContent() instanceof StatementUrlState.InPreparation) {
                    return (r) block.invoke(Boolean.TRUE);
                }
                r rVarJust = r.just(data3);
                Intrinsics.h(rVarJust);
                return rVarJust;
            case 24:
                Data data4 = (Data) it8;
                Intrinsics.checkNotNullParameter(data4, "data");
                Throwable error = data4.getError();
                if (data4.getContent() != null || error == null) {
                    return data4;
                }
                try {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var2);
                    return new Data(block.invoke(error), null, data4.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data4.getLoading());
                }
            case 25:
                mw6.e output2 = (mw6.e) it8;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof mw6.c) {
                    block.invoke(((mw6.c) output2).f209401a);
                }
                return Unit.f186387a;
            case 26:
                qc4.e output3 = (qc4.e) it8;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (Intrinsics.f(output3, e.b.f244557a)) {
                    block.invoke(d84.c.f112125a);
                } else {
                    if (!Intrinsics.f(output3, e.a.f244556a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    block.invoke(d84.b.f112124a);
                }
                return Unit.f186387a;
            case 27:
                if ((it8 instanceof Answer ? (Answer) it8 : null) != null) {
                    block.invoke(it8);
                }
                return Unit.f186387a;
            case 28:
                block.invoke(it8);
                return Unit.f186387a;
            default:
                Object update5 = (CreditCardSetupAutopayFlowContract$State) it8;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return (CreditCardSetupAutopayFlowContract$State) block.invoke((CreditCardSetupAutopayFlowContract$State.Content) update5);
        }
    }

    public /* synthetic */ c(z4 z4Var, Function1 function1) {
        this.f178150a = 3;
        this.f178151b = function1;
    }
}
