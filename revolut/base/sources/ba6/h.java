package ba6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f13934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13935b;

    public h(int i, dj0.d totalDonation) {
        Intrinsics.checkNotNullParameter(totalDonation, "totalDonation");
        this.f13934a = totalDonation;
        this.f13935b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f13934a, hVar.f13934a) && this.f13935b == hVar.f13935b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13935b) + (this.f13934a.hashCode() * 31);
    }
}
