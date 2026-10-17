package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y3 {

    @NotNull
    public static final x3 Companion = new x3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kr7.a f153375b;

    public /* synthetic */ y3(int i, String str, kr7.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(w3.f153350a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153374a = str;
        this.f153375b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f153374a, y3Var.f153374a) && Intrinsics.f(this.f153375b, y3Var.f153375b);
    }

    public final int hashCode() {
        int iHashCode = this.f153374a.hashCode() * 31;
        kr7.a aVar = this.f153375b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
