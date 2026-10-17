package d56;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f111382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f111383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f111384c;

    public /* synthetic */ n(int i, m mVar, j jVar, Boolean bool) {
        if (7 != (i & 7)) {
            j1.f(f.f111373a.getDescriptor(), i, 7);
            throw null;
        }
        this.f111382a = mVar;
        this.f111383b = jVar;
        this.f111384c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f111382a, nVar.f111382a) && Intrinsics.f(this.f111383b, nVar.f111383b) && Intrinsics.f(this.f111384c, nVar.f111384c);
    }

    public final int hashCode() {
        m mVar = this.f111382a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        j jVar = this.f111383b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool = this.f111384c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
