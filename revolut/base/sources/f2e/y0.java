package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131772b;

    public /* synthetic */ y0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(w0.f131737a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131771a = str;
        this.f131772b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f131771a, y0Var.f131771a) && Intrinsics.f(this.f131772b, y0Var.f131772b);
    }

    public final int hashCode() {
        return this.f131772b.hashCode() + (this.f131771a.hashCode() * 31);
    }

    public y0(String deeplink, String analyticsRef) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.f131771a = deeplink;
        this.f131772b = analyticsRef;
    }
}
