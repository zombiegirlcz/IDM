package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d1 {

    @NotNull
    public static final c1 Companion = new c1();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new z(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304317c;
    public final List d;

    public /* synthetic */ d1(int i, String str, String str2, String str3, List list) {
        if (7 != (i & 7)) {
            j1.f(b1.f304306a.getDescriptor(), i, 7);
            throw null;
        }
        this.f304315a = str;
        this.f304316b = str2;
        this.f304317c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f304315a, d1Var.f304315a) && Intrinsics.f(this.f304316b, d1Var.f304316b) && Intrinsics.f(this.f304317c, d1Var.f304317c) && Intrinsics.f(this.d, d1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f304315a.hashCode() * 31, 31, this.f304316b);
        String str = this.f304317c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
