package c7k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vv9.a f22055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e7k.a f22056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f22057r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vv9.a moneyRequestActionsInteractor, e7k.a rejectMoneyRequestDialogMapper, p stateMapper, MoneyRequestRejectWithReasonContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(moneyRequestActionsInteractor, "moneyRequestActionsInteractor");
        Intrinsics.checkNotNullParameter(rejectMoneyRequestDialogMapper, "rejectMoneyRequestDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f22055p = moneyRequestActionsInteractor;
        this.f22056q = rejectMoneyRequestDialogMapper;
        MoneyRequest moneyRequest = inputData.f102160a;
        m70.a.c(t0.f186434a);
        this.f22057r = new a(moneyRequest, "", true);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f22057r;
    }
}
