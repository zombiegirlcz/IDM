package qll;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247591a;

    public l(List sessions) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        this.f247591a = sessions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f247591a, ((l) obj2).f247591a);
    }

    public final int hashCode() {
        return this.f247591a.hashCode();
    }
}
