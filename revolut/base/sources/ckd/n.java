package ckd;

import chc.c0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new c0(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24814c;

    public /* synthetic */ n(int i, String str, String str2, Map map) {
        if (3 != (i & 3)) {
            j1.f(l.f24811a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24812a = str;
        this.f24813b = str2;
        if ((i & 4) == 0) {
            this.f24814c = r0.g();
        } else {
            this.f24814c = map;
        }
    }

    public final String a() {
        return this.f24813b;
    }

    public final Map b() {
        return this.f24814c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f24812a, nVar.f24812a) && Intrinsics.f(this.f24813b, nVar.f24813b) && Intrinsics.f(this.f24814c, nVar.f24814c);
    }

    public final int hashCode() {
        return this.f24814c.hashCode() + p.a.c(this.f24812a.hashCode() * 31, 31, this.f24813b);
    }
}
