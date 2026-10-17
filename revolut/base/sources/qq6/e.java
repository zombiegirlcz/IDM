package qq6;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f248495a;

    public e(Data limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f248495a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f248495a, ((e) obj2).f248495a);
    }

    public final int hashCode() {
        return this.f248495a.hashCode();
    }
}
