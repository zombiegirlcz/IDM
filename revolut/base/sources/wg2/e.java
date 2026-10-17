package wg2;

import cli.j;
import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResolveAlias f297221b;

    public e() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f297220a, eVar.f297220a) && Intrinsics.f(this.f297221b, eVar.f297221b);
    }

    public final int hashCode() {
        int iHashCode = this.f297220a.hashCode() * 31;
        ResolveAlias resolveAlias = this.f297221b;
        return iHashCode + (resolveAlias == null ? 0 : resolveAlias.hashCode());
    }

    public e(String currentText, ResolveAlias resolveAlias) {
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        this.f297220a = currentText;
        this.f297221b = resolveAlias;
    }

    public /* synthetic */ e(int i) {
        this("", null);
    }
}
