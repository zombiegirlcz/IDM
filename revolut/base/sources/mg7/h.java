package mg7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205168b;

    public h(String title, String iconName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.f205167a = title;
        this.f205168b = iconName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f205167a, hVar.f205167a) && Intrinsics.f(this.f205168b, hVar.f205168b);
    }

    public final int hashCode() {
        return this.f205168b.hashCode() + (this.f205167a.hashCode() * 31);
    }
}
