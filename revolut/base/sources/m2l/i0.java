package m2l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final e0 Companion = new e0();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f202209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f202210c;
    public final o d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new m05.d(26)), yhm.j.c(kVar, new m05.d(27)), null};
    }

    public /* synthetic */ i0(int i, String str, List list, List list2, o oVar) {
        if (15 != (i & 15)) {
            j1.f(d0.f202192a.getDescriptor(), i, 15);
            throw null;
        }
        this.f202208a = str;
        this.f202209b = list;
        this.f202210c = list2;
        this.d = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f202208a, i0Var.f202208a) && Intrinsics.f(this.f202209b, i0Var.f202209b) && Intrinsics.f(this.f202210c, i0Var.f202210c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f202208a.hashCode() * 31, 31, this.f202209b), 31, this.f202210c);
    }

    public i0(String value, ArrayList movingAverages, ArrayList oscillators, o description) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(movingAverages, "movingAverages");
        Intrinsics.checkNotNullParameter(oscillators, "oscillators");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f202208a = value;
        this.f202209b = movingAverages;
        this.f202210c = oscillators;
        this.d = description;
    }
}
