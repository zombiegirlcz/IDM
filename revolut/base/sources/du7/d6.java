package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d6 {

    @NotNull
    public static final c6 Companion = new c6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117646a;

    public /* synthetic */ d6(int i, String str) {
        if (1 == (i & 1)) {
            this.f117646a = str;
        } else {
            qlm.j1.f(b6.f117613a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d6) && Intrinsics.f(this.f117646a, ((d6) obj2).f117646a);
    }

    public final int hashCode() {
        return this.f117646a.hashCode();
    }
}
