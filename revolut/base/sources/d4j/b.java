package d4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3j.b f111337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountFieldsScreenContract$InputData f111338b;

    public b(c3j.b bankInformationProvider, AccountFieldsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(bankInformationProvider, "bankInformationProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f111337a = bankInformationProvider;
        this.f111338b = inputData;
    }
}
