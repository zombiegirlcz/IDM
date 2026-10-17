package asc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f8922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f8923c;

    public /* synthetic */ i(int i, boolean z, h hVar, h hVar2) {
        if (7 != (i & 7)) {
            j1.f(d.f8917a.getDescriptor(), i, 7);
            throw null;
        }
        this.f8921a = z;
        this.f8922b = hVar;
        this.f8923c = hVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f8921a == iVar.f8921a && Intrinsics.f(this.f8922b, iVar.f8922b) && Intrinsics.f(this.f8923c, iVar.f8923c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f8921a) * 31;
        h hVar = this.f8922b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.f8923c;
        return iHashCode2 + (hVar2 != null ? hVar2.hashCode() : 0);
    }
}
