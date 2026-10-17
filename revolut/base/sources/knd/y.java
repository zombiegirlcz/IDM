package knd;

import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final amd.i f186154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GroupingExtraData f186155b;

    public y(amd.i filter, GroupingExtraData extraData) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f186154a = filter;
        this.f186155b = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f186154a == yVar.f186154a && Intrinsics.f(this.f186155b, yVar.f186155b);
    }

    public final int hashCode() {
        return this.f186155b.hashCode() + (this.f186154a.hashCode() * 31);
    }
}
