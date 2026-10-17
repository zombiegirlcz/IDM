package ryd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c71.b f258350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258351b;

    public o(c71.b info, boolean z) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f258350a = info;
        this.f258351b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f258350a, oVar.f258350a) && this.f258351b == oVar.f258351b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258351b) + (this.f258350a.hashCode() * 31);
    }
}
