package c59;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f21477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f21478b;

    public /* synthetic */ f(int i, d dVar, d dVar2) {
        if (3 != (i & 3)) {
            j1.f(a.f21474a.getDescriptor(), i, 3);
            throw null;
        }
        this.f21477a = dVar;
        this.f21478b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f21477a, fVar.f21477a) && Intrinsics.f(this.f21478b, fVar.f21478b);
    }

    public final int hashCode() {
        return this.f21478b.f21476a.hashCode() + (this.f21477a.f21476a.hashCode() * 31);
    }
}
