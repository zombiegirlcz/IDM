package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219044b;

    public /* synthetic */ a0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(y.f219142a.getDescriptor(), i, 1);
            throw null;
        }
        this.f219043a = str;
        if ((i & 2) == 0) {
            this.f219044b = null;
        } else {
            this.f219044b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f219043a, a0Var.f219043a) && Intrinsics.f(this.f219044b, a0Var.f219044b);
    }

    public final int hashCode() {
        int iHashCode = this.f219043a.hashCode() * 31;
        String str = this.f219044b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public a0(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f219043a = type;
        this.f219044b = str;
    }
}
