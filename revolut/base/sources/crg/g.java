package crg;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108384b;

    public g(List items, String screenTitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        this.f108383a = items;
        this.f108384b = screenTitle;
    }

    @Override // jki.n
    public final List c() {
        return this.f108383a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f108383a, gVar.f108383a) && Intrinsics.f(this.f108384b, gVar.f108384b);
    }

    public final int hashCode() {
        return this.f108384b.hashCode() + (this.f108383a.hashCode() * 31);
    }
}
