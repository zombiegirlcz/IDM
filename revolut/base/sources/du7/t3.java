package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t3 extends k3 {

    @NotNull
    public static final s3 Companion = new s3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f117852b = {yhm.j.c(yhm.k.PUBLICATION, new e2(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f117853a;

    public t3(int i, List list) {
        if (1 == (i & 1)) {
            this.f117853a = list;
        } else {
            qlm.j1.f(r3.f117828a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t3) && Intrinsics.f(this.f117853a, ((t3) obj2).f117853a);
    }

    public final int hashCode() {
        return this.f117853a.hashCode();
    }
}
