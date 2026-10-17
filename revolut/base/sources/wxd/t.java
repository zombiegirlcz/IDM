package wxd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f300887c;

    public t(String title, String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f300885a = title;
        this.f300886b = str;
        this.f300887c = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f300885a, tVar.f300885a) && Intrinsics.f(this.f300886b, tVar.f300886b) && this.f300887c.equals(tVar.f300887c);
    }

    public final int hashCode() {
        int iHashCode = this.f300885a.hashCode() * 31;
        String str = this.f300886b;
        return this.f300887c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
