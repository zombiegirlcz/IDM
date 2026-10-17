package qpd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f248352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f248353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GroupingExtraData f248354c;

    public f(Data data, i7 i7Var, GroupingExtraData groupingExtraData) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(groupingExtraData, "groupingExtraData");
        this.f248352a = data;
        this.f248353b = i7Var;
        this.f248354c = groupingExtraData;
    }

    public static f a(f fVar, Data data, i7 i7Var, GroupingExtraData groupingExtraData, int i) {
        if ((i & 1) != 0) {
            data = fVar.f248352a;
        }
        if ((i & 2) != 0) {
            i7Var = fVar.f248353b;
        }
        if ((i & 4) != 0) {
            groupingExtraData = fVar.f248354c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(groupingExtraData, "groupingExtraData");
        return new f(data, i7Var, groupingExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f248352a, fVar.f248352a) && Intrinsics.f(this.f248353b, fVar.f248353b) && Intrinsics.f(this.f248354c, fVar.f248354c);
    }

    public final int hashCode() {
        int iHashCode = this.f248352a.hashCode() * 31;
        i7 i7Var = this.f248353b;
        return this.f248354c.hashCode() + ((iHashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31);
    }
}
