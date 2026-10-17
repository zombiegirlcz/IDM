package og2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224998a;

    public d(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f224998a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f224998a, ((d) obj2).f224998a);
    }

    public final int hashCode() {
        return this.f224998a.hashCode();
    }
}
