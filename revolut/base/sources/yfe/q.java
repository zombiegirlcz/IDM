package yfe;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class q extends h.a {

    @NotNull
    public static final p Companion = new p();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new yfd.c(16))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f313294c;
    public final int d;
    public final List e;

    public q(int i, dj0.d dVar, int i2, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(o.f313287a.getDescriptor(), i, 3);
            throw null;
        }
        this.f313294c = dVar;
        this.d = i2;
        if ((i & 4) == 0) {
            this.e = zhm.f0.f322471a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f313294c, qVar.f313294c) && this.d == qVar.d && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, this.f313294c.hashCode() * 31, 31);
    }

    public q(dj0.d money, int i, ArrayList icons) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.f313294c = money;
        this.d = i;
        this.e = icons;
    }
}
