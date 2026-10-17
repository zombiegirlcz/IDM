package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296645a;

    public h0(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f296645a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f296645a, ((h0) obj2).f296645a);
    }

    public final int hashCode() {
        return this.f296645a.hashCode();
    }
}
