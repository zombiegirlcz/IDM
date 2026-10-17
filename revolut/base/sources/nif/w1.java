package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f216058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f216059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f216060c;
    public final Long d;
    public final Long e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f216061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1 f216062h;

    public /* synthetic */ w1(int i, Long l2, Long l3, Long l4, Long l5, Long l22, z1 z1Var, z1 z1Var2, z1 z1Var3) {
        if (255 != (i & 255)) {
            qlm.j1.f(u1.f216044a.getDescriptor(), i, 255);
            throw null;
        }
        this.f216058a = l2;
        this.f216059b = l3;
        this.f216060c = l4;
        this.d = l5;
        this.e = l22;
        this.f = z1Var;
        this.f216061g = z1Var2;
        this.f216062h = z1Var3;
    }

    public final Long a() {
        return this.f216060c;
    }

    public final Long b() {
        return this.f216059b;
    }

    public final Long c() {
        return this.e;
    }

    public final z1 d() {
        return this.f216062h;
    }

    public final Long e() {
        return this.f216058a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f216058a, w1Var.f216058a) && Intrinsics.f(this.f216059b, w1Var.f216059b) && Intrinsics.f(this.f216060c, w1Var.f216060c) && Intrinsics.f(this.d, w1Var.d) && Intrinsics.f(this.e, w1Var.e) && Intrinsics.f(this.f, w1Var.f) && Intrinsics.f(this.f216061g, w1Var.f216061g) && Intrinsics.f(this.f216062h, w1Var.f216062h);
    }

    public final z1 f() {
        return this.f;
    }

    public final z1 g() {
        return this.f216061g;
    }

    public final Long h() {
        return this.d;
    }

    public final int hashCode() {
        Long l2 = this.f216058a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f216059b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f216060c;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.d;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.e;
        int iHashCode5 = (iHashCode4 + (l22 == null ? 0 : l22.hashCode())) * 31;
        z1 z1Var = this.f;
        int iHashCode6 = (iHashCode5 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        z1 z1Var2 = this.f216061g;
        int iHashCode7 = (iHashCode6 + (z1Var2 == null ? 0 : z1Var2.hashCode())) * 31;
        z1 z1Var3 = this.f216062h;
        return iHashCode7 + (z1Var3 != null ? z1Var3.hashCode() : 0);
    }

    public w1(Long l2, Long l3, Long l4, Long l5, Long l22, z1 z1Var, z1 z1Var2, z1 z1Var3) {
        this.f216058a = l2;
        this.f216059b = l3;
        this.f216060c = l4;
        this.d = l5;
        this.e = l22;
        this.f = z1Var;
        this.f216061g = z1Var2;
        this.f216062h = z1Var3;
    }
}
