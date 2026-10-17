package tmk;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eyl.a f272233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eyl.a f272234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f272235c;

    public h(eyl.a title, eyl.a description, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f272233a = title;
        this.f272234b = description;
        this.f272235c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f272233a, hVar.f272233a) && Intrinsics.f(this.f272234b, hVar.f272234b) && Intrinsics.f(this.f272235c, hVar.f272235c);
    }

    public final int hashCode() {
        int iHashCode = (this.f272234b.hashCode() + (this.f272233a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f272235c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
