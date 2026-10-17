package ij4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f161705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161706c;
    public final Integer d;

    public i(List items, List tabs, String str, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f161704a = items;
        this.f161705b = tabs;
        this.f161706c = str;
        this.d = num;
    }

    @Override // cli.p
    public final List c() {
        return this.f161704a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f161704a, iVar.f161704a) && Intrinsics.f(this.f161705b, iVar.f161705b) && Intrinsics.f(this.f161706c, iVar.f161706c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f161704a.hashCode() * 31, 31, this.f161705b);
        String str = this.f161706c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public i(List list) {
        this(list, f0.f322471a, null, null);
    }
}
