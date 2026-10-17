package mr9;

import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import efm.d0;
import er9.l;
import er9.x;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mq9.f;
import pfm.h;
import pfm.r;
import pfm.t;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er9.f f208082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f208083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f208084c;

    public a(er9.f repository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f208082a = repository;
        this.f208083b = featureToggleInteractor;
        this.f208084c = v0.a.d("create(...)");
    }

    public final r a(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        pfm.a aVarE = xVar.f128599g.acceptGroupParticipation(groupId).e(xVar.h(groupId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }

    public final r b(String groupId, List requests) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(requests, "requests");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(requests, "requests");
        pfm.a aVarE = xVar.f128599g.addMultiSettlements(groupId, uj3.b.A(requests), new wj0.b("payments_group_settle_up")).e(xVar.h(groupId)).e(new h(new l(xVar, 1), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }

    public final Object c(ItemizationReceiptDeletionData.GroupBill groupBill, i iVar) {
        String groupId = groupBill.getF79914a();
        String billId = groupBill.getF79915b();
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(billId, "billId");
        pfm.a aVarE = xVar.f128599g.deleteBillReceipt(groupId, billId).e(e.v(xVar.f128608s.g(groupId, true)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        Object objA = nim.a.a(w.g0(aVarE), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final d0 d(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        d0 d0VarFirstOrError = m70.a.g(nim.a.w(xVar.f128606q.f(Unit.f186387a, xVar.o.a("RELOAD_STRATEGY_KEY_GROUPS", false)), new e2j.i(groupId, 18)), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final r e(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        t tVarL = xVar.f128599g.leaveGroup(groupId).l(new a08.l(xVar, groupId, 28));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return w.g0(tVarL);
    }

    public final efm.r f(String groupId, boolean z) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return xVar.f128608s.f(groupId, xVar.o.a("RELOAD_STRATEGY_KEY_BILLS" + groupId, z));
    }

    public final vkm.d g(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xVar.v.b(groupId, loadingStrategy);
    }

    public final efm.r h(String groupId, boolean z) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return xVar.f128609t.f(groupId, xVar.o.a("RELOAD_STRATEGY_KEY_SETTLEMENTS" + groupId, z));
    }

    public final efm.r i(boolean z) {
        return ((x) this.f208082a).g(z);
    }

    public final r j(String groupId, oq9.i bill) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(bill, "bill");
        x xVar = (x) this.f208082a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(bill, "bill");
        pfm.a aVarE = xVar.f128599g.removeBill(groupId, bill.getId()).e(xVar.h(groupId)).e(new h(new l(xVar, 0), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }
}
