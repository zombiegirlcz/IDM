package o4d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f222203c;
    public final int d;

    public e(int i, String id10, boolean z, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f222201a = id10;
        this.f222202b = name;
        this.f222203c = z;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f222201a, eVar.f222201a) && Intrinsics.f(this.f222202b, eVar.f222202b) && this.f222203c == eVar.f222203c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.c(p.a.c(this.f222201a.hashCode() * 31, 31, this.f222202b), 31, this.f222203c);
    }
}
