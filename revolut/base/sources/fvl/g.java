package fvl;

import com.revolut.feature.trading_orders.common.models.SourcePocket;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f138495a = new g();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Boolean.valueOf(obj2 instanceof SourcePocket.Holding);
    }
}
