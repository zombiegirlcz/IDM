package e4b;

import com.revolut.data.model.Data;
import dfl.v;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f122518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f122519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122520c;
    public final List d;
    public final Data e;

    public e(v trade, Data breakdown, String str, List list, Data data) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f122518a = trade;
        this.f122519b = breakdown;
        this.f122520c = str;
        this.d = list;
        this.e = data;
    }

    public static e a(e eVar, Data data, String str, List list, Data data2, int i) {
        Data breakdown = data;
        v trade = eVar.f122518a;
        if ((i & 2) != 0) {
            breakdown = eVar.f122519b;
        }
        if ((i & 4) != 0) {
            str = eVar.f122520c;
        }
        if ((i & 8) != 0) {
            list = eVar.d;
        }
        if ((i & 16) != 0) {
            data2 = eVar.e;
        }
        Data data3 = data2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        List list2 = list;
        return new e(trade, breakdown, str, list2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f122518a, eVar.f122518a) && Intrinsics.f(this.f122519b, eVar.f122519b) && Intrinsics.f(this.f122520c, eVar.f122520c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f122519b, this.f122518a.hashCode() * 31, 31);
        String str = this.f122520c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Data data = this.e;
        return iHashCode2 + (data != null ? data.hashCode() : 0);
    }
}
