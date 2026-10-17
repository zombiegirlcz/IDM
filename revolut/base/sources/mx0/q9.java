package mx0;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GmsLatLngBounds f209962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u9 f209963b;

    public q9(GmsLatLngBounds bounds, u9 reasonForUpdate) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(reasonForUpdate, "reasonForUpdate");
        this.f209962a = bounds;
        this.f209963b = reasonForUpdate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj2;
        return this.f209962a.equals(q9Var.f209962a) && this.f209963b == q9Var.f209963b;
    }

    public final int hashCode() {
        return this.f209963b.hashCode() + (this.f209962a.hashCode() * 31);
    }
}
