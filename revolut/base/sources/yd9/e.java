package yd9;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f312659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f312660b;

    public e(b exchangeOrdersMapper, m recurringOrdersMapper) {
        Intrinsics.checkNotNullParameter(exchangeOrdersMapper, "exchangeOrdersMapper");
        Intrinsics.checkNotNullParameter(recurringOrdersMapper, "recurringOrdersMapper");
        this.f312659a = exchangeOrdersMapper;
        this.f312660b = recurringOrdersMapper;
    }

    public final qv0.i a(ExchangeOrder.Active order) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(order, "order");
        return this.f312659a.a(order, "");
    }

    public final qv0.i b(ExchangeOrder.Active order, String listIdPrefix, boolean z, boolean z3, Object obj2) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        return this.f312659a.b(order, listIdPrefix, z, z3, obj2);
    }

    public final qv0.i c(p order) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(order, "order");
        return this.f312660b.b(order, "");
    }
}
