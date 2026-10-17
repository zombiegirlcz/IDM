package kl7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185303a;

    public d(List makes) {
        Intrinsics.checkNotNullParameter(makes, "makes");
        this.f185303a = makes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f185303a, ((d) obj2).f185303a);
    }

    public final int hashCode() {
        return this.f185303a.hashCode();
    }
}
