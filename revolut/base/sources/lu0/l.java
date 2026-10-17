package lu0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f199996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.k f199997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f199998c;

    public l(efm.r searchObservable, ihm.k itemClickSubject, ihm.b retrySubject) {
        Intrinsics.checkNotNullParameter(searchObservable, "searchObservable");
        Intrinsics.checkNotNullParameter(itemClickSubject, "itemClickSubject");
        Intrinsics.checkNotNullParameter(retrySubject, "retrySubject");
        this.f199996a = searchObservable;
        this.f199997b = itemClickSubject;
        this.f199998c = retrySubject;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f199996a.equals(lVar.f199996a) && Intrinsics.f(this.f199997b, lVar.f199997b) && this.f199998c.equals(lVar.f199998c);
    }

    public final int hashCode() {
        return this.f199998c.hashCode() + ((this.f199997b.hashCode() + (this.f199996a.hashCode() * 31)) * 31);
    }
}
