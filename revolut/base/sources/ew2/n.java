package ew2;

import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f130031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f130032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f130033c;
    public final boolean d;
    public final BitmapImage e;
    public final al4.a f;

    public n(h93.f0 f0Var, boolean z, boolean z3, boolean z4, BitmapImage bitmapImage, al4.a aVar) {
        this.f130031a = f0Var;
        this.f130032b = z;
        this.f130033c = z3;
        this.d = z4;
        this.e = bitmapImage;
        this.f = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f130031a, nVar.f130031a) && this.f130032b == nVar.f130032b && this.f130033c == nVar.f130033c && this.d == nVar.d && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f;
    }

    public final int hashCode() {
        h93.f0 f0Var = this.f130031a;
        int iC = j6.a.c(j6.a.c(j6.a.c((f0Var == null ? 0 : f0Var.hashCode()) * 31, 31, this.f130032b), 31, this.f130033c), 31, this.d);
        BitmapImage bitmapImage = this.e;
        int iHashCode = (iC + (bitmapImage == null ? 0 : bitmapImage.hashCode())) * 31;
        al4.a aVar = this.f;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
