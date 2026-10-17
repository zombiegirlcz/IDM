package po9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237915a;

    public g(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f237915a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f237915a, ((g) obj2).f237915a);
    }

    public final int hashCode() {
        return this.f237915a.hashCode();
    }
}
