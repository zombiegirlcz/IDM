package jrk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new jp9.l(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f178047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f178048c;
    public final List d;

    public /* synthetic */ d0(int i, int i2, Integer num, String str, List list) {
        if (11 != (i & 11)) {
            j1.f(b0.f178041a.getDescriptor(), i, 11);
            throw null;
        }
        this.f178046a = str;
        this.f178047b = i2;
        if ((i & 4) == 0) {
            this.f178048c = null;
        } else {
            this.f178048c = num;
        }
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f178046a, d0Var.f178046a) && this.f178047b == d0Var.f178047b && Intrinsics.f(this.f178048c, d0Var.f178048c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f178047b, this.f178046a.hashCode() * 31, 31);
        Integer num = this.f178048c;
        return this.d.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31);
    }
}
