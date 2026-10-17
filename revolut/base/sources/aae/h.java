package aae;

import cli.n;
import cli.y;
import com.revolut.feature.subscriptions.impl.edit_subscription_end_date.EditSubscriptionEndDateControllerContract$InputData;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends oki.h implements dli.b {
    public final EditSubscriptionEndDateControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f2816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xua.a f2817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f2818r;

    public h(n stateMapper, EditSubscriptionEndDateControllerContract$InputData inputData, l80.e dateProvider, xua.a recurringPaymentInteractor) {
        LocalDate localDatePlusDays;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        this.o = inputData;
        this.f2816p = dateProvider;
        this.f2817q = recurringPaymentInteractor;
        p pVar = inputData.f89185a;
        qua.g gVar = pVar.f249332w;
        if (gVar == null || (localDatePlusDays = gVar.f249296h) == null) {
            localDatePlusDays = ((l80.f) dateProvider).e().plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        }
        LocalDate localDatePlusDays2 = ((l80.f) dateProvider).e().plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
        this.f2818r = mra.d.b(this, new c(pVar, localDatePlusDays, localDatePlusDays2), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f2818r;
    }
}
