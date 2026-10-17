package gkl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class f1 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f144448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f144449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f144450c;

    public /* synthetic */ f1(int i, e1 e1Var, Instant instant, Instant instant2) {
        if (7 != (i & 7)) {
            qlm.j1.f(x0.f144501a.getDescriptor(), i, 7);
            throw null;
        }
        this.f144448a = e1Var;
        this.f144449b = instant;
        this.f144450c = instant2;
    }

    public final Instant a() {
        return this.f144450c;
    }

    public final Instant b() {
        return this.f144449b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f144448a, f1Var.f144448a) && Intrinsics.f(this.f144449b, f1Var.f144449b) && Intrinsics.f(this.f144450c, f1Var.f144450c);
    }

    public final int hashCode() {
        e1 e1Var = this.f144448a;
        return this.f144450c.hashCode() + r6.b.c((e1Var == null ? 0 : e1Var.hashCode()) * 31, 31, this.f144449b);
    }
}
