package sm9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f264393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264394b;

    public e(List pagerItems, String str) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f264393a = pagerItems;
        this.f264394b = str;
    }

    public static e a(e eVar, ArrayList arrayList, String str, int i) {
        List pagerItems = arrayList;
        if ((i & 1) != 0) {
            pagerItems = eVar.f264393a;
        }
        if ((i & 2) != 0) {
            str = eVar.f264394b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new e(pagerItems, str);
    }

    @Override // oki.a
    public final List W() {
        return this.f264393a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f264393a, eVar.f264393a) && Intrinsics.f(this.f264394b, eVar.f264394b);
    }

    public final int hashCode() {
        int iHashCode = this.f264393a.hashCode() * 31;
        String str = this.f264394b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // oki.a
    public final String z() {
        return this.f264394b;
    }
}
