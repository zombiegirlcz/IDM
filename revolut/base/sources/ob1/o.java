package ob1;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsDashboardState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends jki.g implements jki.h {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xa1.a f223857p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, xa1.a orderInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(orderInteractor, "orderInteractor");
        this.f223857p = orderInteractor;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(xa1.a.a(this.f223857p, null, 1)), null, null, new o95.c(this, null, 3), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return new f(new Data(null, null, true, 3, null), new CardReaderProductDetailsScreenContract$ProductDetailsDashboardState(), new Data(null, null, true, 3, null));
    }
}
