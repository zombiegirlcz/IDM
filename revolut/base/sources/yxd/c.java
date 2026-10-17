package yxd;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f317662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f317663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f317664c;
    public final boolean d;

    public c(Set enabledSettings, Map availableOptions, Map selections, boolean z) {
        Intrinsics.checkNotNullParameter(enabledSettings, "enabledSettings");
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        Intrinsics.checkNotNullParameter(selections, "selections");
        this.f317662a = enabledSettings;
        this.f317663b = availableOptions;
        this.f317664c = selections;
        this.d = z;
    }

    public static c a(c cVar, Map availableOptions, Map selections, boolean z, int i) {
        Set enabledSettings = cVar.f317662a;
        if ((i & 2) != 0) {
            availableOptions = cVar.f317663b;
        }
        if ((i & 4) != 0) {
            selections = cVar.f317664c;
        }
        if ((i & 8) != 0) {
            z = cVar.d;
        }
        Intrinsics.checkNotNullParameter(enabledSettings, "enabledSettings");
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new c(enabledSettings, availableOptions, selections, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f317662a, cVar.f317662a) && Intrinsics.f(this.f317663b, cVar.f317663b) && Intrinsics.f(this.f317664c, cVar.f317664c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.e(p.a.e(this.f317662a.hashCode() * 31, 31, this.f317663b), 31, this.f317664c);
    }
}
