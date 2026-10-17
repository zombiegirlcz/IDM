package l8e;

import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f192961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f192962c;

    public d(String vaultId, Data invitationData, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(invitationData, "invitationData");
        this.f192960a = vaultId;
        this.f192961b = invitationData;
        this.f192962c = naviCommand;
    }

    public static d a(d dVar, Data invitationData, NaviCommand naviCommand, int i) {
        String vaultId = dVar.f192960a;
        if ((i & 2) != 0) {
            invitationData = dVar.f192961b;
        }
        if ((i & 4) != 0) {
            naviCommand = dVar.f192962c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        Intrinsics.checkNotNullParameter(invitationData, "invitationData");
        return new d(vaultId, invitationData, naviCommand);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f192960a, dVar.f192960a) && Intrinsics.f(this.f192961b, dVar.f192961b) && Intrinsics.f(this.f192962c, dVar.f192962c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f192961b, this.f192960a.hashCode() * 31, 31);
        NaviCommand naviCommand = this.f192962c;
        return iC + (naviCommand == null ? 0 : naviCommand.hashCode());
    }
}
