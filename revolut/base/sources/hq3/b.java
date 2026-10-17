package hq3;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f154590a;

    public b(NaviCommand redirection) {
        Intrinsics.checkNotNullParameter(redirection, "redirection");
        this.f154590a = redirection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f154590a, ((b) obj2).f154590a);
    }

    public final int hashCode() {
        return this.f154590a.hashCode();
    }
}
