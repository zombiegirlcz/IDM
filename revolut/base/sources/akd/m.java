package akd;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5796c;
    public final Map d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new aj0.o(20)), yhm.j.c(kVar, new aj0.o(21))};
    }

    public /* synthetic */ m(int i, String str, String str2, Map map, Map map2) {
        if (2 != (i & 2)) {
            j1.f(k.f5793a.getDescriptor(), i, 2);
            throw null;
        }
        this.f5794a = (i & 1) == 0 ? "" : str;
        this.f5795b = str2;
        if ((i & 4) == 0) {
            this.f5796c = r0.g();
        } else {
            this.f5796c = map;
        }
        if ((i & 8) == 0) {
            this.d = r0.g();
        } else {
            this.d = map2;
        }
    }

    public final String a() {
        return this.f5795b;
    }

    public final Map b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f5794a, mVar.f5794a) && Intrinsics.f(this.f5795b, mVar.f5795b) && Intrinsics.f(this.f5796c, mVar.f5796c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.c(this.f5794a.hashCode() * 31, 31, this.f5795b), 31, this.f5796c);
    }
}
