package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f222078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f222079c;
    public final String d;
    public final String e;

    public /* synthetic */ m(int i, String str, int i2, p pVar, String str2, String str3) {
        if (31 != (i & 31)) {
            qlm.j1.f(k.f222073a.getDescriptor(), i, 31);
            throw null;
        }
        this.f222077a = str;
        this.f222078b = i2;
        this.f222079c = pVar;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f222077a, mVar.f222077a) && this.f222078b == mVar.f222078b && Intrinsics.f(this.f222079c, mVar.f222079c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f222079c.hashCode() + j6.a.b(this.f222078b, this.f222077a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public m(String clientId, int i, p paymentSource, String str, String str2) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        this.f222077a = clientId;
        this.f222078b = i;
        this.f222079c = paymentSource;
        this.d = str;
        this.e = str2;
    }
}
