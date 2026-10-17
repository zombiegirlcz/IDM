package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f131646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131647c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new i(0)), yhm.j.c(kVar, new i(1)), null};
    }

    public /* synthetic */ l(int i, List list, List list2, boolean z) {
        if (3 != (i & 3)) {
            qlm.j1.f(j.f131626a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131645a = list;
        this.f131646b = list2;
        if ((i & 4) == 0) {
            this.f131647c = false;
        } else {
            this.f131647c = z;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f131645a, lVar.f131645a) && Intrinsics.f(this.f131646b, lVar.f131646b) && this.f131647c == lVar.f131647c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131647c) + p.a.d(this.f131645a.hashCode() * 31, 31, this.f131646b);
    }

    public l(ArrayList intervals, List days, boolean z) {
        Intrinsics.checkNotNullParameter(days, "days");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.f131645a = days;
        this.f131646b = intervals;
        this.f131647c = z;
    }
}
