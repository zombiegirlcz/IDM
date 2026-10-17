package vch;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f287750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f287751b;

    public y0(Data data, Data data2) {
        this.f287750a = data;
        this.f287751b = data2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f287750a, y0Var.f287750a) && Intrinsics.f(this.f287751b, y0Var.f287751b);
    }

    public final int hashCode() {
        Data data = this.f287750a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f287751b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }
}
