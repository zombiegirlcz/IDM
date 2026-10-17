package n85;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f213212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213213c;

    public h(String str, List items, List tabs) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f213211a = items;
        this.f213212b = tabs;
        this.f213213c = str;
    }

    @Override // jki.n
    public final List c() {
        return this.f213211a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f213211a, hVar.f213211a) && Intrinsics.f(this.f213212b, hVar.f213212b) && Intrinsics.f(this.f213213c, hVar.f213213c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f213211a.hashCode() * 31, 31, this.f213212b);
        String str = this.f213213c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
