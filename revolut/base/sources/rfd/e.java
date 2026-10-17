package rfd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f253760a;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f253760a, ((e) obj2).f253760a);
    }

    public final int hashCode() {
        return this.f253760a.hashCode();
    }

    public e(Data watchlistData) {
        Intrinsics.checkNotNullParameter(watchlistData, "watchlistData");
        this.f253760a = watchlistData;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, false, 7, null));
    }
}
