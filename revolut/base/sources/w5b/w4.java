package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class w4 {

    @NotNull
    public static final v4 Companion = new v4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295058c;

    public /* synthetic */ w4(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(u4.f295034a.getDescriptor(), i, 7);
            throw null;
        }
        this.f295056a = str;
        this.f295057b = str2;
        this.f295058c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj2;
        return Intrinsics.f(this.f295056a, w4Var.f295056a) && Intrinsics.f(this.f295057b, w4Var.f295057b) && Intrinsics.f(this.f295058c, w4Var.f295058c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f295056a.hashCode() * 31, 31, this.f295057b);
        String str = this.f295058c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public w4(String productId, String tier, String str) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(tier, "tier");
        this.f295056a = productId;
        this.f295057b = tier;
        this.f295058c = str;
    }
}
