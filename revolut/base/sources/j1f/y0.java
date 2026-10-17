package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170448a;

    public /* synthetic */ y0(int i, String str) {
        if (1 == (i & 1)) {
            this.f170448a = str;
        } else {
            j1.f(w0.f170440a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && Intrinsics.f(this.f170448a, ((y0) obj2).f170448a);
    }

    public final int hashCode() {
        return this.f170448a.hashCode();
    }

    public y0(String partnerPointsBuyRate) {
        Intrinsics.checkNotNullParameter(partnerPointsBuyRate, "partnerPointsBuyRate");
        this.f170448a = partnerPointsBuyRate;
    }
}
