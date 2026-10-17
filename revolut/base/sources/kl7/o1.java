package kl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f185368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f185369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f185370c;

    public o1(dj0.d price, ArrayList options, r2 r2Var) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f185368a = price;
        this.f185369b = options;
        this.f185370c = r2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f185368a, o1Var.f185368a) && this.f185369b.equals(o1Var.f185369b) && Intrinsics.f(this.f185370c, o1Var.f185370c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f185369b, this.f185368a.hashCode() * 31, 31);
        r2 r2Var = this.f185370c;
        return iB + (r2Var == null ? 0 : r2Var.hashCode());
    }
}
