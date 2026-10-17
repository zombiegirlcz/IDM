package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u5 {

    @NotNull
    public static final t5 Companion = new t5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f117866c = {null, yhm.j.c(yhm.k.PUBLICATION, new e2(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117868b;

    public /* synthetic */ u5(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(s5.f117840a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117867a = str;
        this.f117868b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj2;
        return Intrinsics.f(this.f117867a, u5Var.f117867a) && Intrinsics.f(this.f117868b, u5Var.f117868b);
    }

    public final int hashCode() {
        return this.f117868b.hashCode() + (this.f117867a.hashCode() * 31);
    }
}
