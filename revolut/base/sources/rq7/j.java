package rq7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f256482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f256483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f256484c;

    public j(Data policy, Data todoItems, Data drivingStatistics) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(todoItems, "todoItems");
        Intrinsics.checkNotNullParameter(drivingStatistics, "drivingStatistics");
        this.f256482a = policy;
        this.f256483b = todoItems;
        this.f256484c = drivingStatistics;
    }

    public static j a(j jVar, Data policy, Data todoItems, Data drivingStatistics, int i) {
        if ((i & 1) != 0) {
            policy = jVar.f256482a;
        }
        if ((i & 2) != 0) {
            todoItems = jVar.f256483b;
        }
        if ((i & 4) != 0) {
            drivingStatistics = jVar.f256484c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(todoItems, "todoItems");
        Intrinsics.checkNotNullParameter(drivingStatistics, "drivingStatistics");
        return new j(policy, todoItems, drivingStatistics);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f256482a, jVar.f256482a) && Intrinsics.f(this.f256483b, jVar.f256483b) && Intrinsics.f(this.f256484c, jVar.f256484c);
    }

    public final int hashCode() {
        return this.f256484c.hashCode() + kii.e.c(this.f256483b, this.f256482a.hashCode() * 31, 31);
    }
}
