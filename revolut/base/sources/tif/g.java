package tif;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreen;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o97.y;
import zh9.i0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271500a;

    public /* synthetic */ g(int i) {
        this.f271500a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        boolean z = true;
        switch (this.f271500a) {
            case 0:
                e7l.f it8 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new o(it8.f123384o0);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 4:
                EsimDescriptorValue it9 = (EsimDescriptorValue) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9;
            case 5:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (i0) it10.c();
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List listV0 = d0.V0((Iterable) getDefaultLoadingItems.invoke(), 4);
                yp0.b.k(listV0, 0, 0, 0, 0, 31);
                return listV0;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 8:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                if (!zBooleanValue && !zBooleanValue2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                return new y(o97.r.JOINT_TRANSACTIONS, (uhf.i) obj2, null, 60);
            case 10:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                boolean zBooleanValue3 = ((Boolean) pair2.f186385a).booleanValue();
                boolean zBooleanValue4 = ((Boolean) pair2.f186386b).booleanValue();
                if (!zBooleanValue3 && !zBooleanValue4) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                efm.r published = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(published, "published");
                return published.ambWith(z9h.n.f(null, null, true, 3, null).delay(1L, TimeUnit.SECONDS).concatWith(published));
            case 12:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list = pockets;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList.add(((io3.d) it11.next()).f163145a);
                }
                return d0.i1(arrayList);
            case 13:
                return new y(o97.r.TRANSACTIONS, (uhf.i) obj2, null, 60);
            case 14:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT id FROM consented_client");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 15:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT id FROM user_info_account");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 17:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACClaimExpensesScreen.c0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = it12.u;
                if (obj3 instanceof CFACClaimExpense) {
                    return (CFACClaimExpense) obj3;
                }
                return null;
            case 18:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new tk9.f((List) getDefaultLoadingItems2.invoke());
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 20:
                Intrinsics.checkNotNullParameter((ty0.a) obj2, "it");
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((LocalDate) obj2, "it");
                return Unit.f186387a;
            case 22:
                Intrinsics.checkNotNullParameter((LocalTime) obj2, "it");
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((ty0.a) obj2, "it");
                return Unit.f186387a;
            case 24:
                return Unit.f186387a;
            case 25:
                Intrinsics.checkNotNullParameter((LocalDate) obj2, "it");
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((LocalTime) obj2, "it");
                return Unit.f186387a;
            case 27:
                Intrinsics.checkNotNullParameter((ty0.a) obj2, "it");
                return Unit.f186387a;
            case 28:
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return r0.g();
        }
    }
}
