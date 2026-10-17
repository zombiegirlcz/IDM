package pj4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f236666a;

    public g(Data dashboardData) {
        Intrinsics.checkNotNullParameter(dashboardData, "dashboardData");
        this.f236666a = dashboardData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f236666a, ((g) obj2).f236666a);
    }

    public final int hashCode() {
        return this.f236666a.hashCode();
    }
}
