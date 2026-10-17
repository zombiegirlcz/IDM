package j82;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f172090a;

    public i(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f172090a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f172090a, ((i) obj2).f172090a);
    }

    public final int hashCode() {
        return this.f172090a.hashCode();
    }
}
