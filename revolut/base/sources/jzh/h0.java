package jzh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myh.j f179824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f179825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f179826c;
    public final Limit.UsageLimit d;

    public h0(myh.j selectedTab, Data data, Data data2, Limit.UsageLimit usageLimit) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f179824a = selectedTab;
        this.f179825b = data;
        this.f179826c = data2;
        this.d = usageLimit;
    }

    public static h0 b(h0 h0Var, myh.j selectedTab, Data data, Data data2, Limit.UsageLimit usageLimit, int i) {
        if ((i & 1) != 0) {
            selectedTab = h0Var.f179824a;
        }
        if ((i & 2) != 0) {
            data = h0Var.f179825b;
        }
        if ((i & 4) != 0) {
            data2 = h0Var.f179826c;
        }
        if ((i & 8) != 0) {
            usageLimit = h0Var.d;
        }
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        return new h0(selectedTab, data, data2, usageLimit);
    }

    @Override // jzh.s
    public final Limit.UsageLimit a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f179824a == h0Var.f179824a && Intrinsics.f(this.f179825b, h0Var.f179825b) && Intrinsics.f(this.f179826c, h0Var.f179826c) && Intrinsics.f(this.d, h0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f179824a.hashCode() * 31;
        Data data = this.f179825b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f179826c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Limit.UsageLimit usageLimit = this.d;
        return iHashCode3 + (usageLimit != null ? usageLimit.hashCode() : 0);
    }
}
