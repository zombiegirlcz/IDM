package htj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f155441c = {null, yhm.j.c(yhm.k.PUBLICATION, new ht1.e(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f155442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155443b;

    public /* synthetic */ u(long j2, int i, List list) {
        if (3 != (i & 3)) {
            j1.f(s.f155440a.getDescriptor(), i, 3);
            throw null;
        }
        this.f155442a = j2;
        this.f155443b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f155442a == uVar.f155442a && Intrinsics.f(this.f155443b, uVar.f155443b);
    }

    public final int hashCode() {
        return this.f155443b.hashCode() + (Long.hashCode(this.f155442a) * 31);
    }
}
