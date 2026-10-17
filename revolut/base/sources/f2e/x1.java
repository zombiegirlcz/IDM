package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131762a;

    public /* synthetic */ x1(int i, String str) {
        if (1 == (i & 1)) {
            this.f131762a = str;
        } else {
            qlm.j1.f(v1.f131735a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x1) && Intrinsics.f(this.f131762a, ((x1) obj2).f131762a);
    }

    public final int hashCode() {
        return this.f131762a.hashCode();
    }

    public x1(String voucherGroupId) {
        Intrinsics.checkNotNullParameter(voucherGroupId, "voucherGroupId");
        this.f131762a = voucherGroupId;
    }
}
