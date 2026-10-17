package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u5 {

    @NotNull
    public static final t5 Companion = new t5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295036b;

    public /* synthetic */ u5(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(s5.f295009a.getDescriptor(), i, 1);
            throw null;
        }
        this.f295035a = str;
        if ((i & 2) == 0) {
            this.f295036b = null;
        } else {
            this.f295036b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj2;
        return Intrinsics.f(this.f295035a, u5Var.f295035a) && Intrinsics.f(this.f295036b, u5Var.f295036b);
    }

    public final int hashCode() {
        int iHashCode = this.f295035a.hashCode() * 31;
        String str = this.f295036b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public u5(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295035a = title;
        this.f295036b = str;
    }
}
