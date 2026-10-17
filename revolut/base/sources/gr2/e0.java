package gr2;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145829c;
    public final List d;
    public final List e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new gla.k(27)), yhm.j.c(kVar, new gla.k(28))};
    }

    public /* synthetic */ e0(int i, String str, String str2, String str3, List list, List list2) {
        if (10 != (i & 10)) {
            j1.f(c0.f145821a.getDescriptor(), i, 10);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f145827a = null;
        } else {
            this.f145827a = str;
        }
        this.f145828b = str2;
        if ((i & 4) == 0) {
            this.f145829c = null;
        } else {
            this.f145829c = str3;
        }
        this.d = list;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f145827a, e0Var.f145827a) && Intrinsics.f(this.f145828b, e0Var.f145828b) && Intrinsics.f(this.f145829c, e0Var.f145829c) && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e);
    }

    public final int hashCode() {
        String str = this.f145827a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f145828b);
        String str2 = this.f145829c;
        int iD = p.a.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        List list = this.e;
        return iD + (list != null ? list.hashCode() : 0);
    }
}
