package krk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kr.h2;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new h2(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f188886c;

    public e(ArrayList series, int i, int i2) {
        Intrinsics.checkNotNullParameter(series, "series");
        this.f188884a = i;
        this.f188885b = i2;
        this.f188886c = series;
        if (series.size() > 4) {
            throw new IllegalArgumentException(a0.d.n("Up to 4 series are supported; requested: ", series.size()));
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f188884a == eVar.f188884a && this.f188885b == eVar.f188885b && Intrinsics.f(this.f188886c, eVar.f188886c);
    }

    public final int hashCode() {
        return this.f188886c.hashCode() + j6.a.b(this.f188885b, Integer.hashCode(this.f188884a) * 31, 31);
    }

    public /* synthetic */ e(List list, int i, int i2, int i3) {
        if (7 == (i & 7)) {
            this.f188884a = i2;
            this.f188885b = i3;
            this.f188886c = list;
            if (list.size() > 4) {
                throw new IllegalArgumentException(a0.d.n("Up to 4 series are supported; requested: ", list.size()));
            }
            return;
        }
        j1.f(c.f188883a.getDescriptor(), i, 7);
        throw null;
    }
}
