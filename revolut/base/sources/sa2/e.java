package sa2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f261271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261272b;

    public e(Alias alias, String str) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f261271a = alias;
        this.f261272b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f261271a, eVar.f261271a) && Intrinsics.f(this.f261272b, eVar.f261272b);
    }

    public final int hashCode() {
        int iHashCode = this.f261271a.hashCode() * 31;
        String str = this.f261272b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
