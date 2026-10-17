package go;

import kotlin.jvm.internal.Intrinsics;
import no.w2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2 f145060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145061b;

    public a(w2 permission, boolean z) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.f145060a = permission;
        this.f145061b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f145060a == aVar.f145060a && this.f145061b == aVar.f145061b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145061b) + (this.f145060a.hashCode() * 31);
    }
}
