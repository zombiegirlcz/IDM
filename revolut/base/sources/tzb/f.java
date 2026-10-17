package tzb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f275905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f275906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f275907c;

    public f(aim.e items, e header, aw0.i footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f275905a = items;
        this.f275906b = header;
        this.f275907c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f275905a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f275905a, fVar.f275905a) && Intrinsics.f(this.f275906b, fVar.f275906b) && Intrinsics.f(this.f275907c, fVar.f275907c);
    }

    public final int hashCode() {
        return this.f275907c.hashCode() + ((this.f275906b.hashCode() + (this.f275905a.hashCode() * 31)) * 31);
    }
}
