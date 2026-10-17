package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117790a;

    public /* synthetic */ o(int i, String str) {
        if (1 == (i & 1)) {
            this.f117790a = str;
        } else {
            qlm.j1.f(m.f117755a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f117790a, ((o) obj2).f117790a);
    }

    public final int hashCode() {
        return this.f117790a.hashCode();
    }
}
