package w26;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f293965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f293966c;
    public final jo3.a d;
    public final k e;

    public /* synthetic */ n(int i, String str, d dVar, d dVar2, jo3.a aVar, k kVar) {
        if (31 != (i & 31)) {
            j1.f(l.f293963a.getDescriptor(), i, 31);
            throw null;
        }
        this.f293964a = str;
        this.f293965b = dVar;
        this.f293966c = dVar2;
        this.d = aVar;
        this.e = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f293964a, nVar.f293964a) && Intrinsics.f(this.f293965b, nVar.f293965b) && Intrinsics.f(this.f293966c, nVar.f293966c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        String str = this.f293964a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f293965b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f293966c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        jo3.a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        k kVar = this.e;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }
}
