package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c5 {

    @NotNull
    public static final b5 Companion = new b5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294798b;

    public /* synthetic */ c5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a5.f294777a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294797a = str;
        this.f294798b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj2;
        return Intrinsics.f(this.f294797a, c5Var.f294797a) && Intrinsics.f(this.f294798b, c5Var.f294798b);
    }

    public final int hashCode() {
        return this.f294798b.hashCode() + (this.f294797a.hashCode() * 31);
    }

    public c5(String code, String rewardId) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        this.f294797a = code;
        this.f294798b = rewardId;
    }
}
