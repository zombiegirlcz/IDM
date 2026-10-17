package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m4 extends k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4 f10423a;

    public m4(j4 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.f10423a = segment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m4) && Intrinsics.f(this.f10423a, ((m4) obj2).f10423a);
    }

    public final int hashCode() {
        return this.f10423a.hashCode();
    }
}
