package bul;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.util.Set;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements v, e4i.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f18903b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f18904a;

    static {
        r0[] elements = {r0.MARKET, r0.LIMIT, r0.STOP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f18903b = kotlin.collections.d.y0(elements);
    }

    public c(l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f18904a = amountConverter;
    }

    @Override // bul.v
    public final dfl.x a(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        return new dfl.x(e1.m(orderQuote).f104717a);
    }

    @Override // bul.v
    public final dfl.a b(OrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        dj0.d dVarG = g(e1.u(orderQuote));
        return new dfl.a(dVarG.f115082a, dVarG.f115083b);
    }

    @Override // bul.v
    public final boolean c(r0 orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return f18903b.contains(orderType);
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f18904a;
    }
}
