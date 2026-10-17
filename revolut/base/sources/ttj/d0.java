package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new ts1.h(9)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f274329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274331c;

    public d0(int i, String str, List list, boolean z) {
        if (1 != (i & 1)) {
            qlm.j1.f(b0.f274322a.getDescriptor(), i, 1);
            throw null;
        }
        this.f274329a = z;
        this.f274330b = (i & 2) == 0 ? zhm.f0.f322471a : list;
        if ((i & 4) == 0) {
            this.f274331c = null;
        } else {
            this.f274331c = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f274329a == d0Var.f274329a && Intrinsics.f(this.f274330b, d0Var.f274330b) && Intrinsics.f(this.f274331c, d0Var.f274331c);
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.f274329a) * 31, 31, this.f274330b);
        String str = this.f274331c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
