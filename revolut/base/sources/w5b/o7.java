package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class o7 {

    @NotNull
    public static final n7 Companion = new n7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7 f294969b;

    public /* synthetic */ o7(int i, String str, r7 r7Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(m7.f294930a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294968a = str;
        this.f294969b = r7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o7)) {
            return false;
        }
        o7 o7Var = (o7) obj2;
        return Intrinsics.f(this.f294968a, o7Var.f294968a) && Intrinsics.f(this.f294969b, o7Var.f294969b);
    }

    public final int hashCode() {
        return this.f294969b.hashCode() + (this.f294968a.hashCode() * 31);
    }

    public o7(String title, r7 item) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f294968a = title;
        this.f294969b = item;
    }
}
