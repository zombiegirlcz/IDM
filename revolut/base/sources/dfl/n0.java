package dfl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114445a;

    public n0(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f114445a = displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && Intrinsics.f(this.f114445a, ((n0) obj2).f114445a);
    }

    public final int hashCode() {
        return this.f114445a.hashCode();
    }
}
