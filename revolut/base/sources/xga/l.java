package xga;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f305652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f305653b;

    public /* synthetic */ l(int i, h hVar, k kVar) {
        if (3 != (i & 3)) {
            j1.f(a.f305640a.getDescriptor(), i, 3);
            throw null;
        }
        this.f305652a = hVar;
        this.f305653b = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f305652a, lVar.f305652a) && Intrinsics.f(this.f305653b, lVar.f305653b);
    }

    public final int hashCode() {
        return this.f305653b.f305651a.hashCode() + (this.f305652a.hashCode() * 31);
    }
}
