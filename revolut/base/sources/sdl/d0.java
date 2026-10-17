package sdl;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f261945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f261946c;
    public final Long d;

    public /* synthetic */ d0(int i, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, Long l2) {
        if (15 != (i & 15)) {
            qlm.j1.f(b0.f261940a.getDescriptor(), i, 15);
            throw null;
        }
        this.f261944a = dVar;
        this.f261945b = dVar2;
        this.f261946c = dVar3;
        this.d = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f261944a, d0Var.f261944a) && Intrinsics.f(this.f261945b, d0Var.f261945b) && Intrinsics.f(this.f261946c, d0Var.f261946c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f261944a.hashCode() * 31, 31, this.f261945b), 31, this.f261946c);
        Long l2 = this.d;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }

    public d0(dj0.d allowance, dj0.d used, dj0.d remaining, Long l2) {
        Intrinsics.checkNotNullParameter(allowance, "allowance");
        Intrinsics.checkNotNullParameter(used, "used");
        Intrinsics.checkNotNullParameter(remaining, "remaining");
        this.f261944a = allowance;
        this.f261945b = used;
        this.f261946c = remaining;
        this.d = l2;
    }
}
