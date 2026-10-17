package ou3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f229793b;

    public h(String title, f action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f229792a = title;
        this.f229793b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f229792a, hVar.f229792a) && Intrinsics.f(this.f229793b, hVar.f229793b);
    }

    public final int hashCode() {
        return this.f229793b.hashCode() + (this.f229792a.hashCode() * 31);
    }
}
