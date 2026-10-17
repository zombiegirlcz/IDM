package cmc;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f25209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q06.b f25210b;

    public i(NaviCommand command) {
        q06.b bVar = new q06.b(ibb.c.f160141b, null);
        Intrinsics.checkNotNullParameter(command, "command");
        this.f25209a = command;
        this.f25210b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f25209a, iVar.f25209a) && Intrinsics.f(this.f25210b, iVar.f25210b);
    }

    public final int hashCode() {
        int iHashCode = this.f25209a.hashCode() * 31;
        q06.b bVar = this.f25210b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
