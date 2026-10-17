package vs7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f291742b;

    public f(String title, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f291741a = title;
        this.f291742b = tabs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f291741a, fVar.f291741a) && this.f291742b.equals(fVar.f291742b);
    }

    public final int hashCode() {
        return this.f291742b.hashCode() + (this.f291741a.hashCode() * 31);
    }
}
