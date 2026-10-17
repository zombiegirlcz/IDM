package ux0;

import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableViewTarget f283782a;

    public m(ParcelableViewTarget target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f283782a = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f283782a, ((m) obj2).f283782a);
    }

    public final int hashCode() {
        return this.f283782a.hashCode();
    }
}
