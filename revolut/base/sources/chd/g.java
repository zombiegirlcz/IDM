package chd;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24198a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f24198a, ((g) obj2).f24198a);
    }

    public final int hashCode() {
        return this.f24198a.hashCode();
    }

    public g(Data watchlists) {
        Intrinsics.checkNotNullParameter(watchlists, "watchlists");
        this.f24198a = watchlists;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
