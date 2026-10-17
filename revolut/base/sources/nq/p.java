package nq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f218325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f218326c;
    public final String d;
    public final Integer e;

    public p(String id10, w originalScanType, byte[] imageData, String str, Integer num) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(originalScanType, "originalScanType");
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        this.f218324a = id10;
        this.f218325b = originalScanType;
        this.f218326c = imageData;
        this.d = str;
        this.e = num;
    }

    public final String a(String baseKey) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(baseKey, "_", this.f218324a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f218324a, pVar.f218324a) && this.f218325b == pVar.f218325b && Intrinsics.f(this.f218326c, pVar.f218326c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iB = ehe.n.b((this.f218325b.hashCode() + (this.f218324a.hashCode() * 31)) * 31, 31, this.f218326c);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
