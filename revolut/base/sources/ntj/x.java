package ntj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f219139c = {null, yhm.j.c(yhm.k.PUBLICATION, new ns1.a(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f219140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f219141b;

    public x(int i, List list, boolean z) {
        if (1 != (i & 1)) {
            qlm.j1.f(v.f219135a.getDescriptor(), i, 1);
            throw null;
        }
        this.f219140a = z;
        if ((i & 2) == 0) {
            this.f219141b = zhm.f0.f322471a;
        } else {
            this.f219141b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f219140a == xVar.f219140a && Intrinsics.f(this.f219141b, xVar.f219141b);
    }

    public final int hashCode() {
        return this.f219141b.hashCode() + (Boolean.hashCode(this.f219140a) * 31);
    }

    public x(ArrayList challenges, boolean z) {
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f219140a = z;
        this.f219141b = challenges;
    }
}
