package ew2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f130019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.a f130020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f130021c;

    public j0(boolean z, al4.a aVar, Bitmap bitmap) {
        this.f130019a = z;
        this.f130020b = aVar;
        this.f130021c = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f130019a == j0Var.f130019a && this.f130020b == j0Var.f130020b && Intrinsics.f(this.f130021c, j0Var.f130021c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f130019a) * 31;
        al4.a aVar = this.f130020b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Bitmap bitmap = this.f130021c;
        return iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
    }
}
