package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f229632b;

    public /* synthetic */ e1(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(c1.f229621a.getDescriptor(), i, 3);
            throw null;
        }
        this.f229631a = str;
        this.f229632b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f229631a, e1Var.f229631a) && Intrinsics.f(this.f229632b, e1Var.f229632b);
    }

    public final int hashCode() {
        String str = this.f229631a;
        return this.f229632b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public e1(jo3.a refundAmount, String str) {
        Intrinsics.checkNotNullParameter(refundAmount, "refundAmount");
        this.f229631a = str;
        this.f229632b = refundAmount;
    }
}
