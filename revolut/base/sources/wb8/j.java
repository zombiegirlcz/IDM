package wb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296059b;

    public /* synthetic */ j(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h.f296057a.getDescriptor(), i, 3);
            throw null;
        }
        this.f296058a = str;
        this.f296059b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f296058a, jVar.f296058a) && Intrinsics.f(this.f296059b, jVar.f296059b);
    }

    public final int hashCode() {
        return this.f296059b.hashCode() + (this.f296058a.hashCode() * 31);
    }

    public j(String registeredIdentityId, String guardianId) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(guardianId, "guardianId");
        this.f296058a = registeredIdentityId;
        this.f296059b = guardianId;
    }
}
