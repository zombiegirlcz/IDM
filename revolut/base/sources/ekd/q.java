package ekd;

import java.time.Instant;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q implements p0 {

    @NotNull
    public static final p Companion = new p();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f127021c;
    public final Map d;
    public final Map e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new egb.m0(24)), yhm.j.c(kVar, new egb.m0(25))};
    }

    public /* synthetic */ q(int i, String str, String str2, Instant instant, Map map, Map map2) {
        if (5 != (i & 5)) {
            j1.f(o.f127017a.getDescriptor(), i, 5);
            throw null;
        }
        this.f127019a = str;
        if ((i & 2) == 0) {
            this.f127020b = "";
        } else {
            this.f127020b = str2;
        }
        this.f127021c = instant;
        if ((i & 8) == 0) {
            this.d = r0.g();
        } else {
            this.d = map;
        }
        if ((i & 16) == 0) {
            this.e = r0.g();
        } else {
            this.e = map2;
        }
    }

    @Override // ekd.p0
    public final String a() {
        return this.f127020b;
    }

    @Override // ekd.p0
    public final String b() {
        return this.f127019a;
    }

    public final Map c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f127019a, qVar.f127019a) && Intrinsics.f(this.f127020b, qVar.f127020b) && Intrinsics.f(this.f127021c, qVar.f127021c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.e(r6.b.c(p.a.c(this.f127019a.hashCode() * 31, 31, this.f127020b), 31, this.f127021c), 31, this.d);
    }
}
