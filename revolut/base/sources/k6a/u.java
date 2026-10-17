package k6a;

import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentControllerContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardsPaymentControllerContract$InputData f181675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.a f181676b;

    public u(CardsPaymentControllerContract$InputData inputData, l6a.a movePaymentDataProvider, m93.a cardComponentItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(movePaymentDataProvider, "movePaymentDataProvider");
        Intrinsics.checkNotNullParameter(cardComponentItemMapper, "cardComponentItemMapper");
        this.f181675a = inputData;
        this.f181676b = cardComponentItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f181655a, new k1.a(this, domainState, 29), new k3k.k(this, domainState), new joa.j(this, domainState, 16));
        CardsPaymentControllerContract$InputData cardsPaymentControllerContract$InputData = this.f181675a;
        return new n(new m(l6a.a.d(cardsPaymentControllerContract$InputData.f80281a)), l6a.a.a(cardsPaymentControllerContract$InputData.f80281a, domainState.f), list);
    }
}
