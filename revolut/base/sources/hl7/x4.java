package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x4 {

    @NotNull
    public static final w4 Companion = new w4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f153364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f153365c;

    public /* synthetic */ x4(Boolean bool, int i, Boolean bool2, String str) {
        if (7 != (i & 7)) {
            qlm.j1.f(v4.f153337a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153363a = str;
        this.f153364b = bool;
        this.f153365c = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj2;
        return Intrinsics.f(this.f153363a, x4Var.f153363a) && Intrinsics.f(this.f153364b, x4Var.f153364b) && Intrinsics.f(this.f153365c, x4Var.f153365c);
    }

    public final int hashCode() {
        int iHashCode = this.f153363a.hashCode() * 31;
        Boolean bool = this.f153364b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f153365c;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public x4(String points, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f153363a = points;
        this.f153364b = bool;
        this.f153365c = bool2;
    }
}
