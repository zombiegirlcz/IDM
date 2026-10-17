package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class y5 {

    @NotNull
    public static final x5 Companion = new x5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124715a;

    public /* synthetic */ y5(int i, String str) {
        if (1 == (i & 1)) {
            this.f124715a = str;
        } else {
            qlm.j1.f(w5.f124701a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y5) && Intrinsics.f(this.f124715a, ((y5) obj2).f124715a);
    }

    public final int hashCode() {
        String str = this.f124715a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public y5(String str) {
        this.f124715a = str;
    }
}
