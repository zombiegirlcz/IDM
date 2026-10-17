package fkd;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135799c;
    public final Map d;
    public final Map e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new fk8.a(14)), yhm.j.c(kVar, new fk8.a(15))};
    }

    public /* synthetic */ v0(int i, String str, String str2, String str3, Map map, Map map2) {
        if (2 != (i & 2)) {
            j1.f(t0.f135795a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f135797a = "";
        } else {
            this.f135797a = str;
        }
        this.f135798b = str2;
        if ((i & 4) == 0) {
            this.f135799c = "";
        } else {
            this.f135799c = str3;
        }
        if ((i & 8) == 0) {
            this.d = zhm.r0.g();
        } else {
            this.d = map;
        }
        if ((i & 16) == 0) {
            this.e = zhm.r0.g();
        } else {
            this.e = map2;
        }
    }

    public final String a() {
        return this.f135798b;
    }

    public final Map b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f135797a, v0Var.f135797a) && Intrinsics.f(this.f135798b, v0Var.f135798b) && Intrinsics.f(this.f135799c, v0Var.f135799c) && Intrinsics.f(this.d, v0Var.d) && Intrinsics.f(this.e, v0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.e(p.a.c(p.a.c(this.f135797a.hashCode() * 31, 31, this.f135798b), 31, this.f135799c), 31, this.d);
    }
}
