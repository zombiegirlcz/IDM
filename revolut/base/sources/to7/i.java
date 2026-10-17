package to7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272534a;

    public i(List countryCodes) {
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        this.f272534a = countryCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f272534a, ((i) obj2).f272534a);
    }

    public final int hashCode() {
        return this.f272534a.hashCode();
    }
}
