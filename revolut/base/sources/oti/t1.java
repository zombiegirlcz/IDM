package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229690c;
    public final int d;

    public /* synthetic */ t1(String str, int i, int i2, String str2, String str3) {
        if (15 != (i & 15)) {
            qlm.j1.f(r1.f229684a.getDescriptor(), i, 15);
            throw null;
        }
        this.f229688a = str;
        this.f229689b = str2;
        this.f229690c = str3;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f229688a, t1Var.f229688a) && Intrinsics.f(this.f229689b, t1Var.f229689b) && Intrinsics.f(this.f229690c, t1Var.f229690c) && this.d == t1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.c(p.a.c(this.f229688a.hashCode() * 31, 31, this.f229689b), 31, this.f229690c);
    }

    public t1(String terminalId, String date, String time, int i) {
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.f229688a = terminalId;
        this.f229689b = date;
        this.f229690c = time;
        this.d = i;
    }
}
