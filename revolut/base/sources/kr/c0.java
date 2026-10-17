package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f188464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f188466c;

    public /* synthetic */ c0(int i, b1 b1Var, String str, Integer num) {
        if (1 != (i & 1)) {
            qlm.j1.f(a0.f188457a.getDescriptor(), i, 1);
            throw null;
        }
        this.f188464a = b1Var;
        if ((i & 2) == 0) {
            this.f188465b = null;
        } else {
            this.f188465b = str;
        }
        if ((i & 4) == 0) {
            this.f188466c = null;
        } else {
            this.f188466c = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f188464a, c0Var.f188464a) && Intrinsics.f(this.f188465b, c0Var.f188465b) && Intrinsics.f(this.f188466c, c0Var.f188466c);
    }

    public final int hashCode() {
        int iHashCode = this.f188464a.hashCode() * 31;
        String str = this.f188465b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f188466c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public c0(b1 modelsInfo, String str, Integer num) {
        Intrinsics.checkNotNullParameter(modelsInfo, "modelsInfo");
        this.f188464a = modelsInfo;
        this.f188465b = str;
        this.f188466c = num;
    }
}
