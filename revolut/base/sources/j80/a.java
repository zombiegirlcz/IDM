package j80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.f f172074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.a f172075b;

    public a(aim.f hints, vh.a barcodeFormat) {
        Intrinsics.checkNotNullParameter(hints, "hints");
        Intrinsics.checkNotNullParameter(barcodeFormat, "barcodeFormat");
        this.f172074a = hints;
        this.f172075b = barcodeFormat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f172074a.equals(aVar.f172074a) && this.f172075b == aVar.f172075b;
    }

    public final int hashCode() {
        return this.f172075b.hashCode() + (this.f172074a.hashCode() * 31);
    }
}
