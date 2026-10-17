package dpg;

import kotlin.jvm.internal.Intrinsics;
import zlg.r;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f116877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116878b;

    public a(r result, String username) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(username, "username");
        this.f116877a = result;
        this.f116878b = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f116877a, aVar.f116877a) && Intrinsics.f(this.f116878b, aVar.f116878b);
    }

    public final int hashCode() {
        return this.f116878b.hashCode() + (this.f116877a.hashCode() * 31);
    }
}
