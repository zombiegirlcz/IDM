package gh3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yg3.i f143834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f143835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yg3.f f143836c;

    public d(yg3.i header, List blocks, yg3.f fVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f143834a = header;
        this.f143835b = blocks;
        this.f143836c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f143834a, dVar.f143834a) && Intrinsics.f(this.f143835b, dVar.f143835b) && Intrinsics.f(this.f143836c, dVar.f143836c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f143834a.f313508a.hashCode() * 31, 31, this.f143835b);
        yg3.f fVar = this.f143836c;
        return iD + (fVar == null ? 0 : fVar.f313506a.hashCode());
    }
}
