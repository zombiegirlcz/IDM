package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f10243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10244c;

    public b3(String segmentId, y2 header, List segments) {
        Intrinsics.checkNotNullParameter(segmentId, "segmentId");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f10242a = segmentId;
        this.f10243b = header;
        this.f10244c = segments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f10242a, b3Var.f10242a) && Intrinsics.f(this.f10243b, b3Var.f10243b) && Intrinsics.f(this.f10244c, b3Var.f10244c);
    }

    public final int hashCode() {
        return this.f10244c.hashCode() + ((this.f10243b.hashCode() + (this.f10242a.hashCode() * 31)) * 31);
    }
}
