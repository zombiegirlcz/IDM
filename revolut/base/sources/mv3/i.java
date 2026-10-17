package mv3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f209129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f209130c;
    public final fu3.a d;

    public i() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f209128a, iVar.f209128a) && Intrinsics.f(this.f209129b, iVar.f209129b) && Intrinsics.f(this.f209130c, iVar.f209130c) && this.d == iVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f209128a.hashCode() * 31;
        Long l2 = this.f209129b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f209130c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 961;
        fu3.a aVar = this.d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public i(ArrayList arrayList, Long l2, Long l3, fu3.a aVar, int i) {
        List selectedCredits = arrayList;
        selectedCredits = (i & 1) != 0 ? f0.f322471a : selectedCredits;
        l2 = (i & 2) != 0 ? null : l2;
        l3 = (i & 4) != 0 ? null : l3;
        aVar = (i & 16) != 0 ? null : aVar;
        Intrinsics.checkNotNullParameter(selectedCredits, "selectedCredits");
        this.f209128a = selectedCredits;
        this.f209129b = l2;
        this.f209130c = l3;
        this.d = aVar;
    }
}
