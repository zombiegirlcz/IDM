package zx6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f326054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f326055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f326056c;

    public l(k headerState, j footerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f326054a = headerState;
        this.f326055b = footerState;
        this.f326056c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f326056c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f326054a, lVar.f326054a) && Intrinsics.f(this.f326055b, lVar.f326055b) && Intrinsics.f(this.f326056c, lVar.f326056c);
    }

    public final int hashCode() {
        return this.f326056c.hashCode() + ((this.f326055b.hashCode() + (this.f326054a.hashCode() * 31)) * 31);
    }
}
