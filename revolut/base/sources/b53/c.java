package b53;

import e93.g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f12423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12424b;

    public c(g0 imagesData, String selectedImageId) {
        Intrinsics.checkNotNullParameter(imagesData, "imagesData");
        Intrinsics.checkNotNullParameter(selectedImageId, "selectedImageId");
        this.f12423a = imagesData;
        this.f12424b = selectedImageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f12423a, cVar.f12423a) && Intrinsics.f(this.f12424b, cVar.f12424b);
    }

    public final int hashCode() {
        return this.f12424b.hashCode() + (this.f12423a.hashCode() * 31);
    }
}
