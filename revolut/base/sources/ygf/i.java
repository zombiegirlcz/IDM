package ygf;

import ahf.c0;
import com.revolut.data.model.Data;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreenContract$InputData;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import g48.r0;
import java.util.Set;
import jki.p;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import y4f.o;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g9e.a f313655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f313656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f313657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nhf.a f313658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecurringTransfersScreenContract$InputData f313659t;
    public final d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g9e.a subscriptionsListPresentationModel, c0 naviCommandProvider, r0 jointInteractor, nhf.a unitedWalletInteractor, RecurringTransfersScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(subscriptionsListPresentationModel, "subscriptionsListPresentationModel");
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(jointInteractor, "jointInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f313655p = subscriptionsListPresentationModel;
        this.f313656q = naviCommandProvider;
        this.f313657r = jointInteractor;
        this.f313658s = unitedWalletInteractor;
        this.f313659t = inputData;
        Data data = new Data(null, null, true, 3, null);
        q.Companion.getClass();
        this.u = new d(data, k71.p.a());
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, vkm.q.Q(mo3.a.g(this.f313657r.h(w4l.j.f294644c), null, null, 3), new o(null, this, 13)), null, new h(this, null, 0), 3);
        l.b1(this, rd0.e.b(((njf.j) this.f313658s).f()), null, new h(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2() {
        RecurringTransfersScreenContract$InputData recurringTransfersScreenContract$InputData = this.f313659t;
        C1(new MoveMoneyDestination(new MoveMoneyInputData(new Action.AddNewScheduledPayment(u5i.b.a(recurringTransfersScreenContract$InputData.f91946c, recurringTransfersScreenContract$InputData.f91945b), 2), (Set) null, 6), null));
    }
}
