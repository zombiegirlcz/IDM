package mic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f205676b;

    public q(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f205675a = id10;
        this.f205676b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f205675a, qVar.f205675a) && this.f205676b == qVar.f205676b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205676b) + (this.f205675a.hashCode() * 31);
    }
}
