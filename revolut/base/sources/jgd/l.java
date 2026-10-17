package jgd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173975a;

    public l(List assetTypeKeys) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        this.f173975a = assetTypeKeys;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f173975a, ((l) obj2).f173975a);
    }

    public final int hashCode() {
        return this.f173975a.hashCode();
    }
}
