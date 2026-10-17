package g9j;

import g9j.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f141907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f141908b;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f141907a, cVar.f141907a) && this.f141908b == cVar.f141908b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141908b) + (this.f141907a.hashCode() * 31);
    }

    public c(f widgetData, boolean z) {
        Intrinsics.checkNotNullParameter(widgetData, "widgetData");
        this.f141907a = widgetData;
        this.f141908b = z;
    }

    public /* synthetic */ c(int i) {
        this(f.b.f141915a, false);
    }
}
