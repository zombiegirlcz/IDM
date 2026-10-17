package nbc;

import com.revolut.core.ui_kit.delegates.LinearProgressTrackingDelegate;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import fub.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.g;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f214068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f214069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f214070c;
    public final kbc.b d;

    public b(qd0.b languageProvider, zdc.a imageMapper, g transactionItemMapper, k revPointsTransactionItemsMapper, kbc.b deliveryMapper) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(revPointsTransactionItemsMapper, "revPointsTransactionItemsMapper");
        Intrinsics.checkNotNullParameter(deliveryMapper, "deliveryMapper");
        this.f214068a = languageProvider;
        this.f214069b = transactionItemMapper;
        this.f214070c = revPointsTransactionItemsMapper;
        this.d = deliveryMapper;
    }

    public final LinearProgressTrackingDelegate.Model a(Delivery delivery) {
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        String strQ = j6.a.q("LINEAR_PROGRESS_DELIVERY_TRACKING_LIST_ID_", delivery.f84640a);
        wbc.c cVar = delivery.f84643g;
        kbc.b bVar = this.d;
        return new LinearProgressTrackingDelegate.Model(strQ, bVar.b(cVar), bVar.a(delivery), bVar.d(cVar), bVar.c(cVar), bVar.e(cVar), delivery, 512);
    }
}
