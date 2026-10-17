package dh0;

import e10.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f114736a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Intrinsics.f(this.f114736a, ((a) obj2).f114736a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f114736a.hashCode();
    }

    public final String toString() {
        return "RevolutFacePayload(face=" + this.f114736a + ")";
    }
}
