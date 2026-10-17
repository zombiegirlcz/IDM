package tna;

import com.revolut.core.ui_kit.recycler.ScrollOffsetData;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f272343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f272345c;
    public final ScrollOffsetData d;

    public k(Data themeInfo, boolean z, Boolean bool, ScrollOffsetData scrollOffsetData) {
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        this.f272343a = themeInfo;
        this.f272344b = z;
        this.f272345c = bool;
        this.d = scrollOffsetData;
    }

    public static k a(k kVar, Data themeInfo, Boolean bool, ScrollOffsetData scrollOffsetData, int i) {
        if ((i & 1) != 0) {
            themeInfo = kVar.f272343a;
        }
        boolean z = kVar.f272344b;
        if ((i & 4) != 0) {
            bool = kVar.f272345c;
        }
        if ((i & 8) != 0) {
            scrollOffsetData = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        return new k(themeInfo, z, bool, scrollOffsetData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f272343a, kVar.f272343a) && this.f272344b == kVar.f272344b && Intrinsics.f(this.f272345c, kVar.f272345c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f272343a.hashCode() * 31, 31, this.f272344b);
        Boolean bool = this.f272345c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        ScrollOffsetData scrollOffsetData = this.d;
        return iHashCode + (scrollOffsetData != null ? scrollOffsetData.hashCode() : 0);
    }
}
