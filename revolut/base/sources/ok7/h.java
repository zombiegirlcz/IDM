package ok7;

import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACProductDetails f225919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f225921c;

    public h(CFACProductDetails productDetails, String selectedTabId, boolean z) {
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f225919a = productDetails;
        this.f225920b = selectedTabId;
        this.f225921c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f225919a, hVar.f225919a) && Intrinsics.f(this.f225920b, hVar.f225920b) && this.f225921c == hVar.f225921c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225921c) + p.a.c(this.f225919a.hashCode() * 31, 31, this.f225920b);
    }
}
