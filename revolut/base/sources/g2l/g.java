package g2l;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140138a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f140138a, ((g) obj2).f140138a);
    }

    public final int hashCode() {
        return this.f140138a.hashCode();
    }

    public g(Data overview) {
        Intrinsics.checkNotNullParameter(overview, "overview");
        this.f140138a = overview;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
