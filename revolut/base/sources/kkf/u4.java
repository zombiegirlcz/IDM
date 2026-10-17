package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class u4 {

    @NotNull
    public static final t4 Companion = new t4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u4 f184965c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f184966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f184967b;

    static {
        dj0.d.Companion.getClass();
        f184965c = new u4(dj0.d.e, false);
    }

    public u4(dj0.d maxLoanAmount, boolean z) {
        Intrinsics.checkNotNullParameter(maxLoanAmount, "maxLoanAmount");
        this.f184966a = z;
        this.f184967b = maxLoanAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj2;
        return this.f184966a == u4Var.f184966a && Intrinsics.f(this.f184967b, u4Var.f184967b);
    }

    public final int hashCode() {
        return this.f184967b.hashCode() + (Boolean.hashCode(this.f184966a) * 31);
    }
}
