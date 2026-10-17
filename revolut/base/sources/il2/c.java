package il2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162048b;

    public c(String icon, String title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f162047a = icon;
        this.f162048b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f162047a, cVar.f162047a) && Intrinsics.f(this.f162048b, cVar.f162048b);
    }

    public final int hashCode() {
        return this.f162048b.hashCode() + (this.f162047a.hashCode() * 31);
    }
}
