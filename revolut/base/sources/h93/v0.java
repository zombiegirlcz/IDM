package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f150167a;

    public v0(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f150167a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v0) && this.f150167a.equals(((v0) obj2).f150167a);
    }

    public final int hashCode() {
        return this.f150167a.hashCode();
    }
}
