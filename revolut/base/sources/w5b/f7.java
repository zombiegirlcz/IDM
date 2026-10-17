package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class f7 {

    @NotNull
    public static final e7 Companion = new e7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f294838b;

    public /* synthetic */ f7(int i, String str, i7 i7Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(d7.f294817a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294837a = str;
        this.f294838b = i7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj2;
        return Intrinsics.f(this.f294837a, f7Var.f294837a) && Intrinsics.f(this.f294838b, f7Var.f294838b);
    }

    public final int hashCode() {
        return this.f294838b.hashCode() + (this.f294837a.hashCode() * 31);
    }

    public f7(String title, i7 item) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f294837a = title;
        this.f294838b = item;
    }
}
