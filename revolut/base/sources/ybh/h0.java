package ybh;

import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecurringDepositSchedule f312313b;

    public /* synthetic */ h0(RecurringDepositSchedule recurringDepositSchedule, int i) {
        this.f312312a = i;
        this.f312313b = recurringDepositSchedule;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        n update = (n) obj2;
        switch (this.f312312a) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
        }
        return n.a(update, null, null, null, null, null, null, this.f312313b, null, null, null, null, false, false, false, null, null, false, 131007);
    }
}
