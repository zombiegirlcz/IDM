package pea;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dda.j f235349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i80.a f235351c;

    public g(dda.j qrCodeProvider, String qrCodeText, i80.a aVar) {
        Intrinsics.checkNotNullParameter(qrCodeProvider, "qrCodeProvider");
        Intrinsics.checkNotNullParameter(qrCodeText, "qrCodeText");
        this.f235349a = qrCodeProvider;
        this.f235350b = qrCodeText;
        this.f235351c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f235349a == gVar.f235349a && Intrinsics.f(this.f235350b, gVar.f235350b) && Intrinsics.f(this.f235351c, gVar.f235351c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f235349a.hashCode() * 31, 31, this.f235350b);
        i80.a aVar = this.f235351c;
        return iC + (aVar == null ? 0 : Arrays.deepHashCode(aVar.f159408a));
    }
}
