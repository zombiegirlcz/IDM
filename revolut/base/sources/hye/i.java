package hye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.f f156863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f156864b;

    public i(aim.f breakdown, dj0.d fullFee) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(fullFee, "fullFee");
        this.f156863a = breakdown;
        this.f156864b = fullFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f156863a.equals(iVar.f156863a) && this.f156864b.equals(iVar.f156864b);
    }

    public final int hashCode() {
        return this.f156864b.hashCode() + (this.f156863a.hashCode() * 31);
    }
}
