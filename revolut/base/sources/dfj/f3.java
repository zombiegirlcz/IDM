package dfj;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i80.a f113964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f113966c;

    public f3(i80.a qrCode, String recipientName, e3 e3Var) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(recipientName, "recipientName");
        this.f113964a = qrCode;
        this.f113965b = recipientName;
        this.f113966c = e3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return Intrinsics.f(this.f113964a, f3Var.f113964a) && Intrinsics.f(this.f113965b, f3Var.f113965b) && Intrinsics.f(this.f113966c, f3Var.f113966c);
    }

    public final int hashCode() {
        int iC = p.a.c(Arrays.deepHashCode(this.f113964a.f159408a) * 31, 31, this.f113965b);
        e3 e3Var = this.f113966c;
        return iC + (e3Var == null ? 0 : e3Var.hashCode());
    }
}
