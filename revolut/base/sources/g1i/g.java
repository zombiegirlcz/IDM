package g1i;

import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f139625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f139626c;

    public /* synthetic */ g(d0 d0Var, long j2, int i) {
        this.f139624a = i;
        this.f139625b = d0Var;
        this.f139626c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
        switch (this.f139624a) {
            case 0:
                Intrinsics.checkNotNullParameter(draft, "draft");
                return this.f139625b.f139605n.q(draft, this.f139626c, false);
            default:
                Intrinsics.checkNotNullParameter(draft, "draft");
                return this.f139625b.f139605n.l(draft, this.f139626c, false);
        }
    }
}
