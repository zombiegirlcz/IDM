package hvb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155818c;
    public final int d;
    public final no3.b e;
    public final String f;

    public /* synthetic */ u(int i, String str, String str2, String str3, int i2, no3.b bVar, String str4) {
        if (15 != (i & 15)) {
            j1.f(s.f155815a.getDescriptor(), i, 15);
            throw null;
        }
        this.f155816a = str;
        this.f155817b = str2;
        this.f155818c = str3;
        this.d = i2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f155816a, uVar.f155816a) && Intrinsics.f(this.f155817b, uVar.f155817b) && Intrinsics.f(this.f155818c, uVar.f155818c) && this.d == uVar.d && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.c(p.a.c(this.f155816a.hashCode() * 31, 31, this.f155817b), 31, this.f155818c), 31);
        no3.b bVar = this.e;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public u(String requestId, String productId, String quoteToken, int i, no3.b bVar, String str) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        this.f155816a = requestId;
        this.f155817b = productId;
        this.f155818c = quoteToken;
        this.d = i;
        this.e = bVar;
        this.f = str;
    }
}
