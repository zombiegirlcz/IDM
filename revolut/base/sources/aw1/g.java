package aw1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f10652a;

    public g(Data aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        this.f10652a = aliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f10652a, ((g) obj2).f10652a);
    }

    public final int hashCode() {
        return this.f10652a.hashCode();
    }
}
