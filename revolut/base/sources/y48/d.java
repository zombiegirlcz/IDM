package y48;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import z38.h;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f310823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f310824b;

    public /* synthetic */ d(int i, int i2, h hVar) {
        if (3 != (i & 3)) {
            j1.f(b.f310822a.getDescriptor(), i, 3);
            throw null;
        }
        this.f310823a = i2;
        this.f310824b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f310823a == dVar.f310823a && Intrinsics.f(this.f310824b, dVar.f310824b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f310823a) * 31;
        h hVar = this.f310824b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
