package ip4;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import ip0.c0;
import ip0.cs;
import ip0.gu;
import ip0.p10;
import ip0.pb0;
import ip0.t10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import ks6.t;
import m2l.x;
import m2l.y;
import m2l.z;
import qua.p;
import tof.a3;
import tof.s9;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167662a;

    public /* synthetic */ m(int i) {
        this.f167662a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f167662a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(new pb0(a0.d.n("LOADING_STATE_ID_", it8.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                pb0 pb0Var = new pb0("LOADING_STATE_ID_4");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0Var);
                return new k(null, null, u.a(eVarB), 7);
            case 1:
                Function0 defaultItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return new ip7.i(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (List) defaultItems.invoke(), false);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("SUBHEADER_LOADING_LIST_ID_1", 0, 0, 30);
                p10 p10Var = p10.f165755a;
                t10 t10Var = new t10("PLAIN_TEXT_LOADING_LIST_ID_1", p10Var);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                gu guVar2 = new gu("SUBHEADER_LOADING_LIST_ID_2", 0, 0, 30);
                t10 t10Var2 = new t10("PLAIN_TEXT_LOADING_LIST_ID_3", p10Var);
                yp0.b.l(t10Var2, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, t10Var, guVar2, t10Var2);
            case 3:
                alc.l it9 = (alc.l) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new t1h.h(8, it9.f6205b, false);
            case 4:
                jpc.c it10 = (jpc.c) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                dj0.d dVarH = pyd.c.H(it10.f177253a, it10.f177254b);
                long j2 = dVarH.f115082a;
                if (j2 < 0) {
                    j2 = 0;
                }
                return new t1h.g(dj0.d.c(dVarH, j2, null, 2), null);
            case 5:
                SingleChoiceDelegate.Model it11 = (SingleChoiceDelegate.Model) obj2;
                KProperty[] kPropertyArr = ReasonForTransferChooserScreen.R;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj3 = it11.f;
                if (obj3 instanceof krf.c) {
                    return (krf.c) obj3;
                }
                return null;
            case 6:
                iqf.a it12 = (iqf.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.d;
            case 7:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                return 300L;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                hqg.b.Companion.getClass();
                c0 c0Var = new c0("LOADING_DELEGATE0", new u.a(6, 2), 0, 0, 60);
                yp0.b.l(c0Var, 0, 0, 0, 0, null, false, 63);
                cs csVar = new cs("LOADING_DELEGATE1");
                yp0.b.r(csVar, 0, 0, 0, 0, 15);
                return v.k(c0Var, csVar);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 10:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 11:
                NaviCommand it13 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160142c, null, null, null, 14), it13);
            case 12:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 13:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                ArrayList arrayList2 = new ArrayList(w.t(linkedHashSet, 10));
                Iterator it14 = linkedHashSet.iterator();
                while (it14.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it14.next(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (cp5.d.A((xi0.b) obj4)) {
                        arrayList3.add(obj4);
                    }
                }
                return d0.P0(arrayList3, new ird.d());
            case 14:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.f fVar = new tlm.f();
                p0 p0Var = o0.f186429a;
                jt0.b bVar = new jt0.b(p0Var.b(z.class));
                bVar.G0(p0Var.b(x.class), x.INSTANCE.serializer());
                bVar.G0(p0Var.b(y.class), y.INSTANCE.serializer());
                bVar.G0(p0Var.b(m2l.w.class), m2l.w.INSTANCE.serializer());
                bVar.O(fVar);
                tlm.d dVarA = fVar.a();
                Json.getClass();
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 15:
                SelectableDelegate.Model it15 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = SelectPaymentToBlockScreen.f64258d0;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj5 = ((RowDelegate.Model) it15.f53305b).u;
                if (obj5 instanceof a3) {
                    return (a3) obj5;
                }
                return null;
            case 16:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : recurringPayments) {
                    p pVar = (p) obj6;
                    qua.g gVar = pVar.f249332w;
                    boolean z = gVar != null ? gVar.e : false;
                    ibd.f fVar2 = pVar.f249316b;
                    boolean z3 = fVar2 == ibd.f.ACTIVE || fVar2 == ibd.f.INACTIVE || fVar2 == ibd.f.CONFIRMED;
                    if (qua.u.G(pVar) && !z && z3 && qua.u.a(pVar) && !qua.u.k(pVar)) {
                        arrayList4.add(obj6);
                    }
                }
                return arrayList4;
            case 17:
                List recurringPayments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments2, "recurringPayments");
                ArrayList arrayList5 = new ArrayList();
                Iterator it16 = recurringPayments2.iterator();
                while (it16.hasNext()) {
                    Set set = ((p) it16.next()).G;
                    if (set != null) {
                        arrayList5.add(set);
                    }
                }
                return d0.i1(w.u(arrayList5));
            case 18:
                Set transactionIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
                return new s9(transactionIds);
            case 19:
                return is2.f.a((is2.f) obj2, null, null, null, null, true, 15);
            case 20:
                return is2.f.a((is2.f) obj2, null, null, null, null, false, 15);
            case 21:
                return is2.f.a((is2.f) obj2, null, null, null, null, false, 15);
            case 22:
                return is2.f.a((is2.f) obj2, null, null, null, null, true, 15);
            case 23:
                return is2.f.a((is2.f) obj2, null, null, null, null, false, 15);
            case 24:
                return is2.f.a((is2.f) obj2, null, null, null, null, false, 15);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 26:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM business_category");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPopular");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "keywords");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logo_ref");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList6.add(new t(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3)) != 0));
                        break;
                    }
                    return arrayList6;
                } finally {
                }
            case 27:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM invoice_tax_rates");
                try {
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "percentage");
                    ArrayList arrayList7 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList7.add(new ks6.d0(sQLiteStatementPrepare.getDouble(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
                        break;
                    }
                    return arrayList7;
                } finally {
                }
            case 28:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM invoices WHERE recurringSchedule IS NULL").step();
                    return null;
                } finally {
                }
            default:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM invoices WHERE recurringSchedule IS NOT NULL").step();
                    return null;
                } finally {
                }
        }
    }
}
