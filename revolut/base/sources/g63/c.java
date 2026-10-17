package g63;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x53.a f140839a;

    public c(x53.a scannedCardData) {
        Intrinsics.checkNotNullParameter(scannedCardData, "scannedCardData");
        this.f140839a = scannedCardData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f140839a, ((c) obj2).f140839a);
    }

    public final int hashCode() {
        return this.f140839a.hashCode();
    }
}
