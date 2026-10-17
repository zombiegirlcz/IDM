package os9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f229269a;

    public j(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f229269a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f229269a, ((j) obj2).f229269a);
    }

    public final int hashCode() {
        return this.f229269a.hashCode();
    }
}
