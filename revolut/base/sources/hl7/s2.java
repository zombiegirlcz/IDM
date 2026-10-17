package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s2 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f153296b;

    public /* synthetic */ s2(int i, String str, p2 p2Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(q2.f153264a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153295a = str;
        this.f153296b = p2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f153295a, s2Var.f153295a) && Intrinsics.f(this.f153296b, s2Var.f153296b);
    }

    public final int hashCode() {
        return this.f153296b.hashCode() + (this.f153295a.hashCode() * 31);
    }

    public s2(String requestId, p2 drivingLicence) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(drivingLicence, "drivingLicence");
        this.f153295a = requestId;
        this.f153296b = drivingLicence;
    }
}
