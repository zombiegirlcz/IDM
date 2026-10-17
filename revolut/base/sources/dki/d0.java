package dki;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f115527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115528b;

    public d0(Bundle bundle, boolean z) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f115527a = bundle;
        this.f115528b = z;
    }

    @Override // dki.f0
    public final boolean a() {
        return this.f115528b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f115527a, d0Var.f115527a) && this.f115528b == d0Var.f115528b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115528b) + (this.f115527a.hashCode() * 31);
    }
}
