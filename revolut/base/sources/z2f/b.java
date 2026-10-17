package z2f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f319062b;

    public b(List mainPage, List searchPage) {
        Intrinsics.checkNotNullParameter(mainPage, "mainPage");
        Intrinsics.checkNotNullParameter(searchPage, "searchPage");
        this.f319061a = mainPage;
        this.f319062b = searchPage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319061a, bVar.f319061a) && Intrinsics.f(this.f319062b, bVar.f319062b);
    }

    public final int hashCode() {
        return this.f319062b.hashCode() + (this.f319061a.hashCode() * 31);
    }
}
