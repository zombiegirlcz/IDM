package com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform;

import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.BillFormFooter;
import com.revolut.feature.apm.bills.core.api.model.BillFormHeader;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.feature.apm.bills.core.api.model.form.MoneyField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.BillFormFieldControllerModelExtensionV2$BillData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$SubformDataSource;
import elm.f;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg9.q;
import jg9.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import mra.d;
import of9.n;
import oki.h;
import rm6.c;
import skm.e0;
import skm.p0;
import vkm.j2;
import yed.g0;
import yg9.k;
import yg9.m;
import yg9.o;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements m {
    public final SubformScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f78736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wo1.b f78737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f78738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f78739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f78740t;
    public List u;

    public a(SubformScreenContract$InputData inputData, q formExtension, wo1.b billsInteractor, w80.b amountFormatter, n dialogProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f78736p = formExtension;
        this.f78737q = billsInteractor;
        this.f78738r = amountFormatter;
        this.f78739s = dialogProvider;
        BillFormV2 billFormV2 = inputData.f78728c;
        SubformScreenContract$SubformScreenAction subformScreenContract$SubformScreenAction = inputData.f;
        SubformScreenContract$ToolbarAction subformScreenContract$ToolbarAction = inputData.f78729g;
        f0 f0Var = f0.f322471a;
        this.f78740t = d.b(this, new k(billFormV2, null, f0Var, null, null, subformScreenContract$SubformScreenAction, subformScreenContract$ToolbarAction), stateMapper, null, false, 12);
        this.u = f0Var;
    }

    public static final Object I2(a aVar, Bill bill, ArrayList arrayList, i iVar) {
        wo1.b bVar = aVar.f78737q;
        Continuation continuation = null;
        if (bill == null) {
            c cVar = new c(((vp1.c) bVar).f291042a, new xo1.h(aVar.o.f78726a, arrayList, null, null), continuation, 10);
            p0 p0Var = p0.f264001a;
            return e0.J(f.f127540b, cVar, iVar);
        }
        xo1.h hVar = new xo1.h(bill.f61246a, arrayList, bill.f61250h, bill.f61251j);
        rhl.b bVar2 = new rhl.b(((vp1.c) bVar).f291042a, bill.e, hVar, continuation, 5);
        p0 p0Var2 = p0.f264001a;
        return e0.J(f.f127540b, bVar2, iVar);
    }

    @Override // yji.l
    public final void I1() {
        SubformScreenContract$SubformDataSource subformScreenContract$SubformDataSource = this.o.d;
        if (subformScreenContract$SubformDataSource instanceof SubformScreenContract$SubformDataSource.ExistingBill) {
            O2(((SubformScreenContract$SubformDataSource.ExistingBill) subformScreenContract$SubformDataSource).f78731a);
        } else {
            if (!(subformScreenContract$SubformDataSource instanceof SubformScreenContract$SubformDataSource.NewInputs)) {
                throw new NoWhenBranchMatchedException();
            }
            P2(((SubformScreenContract$SubformDataSource.NewInputs) subformScreenContract$SubformDataSource).f78732a);
        }
    }

    public final BillFormFieldControllerModelExtensionV2$BillData J2() {
        ArrayList arrayListM2 = M2();
        Bill bill = ((k) ((j2) this.f78740t.f22677a).getValue()).f313583b;
        return new BillFormFieldControllerModelExtensionV2$BillData(bill != null ? Bill.a(bill, arrayListM2) : null, arrayListM2, this.o.f78726a);
    }

    public final void K2(RepeaterField repeaterField, String str, Clause clause) {
        ((s) this.f78736p).i3(repeaterField, J2(), this.o.f78727b, str, clause, new o(this, 5));
    }

    public final void L2(String listId, String extractedValue, String str) {
        Object next;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        if (!a0.H(listId, "MONEY_ITEM_ID_", false)) {
            i2b.a.P(listId, extractedValue, str, new rch.o(2, this, a.class, "updateFieldValue", "updateFieldValue(Ljava/lang/String;Ljava/lang/Object;)V", 0, 29));
            return;
        }
        String strE0 = d0.e0(listId, "MONEY_ITEM_ID_");
        Iterator it8 = ((k) ((j2) this.f78740t.f22677a).getValue()).f313582a.f61360a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((BillFormFieldV2) next).getF61418a(), strE0)) {
                    break;
                }
            }
        }
        MoneyField moneyField = next instanceof MoneyField ? (MoneyField) next : null;
        if (moneyField != null) {
            xi0.b bVar = moneyField.e;
            N2(new dj0.d(this.f78738r.b(extractedValue, bVar.f306286a), bVar), strE0);
        }
    }

    public final ArrayList M2() {
        y yVar = this.f78740t;
        ArrayList arrayListA = of9.d.a(ff9.a.e(((k) ((j2) yVar.f22677a).getValue()).f313584c, ((k) ((j2) yVar.f22677a).getValue()).f313582a.f61360a));
        if (this.u.isEmpty()) {
            return arrayListA;
        }
        List<BillInputV2> list = this.u;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (BillInputV2 billInputV2 : list) {
            SubformScreenContract$InputData subformScreenContract$InputData = this.o;
            arrayList.add(of9.d.f(billInputV2, subformScreenContract$InputData.f78727b, arrayListA, subformScreenContract$InputData.f78730h, subformScreenContract$InputData.i));
        }
        return arrayList;
    }

    public final void N2(Object obj2, String str) {
        H2(this.f78740t, new grd.s(3, str, obj2));
    }

    public final void O2(Bill bill) {
        H2(this.f78740t, new g0(bill, 9));
        P2(bill.f61248c);
    }

    public final void P2(List list) {
        List f61321c;
        List listL;
        BillInputV2 billInputV2G;
        this.u = list;
        SubformScreenContract$InputData subformScreenContract$InputData = this.o;
        String str = subformScreenContract$InputData.f78730h;
        BillFormV2 billFormV2 = subformScreenContract$InputData.f78728c;
        if (str == null || (billInputV2G = foh.i.g(str, list)) == null || (f61321c = billInputV2G.getF61321c()) == null) {
            f61321c = this.u;
        }
        BillInputV2 billInputV2G2 = foh.i.g(subformScreenContract$InputData.f78727b, f61321c);
        if (billInputV2G2 == null || (listL = billInputV2G2.getF61321c()) == null) {
            listL = f0.f322471a;
        }
        if (billInputV2G2 instanceof BillInputV2.BillInputRepeater) {
            String str2 = subformScreenContract$InputData.i;
            listL = str2 != null ? v.l(foh.i.g(str2, ((BillInputV2.BillInputRepeater) billInputV2G2).f61312c)) : f0.f322471a;
        }
        y yVar = this.f78740t;
        ArrayList arrayListB = of9.c.b(((k) ((j2) yVar.f22677a).getValue()).f313582a.f61360a, listL);
        BillFormHeader billFormHeader = billFormV2.f61361b;
        CompositeClause compositeClauseF = billFormHeader != null ? ff9.a.f(billFormHeader, listL) : null;
        BillFormFooter billFormFooter = billFormV2.f61362c;
        H2(yVar, new xwd.o(arrayListB, 14, compositeClauseF, billFormFooter != null ? ff9.a.g(billFormFooter, listL) : null));
    }

    @Override // cli.z
    public final g getState() {
        return this.f78740t;
    }
}
