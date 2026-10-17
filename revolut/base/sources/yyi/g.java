package yyi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317942a;

    public g(Data home) {
        Intrinsics.checkNotNullParameter(home, "home");
        this.f317942a = home;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f317942a, ((g) obj2).f317942a);
    }

    public final int hashCode() {
        return this.f317942a.hashCode();
    }
}
