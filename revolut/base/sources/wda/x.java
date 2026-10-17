package wda;

import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f296505b = {yhm.j.c(yhm.k.PUBLICATION, new wal.f(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f296506a;

    public /* synthetic */ x(int i, Set set) {
        if (1 == (i & 1)) {
            this.f296506a = set;
        } else {
            j1.f(v.f296504a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f296506a, ((x) obj2).f296506a);
    }

    public final int hashCode() {
        return this.f296506a.hashCode();
    }

    public x(Set ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f296506a = ids;
    }
}
