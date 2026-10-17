package xdf;

import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SourcePocketWrapper f304422a;

    public a(SourcePocketWrapper sourcePocketWrapper) {
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        this.f304422a = sourcePocketWrapper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f304422a, ((a) obj2).f304422a);
    }

    public final int hashCode() {
        return this.f304422a.hashCode();
    }
}
