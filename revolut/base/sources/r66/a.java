package r66;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251645a;

    public a(String selectedAssetExternalId) {
        Intrinsics.checkNotNullParameter(selectedAssetExternalId, "selectedAssetExternalId");
        this.f251645a = selectedAssetExternalId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f251645a, ((a) obj2).f251645a);
    }

    public final int hashCode() {
        return this.f251645a.hashCode();
    }
}
