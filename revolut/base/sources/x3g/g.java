package x3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302747b;

    public g(String experienceId, String str) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f302746a = experienceId;
        this.f302747b = str;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF71990a() {
        return 30;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f302746a, gVar.f302746a) && Intrinsics.f(this.f302747b, gVar.f302747b);
    }

    public final int hashCode() {
        int iB = j6.a.b(30, this.f302746a.hashCode() * 31, 31);
        String str = this.f302747b;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
