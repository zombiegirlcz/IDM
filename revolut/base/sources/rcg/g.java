package rcg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f253255a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f253255a, ((g) obj2).f253255a);
    }

    public final int hashCode() {
        return this.f253255a.hashCode();
    }

    public g(Data favorites) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        this.f253255a = favorites;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null));
    }
}
