package x00;

import com.revolut.camerakit.validators.mrz.MrzDocument$Standard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MrzDocument$Standard f301451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f301452b;

    public d(MrzDocument$Standard document, boolean z) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f301451a = document;
        this.f301452b = z;
    }

    @Override // xv.q
    public final boolean c() {
        return this.f301452b;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f301451a.equals(dVar.f301451a) && this.f301452b == dVar.f301452b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f301452b) + (this.f301451a.hashCode() * 31);
    }
}
