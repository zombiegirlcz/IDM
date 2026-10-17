package a94;

import android.content.ContentValues;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.foundation.ScrollNode;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState$prefetchScope$1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import com.revolut.kompot.navigable.TransitionAnimation;
import dx4.n4;
import dx4.p4;
import fg8.y;
import ip0.a10;
import ip0.c10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl7.m2;
import kl7.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import mhb.a;
import qc0.j0;
import to7.x;
import uyd.h0;
import v30.c0;
import yrb.s;
import zhm.d0;
import zhm.k0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2311c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(int i, Object obj2, Object obj3, int i2) {
        this.f2309a = i2;
        this.f2310b = i;
        this.f2311c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TransitionAnimation transitionAnimation;
        List list;
        Object next;
        List list2;
        int i = this.f2309a;
        p4 p4Var = null;
        numValueOf = null;
        Integer numValueOf = null;
        Object obj3 = null;
        p4Var = null;
        p4Var = null;
        p4Var = null;
        int i2 = this.f2310b;
        Object obj4 = this.d;
        Object obj5 = this.f2311c;
        switch (i) {
            case 0:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data debts = zi0.c.P((ArrayList) obj5, false, null, 3);
                Integer numValueOf2 = Integer.valueOf(i2);
                update.getClass();
                Intrinsics.checkNotNullParameter(debts, "debts");
                return new r(debts, (qu3.e) obj4, numValueOf2);
            case 1:
                return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.insert$lambda$4((String) obj5, i2, (ContentValues) obj4, (SupportSQLiteDatabase) obj2));
            case 2:
                return ScrollNode.measure_3p2s80s$lambda$0((ScrollNode) obj5, i2, (Placeable) obj4, (Placeable.PlacementScope) obj2);
            case 3:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b) obj5;
                p4 p4Var2 = (p4) obj4;
                ah4.k result = (ah4.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ah4.j) {
                    transitionAnimation = TransitionAnimation.SLIDE_END_TO_START.f98395a;
                } else {
                    if (!(result instanceof ah4.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    transitionAnimation = TransitionAnimation.SLIDE_START_TO_END.f98396a;
                }
                TransitionAnimation transitionAnimation2 = transitionAnimation;
                lv3.a aVarD = result.d();
                if (aVarD != null && (list = aVarD.e) != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((n4) next).f120689a, bVar.f68274p.f68260a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    n4 n4Var = (n4) next;
                    if (n4Var != null && (list2 = n4Var.f120690b) != null) {
                        Iterator it9 = list2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                Object next2 = it9.next();
                                if (Intrinsics.f(((p4) next2).f120716a, p4Var2.f120716a)) {
                                    obj3 = next2;
                                }
                            }
                        }
                        p4Var = (p4) obj3;
                    }
                }
                if (p4Var != null) {
                    bVar.H2(bVar.f68277s, new y(bVar, p4Var, 4));
                }
                oki.h.t2(bVar, bVar.f68278t, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(i2), false, transitionAnimation2, false, 8);
                return Unit.f186387a;
            case 4:
                return LazyListState$prefetchScope$1.schedulePrefetch$lambda$1((Function1) obj5, i2, (LazyListMeasureResult) obj4, (LazyLayoutPrefetchState.PrefetchResultScope) obj2);
            case 5:
                wi0.b bVar2 = (wi0.b) obj5;
                la8.e update2 = (la8.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return la8.e.a(update2, bVar2, null, this.f2310b, ((com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.a) obj4).I2(update2.f193347b, bVar2), 2);
            case 6:
                String str = (String) obj5;
                String str2 = (String) obj4;
                mhb.a update3 = (mhb.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                if (i2 < 0 || i2 >= update3.f205470a.size()) {
                    return update3;
                }
                List list3 = update3.f205470a;
                ArrayList contactForms = new ArrayList(w.t(list3, 10));
                int i3 = 0;
                for (Object obj6 : list3) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    a.C1165a c1165aA = (a.C1165a) obj6;
                    if (i3 == i2) {
                        if (a0.H(str, "FIELD_TYPE_EMAIL", false)) {
                            c1165aA = a.C1165a.a(c1165aA, str2, null, 2);
                        } else if (a0.H(str, "FIELD_TYPE_NAME", false)) {
                            c1165aA = a.C1165a.a(c1165aA, null, str2, 1);
                        }
                    }
                    contactForms.add(c1165aA);
                    i3 = i5;
                }
                Intrinsics.checkNotNullParameter(contactForms, "contactForms");
                return new mhb.a(contactForms);
            case 7:
                a10 model = (a10) obj4;
                TaxHubTransactionExportPeriodPickerScreenContract$DomainState update4 = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                o47.b bVar3 = ((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) obj5).f74420r;
                n47.i periodSelection = update4.f74403b;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(periodSelection, "periodSelection");
                Intrinsics.checkNotNullParameter(model, "model");
                boolean z = periodSelection instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d;
                n47.i dVar = n47.h.f212317a;
                if (z) {
                    c10 c10Var = (c10) d0.e0(i2, model.f163364b);
                    Object obj7 = c10Var != null ? c10Var.f163673b : null;
                    TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period period = obj7 instanceof TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period ? (TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period) obj7 : null;
                    if (period != null) {
                        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d dVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d) periodSelection;
                        dVar = new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d(dVar2.f74415a, period, dVar2.f74417c);
                    }
                }
                return TaxHubTransactionExportPeriodPickerScreenContract$DomainState.a(update4, dVar);
            case 8:
                lk0.h hVar = (lk0.h) obj4;
                p0c.c update5 = (p0c.c) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return p0c.c.a(update5, ((TransactionDetailsPagerFlowContract$DetailsPage.Details) ((TransactionDetailsPagerFlowContract$DetailsPage) obj5)).f83861a.f84054a, null, hVar != null ? null : Integer.valueOf(i2), 2);
            case 9:
                FormScreen it10 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((j0) obj5).f244454x.c(it10, (String) obj4, Integer.valueOf(i2));
            case 10:
                c0 c0Var = (c0) obj4;
                ((r10.q) obj5).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT COUNT(*) FROM messages WHERE feedType = ? AND feedTypeGroup = ?");
                try {
                    String strA = s10.a.a(c0Var);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    sQLiteStatementPrepare.bindLong(2, i2);
                    if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                        numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 11:
                return ruk.i.a((ruk.i) obj2, null, null, null, null, null, (Data) obj5, (Data) obj4, this.f2310b, 31);
            case 12:
                return ((h0) ((ryd.w) obj5).f258357a).z.e(new uyd.b(i2, ((Boolean) obj2).booleanValue(), (String) obj4), w4l.i.f294643c);
            case 13:
                s0 s0Var = (s0) obj5;
                x xVar = (x) obj4;
                List carVariations = (List) obj2;
                Intrinsics.checkNotNullParameter(carVariations, "carVariations");
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : carVariations) {
                    CarVariation carVariation = (CarVariation) obj8;
                    if (carVariation.f75195g == s0Var) {
                        int i6 = carVariation.i;
                        Integer num = carVariation.f75197j;
                        if (i2 <= (num != null ? num.intValue() : to7.c.f(xVar.f272550b)) && i6 <= i2) {
                            arrayList.add(obj8);
                        }
                    }
                }
                Set<m2> setKeySet = k0.a(new om4.d0(arrayList, 24)).keySet();
                ArrayList arrayList2 = new ArrayList(w.t(setKeySet, 10));
                for (m2 m2Var : setKeySet) {
                    int iG = xl7.h.g(m2Var);
                    f01.c uiKitResources = xVar.f272551c;
                    Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                    arrayList2.add(new to7.a0(m2Var, a10.b.o(iG, null, null, 14, uiKitResources)));
                }
                List<to7.a0> listP0 = d0.P0(arrayList2, new to7.w());
                ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
                for (to7.a0 a0Var : listP0) {
                    m2 m2Var2 = a0Var.f272514a;
                    Object obj9 = jl7.f.f175621a;
                    Intrinsics.checkNotNullParameter(m2Var2, "<this>");
                    arrayList3.add(new SingleChoiceDelegate.Model(u1.g(m2Var2, jl7.f.f175622b), new TextClause(a0Var.f272515b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 2040));
                }
                return arrayList3;
            case 14:
                xel.c cVar = (xel.c) obj5;
                xzk.g gVar = (xzk.g) obj4;
                Map allInputDocuments = (Map) obj2;
                Intrinsics.checkNotNullParameter(allInputDocuments, "allInputDocuments");
                xel.a aVar = (xel.a) allInputDocuments.get(Integer.valueOf(i2));
                return aVar != null ? gVar.d.c(cVar, aVar, true) : new xel.f(cVar, false, false);
            case 15:
                return yrb.x.a((yrb.x) obj2, null, null, null, ((s) obj5).q3(1.0f, (qrb.a) obj4, i2), null, null, false, null, null, null, null, null, null, null, null, 32759);
            case 16:
                return RecomposeScopeImpl.end$lambda$0$1((RecomposeScopeImpl) obj5, i2, (MutableObjectIntMap) obj4, (Composition) obj2);
            default:
                Intrinsics.checkNotNullParameter((zrf.k) obj2, "$this$update");
                return new zrf.i(i2, (TransferQuoteSplit) obj5, ((vrf.i) obj4).f291590b);
        }
    }

    public /* synthetic */ e(Object obj2, int i, Object obj3, int i2) {
        this.f2309a = i2;
        this.f2311c = obj2;
        this.f2310b = i;
        this.d = obj3;
    }

    public /* synthetic */ e(Object obj2, Object obj3, int i, int i2) {
        this.f2309a = i2;
        this.f2311c = obj2;
        this.d = obj3;
        this.f2310b = i;
    }
}
