package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h6 {

    @NotNull
    public static final g6 Companion = new g6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f153129b;

    public /* synthetic */ h6(int i, dj0.d dVar, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(f6.f153100a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153128a = str;
        this.f153129b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj2;
        return Intrinsics.f(this.f153128a, h6Var.f153128a) && Intrinsics.f(this.f153129b, h6Var.f153129b);
    }

    public final int hashCode() {
        return this.f153129b.hashCode() + (this.f153128a.hashCode() * 31);
    }

    public h6(dj0.d amount, String paymentFrequency) {
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f153128a = paymentFrequency;
        this.f153129b = amount;
    }
}
