package j1j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f170611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f170612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f170613c;
    public final i d;
    public final i e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f170614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f170615h;
    public final boolean i;

    public b(i iVar, i iVar2, i iVar3, i iVar4, i iVar5, boolean z, Integer num, List customPersonalSectionOrder, boolean z3) {
        Intrinsics.checkNotNullParameter(customPersonalSectionOrder, "customPersonalSectionOrder");
        this.f170611a = iVar;
        this.f170612b = iVar2;
        this.f170613c = iVar3;
        this.d = iVar4;
        this.e = iVar5;
        this.f = z;
        this.f170614g = num;
        this.f170615h = customPersonalSectionOrder;
        this.i = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f170611a, bVar.f170611a) && Intrinsics.f(this.f170612b, bVar.f170612b) && Intrinsics.f(this.f170613c, bVar.f170613c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && Intrinsics.f(this.f170614g, bVar.f170614g) && Intrinsics.f(this.f170615h, bVar.f170615h) && this.i == bVar.i;
    }

    public final int hashCode() {
        i iVar = this.f170611a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        i iVar2 = this.f170612b;
        int iHashCode2 = (iHashCode + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        i iVar3 = this.f170613c;
        int iHashCode3 = (iHashCode2 + (iVar3 == null ? 0 : iVar3.hashCode())) * 31;
        i iVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (iVar4 == null ? 0 : iVar4.hashCode())) * 31;
        i iVar5 = this.e;
        int iC = j6.a.c((iHashCode4 + (iVar5 == null ? 0 : iVar5.hashCode())) * 31, 31, this.f);
        Integer num = this.f170614g;
        return Boolean.hashCode(this.i) + p.a.d((iC + (num != null ? num.hashCode() : 0)) * 31, 31, this.f170615h);
    }

    public b(boolean z, Integer num, boolean z3, int i) {
        this(null, null, null, null, null, z, (i & 64) != 0 ? null : num, f0.f322471a, (i & 256) != 0 ? false : z3);
    }
}
