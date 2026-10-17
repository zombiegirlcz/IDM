package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l5 {

    @NotNull
    public static final k5 Companion = new k5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117753a;

    public /* synthetic */ l5(int i, String str) {
        if (1 == (i & 1)) {
            this.f117753a = str;
        } else {
            qlm.j1.f(j5.f117726a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l5) && Intrinsics.f(this.f117753a, ((l5) obj2).f117753a);
    }

    public final int hashCode() {
        String str = this.f117753a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
