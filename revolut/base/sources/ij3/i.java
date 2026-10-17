package ij3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161681b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(g.f161679a.getDescriptor(), i, 1);
            throw null;
        }
        this.f161680a = str;
        if ((i & 2) == 0) {
            this.f161681b = null;
        } else {
            this.f161681b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f161680a, iVar.f161680a) && Intrinsics.f(this.f161681b, iVar.f161681b);
    }

    public final int hashCode() {
        int iHashCode = this.f161680a.hashCode() * 31;
        String str = this.f161681b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public i(String label, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f161680a = label;
        this.f161681b = str;
    }
}
