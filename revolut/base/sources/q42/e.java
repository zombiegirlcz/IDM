package q42;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f241996a;

    public e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f241996a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f241996a, ((e) obj2).f241996a);
    }

    public final int hashCode() {
        return this.f241996a.hashCode();
    }
}
