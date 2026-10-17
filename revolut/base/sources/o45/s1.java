package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class s1 extends f1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222104b;

    public /* synthetic */ s1(int i, String str) {
        if (1 == (i & 1)) {
            this.f222104b = str;
        } else {
            qlm.j1.f(q1.f222095a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s1) && Intrinsics.f(this.f222104b, ((s1) obj2).f222104b);
    }

    public final int hashCode() {
        return this.f222104b.hashCode();
    }

    public s1(String repaidDate) {
        Intrinsics.checkNotNullParameter(repaidDate, "repaidDate");
        this.f222104b = repaidDate;
    }
}
