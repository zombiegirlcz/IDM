package jrk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f178082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f178083c;
    public final c d;
    public final f e;

    public /* synthetic */ x(int i, int i2, Integer num, i iVar, c cVar, f fVar) {
        if (31 != (i & 31)) {
            j1.f(v.f178080a.getDescriptor(), i, 31);
            throw null;
        }
        this.f178081a = i2;
        this.f178082b = num;
        this.f178083c = iVar;
        this.d = cVar;
        this.e = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f178081a == xVar.f178081a && Intrinsics.f(this.f178082b, xVar.f178082b) && Intrinsics.f(this.f178083c, xVar.f178083c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f178081a) * 31;
        Integer num = this.f178082b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        i iVar = this.f178083c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        c cVar = this.d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        f fVar = this.e;
        return iHashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }
}
