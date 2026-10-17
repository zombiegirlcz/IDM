package ipg;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167747a;

    public c(String targetId) {
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        this.f167747a = targetId;
    }

    public final String b() {
        return this.f167747a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f167747a, ((c) obj2).f167747a);
    }

    public final int hashCode() {
        return this.f167747a.hashCode();
    }
}
