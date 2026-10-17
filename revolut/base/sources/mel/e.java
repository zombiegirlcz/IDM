package mel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f204737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f204739c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f204740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f204741h;
    public final float i;

    public e(j0 consensus, int i, int i2, int i3, int i5, int i6) {
        Intrinsics.checkNotNullParameter(consensus, "consensus");
        this.f204737a = consensus;
        this.f204738b = i;
        this.f204739c = i2;
        this.d = i3;
        this.e = i5;
        this.f = i6;
        this.f204740g = (i2 + i) / a();
        this.f204741h = (i5 + i6) / a();
        this.i = i3 / a();
    }

    public final int a() {
        return this.f204738b + this.f204739c + this.d + this.e + this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f204737a == eVar.f204737a && this.f204738b == eVar.f204738b && this.f204739c == eVar.f204739c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f204739c, j6.a.b(this.f204738b, this.f204737a.hashCode() * 31, 31), 31), 31), 31);
    }
}
