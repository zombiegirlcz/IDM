package o42;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f221979a;

    public e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f221979a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f221979a, ((e) obj2).f221979a);
    }

    public final int hashCode() {
        return this.f221979a.hashCode();
    }
}
