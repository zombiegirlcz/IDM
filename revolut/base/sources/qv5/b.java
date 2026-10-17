package qv5;

import ahe.i;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mu5.p;
import o9c.r0;
import tk0.c;
import ut5.k;
import vkm.j2;
import vkm.q;
import vkm.y;
import wkm.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f249536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f249537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f249538c;

    public b(p widgetCustomizationInteractor, k spotMarginTradingItemsProvider) {
        Intrinsics.checkNotNullParameter(widgetCustomizationInteractor, "widgetCustomizationInteractor");
        Intrinsics.checkNotNullParameter(spotMarginTradingItemsProvider, "spotMarginTradingItemsProvider");
        this.f249536a = widgetCustomizationInteractor;
        Boolean bool = Boolean.TRUE;
        this.f249537b = q.c(bool);
        this.f249538c = q.c(bool);
    }

    public final l a() {
        p pVar = this.f249536a;
        Continuation continuation = null;
        return q.Q(ta6.a.g(this.f249537b, this.f249538c, pVar.c(), t1.E(new i(new y(new mu5.i(pVar, null, 3), pVar.f208986a.j(new c("CRYPTO_SPOT_MARGIN_TRADING_WIDGET_SHOW_UP_TO"))), 11)), new r0(this, continuation, 2)), new bwb.k(3, 15, continuation));
    }
}
