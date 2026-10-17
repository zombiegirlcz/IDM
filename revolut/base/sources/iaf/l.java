package iaf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160006a;

    public l(List selectedAssets) {
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        this.f160006a = selectedAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f160006a, ((l) obj2).f160006a);
    }

    public final int hashCode() {
        return this.f160006a.hashCode();
    }
}
