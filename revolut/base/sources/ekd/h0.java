package ekd;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h0 implements p0 {

    @NotNull
    public static final g0 Companion = new g0();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f127003c;
    public final Map d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new egb.m0(28)), yhm.j.c(kVar, new egb.m0(29))};
    }

    public /* synthetic */ h0(int i, String str, String str2, Map map, Map map2) {
        if (1 != (i & 1)) {
            j1.f(f0.f126997a.getDescriptor(), i, 1);
            throw null;
        }
        this.f127001a = str;
        if ((i & 2) == 0) {
            this.f127002b = "";
        } else {
            this.f127002b = str2;
        }
        if ((i & 4) == 0) {
            this.f127003c = r0.g();
        } else {
            this.f127003c = map;
        }
        if ((i & 8) == 0) {
            this.d = r0.g();
        } else {
            this.d = map2;
        }
    }

    @Override // ekd.p0
    public final String a() {
        return this.f127002b;
    }

    @Override // ekd.p0
    public final String b() {
        return this.f127001a;
    }

    public final Map c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f127001a, h0Var.f127001a) && Intrinsics.f(this.f127002b, h0Var.f127002b) && Intrinsics.f(this.f127003c, h0Var.f127003c) && Intrinsics.f(this.d, h0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.c(this.f127001a.hashCode() * 31, 31, this.f127002b), 31, this.f127003c);
    }
}
