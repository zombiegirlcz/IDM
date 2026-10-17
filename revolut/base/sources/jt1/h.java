package jt1;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f178284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178285c;

    public h(List items, j8 navBarModel, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f178283a = items;
        this.f178284b = navBarModel;
        this.f178285c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f178283a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f178283a, hVar.f178283a) && Intrinsics.f(this.f178284b, hVar.f178284b) && this.f178285c == hVar.f178285c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178285c) + ((this.f178284b.hashCode() + (this.f178283a.hashCode() * 31)) * 31);
    }
}
