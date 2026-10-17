package df2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113766b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f113764a.getDescriptor(), i, 3);
            throw null;
        }
        this.f113765a = str;
        this.f113766b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f113765a, fVar.f113765a) && Intrinsics.f(this.f113766b, fVar.f113766b);
    }

    public final int hashCode() {
        return this.f113766b.hashCode() + (this.f113765a.hashCode() * 31);
    }

    public f(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter("UPI", "qrType");
        this.f113765a = qrCode;
        this.f113766b = "UPI";
    }
}
