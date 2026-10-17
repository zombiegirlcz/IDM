package chc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f24172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f24173b;

    public /* synthetic */ n(int i, m mVar, m mVar2) {
        if (3 != (i & 3)) {
            j1.f(e.f24156a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24172a = mVar;
        this.f24173b = mVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f24172a, nVar.f24172a) && Intrinsics.f(this.f24173b, nVar.f24173b);
    }

    public final int hashCode() {
        m mVar = this.f24172a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        m mVar2 = this.f24173b;
        return iHashCode + (mVar2 != null ? mVar2.hashCode() : 0);
    }

    public n(m mVar, m mVar2) {
        this.f24172a = mVar;
        this.f24173b = mVar2;
    }
}
