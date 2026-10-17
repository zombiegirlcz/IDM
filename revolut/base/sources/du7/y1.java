package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y1 {

    @NotNull
    public static final x1 Companion = new x1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117912a;

    public /* synthetic */ y1(int i, String str) {
        if (1 == (i & 1)) {
            this.f117912a = str;
        } else {
            qlm.j1.f(w1.f117889a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y1) && Intrinsics.f(this.f117912a, ((y1) obj2).f117912a);
    }

    public final int hashCode() {
        return this.f117912a.hashCode();
    }
}
