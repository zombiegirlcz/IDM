package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321369b;

    public /* synthetic */ d0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(b0.f321360a.getDescriptor(), i, 1);
            throw null;
        }
        this.f321368a = str;
        if ((i & 2) == 0) {
            this.f321369b = null;
        } else {
            this.f321369b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f321368a, d0Var.f321368a) && Intrinsics.f(this.f321369b, d0Var.f321369b);
    }

    public final int hashCode() {
        int iHashCode = this.f321368a.hashCode() * 31;
        String str = this.f321369b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public d0(String value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321368a = value;
        this.f321369b = str;
    }
}
