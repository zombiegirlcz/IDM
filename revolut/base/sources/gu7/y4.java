package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y4 {

    @NotNull
    public static final r4 Companion = new r4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4 f146871c;

    public /* synthetic */ y4(int i, String str, String str2, w4 w4Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(q4.f146816a.getDescriptor(), i, 7);
            throw null;
        }
        this.f146869a = str;
        this.f146870b = str2;
        this.f146871c = w4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj2;
        return Intrinsics.f(this.f146869a, y4Var.f146869a) && Intrinsics.f(this.f146870b, y4Var.f146870b) && Intrinsics.f(this.f146871c, y4Var.f146871c);
    }

    public final int hashCode() {
        return this.f146871c.hashCode() + p.a.c(this.f146869a.hashCode() * 31, 31, this.f146870b);
    }
}
