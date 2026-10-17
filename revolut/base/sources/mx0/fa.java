package mx0;

import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class fa implements ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableViewTarget f209703a;

    public fa(ParcelableViewTarget anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.f209703a = anchor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof fa) && Intrinsics.f(this.f209703a, ((fa) obj2).f209703a);
    }

    public final int hashCode() {
        return this.f209703a.hashCode();
    }
}
