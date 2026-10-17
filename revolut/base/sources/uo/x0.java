package uo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class x0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f281518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f281519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f281520c;
    public final Long d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f281521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f281522h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f281523j;
    public final Long k;

    public static final class a {
        private a() {
        }
    }

    public x0() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f281518a, x0Var.f281518a) && Intrinsics.f(this.f281519b, x0Var.f281519b) && Intrinsics.f(this.f281520c, x0Var.f281520c) && Intrinsics.f(this.d, x0Var.d) && Intrinsics.f(this.e, x0Var.e) && Intrinsics.f(this.f, x0Var.f) && Intrinsics.f(this.f281521g, x0Var.f281521g) && Intrinsics.f(this.f281522h, x0Var.f281522h) && Intrinsics.f(this.i, x0Var.i) && Intrinsics.f(this.f281523j, x0Var.f281523j) && Intrinsics.f(this.k, x0Var.k);
    }

    public final int hashCode() {
        Long l2 = this.f281518a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f281519b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f281520c;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.d;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.e;
        int iHashCode5 = (iHashCode4 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.f;
        int iHashCode6 = (iHashCode5 + (l31 == null ? 0 : l31.hashCode())) * 31;
        Long l37 = this.f281521g;
        int iHashCode7 = (iHashCode6 + (l37 == null ? 0 : l37.hashCode())) * 31;
        Long l39 = this.f281522h;
        int iHashCode8 = (iHashCode7 + (l39 == null ? 0 : l39.hashCode())) * 31;
        Long l51 = this.i;
        int iHashCode9 = (iHashCode8 + (l51 == null ? 0 : l51.hashCode())) * 31;
        Long l52 = this.f281523j;
        int iHashCode10 = (iHashCode9 + (l52 == null ? 0 : l52.hashCode())) * 31;
        Long l60 = this.k;
        return iHashCode10 + (l60 != null ? l60.hashCode() : 0);
    }

    public x0(Long l2, Long l3, Long l4, Long l5, Long l22, Long l31, Long l37, Long l39, Long l51, Long l52, Long l60) {
        this.f281518a = l2;
        this.f281519b = l3;
        this.f281520c = l4;
        this.d = l5;
        this.e = l22;
        this.f = l31;
        this.f281521g = l37;
        this.f281522h = l39;
        this.i = l51;
        this.f281523j = l52;
        this.k = l60;
    }
}
