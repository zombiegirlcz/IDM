package zp9;

import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1a.q f324206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitBillInputData f324207b;

    public j(k valueMapper, m1a.q avatarsMapper, SplitBillInputData inputData, h discountMapper) {
        Intrinsics.checkNotNullParameter(valueMapper, "valueMapper");
        Intrinsics.checkNotNullParameter(avatarsMapper, "avatarsMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(discountMapper, "discountMapper");
        this.f324206a = avatarsMapper;
        this.f324207b = inputData;
    }
}
