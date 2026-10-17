package com.revolut.feature.pay_bills_taxes.impl.ui.screen.form;

import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.BillFormFooter;
import com.revolut.feature.apm.bills.core.api.model.BillFormHeader;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.MoneyField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.apm.bills.f24.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.BillFormFieldControllerModelExtensionV2$BillData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg9.q;
import jg9.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlin.text.d0;
import mra.d;
import of9.c;
import of9.n;
import oki.h;
import tsk.t;
import vkm.j2;
import wde.f;
import wg9.k;
import wg9.m;
import wg9.o;
import wg9.p;
import wo1.b;
import xo1.g;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements m {
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FormScreenContract$InputData f78721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f78722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f78723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f78724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f78725t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final y v;

    public a(q formExtension, FormScreenContract$InputData inputData, b billsInteractor, w80.b amountFormatter, t parser, n dialogProvider, wg9.t stateMapper) {
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = formExtension;
        this.f78721p = inputData;
        this.f78722q = billsInteractor;
        this.f78723r = amountFormatter;
        this.f78724s = parser;
        this.f78725t = dialogProvider;
        this.u = e.a(this, new f(this, 8));
        ArrayList arrayList = inputData.f78717b.f61360a;
        Bill bill = inputData.f78718c;
        g gVar = inputData.f78716a;
        if (wg9.q.f297263a[gVar.ordinal()] != 1) {
            throw new IllegalArgumentException(p.a.p("Form for BillPaymentMethod=[", gVar.name(), "] is not supported!"));
        }
        this.v = d.b(this, new k(arrayList, bill, f0.f322471a, new TextLocalisedClause(R$string.f24_create_form_title, null, null, 14), null, null, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a r11, com.revolut.feature.apm.bills.core.api.model.Bill r12, gim.c r13) {
        /*
            cli.y r0 = r11.v
            boolean r1 = r13 instanceof wg9.s
            if (r1 == 0) goto L15
            r1 = r13
            wg9.s r1 = (wg9.s) r1
            int r2 = r1.f297265w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f297265w = r2
            goto L1a
        L15:
            wg9.s r1 = new wg9.s
            r1.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f297265w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r13)
            goto L81
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            yhm.o.b(r13)
            wo1.b r13 = r11.f78722q
            xo1.m r5 = new xo1.m
            java.lang.Object r3 = r0.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            wg9.k r3 = (wg9.k) r3
            com.revolut.feature.apm.bills.core.api.model.Bill r3 = r3.f297249b
            if (r3 == 0) goto L4d
            xo1.g r3 = r3.f61246a
            if (r3 != 0) goto L4b
            goto L4d
        L4b:
            r6 = r3
            goto L52
        L4d:
            com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$InputData r3 = r11.f78721p
            xo1.g r3 = r3.f78716a
            goto L4b
        L52:
            java.util.ArrayList r7 = r11.N2()
            if (r12 == 0) goto L5f
            dj0.d r3 = r12.f
            if (r3 != 0) goto L5d
            goto L5f
        L5d:
            r8 = r3
            goto L67
        L5f:
            dj0.c r3 = dj0.d.Companion
            r3.getClass()
            dj0.d r3 = dj0.d.e
            goto L5d
        L67:
            r3 = 0
            if (r12 == 0) goto L6d
            java.lang.String r9 = r12.f61250h
            goto L6e
        L6d:
            r9 = r3
        L6e:
            if (r12 == 0) goto L72
            java.time.LocalDate r3 = r12.f61251j
        L72:
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r1.f297265w = r4
            vp1.c r13 = (vp1.c) r13
            java.lang.Object r13 = r13.g(r5, r1)
            if (r13 != r2) goto L81
            return r2
        L81:
            xo1.o r13 = (xo1.o) r13
            wf6.p r12 = new wf6.p
            r1 = 25
            r12.<init>(r1)
            r11.H2(r0, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a.I2(com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a, com.revolut.feature.apm.bills.core.api.model.Bill, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        L2(this.f78721p.f78718c);
    }

    public final BillFormFieldControllerModelExtensionV2$BillData J2() {
        g gVar;
        y yVar = this.v;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        Bill bill = ((k) j2Var.getValue()).f297249b;
        Bill billA = bill != null ? Bill.a(bill, ((k) j2Var2.getValue()).f297250c) : null;
        List list = ((k) j2Var2.getValue()).f297250c;
        Bill bill2 = ((k) j2Var2.getValue()).f297249b;
        if (bill2 == null || (gVar = bill2.f61246a) == null) {
            gVar = this.f78721p.f78716a;
        }
        return new BillFormFieldControllerModelExtensionV2$BillData(billA, list, gVar);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    public final void K2(RepeaterField repeaterField, String str, Clause clause) {
        BillFormFieldControllerModelExtensionV2$BillData billFormFieldControllerModelExtensionV2$BillDataJ2 = J2();
        m70.a.c(t0.f186434a);
        ((s) this.o).i3(repeaterField, billFormFieldControllerModelExtensionV2$BillDataJ2, "", str, clause, new o(this, 6));
    }

    public final void L2(Bill bill) {
        List list = bill != null ? bill.f61248c : null;
        if (list == null) {
            list = f0.f322471a;
        }
        FormScreenContract$InputData formScreenContract$InputData = this.f78721p;
        BillFormFooter billFormFooter = formScreenContract$InputData.f78717b.f61362c;
        HtmlClause htmlClauseG = billFormFooter != null ? ff9.a.g(billFormFooter, list) : null;
        BillFormHeader billFormHeader = formScreenContract$InputData.f78717b.f61361b;
        CompositeClause compositeClauseF = billFormHeader != null ? ff9.a.f(billFormHeader, list) : null;
        y yVar = this.v;
        H2(yVar, new p(bill, c.b(((k) ((j2) yVar.f22677a).getValue()).f297248a, list), compositeClauseF, htmlClauseG, 0));
    }

    public final void M2(String listId, String extractedValue, String str) {
        Object next;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        if (!a0.H(listId, "MONEY_ITEM_ID_", false)) {
            i2b.a.P(listId, extractedValue, str, new rch.o(2, this, a.class, "updateFieldValue", "updateFieldValue(Ljava/lang/String;Ljava/lang/Object;)V", 0, 22));
            return;
        }
        String strE0 = d0.e0(listId, "MONEY_ITEM_ID_");
        Iterator it8 = ((k) ((j2) this.v.f22677a).getValue()).f297248a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((BillFormFieldV2) next).getF61412a(), strE0)) {
                    break;
                }
            }
        }
        MoneyField moneyField = next instanceof MoneyField ? (MoneyField) next : null;
        if (moneyField != null) {
            xi0.b bVar = moneyField.e;
            O2(new dj0.d(this.f78723r.b(extractedValue, bVar.f306286a), bVar), strE0);
        }
    }

    public final ArrayList N2() {
        y yVar = this.v;
        return of9.d.a(ff9.a.e(((k) ((j2) yVar.f22677a).getValue()).f297250c, ((k) ((j2) yVar.f22677a).getValue()).f297248a));
    }

    public final void O2(Object obj2, String str) {
        H2(this.v, new grd.s(2, str, obj2));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        FormServerError formServerErrorJ = this.f78724s.j(throwable);
        if (formServerErrorJ == null) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return false;
        }
        wdb.b bVar = new wdb.b(formServerErrorJ, 17);
        y yVar = this.v;
        H2(yVar, bVar);
        h.v2(this.u, new FormScreenContract$ModalStep.Errors(((k) ((j2) yVar.f22677a).getValue()).f297248a, formServerErrorJ), ModalDestination.Style.POPUP.f98311a);
        return true;
    }
}
