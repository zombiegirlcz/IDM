package bbg;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsAmendmentConfirmationScreenContract$InputData f14278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ccg.g f14279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mag.g f14280c;
    public final ccg.i d;
    public final ccg.j e;
    public final dbg.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dbg.d f14281g;

    public f0(TravelHotelsAmendmentConfirmationScreenContract$InputData inputData, ccg.g propertyPaymentMapper, mag.g revPointsRedeemOptionsSectionMapper, ccg.i propertyPreviewItemsMapper, ccg.j roomsListItemsMapper, dbg.f paymentSummaryMapper, dbg.d paymentButtonMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(propertyPaymentMapper, "propertyPaymentMapper");
        Intrinsics.checkNotNullParameter(revPointsRedeemOptionsSectionMapper, "revPointsRedeemOptionsSectionMapper");
        Intrinsics.checkNotNullParameter(propertyPreviewItemsMapper, "propertyPreviewItemsMapper");
        Intrinsics.checkNotNullParameter(roomsListItemsMapper, "roomsListItemsMapper");
        Intrinsics.checkNotNullParameter(paymentSummaryMapper, "paymentSummaryMapper");
        Intrinsics.checkNotNullParameter(paymentButtonMapper, "paymentButtonMapper");
        this.f14278a = inputData;
        this.f14279b = propertyPaymentMapper;
        this.f14280c = revPointsRedeemOptionsSectionMapper;
        this.d = propertyPreviewItemsMapper;
        this.e = roomsListItemsMapper;
        this.f = paymentSummaryMapper;
        this.f14281g = paymentButtonMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(t1.v(domainState.f14282a, domainState.f14283b, domainState.f14284c, domainState.i), new b96.a(this, 29), new bb2.t(4), new b1c.p(this, domainState, 9));
    }
}
