package ekd;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f127000c;
    public final Map d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new egb.m0(22)), yhm.j.c(kVar, new egb.m0(23))};
    }

    public /* synthetic */ h(int i, String str, String str2, Map map, Map map2) {
        if (1 != (i & 1)) {
            j1.f(f.f126996a.getDescriptor(), i, 1);
            throw null;
        }
        this.f126998a = str;
        if ((i & 2) == 0) {
            this.f126999b = "";
        } else {
            this.f126999b = str2;
        }
        if ((i & 4) == 0) {
            this.f127000c = r0.g();
        } else {
            this.f127000c = map;
        }
        if ((i & 8) == 0) {
            this.d = r0.g();
        } else {
            this.d = map2;
        }
    }

    public final String a() {
        return this.f126998a;
    }

    public final Map b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f126998a, hVar.f126998a) && Intrinsics.f(this.f126999b, hVar.f126999b) && Intrinsics.f(this.f127000c, hVar.f127000c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(p.a.c(this.f126998a.hashCode() * 31, 31, this.f126999b), 31, this.f127000c);
    }
}
