package ba6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f13923a;

    public c0(r campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f13923a = campaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f13923a, ((c0) obj2).f13923a);
    }

    public final int hashCode() {
        return this.f13923a.hashCode();
    }
}
