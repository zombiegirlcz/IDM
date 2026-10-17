package ro3;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f255860c = {null, yhm.j.c(yhm.k.PUBLICATION, new rm0.k(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255862b;

    public /* synthetic */ n(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(l.f255859a.getDescriptor(), i, 3);
            throw null;
        }
        this.f255861a = str;
        this.f255862b = list;
    }

    public final List a() {
        return this.f255862b;
    }

    public final String b() {
        return this.f255861a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f255861a, nVar.f255861a) && Intrinsics.f(this.f255862b, nVar.f255862b);
    }

    public final int hashCode() {
        return this.f255862b.hashCode() + (this.f255861a.hashCode() * 31);
    }
}
