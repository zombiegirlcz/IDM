package uwk;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f283697a;

    public b(n mainAsset) {
        Intrinsics.checkNotNullParameter(mainAsset, "mainAsset");
        this.f283697a = mainAsset;
    }

    public final n b() {
        return this.f283697a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f283697a, ((b) obj2).f283697a);
    }

    public final int hashCode() {
        return this.f283697a.hashCode();
    }
}
