package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f2 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f274340b = {yhm.j.c(yhm.k.PUBLICATION, new ts1.h(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f274341a;

    public /* synthetic */ f2(int i, List list) {
        if (1 == (i & 1)) {
            this.f274341a = list;
        } else {
            qlm.j1.f(d2.f274335a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f2) && Intrinsics.f(this.f274341a, ((f2) obj2).f274341a);
    }

    public final int hashCode() {
        return this.f274341a.hashCode();
    }
}
