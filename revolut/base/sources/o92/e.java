package o92;

import cli.j;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViaVerdeEnrollment f223061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f223062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f223063c;

    public e(ViaVerdeEnrollment enrollment, String label, boolean z) {
        Intrinsics.checkNotNullParameter(enrollment, "enrollment");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f223061a = enrollment;
        this.f223062b = label;
        this.f223063c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f223061a, eVar.f223061a) && Intrinsics.f(this.f223062b, eVar.f223062b) && this.f223063c == eVar.f223063c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223063c) + p.a.c(this.f223061a.hashCode() * 31, 31, this.f223062b);
    }
}
