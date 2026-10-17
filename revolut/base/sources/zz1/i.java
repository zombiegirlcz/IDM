package zz1;

import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegisterAlias$Alias f326495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326496b;

    public /* synthetic */ i(RegisterAlias$Alias registerAlias$Alias) {
        this(registerAlias$Alias, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f326495a, iVar.f326495a) && Intrinsics.f(this.f326496b, iVar.f326496b);
    }

    public final int hashCode() {
        int iHashCode = this.f326495a.hashCode() * 31;
        String str = this.f326496b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public i(RegisterAlias$Alias alias, String str) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f326495a = alias;
        this.f326496b = str;
    }
}
