package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f896a;

    public c(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f896a = assetName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f896a, ((c) obj2).f896a);
    }

    public final int hashCode() {
        return this.f896a.hashCode();
    }
}
