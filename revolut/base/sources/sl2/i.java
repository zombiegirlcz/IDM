package sl2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f264088a;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f264088a, ((i) obj2).f264088a);
    }

    public final int hashCode() {
        return this.f264088a.hashCode();
    }

    public i(Data restrictions) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f264088a = restrictions;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
