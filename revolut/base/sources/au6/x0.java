package au6;

import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError;
import ip0.v7;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks6.a0;
import ks6.n0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f9655b;

    public /* synthetic */ x0(k1 k1Var, int i) {
        this.f9654a = i;
        this.f9655b = k1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        List listC;
        switch (this.f9654a) {
            case 0:
                FreelancerInvoiceTaxRate taxRate = (FreelancerInvoiceTaxRate) obj2;
                Intrinsics.checkNotNullParameter(taxRate, "taxRate");
                return this.f9655b.f9551j.g(Unit.f186387a, false).f(te0.w.j(taxRate));
            case 1:
                FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) obj2;
                w4l.f fVar = this.f9655b.i;
                Unit unit = Unit.f186387a;
                Intrinsics.h(freelancerInvoiceSettings);
                fVar.j(unit, freelancerInvoiceSettings);
                return unit;
            case 2:
                Throwable exception = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                FreelancerServerError freelancerServerErrorA = ((com.revolut.feature.freelancer.impl.network.errorhandling.b) this.f9655b.f9549g).a(exception);
                FreelancerServerError.InvoiceNumberTaken invoiceNumberTaken = freelancerServerErrorA instanceof FreelancerServerError.InvoiceNumberTaken ? (FreelancerServerError.InvoiceNumberTaken) freelancerServerErrorA : null;
                if (invoiceNumberTaken != null) {
                    exception = invoiceNumberTaken;
                }
                ufm.c cVarL = efm.d0.l(exception);
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            case 3:
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) obj2;
                this.f9655b.f9550h.j(new f1(freelancerInvoice.f73374a), zhm.u.c(freelancerInvoice));
                return Unit.f186387a;
            case 4:
                File file = (File) obj2;
                Intrinsics.checkNotNullParameter(file, "file");
                return ((f80.b) this.f9655b.f).a(file);
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) this.f9655b.f9547b.get("CACHE_KEY_TAX_RATES");
            case 6:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                List<ks6.d0> list = (List) DBUtil.performBlocking(this.f9655b.f9548c.f168138a, true, false, new ip4.m(27));
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (ks6.d0 d0Var : list) {
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    arrayList.add(new FreelancerInvoiceTaxRate(d0Var.f189140c, d0Var.f189138a, d0Var.f189139b));
                }
                return arrayList;
            case 7:
                g1 param = (g1) obj2;
                Intrinsics.checkNotNullParameter(param, "param");
                boolean z = param instanceof c1;
                k1 k1Var = this.f9655b;
                if (z) {
                    return (List) k1Var.f9547b.get("FreelancerInvoiceRepository:Invoices:OneTime");
                }
                if (param instanceof d1) {
                    return (List) k1Var.f9547b.get("FreelancerInvoiceRepository:Invoices:Recurring");
                }
                if (!(param instanceof f1)) {
                    if (param instanceof e1) {
                        return (List) v7.r("FreelancerInvoiceRepository:RecurringHistory:", ((e1) param).f9519a, k1Var.f9547b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ne0.j jVar = k1Var.f9547b;
                List list2 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:OneTime");
                if (list2 != null) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next2 = it8.next();
                            FreelancerInvoice it9 = (FreelancerInvoice) next2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            if (Intrinsics.f(it9.f73374a, ((f1) param).f9528a)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    FreelancerInvoice freelancerInvoice2 = (FreelancerInvoice) next2;
                    if (freelancerInvoice2 != null && (listC = zhm.u.c(freelancerInvoice2)) != null) {
                        return listC;
                    }
                }
                List list3 = (List) jVar.get("FreelancerInvoiceRepository:Invoices:Recurring");
                if (list3 != null) {
                    Iterator it10 = list3.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next = it10.next();
                            FreelancerInvoice it11 = (FreelancerInvoice) next;
                            Intrinsics.checkNotNullParameter(it11, "it");
                            if (Intrinsics.f(it11.f73374a, ((f1) param).f9528a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    FreelancerInvoice freelancerInvoice3 = (FreelancerInvoice) next;
                    if (freelancerInvoice3 != null) {
                        return zhm.u.c(freelancerInvoice3);
                    }
                }
                return null;
            case 8:
                final is6.y yVar = this.f9655b.d;
                g1 param2 = (g1) obj2;
                Intrinsics.checkNotNullParameter(param2, "param");
                if (param2 instanceof c1) {
                    final int i = 1;
                    List list4 = (List) DBUtil.performBlocking(yVar.f168146a, true, false, new Function1() { // from class: is6.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            SQLiteStatement sQLiteStatementPrepare;
                            int i2;
                            int i3;
                            String text;
                            int i5;
                            int i6;
                            String text2;
                            switch (i) {
                                case 0:
                                    js6.p pVar = yVar.f168148c;
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE recurringSchedule IS NOT NULL");
                                    try {
                                        int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                        int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentInvoiceId");
                                        int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "number");
                                        int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberFormatted");
                                        int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberPrefix");
                                        int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "saleDate");
                                        int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "issueDate");
                                        int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dueDate");
                                        int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                        int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                        int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total");
                                        int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtotal");
                                        int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalTax");
                                        int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerId");
                                        int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerDetails");
                                        int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supplierDetails");
                                        int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statusDetails");
                                        int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledPaymentMethods");
                                        int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledReminders");
                                        int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "taxes");
                                        int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "items");
                                        int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalNote");
                                        int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerMessage");
                                        int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringInvoiceId");
                                        int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringSchedule");
                                        int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateId");
                                        int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateOverride");
                                        ArrayList arrayList2 = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            String text3 = null;
                                            String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                            String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                            String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                            String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                            String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                            Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                                            Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                            Long lValueOf3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                                            String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                            String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                            jo3.b bVarA = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                            jo3.b bVarA2 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                                            jo3.b bVarA3 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                            if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                                                int i21 = columnIndexOrThrow;
                                                i2 = columnIndexOrThrow15;
                                                i3 = i21;
                                                text = null;
                                            } else {
                                                int i22 = columnIndexOrThrow;
                                                i2 = columnIndexOrThrow15;
                                                i3 = i22;
                                                text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                                            }
                                            ks6.w wVarA = js6.j.a(sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2));
                                            int i32 = i2;
                                            int i33 = columnIndexOrThrow16;
                                            a0 a0VarA = js6.m.a(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                                            columnIndexOrThrow16 = i33;
                                            int i43 = columnIndexOrThrow17;
                                            ks6.z zVarA = js6.l.a(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                                            columnIndexOrThrow17 = i43;
                                            int i59 = columnIndexOrThrow18;
                                            List listA = js6.p.a(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                                            columnIndexOrThrow18 = i59;
                                            int i66 = columnIndexOrThrow19;
                                            List listA2 = js6.p.a(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                                            columnIndexOrThrow19 = i66;
                                            int i74 = columnIndexOrThrow20;
                                            List listA3 = js6.n.a(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                                            columnIndexOrThrow20 = i74;
                                            int i92 = columnIndexOrThrow21;
                                            List listA4 = js6.k.a(sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92));
                                            columnIndexOrThrow21 = i92;
                                            int i96 = columnIndexOrThrow22;
                                            String text11 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                                            columnIndexOrThrow22 = i96;
                                            int i99 = columnIndexOrThrow23;
                                            String text12 = sQLiteStatementPrepare.isNull(i99) ? null : sQLiteStatementPrepare.getText(i99);
                                            columnIndexOrThrow23 = i99;
                                            int i100 = columnIndexOrThrow24;
                                            String text13 = sQLiteStatementPrepare.isNull(i100) ? null : sQLiteStatementPrepare.getText(i100);
                                            columnIndexOrThrow24 = i100;
                                            int i101 = columnIndexOrThrow25;
                                            n0 n0VarA = js6.w.a(sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101));
                                            columnIndexOrThrow25 = i101;
                                            int i102 = columnIndexOrThrow26;
                                            String text14 = sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102);
                                            columnIndexOrThrow26 = i102;
                                            int i103 = columnIndexOrThrow27;
                                            if (!sQLiteStatementPrepare.isNull(i103)) {
                                                text3 = sQLiteStatementPrepare.getText(i103);
                                            }
                                            columnIndexOrThrow27 = i103;
                                            arrayList2.add(new ks6.x(text4, text5, text6, text7, text8, lValueOf, lValueOf2, lValueOf3, text9, text10, bVarA, bVarA2, bVarA3, text, wVarA, a0VarA, zVarA, listA, listA2, listA3, listA4, text11, text12, text13, n0VarA, text14, js6.o.a(text3)));
                                            columnIndexOrThrow = i3;
                                            columnIndexOrThrow15 = i32;
                                            break;
                                        }
                                        return arrayList2;
                                    } finally {
                                    }
                                default:
                                    js6.p pVar2 = yVar.f168148c;
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE recurringSchedule IS NULL");
                                    try {
                                        int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                        int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentInvoiceId");
                                        int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "number");
                                        int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberFormatted");
                                        int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberPrefix");
                                        int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "saleDate");
                                        int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "issueDate");
                                        int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dueDate");
                                        int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                        int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                        int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total");
                                        int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtotal");
                                        int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalTax");
                                        int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerId");
                                        int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerDetails");
                                        int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supplierDetails");
                                        int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statusDetails");
                                        int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledPaymentMethods");
                                        int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledReminders");
                                        int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "taxes");
                                        int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "items");
                                        int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalNote");
                                        int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerMessage");
                                        int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringInvoiceId");
                                        int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringSchedule");
                                        int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateId");
                                        int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateOverride");
                                        ArrayList arrayList3 = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            String text15 = null;
                                            String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                            String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                            String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                            String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31);
                                            String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                            Long lValueOf4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow33));
                                            Long lValueOf5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow34));
                                            Long lValueOf6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow35));
                                            String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                            String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37);
                                            jo3.b bVarA4 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                            jo3.b bVarA5 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39));
                                            jo3.b bVarA6 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40));
                                            if (sQLiteStatementPrepare.isNull(columnIndexOrThrow41)) {
                                                int i104 = columnIndexOrThrow28;
                                                i5 = columnIndexOrThrow42;
                                                i6 = i104;
                                                text2 = null;
                                            } else {
                                                int i105 = columnIndexOrThrow28;
                                                i5 = columnIndexOrThrow42;
                                                i6 = i105;
                                                text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow41);
                                            }
                                            ks6.w wVarA2 = js6.j.a(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                                            int i106 = i5;
                                            int i107 = columnIndexOrThrow43;
                                            a0 a0VarA2 = js6.m.a(sQLiteStatementPrepare.isNull(i107) ? null : sQLiteStatementPrepare.getText(i107));
                                            columnIndexOrThrow43 = i107;
                                            int i108 = columnIndexOrThrow44;
                                            ks6.z zVarA2 = js6.l.a(sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108));
                                            columnIndexOrThrow44 = i108;
                                            int i109 = columnIndexOrThrow45;
                                            List listA5 = js6.p.a(sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109));
                                            columnIndexOrThrow45 = i109;
                                            int i110 = columnIndexOrThrow46;
                                            List listA6 = js6.p.a(sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110));
                                            columnIndexOrThrow46 = i110;
                                            int i111 = columnIndexOrThrow47;
                                            List listA7 = js6.n.a(sQLiteStatementPrepare.isNull(i111) ? null : sQLiteStatementPrepare.getText(i111));
                                            columnIndexOrThrow47 = i111;
                                            int i112 = columnIndexOrThrow48;
                                            List listA8 = js6.k.a(sQLiteStatementPrepare.isNull(i112) ? null : sQLiteStatementPrepare.getText(i112));
                                            columnIndexOrThrow48 = i112;
                                            int i113 = columnIndexOrThrow49;
                                            String text23 = sQLiteStatementPrepare.isNull(i113) ? null : sQLiteStatementPrepare.getText(i113);
                                            columnIndexOrThrow49 = i113;
                                            int i114 = columnIndexOrThrow50;
                                            String text24 = sQLiteStatementPrepare.isNull(i114) ? null : sQLiteStatementPrepare.getText(i114);
                                            columnIndexOrThrow50 = i114;
                                            int i115 = columnIndexOrThrow51;
                                            String text25 = sQLiteStatementPrepare.isNull(i115) ? null : sQLiteStatementPrepare.getText(i115);
                                            columnIndexOrThrow51 = i115;
                                            int i116 = columnIndexOrThrow52;
                                            n0 n0VarA2 = js6.w.a(sQLiteStatementPrepare.isNull(i116) ? null : sQLiteStatementPrepare.getText(i116));
                                            columnIndexOrThrow52 = i116;
                                            int i117 = columnIndexOrThrow53;
                                            String text26 = sQLiteStatementPrepare.isNull(i117) ? null : sQLiteStatementPrepare.getText(i117);
                                            columnIndexOrThrow53 = i117;
                                            int i118 = columnIndexOrThrow54;
                                            if (!sQLiteStatementPrepare.isNull(i118)) {
                                                text15 = sQLiteStatementPrepare.getText(i118);
                                            }
                                            columnIndexOrThrow54 = i118;
                                            arrayList3.add(new ks6.x(text16, text17, text18, text19, text20, lValueOf4, lValueOf5, lValueOf6, text21, text22, bVarA4, bVarA5, bVarA6, text2, wVarA2, a0VarA2, zVarA2, listA5, listA6, listA7, listA8, text23, text24, text25, n0VarA2, text26, js6.o.a(text15)));
                                            columnIndexOrThrow28 = i6;
                                            columnIndexOrThrow42 = i106;
                                            break;
                                        }
                                        return arrayList3;
                                    } finally {
                                    }
                            }
                        }
                    });
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it12 = list4.iterator();
                    while (it12.hasNext()) {
                        arrayList2.add(ft6.h.d((ks6.x) it12.next()));
                    }
                    return arrayList2;
                }
                if (param2 instanceof d1) {
                    final int i2 = 0;
                    List list5 = (List) DBUtil.performBlocking(yVar.f168146a, true, false, new Function1() { // from class: is6.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            SQLiteStatement sQLiteStatementPrepare;
                            int i22;
                            int i3;
                            String text;
                            int i5;
                            int i6;
                            String text2;
                            switch (i2) {
                                case 0:
                                    js6.p pVar = yVar.f168148c;
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE recurringSchedule IS NOT NULL");
                                    try {
                                        int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                        int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentInvoiceId");
                                        int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "number");
                                        int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberFormatted");
                                        int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberPrefix");
                                        int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "saleDate");
                                        int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "issueDate");
                                        int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dueDate");
                                        int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                        int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                        int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total");
                                        int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtotal");
                                        int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalTax");
                                        int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerId");
                                        int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerDetails");
                                        int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supplierDetails");
                                        int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statusDetails");
                                        int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledPaymentMethods");
                                        int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledReminders");
                                        int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "taxes");
                                        int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "items");
                                        int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalNote");
                                        int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerMessage");
                                        int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringInvoiceId");
                                        int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringSchedule");
                                        int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateId");
                                        int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateOverride");
                                        ArrayList arrayList22 = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            String text3 = null;
                                            String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                            String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                            String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                            String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                            String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                            Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                                            Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                            Long lValueOf3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                                            String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                            String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                            jo3.b bVarA = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                            jo3.b bVarA2 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                                            jo3.b bVarA3 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                            if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                                                int i21 = columnIndexOrThrow;
                                                i22 = columnIndexOrThrow15;
                                                i3 = i21;
                                                text = null;
                                            } else {
                                                int i222 = columnIndexOrThrow;
                                                i22 = columnIndexOrThrow15;
                                                i3 = i222;
                                                text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                                            }
                                            ks6.w wVarA = js6.j.a(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                                            int i32 = i22;
                                            int i33 = columnIndexOrThrow16;
                                            a0 a0VarA = js6.m.a(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                                            columnIndexOrThrow16 = i33;
                                            int i43 = columnIndexOrThrow17;
                                            ks6.z zVarA = js6.l.a(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                                            columnIndexOrThrow17 = i43;
                                            int i59 = columnIndexOrThrow18;
                                            List listA = js6.p.a(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                                            columnIndexOrThrow18 = i59;
                                            int i66 = columnIndexOrThrow19;
                                            List listA2 = js6.p.a(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                                            columnIndexOrThrow19 = i66;
                                            int i74 = columnIndexOrThrow20;
                                            List listA3 = js6.n.a(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                                            columnIndexOrThrow20 = i74;
                                            int i92 = columnIndexOrThrow21;
                                            List listA4 = js6.k.a(sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92));
                                            columnIndexOrThrow21 = i92;
                                            int i96 = columnIndexOrThrow22;
                                            String text11 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                                            columnIndexOrThrow22 = i96;
                                            int i99 = columnIndexOrThrow23;
                                            String text12 = sQLiteStatementPrepare.isNull(i99) ? null : sQLiteStatementPrepare.getText(i99);
                                            columnIndexOrThrow23 = i99;
                                            int i100 = columnIndexOrThrow24;
                                            String text13 = sQLiteStatementPrepare.isNull(i100) ? null : sQLiteStatementPrepare.getText(i100);
                                            columnIndexOrThrow24 = i100;
                                            int i101 = columnIndexOrThrow25;
                                            n0 n0VarA = js6.w.a(sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101));
                                            columnIndexOrThrow25 = i101;
                                            int i102 = columnIndexOrThrow26;
                                            String text14 = sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102);
                                            columnIndexOrThrow26 = i102;
                                            int i103 = columnIndexOrThrow27;
                                            if (!sQLiteStatementPrepare.isNull(i103)) {
                                                text3 = sQLiteStatementPrepare.getText(i103);
                                            }
                                            columnIndexOrThrow27 = i103;
                                            arrayList22.add(new ks6.x(text4, text5, text6, text7, text8, lValueOf, lValueOf2, lValueOf3, text9, text10, bVarA, bVarA2, bVarA3, text, wVarA, a0VarA, zVarA, listA, listA2, listA3, listA4, text11, text12, text13, n0VarA, text14, js6.o.a(text3)));
                                            columnIndexOrThrow = i3;
                                            columnIndexOrThrow15 = i32;
                                            break;
                                        }
                                        return arrayList22;
                                    } finally {
                                    }
                                default:
                                    js6.p pVar2 = yVar.f168148c;
                                    sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE recurringSchedule IS NULL");
                                    try {
                                        int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                        int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentInvoiceId");
                                        int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "number");
                                        int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberFormatted");
                                        int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberPrefix");
                                        int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "saleDate");
                                        int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "issueDate");
                                        int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dueDate");
                                        int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                        int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                        int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total");
                                        int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtotal");
                                        int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalTax");
                                        int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerId");
                                        int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerDetails");
                                        int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supplierDetails");
                                        int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statusDetails");
                                        int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledPaymentMethods");
                                        int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledReminders");
                                        int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "taxes");
                                        int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "items");
                                        int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalNote");
                                        int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerMessage");
                                        int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringInvoiceId");
                                        int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringSchedule");
                                        int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateId");
                                        int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateOverride");
                                        ArrayList arrayList3 = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            String text15 = null;
                                            String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28);
                                            String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29);
                                            String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30);
                                            String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31);
                                            String text20 = sQLiteStatementPrepare.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow32);
                                            Long lValueOf4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow33) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow33));
                                            Long lValueOf5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow34));
                                            Long lValueOf6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow35));
                                            String text21 = sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36);
                                            String text22 = sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37);
                                            jo3.b bVarA4 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38));
                                            jo3.b bVarA5 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39));
                                            jo3.b bVarA6 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40));
                                            if (sQLiteStatementPrepare.isNull(columnIndexOrThrow41)) {
                                                int i104 = columnIndexOrThrow28;
                                                i5 = columnIndexOrThrow42;
                                                i6 = i104;
                                                text2 = null;
                                            } else {
                                                int i105 = columnIndexOrThrow28;
                                                i5 = columnIndexOrThrow42;
                                                i6 = i105;
                                                text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow41);
                                            }
                                            ks6.w wVarA2 = js6.j.a(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                                            int i106 = i5;
                                            int i107 = columnIndexOrThrow43;
                                            a0 a0VarA2 = js6.m.a(sQLiteStatementPrepare.isNull(i107) ? null : sQLiteStatementPrepare.getText(i107));
                                            columnIndexOrThrow43 = i107;
                                            int i108 = columnIndexOrThrow44;
                                            ks6.z zVarA2 = js6.l.a(sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108));
                                            columnIndexOrThrow44 = i108;
                                            int i109 = columnIndexOrThrow45;
                                            List listA5 = js6.p.a(sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109));
                                            columnIndexOrThrow45 = i109;
                                            int i110 = columnIndexOrThrow46;
                                            List listA6 = js6.p.a(sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110));
                                            columnIndexOrThrow46 = i110;
                                            int i111 = columnIndexOrThrow47;
                                            List listA7 = js6.n.a(sQLiteStatementPrepare.isNull(i111) ? null : sQLiteStatementPrepare.getText(i111));
                                            columnIndexOrThrow47 = i111;
                                            int i112 = columnIndexOrThrow48;
                                            List listA8 = js6.k.a(sQLiteStatementPrepare.isNull(i112) ? null : sQLiteStatementPrepare.getText(i112));
                                            columnIndexOrThrow48 = i112;
                                            int i113 = columnIndexOrThrow49;
                                            String text23 = sQLiteStatementPrepare.isNull(i113) ? null : sQLiteStatementPrepare.getText(i113);
                                            columnIndexOrThrow49 = i113;
                                            int i114 = columnIndexOrThrow50;
                                            String text24 = sQLiteStatementPrepare.isNull(i114) ? null : sQLiteStatementPrepare.getText(i114);
                                            columnIndexOrThrow50 = i114;
                                            int i115 = columnIndexOrThrow51;
                                            String text25 = sQLiteStatementPrepare.isNull(i115) ? null : sQLiteStatementPrepare.getText(i115);
                                            columnIndexOrThrow51 = i115;
                                            int i116 = columnIndexOrThrow52;
                                            n0 n0VarA2 = js6.w.a(sQLiteStatementPrepare.isNull(i116) ? null : sQLiteStatementPrepare.getText(i116));
                                            columnIndexOrThrow52 = i116;
                                            int i117 = columnIndexOrThrow53;
                                            String text26 = sQLiteStatementPrepare.isNull(i117) ? null : sQLiteStatementPrepare.getText(i117);
                                            columnIndexOrThrow53 = i117;
                                            int i118 = columnIndexOrThrow54;
                                            if (!sQLiteStatementPrepare.isNull(i118)) {
                                                text15 = sQLiteStatementPrepare.getText(i118);
                                            }
                                            columnIndexOrThrow54 = i118;
                                            arrayList3.add(new ks6.x(text16, text17, text18, text19, text20, lValueOf4, lValueOf5, lValueOf6, text21, text22, bVarA4, bVarA5, bVarA6, text2, wVarA2, a0VarA2, zVarA2, listA5, listA6, listA7, listA8, text23, text24, text25, n0VarA2, text26, js6.o.a(text15)));
                                            columnIndexOrThrow28 = i6;
                                            columnIndexOrThrow42 = i106;
                                            break;
                                        }
                                        return arrayList3;
                                    } finally {
                                    }
                            }
                        }
                    });
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, 10));
                    Iterator it13 = list5.iterator();
                    while (it13.hasNext()) {
                        arrayList3.add(ft6.h.d((ks6.x) it13.next()));
                    }
                    return arrayList3;
                }
                if (param2 instanceof f1) {
                    final String str = ((f1) param2).f9528a;
                    final int i3 = 1;
                    ks6.x xVar = (ks6.x) DBUtil.performBlocking(yVar.f168146a, true, false, new Function1() { // from class: is6.v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i5;
                            int i6;
                            String text;
                            switch (i3) {
                                case 0:
                                    js6.p pVar = yVar.f168148c;
                                    SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE parentInvoiceId = ?");
                                    String str2 = str;
                                    try {
                                        if (str2 == null) {
                                            sQLiteStatementPrepare.bindNull(1);
                                        } else {
                                            sQLiteStatementPrepare.bindText(1, str2);
                                        }
                                        int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                        int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentInvoiceId");
                                        int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "number");
                                        int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberFormatted");
                                        int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberPrefix");
                                        int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "saleDate");
                                        int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "issueDate");
                                        int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dueDate");
                                        int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                        int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                        int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total");
                                        int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtotal");
                                        int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalTax");
                                        int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerId");
                                        int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerDetails");
                                        int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supplierDetails");
                                        int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statusDetails");
                                        int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledPaymentMethods");
                                        int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledReminders");
                                        int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "taxes");
                                        int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "items");
                                        int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalNote");
                                        int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerMessage");
                                        int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringInvoiceId");
                                        int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringSchedule");
                                        int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateId");
                                        int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateOverride");
                                        ArrayList arrayList4 = new ArrayList();
                                        while (sQLiteStatementPrepare.step()) {
                                            String text2 = null;
                                            String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                            String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                            String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                            String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                            String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                            Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                                            Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                            Long lValueOf3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                                            String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                            String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                            jo3.b bVarA = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                            jo3.b bVarA2 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                                            jo3.b bVarA3 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                            if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                                                int i21 = columnIndexOrThrow;
                                                i5 = columnIndexOrThrow15;
                                                i6 = i21;
                                                text = null;
                                            } else {
                                                int i22 = columnIndexOrThrow;
                                                i5 = columnIndexOrThrow15;
                                                i6 = i22;
                                                text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                                            }
                                            ks6.w wVarA = js6.j.a(sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5));
                                            int i32 = i5;
                                            int i33 = columnIndexOrThrow16;
                                            a0 a0VarA = js6.m.a(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                                            columnIndexOrThrow16 = i33;
                                            int i43 = columnIndexOrThrow17;
                                            ks6.z zVarA = js6.l.a(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                                            columnIndexOrThrow17 = i43;
                                            int i59 = columnIndexOrThrow18;
                                            List listA = js6.p.a(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                                            columnIndexOrThrow18 = i59;
                                            int i66 = columnIndexOrThrow19;
                                            List listA2 = js6.p.a(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                                            columnIndexOrThrow19 = i66;
                                            int i74 = columnIndexOrThrow20;
                                            List listA3 = js6.n.a(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                                            columnIndexOrThrow20 = i74;
                                            int i92 = columnIndexOrThrow21;
                                            List listA4 = js6.k.a(sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92));
                                            columnIndexOrThrow21 = i92;
                                            int i96 = columnIndexOrThrow22;
                                            String text10 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                                            columnIndexOrThrow22 = i96;
                                            int i99 = columnIndexOrThrow23;
                                            String text11 = sQLiteStatementPrepare.isNull(i99) ? null : sQLiteStatementPrepare.getText(i99);
                                            columnIndexOrThrow23 = i99;
                                            int i100 = columnIndexOrThrow24;
                                            String text12 = sQLiteStatementPrepare.isNull(i100) ? null : sQLiteStatementPrepare.getText(i100);
                                            columnIndexOrThrow24 = i100;
                                            int i101 = columnIndexOrThrow25;
                                            n0 n0VarA = js6.w.a(sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101));
                                            columnIndexOrThrow25 = i101;
                                            int i102 = columnIndexOrThrow26;
                                            String text13 = sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102);
                                            columnIndexOrThrow26 = i102;
                                            int i103 = columnIndexOrThrow27;
                                            if (!sQLiteStatementPrepare.isNull(i103)) {
                                                text2 = sQLiteStatementPrepare.getText(i103);
                                            }
                                            columnIndexOrThrow27 = i103;
                                            arrayList4.add(new ks6.x(text3, text4, text5, text6, text7, lValueOf, lValueOf2, lValueOf3, text8, text9, bVarA, bVarA2, bVarA3, text, wVarA, a0VarA, zVarA, listA, listA2, listA3, listA4, text10, text11, text12, n0VarA, text13, js6.o.a(text2)));
                                            columnIndexOrThrow = i6;
                                            columnIndexOrThrow15 = i32;
                                            break;
                                        }
                                        sQLiteStatementPrepare.close();
                                        return arrayList4;
                                    } finally {
                                    }
                                default:
                                    js6.p pVar2 = yVar.f168148c;
                                    SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE id = ?");
                                    String str3 = str;
                                    try {
                                        if (str3 == null) {
                                            sQLiteStatementPrepare2.bindNull(1);
                                        } else {
                                            sQLiteStatementPrepare2.bindText(1, str3);
                                        }
                                        int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                                        int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "parentInvoiceId");
                                        int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "number");
                                        int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "numberFormatted");
                                        int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "numberPrefix");
                                        int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "saleDate");
                                        int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "issueDate");
                                        int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "dueDate");
                                        int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "currency");
                                        int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "status");
                                        int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "total");
                                        int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "subtotal");
                                        int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "totalTax");
                                        int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "customerId");
                                        int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "customerDetails");
                                        int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "supplierDetails");
                                        int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "statusDetails");
                                        int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "enabledPaymentMethods");
                                        int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "enabledReminders");
                                        int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "taxes");
                                        int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "items");
                                        int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "additionalNote");
                                        int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "customerMessage");
                                        int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "recurringInvoiceId");
                                        int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "recurringSchedule");
                                        int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "templateId");
                                        int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "templateOverride");
                                        ks6.x xVar2 = null;
                                        String text14 = null;
                                        if (sQLiteStatementPrepare2.step()) {
                                            String text15 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow28);
                                            String text16 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow29);
                                            String text17 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow30);
                                            String text18 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow31);
                                            String text19 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow32);
                                            Long lValueOf4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow33) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow33));
                                            Long lValueOf5 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow34) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow34));
                                            Long lValueOf6 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow35) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow35));
                                            String text20 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow36);
                                            String text21 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow37);
                                            jo3.b bVarA4 = js6.q.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow38));
                                            jo3.b bVarA5 = js6.q.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow39));
                                            jo3.b bVarA6 = js6.q.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow40));
                                            String text22 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow41);
                                            ks6.w wVarA2 = js6.j.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow42));
                                            a0 a0VarA2 = js6.m.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow43));
                                            ks6.z zVarA2 = js6.l.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow44) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow44));
                                            List listA5 = js6.p.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow45) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow45));
                                            List listA6 = js6.p.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow46) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow46));
                                            List listA7 = js6.n.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow47) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow47));
                                            List listA8 = js6.k.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow48) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow48));
                                            String text23 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow49) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow49);
                                            String text24 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow50) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow50);
                                            String text25 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow51) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow51);
                                            n0 n0VarA2 = js6.w.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow52) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow52));
                                            String text26 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow53) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow53);
                                            if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow54)) {
                                                text14 = sQLiteStatementPrepare2.getText(columnIndexOrThrow54);
                                            }
                                            xVar2 = new ks6.x(text15, text16, text17, text18, text19, lValueOf4, lValueOf5, lValueOf6, text20, text21, bVarA4, bVarA5, bVarA6, text22, wVarA2, a0VarA2, zVarA2, listA5, listA6, listA7, listA8, text23, text24, text25, n0VarA2, text26, js6.o.a(text14));
                                        }
                                        sQLiteStatementPrepare2.close();
                                        return xVar2;
                                    } finally {
                                    }
                            }
                        }
                    });
                    if (xVar != null) {
                        return zhm.u.c(ft6.h.d(xVar));
                    }
                    return null;
                }
                if (!(param2 instanceof e1)) {
                    throw new NoWhenBranchMatchedException();
                }
                final String str2 = ((e1) param2).f9519a;
                final int i5 = 0;
                List list6 = (List) DBUtil.performBlocking(yVar.f168146a, true, false, new Function1() { // from class: is6.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        int i59;
                        int i6;
                        String text;
                        switch (i5) {
                            case 0:
                                js6.p pVar = yVar.f168148c;
                                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE parentInvoiceId = ?");
                                String str22 = str2;
                                try {
                                    if (str22 == null) {
                                        sQLiteStatementPrepare.bindNull(1);
                                    } else {
                                        sQLiteStatementPrepare.bindText(1, str22);
                                    }
                                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "parentInvoiceId");
                                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "number");
                                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberFormatted");
                                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "numberPrefix");
                                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "saleDate");
                                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "issueDate");
                                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dueDate");
                                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total");
                                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtotal");
                                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalTax");
                                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerId");
                                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerDetails");
                                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "supplierDetails");
                                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "statusDetails");
                                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledPaymentMethods");
                                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enabledReminders");
                                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "taxes");
                                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "items");
                                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "additionalNote");
                                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customerMessage");
                                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringInvoiceId");
                                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recurringSchedule");
                                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateId");
                                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "templateOverride");
                                    ArrayList arrayList4 = new ArrayList();
                                    while (sQLiteStatementPrepare.step()) {
                                        String text2 = null;
                                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                                        Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                                        Long lValueOf3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                                        jo3.b bVarA = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                                        jo3.b bVarA2 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                                        jo3.b bVarA3 = js6.q.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                                            int i21 = columnIndexOrThrow;
                                            i59 = columnIndexOrThrow15;
                                            i6 = i21;
                                            text = null;
                                        } else {
                                            int i22 = columnIndexOrThrow;
                                            i59 = columnIndexOrThrow15;
                                            i6 = i22;
                                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                                        }
                                        ks6.w wVarA = js6.j.a(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                                        int i32 = i59;
                                        int i33 = columnIndexOrThrow16;
                                        a0 a0VarA = js6.m.a(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                                        columnIndexOrThrow16 = i33;
                                        int i43 = columnIndexOrThrow17;
                                        ks6.z zVarA = js6.l.a(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                                        columnIndexOrThrow17 = i43;
                                        int i592 = columnIndexOrThrow18;
                                        List listA = js6.p.a(sQLiteStatementPrepare.isNull(i592) ? null : sQLiteStatementPrepare.getText(i592));
                                        columnIndexOrThrow18 = i592;
                                        int i66 = columnIndexOrThrow19;
                                        List listA2 = js6.p.a(sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66));
                                        columnIndexOrThrow19 = i66;
                                        int i74 = columnIndexOrThrow20;
                                        List listA3 = js6.n.a(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                                        columnIndexOrThrow20 = i74;
                                        int i92 = columnIndexOrThrow21;
                                        List listA4 = js6.k.a(sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92));
                                        columnIndexOrThrow21 = i92;
                                        int i96 = columnIndexOrThrow22;
                                        String text10 = sQLiteStatementPrepare.isNull(i96) ? null : sQLiteStatementPrepare.getText(i96);
                                        columnIndexOrThrow22 = i96;
                                        int i99 = columnIndexOrThrow23;
                                        String text11 = sQLiteStatementPrepare.isNull(i99) ? null : sQLiteStatementPrepare.getText(i99);
                                        columnIndexOrThrow23 = i99;
                                        int i100 = columnIndexOrThrow24;
                                        String text12 = sQLiteStatementPrepare.isNull(i100) ? null : sQLiteStatementPrepare.getText(i100);
                                        columnIndexOrThrow24 = i100;
                                        int i101 = columnIndexOrThrow25;
                                        n0 n0VarA = js6.w.a(sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101));
                                        columnIndexOrThrow25 = i101;
                                        int i102 = columnIndexOrThrow26;
                                        String text13 = sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102);
                                        columnIndexOrThrow26 = i102;
                                        int i103 = columnIndexOrThrow27;
                                        if (!sQLiteStatementPrepare.isNull(i103)) {
                                            text2 = sQLiteStatementPrepare.getText(i103);
                                        }
                                        columnIndexOrThrow27 = i103;
                                        arrayList4.add(new ks6.x(text3, text4, text5, text6, text7, lValueOf, lValueOf2, lValueOf3, text8, text9, bVarA, bVarA2, bVarA3, text, wVarA, a0VarA, zVarA, listA, listA2, listA3, listA4, text10, text11, text12, n0VarA, text13, js6.o.a(text2)));
                                        columnIndexOrThrow = i6;
                                        columnIndexOrThrow15 = i32;
                                        break;
                                    }
                                    sQLiteStatementPrepare.close();
                                    return arrayList4;
                                } finally {
                                }
                            default:
                                js6.p pVar2 = yVar.f168148c;
                                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj3).prepare("SELECT * FROM invoices WHERE id = ?");
                                String str3 = str2;
                                try {
                                    if (str3 == null) {
                                        sQLiteStatementPrepare2.bindNull(1);
                                    } else {
                                        sQLiteStatementPrepare2.bindText(1, str3);
                                    }
                                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "parentInvoiceId");
                                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "number");
                                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "numberFormatted");
                                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "numberPrefix");
                                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "saleDate");
                                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "issueDate");
                                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "dueDate");
                                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "currency");
                                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "status");
                                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "total");
                                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "subtotal");
                                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "totalTax");
                                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "customerId");
                                    int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "customerDetails");
                                    int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "supplierDetails");
                                    int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "statusDetails");
                                    int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "enabledPaymentMethods");
                                    int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "enabledReminders");
                                    int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "taxes");
                                    int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "items");
                                    int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "additionalNote");
                                    int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "customerMessage");
                                    int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "recurringInvoiceId");
                                    int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "recurringSchedule");
                                    int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "templateId");
                                    int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "templateOverride");
                                    ks6.x xVar2 = null;
                                    String text14 = null;
                                    if (sQLiteStatementPrepare2.step()) {
                                        String text15 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow28);
                                        String text16 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow29);
                                        String text17 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow30);
                                        String text18 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow31);
                                        String text19 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow32);
                                        Long lValueOf4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow33) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow33));
                                        Long lValueOf5 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow34) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow34));
                                        Long lValueOf6 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow35) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow35));
                                        String text20 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow36);
                                        String text21 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow37);
                                        jo3.b bVarA4 = js6.q.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow38));
                                        jo3.b bVarA5 = js6.q.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow39));
                                        jo3.b bVarA6 = js6.q.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow40));
                                        String text22 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow41);
                                        ks6.w wVarA2 = js6.j.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow42));
                                        a0 a0VarA2 = js6.m.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow43));
                                        ks6.z zVarA2 = js6.l.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow44) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow44));
                                        List listA5 = js6.p.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow45) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow45));
                                        List listA6 = js6.p.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow46) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow46));
                                        List listA7 = js6.n.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow47) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow47));
                                        List listA8 = js6.k.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow48) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow48));
                                        String text23 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow49) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow49);
                                        String text24 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow50) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow50);
                                        String text25 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow51) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow51);
                                        n0 n0VarA2 = js6.w.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow52) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow52));
                                        String text26 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow53) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow53);
                                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow54)) {
                                            text14 = sQLiteStatementPrepare2.getText(columnIndexOrThrow54);
                                        }
                                        xVar2 = new ks6.x(text15, text16, text17, text18, text19, lValueOf4, lValueOf5, lValueOf6, text20, text21, bVarA4, bVarA5, bVarA6, text22, wVarA2, a0VarA2, zVarA2, listA5, listA6, listA7, listA8, text23, text24, text25, n0VarA2, text26, js6.o.a(text14));
                                    }
                                    sQLiteStatementPrepare2.close();
                                    return xVar2;
                                } finally {
                                }
                        }
                    }
                });
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it14 = list6.iterator();
                while (it14.hasNext()) {
                    arrayList4.add(ft6.h.d((ks6.x) it14.next()));
                }
                return arrayList4;
            case 9:
                k1 k1Var2 = this.f9655b;
                is6.y yVar2 = k1Var2.d;
                g1 param3 = (g1) obj2;
                Intrinsics.checkNotNullParameter(param3, "param");
                if (param3 instanceof c1) {
                    DBUtil.performBlocking(yVar2.f168146a, false, true, new ip4.m(28));
                } else if (param3 instanceof d1) {
                    DBUtil.performBlocking(yVar2.f168146a, false, true, new ip4.m(29));
                } else if (param3 instanceof f1) {
                    String str3 = ((f1) param3).f9528a;
                    DBUtil.performBlocking(yVar2.f168146a, false, true, new ik3.a(str3, 9));
                    k1Var2.e(str3);
                } else {
                    if (!(param3 instanceof e1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str4 = ((e1) param3).f9519a;
                    DBUtil.performBlocking(yVar2.f168146a, false, true, new ik3.a(str4, 9));
                    k1Var2.e(str4);
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (FreelancerInvoiceSettings) this.f9655b.f9547b.get("CACHE_KEY_INVOICE_SETTINGS");
        }
    }
}
