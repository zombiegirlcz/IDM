package tt8;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my8.l f274294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f274295b;

    public l(my8.l doc2) {
        ArrayList next = new ArrayList();
        Intrinsics.checkNotNullParameter(doc2, "doc");
        Intrinsics.checkNotNullParameter(next, "next");
        this.f274294a = doc2;
        this.f274295b = next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f274294a, lVar.f274294a) && Intrinsics.f(this.f274295b, lVar.f274295b);
    }

    public final int hashCode() {
        return this.f274295b.hashCode() + (this.f274294a.hashCode() * 31);
    }
}
