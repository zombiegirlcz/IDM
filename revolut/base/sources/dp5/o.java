package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116789c;
    public final String d;

    public /* synthetic */ o(int i, long j2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            qlm.j1.f(m.f116779a.getDescriptor(), i, 15);
            throw null;
        }
        this.f116787a = str;
        this.f116788b = j2;
        this.f116789c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f116787a, oVar.f116787a) && this.f116788b == oVar.f116788b && Intrinsics.f(this.f116789c, oVar.f116789c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(a0.d.c(this.f116787a.hashCode() * 31, 31, this.f116788b), 31, this.f116789c);
    }

    public o(String cryptoBeneficiaryId, long j2, String currency, String blockchain) {
        Intrinsics.checkNotNullParameter(cryptoBeneficiaryId, "cryptoBeneficiaryId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f116787a = cryptoBeneficiaryId;
        this.f116788b = j2;
        this.f116789c = currency;
        this.d = blockchain;
    }
}
