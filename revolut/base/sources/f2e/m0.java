package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131656b;

    public /* synthetic */ m0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(k0.f131640a.getDescriptor(), i, 1);
            throw null;
        }
        this.f131655a = str;
        if ((i & 2) == 0) {
            this.f131656b = null;
        } else {
            this.f131656b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f131655a, m0Var.f131655a) && Intrinsics.f(this.f131656b, m0Var.f131656b);
    }

    public final int hashCode() {
        int iHashCode = this.f131655a.hashCode() * 31;
        String str = this.f131656b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public m0(String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f131655a = id10;
        this.f131656b = str;
    }
}
