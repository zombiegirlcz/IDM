package znd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f323746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323747b;

    public e(String str, ArrayList chartSwitcherItems) {
        Intrinsics.checkNotNullParameter(chartSwitcherItems, "chartSwitcherItems");
        this.f323746a = chartSwitcherItems;
        this.f323747b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f323746a.equals(eVar.f323746a) && Intrinsics.f(this.f323747b, eVar.f323747b);
    }

    public final int hashCode() {
        int iHashCode = this.f323746a.hashCode() * 31;
        String str = this.f323747b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
