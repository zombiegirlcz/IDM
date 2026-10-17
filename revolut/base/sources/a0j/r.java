package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f416b;

    public r(q type, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f415a = type;
        this.f416b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f415a == rVar.f415a && this.f416b == rVar.f416b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f416b) + (this.f415a.hashCode() * 31);
    }
}
