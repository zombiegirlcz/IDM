package ma;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203850b;

    public m(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f203849a = title;
        this.f203850b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f203849a, mVar.f203849a) && Intrinsics.f(this.f203850b, mVar.f203850b);
    }

    public final int hashCode() {
        int iHashCode = this.f203849a.hashCode() * 31;
        String str = this.f203850b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return j6.a.s("ToolbarState(title=", this.f203849a, ", description=", this.f203850b, ")");
    }

    public /* synthetic */ m() {
        this("", null);
    }
}
