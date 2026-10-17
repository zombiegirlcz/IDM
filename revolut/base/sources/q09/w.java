package q09;

import ip0.gj0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f241214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gj0 f241215b;

    public w(int i, gj0 videoErrorEvent) {
        Intrinsics.checkNotNullParameter(videoErrorEvent, "videoErrorEvent");
        this.f241214a = i;
        this.f241215b = videoErrorEvent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f241214a == wVar.f241214a && Intrinsics.f(this.f241215b, wVar.f241215b);
    }

    public final int hashCode() {
        return this.f241215b.hashCode() + (Integer.hashCode(this.f241214a) * 31);
    }
}
