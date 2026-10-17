package lki;

import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableViewTarget f196465a;

    public l(ParcelableViewTarget anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f196465a = anchor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f196465a, ((l) obj2).f196465a);
    }

    public final int hashCode() {
        return this.f196465a.hashCode();
    }
}
