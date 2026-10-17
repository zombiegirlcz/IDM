package n91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213544c;

    public e(String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f213542a = id10;
        this.f213543b = name;
        this.f213544c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f213542a, eVar.f213542a) && Intrinsics.f(this.f213543b, eVar.f213543b) && Intrinsics.f(this.f213544c, eVar.f213544c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f213542a.hashCode() * 31, 31, this.f213543b);
        String str = this.f213544c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
