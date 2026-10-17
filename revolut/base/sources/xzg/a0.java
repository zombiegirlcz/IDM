package xzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f309970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f309971c;

    public a0(String ref2, z assetType, float f) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.f309969a = ref2;
        this.f309970b = assetType;
        this.f309971c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f309969a, a0Var.f309969a) && Intrinsics.f(this.f309970b, a0Var.f309970b) && Float.compare(this.f309971c, a0Var.f309971c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f309971c) + ((this.f309970b.hashCode() + (this.f309969a.hashCode() * 31)) * 31);
    }
}
