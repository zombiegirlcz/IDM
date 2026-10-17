package eqd;

import aw0.m6;
import aw0.n6;
import bw0.k;
import bw0.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.biometric_verification.api.models.BiometricVerificationVisionRemoteResource;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlowContract$FlowState;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import cr9.e0;
import cr9.l;
import esj.o;
import et0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128445a;

    public /* synthetic */ h(int i) {
        this.f128445a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f128445a;
        Object obj3 = null;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 1:
                uzi.b cycle = (uzi.b) obj2;
                Intrinsics.checkNotNullParameter(cycle, "cycle");
                uzi.c cVar = cycle.f284679a;
                int i2 = cycle.f284680b;
                int i3 = eqj.e.f128477a[cVar.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new lzi.c(i2, lzi.b.EXACT);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Iterator<E> it8 = lzi.f.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (((lzi.f) next).getDayOfWeek() == i2) {
                            obj3 = next;
                        }
                    }
                }
                lzi.f fVar = (lzi.f) obj3;
                if (fVar != null) {
                    return new lzi.g(fVar);
                }
                throw new IllegalArgumentException(a0.d.n("Invalid weekly cycle start day: ", i2));
            case 2:
                io3.d it9 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                od0.h hVar = od0.i.Companion;
                Boolean boolValueOf = Boolean.valueOf(it9.f163149h == io3.i.EXTERNAL);
                hVar.getClass();
                return od0.h.a(boolValueOf);
            case 3:
                Intrinsics.checkNotNullParameter((eql.h) obj2, "$this$updateState");
                return eql.e.f128502a;
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new er5.f((List) pair.f186385a, (List) pair.f186386b);
            case 5:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.getContent() != null);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return r0.g();
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return r0.g();
            case 8:
                od0.i remindersOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(remindersOptional, "remindersOptional");
                Object obj4 = (List) remindersOptional.g();
                if (obj4 == null) {
                    obj4 = f0.f322471a;
                }
                return zi0.c.P(obj4, false, null, 3);
            case 9:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return zi0.c.O(error);
            case 10:
                List paymentGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentGroups, "paymentGroups");
                return new Data(d0.d0(paymentGroups), null, false, 6, null);
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 12:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 13:
                List bills = (List) obj2;
                Intrinsics.checkNotNullParameter(bills, "bills");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : bills) {
                    l lVar = (l) obj5;
                    if (lVar instanceof l.a) {
                        if (!Intrinsics.f(((l.a) lVar).getState(), "CANCELLED")) {
                            arrayList.add(obj5);
                        }
                    } else if (!(lVar instanceof l.b)) {
                        if (!(lVar instanceof l.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!Intrinsics.f(((l.b) lVar).getState(), "CANCELLED")) {
                        arrayList.add(obj5);
                    }
                }
                return arrayList;
            case 14:
                List suggestions = (List) obj2;
                Intrinsics.checkNotNullParameter(suggestions, "suggestions");
                Intrinsics.checkNotNullParameter(suggestions, "<this>");
                List<cr9.d0> list = suggestions;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (cr9.d0 d0Var : list) {
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    List<e0> members = d0Var.getMembers();
                    ArrayList arrayList3 = new ArrayList(w.t(members, 10));
                    for (e0 e0Var : members) {
                        Intrinsics.checkNotNullParameter(e0Var, "<this>");
                        arrayList3.add(new oq9.e0(e0Var.getFirstName(), e0Var.getCode()));
                    }
                    arrayList2.add(new oq9.d0(arrayList3));
                }
                return arrayList2;
            case 15:
                BiometricVerificationLauncherFlowContract$FlowState state = (BiometricVerificationLauncherFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                List list2 = state.f50475b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list2) {
                    if (obj6 instanceof BiometricVerificationVisionRemoteResource) {
                        arrayList4.add(obj6);
                    }
                }
                return arrayList4;
            case 16:
                PersistedBackground it11 = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f63743a.f63742b;
            case 17:
                esa.d it12 = (esa.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f128917c;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m.Companion.getClass();
                return k.a();
            case 19:
                o updateState = (o) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return o.a(updateState, new Data(null, null, true, 3, null));
            case 20:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                return new o(new Data(null, error2, false, 5, null), false);
            case 21:
                ((Integer) obj2).intValue();
                l.a aVar = et0.l.Companion;
                return Unit.f186387a;
            case 22:
                ((Integer) obj2).intValue();
                l.a aVar2 = et0.l.Companion;
                return Unit.f186387a;
            case 23:
                float fFloatValue = ((Float) obj2).floatValue();
                int i5 = ChatSwipeToReplyLayout.f56837x;
                return Boolean.valueOf(fFloatValue < BitmapDescriptorFactory.HUE_RED);
            case 24:
                FreelancerAccountOnboardingState state2 = (FreelancerAccountOnboardingState) obj2;
                Intrinsics.checkNotNullParameter(state2, "state");
                return Boolean.valueOf(!com.revolut.feature.freelancer.common.models.a.c(state2) && ((state2 instanceof FreelancerAccountOnboardingState.Onboarded) || (state2 instanceof FreelancerAccountOnboardingState.Pending)));
            case 25:
                nr6.k it13 = (nr6.k) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it13);
            case 26:
                FreelancerInvoice invoice = (FreelancerInvoice) obj2;
                Intrinsics.checkNotNullParameter(invoice, "invoice");
                od0.i.Companion.getClass();
                return od0.h.a(invoice);
            case 27:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 28:
                OrderInitiationPage oip = (OrderInitiationPage) obj2;
                Intrinsics.checkNotNullParameter(oip, "oip");
                od0.i.Companion.getClass();
                return od0.h.a(oip);
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
        }
    }

    public /* synthetic */ h(eqj.f fVar) {
        this.f128445a = 1;
    }
}
