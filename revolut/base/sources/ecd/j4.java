package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j4 {

    @NotNull
    public static final i4 Companion = new i4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f124593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f124594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g4 f124595c;

    public /* synthetic */ j4(int i, long j2, Long l2, g4 g4Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(h4.f124566a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124593a = j2;
        this.f124594b = l2;
        this.f124595c = g4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj2;
        return this.f124593a == j4Var.f124593a && Intrinsics.f(this.f124594b, j4Var.f124594b) && Intrinsics.f(this.f124595c, j4Var.f124595c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f124593a) * 31;
        Long l2 = this.f124594b;
        return this.f124595c.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }

    public j4(long j2, Long l2, g4 percentages) {
        Intrinsics.checkNotNullParameter(percentages, "percentages");
        this.f124593a = j2;
        this.f124594b = l2;
        this.f124595c = percentages;
    }
}
