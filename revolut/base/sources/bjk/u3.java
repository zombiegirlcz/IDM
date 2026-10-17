package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u3 {

    @NotNull
    public static final t3 Companion = new t3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16086a;

    public u3() {
        Intrinsics.checkNotNullParameter("PLAN_HUB_OFFER", "type");
        this.f16086a = "PLAN_HUB_OFFER";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u3) && Intrinsics.f(this.f16086a, ((u3) obj2).f16086a);
    }

    public final int hashCode() {
        return this.f16086a.hashCode();
    }

    public /* synthetic */ u3(int i, String str) {
        if (1 == (i & 1)) {
            this.f16086a = str;
        } else {
            qlm.j1.f(s3.f16070a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
