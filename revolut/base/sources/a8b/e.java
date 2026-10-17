package a8b;

import kotlin.jvm.internal.Intrinsics;
import r5b.p;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2148b;

    public e(p action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f2147a = action;
        this.f2148b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f2147a == eVar.f2147a && Intrinsics.f(this.f2148b, eVar.f2148b);
    }

    public final int hashCode() {
        int iHashCode = this.f2147a.hashCode() * 31;
        String str = this.f2148b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
