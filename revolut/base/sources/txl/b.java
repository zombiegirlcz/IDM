package txl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f275434a;

    public b(f message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f275434a = message;
    }

    @Override // txl.d
    public final String a() {
        return "swipe_down";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f275434a, ((b) obj2).f275434a);
    }

    public final int hashCode() {
        return this.f275434a.f275436a.hashCode();
    }
}
