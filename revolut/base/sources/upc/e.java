package upc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yvh.b f281955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f281956c;
    public final yvh.b d;

    public e(String str, yvh.b bVar, boolean z, yvh.b bVar2) {
        this.f281954a = str;
        this.f281955b = bVar;
        this.f281956c = z;
        this.d = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f281954a, eVar.f281954a) && Intrinsics.f(this.f281955b, eVar.f281955b) && this.f281956c == eVar.f281956c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        String str = this.f281954a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        yvh.b bVar = this.f281955b;
        int iC = j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f281956c);
        yvh.b bVar2 = this.d;
        return iC + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
