package ruk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f257606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f257608c;

    public l(k selectedTab, List tabs, List list) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f257606a = selectedTab;
        this.f257607b = tabs;
        this.f257608c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f257606a, lVar.f257606a) && Intrinsics.f(this.f257607b, lVar.f257607b) && Intrinsics.f(this.f257608c, lVar.f257608c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f257606a.hashCode() * 31, 31, this.f257607b);
        List list = this.f257608c;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
