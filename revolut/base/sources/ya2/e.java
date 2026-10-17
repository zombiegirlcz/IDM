package ya2;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResolveAlias f311908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f311909c;

    public e() {
        this(null, 7);
    }

    public static e a(e eVar, String inputValue, ResolveAlias resolveAlias, boolean z, int i) {
        if ((i & 1) != 0) {
            inputValue = eVar.f311907a;
        }
        if ((i & 2) != 0) {
            resolveAlias = eVar.f311908b;
        }
        if ((i & 4) != 0) {
            z = eVar.f311909c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        return new e(inputValue, resolveAlias, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f311907a, eVar.f311907a) && Intrinsics.f(this.f311908b, eVar.f311908b) && this.f311909c == eVar.f311909c;
    }

    public final int hashCode() {
        int iHashCode = this.f311907a.hashCode() * 31;
        ResolveAlias resolveAlias = this.f311908b;
        return Boolean.hashCode(this.f311909c) + ((iHashCode + (resolveAlias == null ? 0 : resolveAlias.hashCode())) * 31);
    }

    public e(String inputValue, ResolveAlias resolveAlias, boolean z) {
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        this.f311907a = inputValue;
        this.f311908b = resolveAlias;
        this.f311909c = z;
    }

    public /* synthetic */ e(String str, int i) {
        this((i & 1) != 0 ? "" : str, null, false);
    }
}
