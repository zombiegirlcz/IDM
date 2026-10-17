package wgl;

import kotlin.jvm.internal.Intrinsics;
import zel.f;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f297338a;

    public a(f instrumentGroup) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        this.f297338a = instrumentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f297338a == ((a) obj2).f297338a;
    }

    public final int hashCode() {
        return this.f297338a.hashCode();
    }
}
