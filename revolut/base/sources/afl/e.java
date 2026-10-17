package afl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f4588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f4589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f4590c;

    public e(BigDecimal bigDecimal, h hVar, h hVar2) {
        this.f4588a = bigDecimal;
        this.f4589b = hVar;
        this.f4590c = hVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f4588a, eVar.f4588a) && Intrinsics.f(this.f4589b, eVar.f4589b) && Intrinsics.f(this.f4590c, eVar.f4590c);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f4588a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        h hVar = this.f4589b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.f4590c;
        return iHashCode2 + (hVar2 != null ? hVar2.hashCode() : 0);
    }
}
