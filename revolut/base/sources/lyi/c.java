package lyi;

import kotlin.jvm.internal.Intrinsics;
import svi.r;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f200833a;

    public c(r details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f200833a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f200833a, ((c) obj2).f200833a);
    }

    public final int hashCode() {
        return this.f200833a.hashCode();
    }
}
