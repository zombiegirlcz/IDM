package op0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227208b;

    public c2(List tabs, String str) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f227207a = tabs;
        this.f227208b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f227207a, c2Var.f227207a) && Intrinsics.f(this.f227208b, c2Var.f227208b);
    }

    public final int hashCode() {
        int iHashCode = this.f227207a.hashCode() * 31;
        String str = this.f227208b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
