package ly3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200659a;

    public b(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f200659a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f200659a, ((b) obj2).f200659a);
    }

    public final int hashCode() {
        return this.f200659a.hashCode();
    }
}
