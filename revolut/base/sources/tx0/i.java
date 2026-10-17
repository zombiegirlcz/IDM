package tx0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.m3 f275155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f275156b;

    public i(ola.d productIntro, Set highlightedActionsIds) {
        Intrinsics.checkNotNullParameter(productIntro, "productIntro");
        Intrinsics.checkNotNullParameter(highlightedActionsIds, "highlightedActionsIds");
        this.f275155a = productIntro;
        this.f275156b = highlightedActionsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f275155a, iVar.f275155a) && Intrinsics.f(this.f275156b, iVar.f275156b);
    }

    public final int hashCode() {
        return this.f275156b.hashCode() + (this.f275155a.hashCode() * 31);
    }
}
