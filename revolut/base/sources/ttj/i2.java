package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i2 {

    @NotNull
    public static final h2 Companion = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274353a;

    public /* synthetic */ i2(int i, String str) {
        if (1 == (i & 1)) {
            this.f274353a = str;
        } else {
            qlm.j1.f(g2.f274348a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i2) && Intrinsics.f(this.f274353a, ((i2) obj2).f274353a);
    }

    public final int hashCode() {
        return this.f274353a.hashCode();
    }
}
