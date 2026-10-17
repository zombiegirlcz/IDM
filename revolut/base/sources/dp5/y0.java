package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f116826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116828c;
    public final String d;

    public /* synthetic */ y0(int i, String str, String str2, String str3, jo3.a aVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(w0.f116819a.getDescriptor(), i, 15);
            throw null;
        }
        this.f116826a = aVar;
        this.f116827b = str;
        this.f116828c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f116826a, y0Var.f116826a) && Intrinsics.f(this.f116827b, y0Var.f116827b) && Intrinsics.f(this.f116828c, y0Var.f116828c) && Intrinsics.f(this.d, y0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f116826a.hashCode() * 31;
        String str = this.f116827b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f116828c);
    }

    public y0(String str, String cryptoAddressId, String blockchain, jo3.a recipientAmount) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f116826a = recipientAmount;
        this.f116827b = str;
        this.f116828c = cryptoAddressId;
        this.d = blockchain;
    }
}
