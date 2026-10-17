package lol;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197471a;

    public h(String evidence) {
        Intrinsics.checkNotNullParameter(evidence, "evidence");
        this.f197471a = evidence;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f197471a, ((h) obj2).f197471a);
    }

    public final int hashCode() {
        return this.f197471a.hashCode();
    }
}
