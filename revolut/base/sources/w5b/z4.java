package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class z4 {

    @NotNull
    public static final y4 Companion = new y4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295092a;

    public /* synthetic */ z4(int i, String str) {
        if (1 == (i & 1)) {
            this.f295092a = str;
        } else {
            qlm.j1.f(x4.f295069a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z4) && Intrinsics.f(this.f295092a, ((z4) obj2).f295092a);
    }

    public final int hashCode() {
        return this.f295092a.hashCode();
    }

    public z4(String productArticleId) {
        Intrinsics.checkNotNullParameter(productArticleId, "productArticleId");
        this.f295092a = productArticleId;
    }
}
