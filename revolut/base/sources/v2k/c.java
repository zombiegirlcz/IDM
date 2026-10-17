package v2k;

import b2k.e;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f285748b = v.k("tcs", "igst", "cgst", "sgst", "fx.igst", "fx.cgst", "fx.sgst", "consumption.vat", "consumption.gmf", "consumption.stamp_duty");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f285749c = v.k("tcs", "igst", "cgst", "sgst", "fx.igst", "fx.cgst", "fx.sgst", "consumption.gmf", "consumption.stamp_duty");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f285750a;

    public c(a paymentsBreakdownTaxesActionTextMapper) {
        Intrinsics.checkNotNullParameter(paymentsBreakdownTaxesActionTextMapper, "paymentsBreakdownTaxesActionTextMapper");
        this.f285750a = paymentsBreakdownTaxesActionTextMapper;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TextLocalisedClause a(z3l.b bVar) {
        String str = bVar.f319300a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1368293883:
                    if (str.equals("consumption.stamp_duty")) {
                        return new TextLocalisedClause(R$string.transaction_details_charges_consumption_stamp_duty, null, null, 14);
                    }
                    break;
                case -482872991:
                    if (str.equals("fx.cgst")) {
                        return new TextLocalisedClause(R$string.transaction_tax_fx_igst_title, null, null, 14);
                    }
                    break;
                case -482694245:
                    if (str.equals("fx.igst")) {
                        return new TextLocalisedClause(R$string.transaction_tax_fx_igst_title, null, null, 14);
                    }
                    break;
                case -482396335:
                    if (str.equals("fx.sgst")) {
                        return new TextLocalisedClause(R$string.transaction_tax_fx_sgst_title, null, null, 14);
                    }
                    break;
                case 114660:
                    if (str.equals("tcs")) {
                        return new TextLocalisedClause(R$string.transaction_tax_tcs_title, null, null, 14);
                    }
                    break;
                case 3051973:
                    if (str.equals("cgst")) {
                        return new TextLocalisedClause(R$string.transaction_tax_cgst_title, null, null, 14);
                    }
                    break;
                case 3230719:
                    if (str.equals("igst")) {
                        return new TextLocalisedClause(R$string.transaction_tax_igst_title, null, null, 14);
                    }
                    break;
                case 3528629:
                    if (str.equals("sgst")) {
                        return new TextLocalisedClause(R$string.transaction_tax_sgst_title, null, null, 14);
                    }
                    break;
                case 366946157:
                    if (str.equals("consumption.gmf")) {
                        return new TextLocalisedClause(R$string.transaction_tax_gmf_title, null, null, 14);
                    }
                    break;
                case 366960214:
                    if (str.equals("consumption.vat")) {
                        return new TextLocalisedClause(R$string.transaction_tax_vat_title, null, null, 14);
                    }
                    break;
            }
        }
        return new TextLocalisedClause(R$string.transaction_tax_unknown_title, null, null, 14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model f(z3l.b r21) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2k.c.f(z3l.b):com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rp0.y b(z3l.b r29) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2k.c.b(z3l.b):rp0.y");
    }

    public final y c(z3l.a taxes) {
        List list;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        List list2 = taxes.f319298a;
        xi0.b bVar = taxes.f319299b.f115083b;
        List list3 = list2;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list3.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            list = f285748b;
            if (!zHasNext) {
                break;
            }
            Object next = it8.next();
            z3l.b bVar2 = (z3l.b) next;
            if (d0.T(list, bVar2.f319300a) || ((str2 = bVar2.f319301b) != null && (!kotlin.text.d0.W(str2)))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(f((z3l.b) it9.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list3) {
            z3l.b bVar3 = (z3l.b) obj2;
            if (!d0.T(list, bVar3.f319300a) && ((str = bVar3.f319301b) == null || kotlin.text.d0.W(str))) {
                arrayList3.add(obj2);
            }
        }
        Iterator it10 = arrayList3.iterator();
        long j2 = 0;
        while (it10.hasNext()) {
            j2 += ((z3l.b) it10.next()).e.f115082a;
        }
        CellDetailsDelegate.Model modelF = f(new z3l.b(new d(j2, bVar), null, null, null, null));
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList2);
        if (j2 > 0) {
            eVarB.add(modelF);
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new y(eVarA, new t(new TextLocalisedClause(R$string.bank_transfer_payment_breakdown_taxes_title, null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate.Model d(dj0.d r24, dj0.d r25, boolean r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2k.c.d(dj0.d, dj0.d, boolean, java.lang.Object):com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate$Model");
    }

    public final CellDetailsActionDelegate.Model e(z3l.a taxes) {
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        return d(taxes.f319299b, null, !taxes.f319298a.isEmpty(), taxes);
    }
}
