package dak;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.n6;
import ba6.l;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.pcw_auth.api.models.ActivePcwApplicationStatus;
import com.revolut.feature.credit.pcw_auth.api.models.ExpiredPcwApplicationStatus;
import com.revolut.feature.credit.pcw_auth.api.models.NonePcwApplicationStatus;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.terms.api.model.Terms;
import db.r;
import dba.g;
import dca.t;
import dce.p;
import dee.n;
import fdl.e3;
import fdl.s2;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import od0.i;
import tlm.h;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112545a;

    public /* synthetic */ c(int i) {
        this.f112545a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112545a) {
            case 0:
                aak.a it8 = (aak.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                String status = it8.getStatus();
                if (Intrinsics.f(status, "ACTIVE")) {
                    String applicationId = it8.getApplicationId();
                    if (applicationId == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String ametistApplicationId = it8.getAmetistApplicationId();
                    if (ametistApplicationId == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String flowType = it8.getFlowType();
                    if (flowType != null) {
                        return new ActivePcwApplicationStatus(applicationId, ametistApplicationId, z95.a.valueOf(flowType));
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (!Intrinsics.f(status, "EXPIRED")) {
                    return NonePcwApplicationStatus.f70651a;
                }
                String applicationId2 = it8.getApplicationId();
                if (applicationId2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String ametistApplicationId2 = it8.getAmetistApplicationId();
                if (ametistApplicationId2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String flowType2 = it8.getFlowType();
                if (flowType2 != null) {
                    return new ExpiredPcwApplicationStatus(applicationId2, ametistApplicationId2, z95.a.valueOf(flowType2));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                int i = R$attr.uikit_dp16;
                eVarB.add(new s7("LOADING_BLOCK_HEADER_ID", 0, 0, i, i, false, null, 102));
                List listK = v.k(new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126), new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126), new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126), new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126), new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126), new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126), new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126), new s7("LOADING_BLOCK_VALUE_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, R$attr.uikit_dp48, 0, 0, 29);
                eVarB.addAll(listK);
                return u.a(eVarB);
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return r.f112629a;
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Map map = (Map) pair.f186385a;
                List<f5j.a> list = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList();
                for (f5j.a aVar : list) {
                    if (map.get(aVar.f132329a) != null) {
                        arrayList.add(aVar);
                    }
                }
                return new g(arrayList, map);
            case 4:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 5:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 2, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRangeU, 10));
                vim.f it9 = intRangeU.iterator();
                while (it9.f289625c) {
                    arrayList2.add(nb0.b(pb0.Companion, a0.d.n("DELIVERIES_LOADING_LIST_ID_", it9.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return arrayList2;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 8:
                List preselectedTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(preselectedTransactions, "preselectedTransactions");
                return u.c(new ec0.a(preselectedTransactions));
            case 9:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (hx7.b.o((l) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            case 10:
                List charityList = (List) obj2;
                Intrinsics.checkNotNullParameter(charityList, "charityList");
                return ta6.b.a(charityList, null);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return t.b();
            case 12:
                p update = (p) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return p.a(update, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, 39);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return iii.c.c(3);
            case 14:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (Terms) d0.e0(0, it10);
            case 15:
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 19:
                xk5.a it11 = (xk5.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f306608a;
            case 20:
                i isEnabledOptional = (i) obj2;
                Intrinsics.checkNotNullParameter(isEnabledOptional, "isEnabledOptional");
                Boolean bool = (Boolean) isEnabledOptional.f224257a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 21:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 22:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM recently_viewed_instrument WHERE ref NOT IN (SELECT ref FROM recently_viewed_instrument ORDER BY last_seen DESC LIMIT ?)");
                try {
                    sQLiteStatementPrepare.bindLong(1, 50);
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                }
            case 23:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM portfolioSettings").step();
                    return null;
                } finally {
                }
            case 24:
                return e3.INSTANCE.serializer();
            case 25:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                jt0.b bVar = new jt0.b(o0.f186429a.b(s2.class));
                bVar.b0(new c(24));
                bVar.O(fVar);
                Unit unit = Unit.f186387a;
                tlm.d dVarA = h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 26:
                de9.h updateState = (de9.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return de9.h.a(updateState, null, 0L, false, null, null, 25);
            case 27:
                Intrinsics.checkNotNullParameter((PaymentMethod.Pocket) obj2, "it");
                return Boolean.valueOf(!r0.b());
            case 28:
                PaymentMethod.Pocket it12 = (PaymentMethod.Pocket) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.b());
            default:
                return (tde.l) ((n) obj2).f113413a.getContent();
        }
    }

    public /* synthetic */ c(cli.n nVar, int i) {
        this.f112545a = i;
    }
}
