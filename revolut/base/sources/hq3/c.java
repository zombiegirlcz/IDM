package hq3;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f154591a;

    public c(NaviCommand redirection) {
        Intrinsics.checkNotNullParameter(redirection, "redirection");
        this.f154591a = redirection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f154591a, ((c) obj2).f154591a);
    }

    public final int hashCode() {
        return this.f154591a.hashCode();
    }
}
