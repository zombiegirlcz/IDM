package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l7 {

    @NotNull
    public static final k7 Companion = new k7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294916b;

    public /* synthetic */ l7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(j7.f294893a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294915a = str;
        this.f294916b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj2;
        return Intrinsics.f(this.f294915a, l7Var.f294915a) && Intrinsics.f(this.f294916b, l7Var.f294916b);
    }

    public final int hashCode() {
        return this.f294916b.hashCode() + (this.f294915a.hashCode() * 31);
    }

    public l7(String tier, String id10) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f294915a = tier;
        this.f294916b = id10;
    }
}
