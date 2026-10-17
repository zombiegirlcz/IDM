package ipb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f167714a;

    public e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f167714a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f167714a, ((e) obj2).f167714a);
    }

    public final int hashCode() {
        return this.f167714a.hashCode();
    }
}
