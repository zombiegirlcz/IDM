package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.cw0;
import com.fourthline.orca.internal.dw0;
import com.fourthline.orca.internal.tr0;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class es0 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f28256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tr0 f28257b;

    public es0(p70 networkSpinnerBoldLottieSource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(networkSpinnerBoldLottieSource, "networkSpinnerBoldLottieSource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f28256a = imageServiceLocator;
        lh0 lh0Var = lh0.f30621a;
        c81.d dVarA = lh0Var.a() ? c81.a.a(c81.f27404a, R.string.step_qes_agree_header_qtsp, 0, 2, null) : c81.a.a(c81.f27404a, R.string.step_qes_agree_header, 0, 2, null);
        c81.d dVarA2 = lh0Var.a() ? c81.a.a(c81.f27404a, R.string.shared_button_sign, 0, 2, null) : c81.a.a(c81.f27404a, R.string.shared_button_continue, 0, 2, null);
        c81.a aVar = c81.f27404a;
        c81.d dVarA3 = c81.a.a(aVar, R.string.shared_button_exit, 0, 2, null);
        c81.d dVarA4 = c81.a.a(aVar, R.string.step_qes_agree_label_contracts, 0, 2, null);
        tr0.a.b bVar = new tr0.a.b(c81.a.a(aVar, R.string.step_qes_agree_label_loading, 0, 2, null), networkSpinnerBoldLottieSource);
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f28257b = new tr0(dVarA, new tr0.a(dVarA4, f0Var, f0Var, null, bVar), null, dVarA2, dVarA3, false, true, false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tr0 a(tr0 tr0Var) {
        Intrinsics.checkNotNullParameter(tr0Var, "<this>");
        return tr0.a(tr0Var, null, null, null, c81.a.a(c81.f27404a, R.string.shared_button_saving, 0, 2, null), null, false, false, true, false, false, 791, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tr0 b(boolean z, tr0 tr0Var) {
        Intrinsics.checkNotNullParameter(tr0Var, "<this>");
        return tr0.a(tr0Var, null, null, null, null, null, z && (tr0Var.t() || (tr0Var.o() == null)), false, false, z, false, 735, null);
    }

    public final Function1 d(boolean z) {
        return new rk1(z, 3);
    }

    public final Function1 e(boolean z) {
        return new rk1(z, 4);
    }

    public final Function1 s() {
        return new bi1(21);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public tr0 getInitialState() {
        return this.f28257b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tr0 a(boolean z, tr0 tr0Var) {
        Intrinsics.checkNotNullParameter(tr0Var, "<this>");
        return tr0.a(tr0Var, null, null, null, null, null, tr0Var.u() && z, false, false, false, z, 479, null);
    }

    public final Function1 a(List signDocuments, List legalDocuments, List list) {
        Intrinsics.checkNotNullParameter(signDocuments, "signDocuments");
        Intrinsics.checkNotNullParameter(legalDocuments, "legalDocuments");
        return new vi1(signDocuments, legalDocuments, list, this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    public static final tr0 a(List list, List list2, List list3, es0 es0Var, tr0 tr0Var) {
        ?? arrayList;
        dw0.b.a.C0188a c0188a;
        Intrinsics.checkNotNullParameter(tr0Var, "<this>");
        tr0.a aVarN = tr0Var.n();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new tr0.a.InterfaceC0287a.b(((dw0.b.a.C0189b) it8.next()).c(), es0Var.f28256a.a(r10.K0)));
        }
        String str = null;
        if (lh0.f30621a.a()) {
            dw0.b.a.C0188a c0188a2 = (dw0.b.a.C0188a) zhm.d0.e0(0, list2);
            arrayList = zhm.v.l(c0188a2 != null ? new tr0.a.InterfaceC0287a.C0288a(c0188a2.c()) : null);
        } else {
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList.add(new tr0.a.InterfaceC0287a.C0288a(((dw0.b.a.C0188a) it9.next()).c()));
            }
        }
        tr0.a aVarA = tr0.a.a(aVarN, null, arrayList2, arrayList, (!lh0.f30621a.a() || (c0188a = (dw0.b.a.C0188a) zhm.d0.e0(1, list2)) == null) ? null : new tr0.a.InterfaceC0287a.C0288a(c0188a.c()), null, 1, null);
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                arrayList3.add(((cw0.a.C0180a.C0181a) it10.next()).b());
            }
            Iterator it11 = arrayList3.iterator();
            if (it11.hasNext()) {
                Object next = it11.next();
                while (it11.hasNext()) {
                    next = ((String) next) + "\n\n" + ((String) it11.next());
                }
                str = (String) next;
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        }
        return tr0.a(tr0Var, null, aVarA, str, null, null, false, false, false, false, false, 889, null);
    }
}
