package svi;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f266016b;

    public y0() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f266015a, y0Var.f266015a) && Intrinsics.f(this.f266016b, y0Var.f266016b);
    }

    public final int hashCode() {
        String str = this.f266015a;
        return this.f266016b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public y0(String str, Map filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f266015a = str;
        this.f266016b = filters;
    }

    public /* synthetic */ y0(int i) {
        this(null, zhm.r0.g());
    }
}
