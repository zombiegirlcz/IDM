package y9a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f311816a;

    public h(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f311816a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f311816a, ((h) obj2).f311816a);
    }

    public final int hashCode() {
        return this.f311816a.hashCode();
    }
}
