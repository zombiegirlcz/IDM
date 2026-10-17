package r8e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f252408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f252409b;

    public h(Data groupSubaccount, Data adminInfo) {
        Intrinsics.checkNotNullParameter(groupSubaccount, "groupSubaccount");
        Intrinsics.checkNotNullParameter(adminInfo, "adminInfo");
        this.f252408a = groupSubaccount;
        this.f252409b = adminInfo;
    }

    public static h a(h hVar, Data groupSubaccount, Data adminInfo, int i) {
        if ((i & 1) != 0) {
            groupSubaccount = hVar.f252408a;
        }
        if ((i & 2) != 0) {
            adminInfo = hVar.f252409b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(groupSubaccount, "groupSubaccount");
        Intrinsics.checkNotNullParameter(adminInfo, "adminInfo");
        return new h(groupSubaccount, adminInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f252408a, hVar.f252408a) && Intrinsics.f(this.f252409b, hVar.f252409b);
    }

    public final int hashCode() {
        return this.f252409b.hashCode() + (this.f252408a.hashCode() * 31);
    }
}
