package zsk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f324943a;

    public a(Data instrumentIsSpac) {
        Intrinsics.checkNotNullParameter(instrumentIsSpac, "instrumentIsSpac");
        this.f324943a = instrumentIsSpac;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f324943a, ((a) obj2).f324943a);
    }

    public final int hashCode() {
        return this.f324943a.hashCode();
    }
}
