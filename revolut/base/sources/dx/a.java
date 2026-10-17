package dx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements xv.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f120490a;

    public a(k face) {
        Intrinsics.checkNotNullParameter(face, "face");
        this.f120490a = face;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f120490a, ((a) obj2).f120490a);
    }

    public final int hashCode() {
        return this.f120490a.hashCode();
    }
}
