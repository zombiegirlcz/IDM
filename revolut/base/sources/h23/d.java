package h23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import g23.l0;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f148631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f148632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k23.f f148633c;
    public final k23.b d;
    public final n e;
    public final ha3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f148634g;

    public d(OrderNewCardTabControllerContract$InputData inputData, l0 itemBuilder, k23.f sharedDataSource, k23.b cardDesignsProvider, n walletInteractor, ha3.c cardPromotionsInteractor, k clickHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemBuilder, "itemBuilder");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        Intrinsics.checkNotNullParameter(cardDesignsProvider, "cardDesignsProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cardPromotionsInteractor, "cardPromotionsInteractor");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        this.f148631a = inputData;
        this.f148632b = itemBuilder;
        this.f148633c = sharedDataSource;
        this.d = cardDesignsProvider;
        this.e = walletInteractor;
        this.f = cardPromotionsInteractor;
        this.f148634g = clickHandler;
    }
}
