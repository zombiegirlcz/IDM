package u6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f277541a;

    public a(i error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f277541a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f277541a, ((a) obj2).f277541a);
    }

    public final int hashCode() {
        return this.f277541a.hashCode();
    }
}
