package iv3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168710a;

    public e(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f168710a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f168710a, ((e) obj2).f168710a);
    }

    public final int hashCode() {
        return this.f168710a.hashCode();
    }
}
