package d47;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f111238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f111239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f111240c;

    public j(i headerState, h footerState, aim.e items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111238a = headerState;
        this.f111239b = footerState;
        this.f111240c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f111240c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f111238a, jVar.f111238a) && Intrinsics.f(this.f111239b, jVar.f111239b) && Intrinsics.f(this.f111240c, jVar.f111240c);
    }

    public final int hashCode() {
        return this.f111240c.hashCode() + t61.a.a(this.f111238a.f111237a.hashCode() * 31, 31, this.f111239b.f111236a);
    }
}
