package gjc;

import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsManageLinkedPaymentsScreenContract$InputData f144251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ojc.d f144252b;

    public f(RentAndBillsManageLinkedPaymentsScreenContract$InputData inputData, ojc.d rentAndBillsPaymentRowMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rentAndBillsPaymentRowMapper, "rentAndBillsPaymentRowMapper");
        this.f144251a = inputData;
        this.f144252b = rentAndBillsPaymentRowMapper;
    }
}
