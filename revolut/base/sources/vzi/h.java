package vzi;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f293543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f293544b;

    public h(CustomAsset asset, boolean z) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f293543a = asset;
        this.f293544b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f293543a, hVar.f293543a) && this.f293544b == hVar.f293544b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f293544b) + (this.f293543a.hashCode() * 31);
    }
}
