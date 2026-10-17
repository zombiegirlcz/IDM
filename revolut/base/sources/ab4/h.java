package ab4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f2873a;

    public h(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f2873a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f2873a, ((h) obj2).f2873a);
    }

    public final int hashCode() {
        return this.f2873a.hashCode();
    }
}
