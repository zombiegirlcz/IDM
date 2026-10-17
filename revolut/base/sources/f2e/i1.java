package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131621a;

    public /* synthetic */ i1(int i, String str) {
        if (1 == (i & 1)) {
            this.f131621a = str;
        } else {
            qlm.j1.f(g1.f131598a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i1) && Intrinsics.f(this.f131621a, ((i1) obj2).f131621a);
    }

    public final int hashCode() {
        return this.f131621a.hashCode();
    }

    public i1(String brandId) {
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        this.f131621a = brandId;
    }
}
