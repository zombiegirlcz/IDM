package zrd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324689b;

    public e(List chartSwitcherItems, String str) {
        Intrinsics.checkNotNullParameter(chartSwitcherItems, "chartSwitcherItems");
        this.f324688a = chartSwitcherItems;
        this.f324689b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f324688a, eVar.f324688a) && Intrinsics.f(this.f324689b, eVar.f324689b);
    }

    public final int hashCode() {
        int iHashCode = this.f324688a.hashCode() * 31;
        String str = this.f324689b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
