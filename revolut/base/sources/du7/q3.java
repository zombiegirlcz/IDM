package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q3 extends k3 {

    @NotNull
    public static final p3 Companion = new p3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117820a;

    public q3(int i, String str) {
        if (1 == (i & 1)) {
            this.f117820a = str;
        } else {
            qlm.j1.f(o3.f117794a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q3) && Intrinsics.f(this.f117820a, ((q3) obj2).f117820a);
    }

    public final int hashCode() {
        return this.f117820a.hashCode();
    }
}
