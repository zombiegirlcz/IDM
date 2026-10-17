package mt0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f208719c;

    public p(List items, int i, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208717a = items;
        this.f208718b = i;
        this.f208719c = str;
    }

    public static p a(p pVar, List items, String str, int i) {
        if ((i & 1) != 0) {
            items = pVar.f208717a;
        }
        int i2 = pVar.f208718b;
        if ((i & 4) != 0) {
            str = pVar.f208719c;
        }
        pVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        return new p(items, i2, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f208717a, pVar.f208717a) && this.f208718b == pVar.f208718b && Intrinsics.f(this.f208719c, pVar.f208719c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f208718b, this.f208717a.hashCode() * 31, 31);
        String str = this.f208719c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
