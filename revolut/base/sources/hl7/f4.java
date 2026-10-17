package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f4 {

    @NotNull
    public static final e4 Companion = new e4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f153097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f153098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153099c;

    public /* synthetic */ f4(int i, dj0.d dVar, dj0.d dVar2, String str) {
        if (7 != (i & 7)) {
            qlm.j1.f(d4.f153061a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153097a = dVar;
        this.f153098b = dVar2;
        this.f153099c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return Intrinsics.f(this.f153097a, f4Var.f153097a) && Intrinsics.f(this.f153098b, f4Var.f153098b) && Intrinsics.f(this.f153099c, f4Var.f153099c);
    }

    public final int hashCode() {
        return this.f153099c.hashCode() + ip0.v7.c(this.f153097a.hashCode() * 31, 31, this.f153098b);
    }
}
