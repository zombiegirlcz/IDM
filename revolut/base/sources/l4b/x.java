package l4b;

import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdOrderReviewScreenContract$InputData f192088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4i.a f192089b;

    public x(CfdOrderReviewScreenContract$InputData inputData, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f192088a = inputData;
        this.f192089b = amountConverter;
    }
}
