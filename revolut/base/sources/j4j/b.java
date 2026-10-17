package j4j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountFieldsScreenContract$InputData f171413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl9.c f171414b;

    public b(AccountFieldsScreenContract$InputData inputData, dl9.c payWithPhotoMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payWithPhotoMapper, "payWithPhotoMapper");
        this.f171413a = inputData;
        this.f171414b = payWithPhotoMapper;
    }
}
