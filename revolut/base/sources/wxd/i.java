package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f300864b;

    public i(String title, e action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f300863a = title;
        this.f300864b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f300863a, iVar.f300863a) && Intrinsics.f(this.f300864b, iVar.f300864b);
    }

    public final int hashCode() {
        return this.f300864b.hashCode() + (this.f300863a.hashCode() * 31);
    }
}
