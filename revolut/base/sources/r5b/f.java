package r5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f251569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f251570c;
    public final g d;

    public f(String id10, String label, String str, g keyboardType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(keyboardType, "keyboardType");
        this.f251568a = id10;
        this.f251569b = label;
        this.f251570c = str;
        this.d = keyboardType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f251568a, fVar.f251568a) && Intrinsics.f(this.f251569b, fVar.f251569b) && Intrinsics.f(this.f251570c, fVar.f251570c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f251568a.hashCode() * 31, 31, this.f251569b);
        String str = this.f251570c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
