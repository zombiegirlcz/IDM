package vnl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290822a;

    public e(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f290822a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f290822a, ((e) obj2).f290822a);
    }

    public final int hashCode() {
        return this.f290822a.hashCode();
    }
}
