package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f309997b;

    public h0(List stocks, List etfs) {
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        Intrinsics.checkNotNullParameter(etfs, "etfs");
        this.f309996a = stocks;
        this.f309997b = etfs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f309996a, h0Var.f309996a) && Intrinsics.f(this.f309997b, h0Var.f309997b);
    }

    public final int hashCode() {
        return this.f309997b.hashCode() + (this.f309996a.hashCode() * 31);
    }
}
