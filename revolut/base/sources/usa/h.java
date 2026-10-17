package usa;

import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PushToCardTransferReviewScreenContract$InputData f282859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kbb.c f282860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cpf.c f282861n;

    public h(PushToCardTransferReviewScreenContract$InputData inputData, kbb.c dialogFactory, cpf.c transferResultHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(transferResultHandlerExtension, "transferResultHandlerExtension");
        this.f282859l = inputData;
        this.f282860m = dialogFactory;
        this.f282861n = transferResultHandlerExtension;
    }
}
