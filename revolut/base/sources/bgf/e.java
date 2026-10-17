package bgf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15193c;
    public final b d;
    public final d e;

    public e(c type, String title, String str, b action, d dVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f15191a = type;
        this.f15192b = title;
        this.f15193c = str;
        this.d = action;
        this.e = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f15191a == eVar.f15191a && Intrinsics.f(this.f15192b, eVar.f15192b) && Intrinsics.f(this.f15193c, eVar.f15193c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f15191a.hashCode() * 31, 31, this.f15192b);
        String str = this.f15193c;
        int iHashCode = (this.d.f15189a.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        d dVar = this.e;
        return iHashCode + (dVar != null ? dVar.f15190a.hashCode() : 0);
    }
}
