package kl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f185377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f185378c;
    public final p2 d;

    public q2(String title, p0 p0Var, ArrayList howItWorks, p2 p2Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(howItWorks, "howItWorks");
        this.f185376a = title;
        this.f185377b = p0Var;
        this.f185378c = howItWorks;
        this.d = p2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.f185376a, q2Var.f185376a) && this.f185377b.equals(q2Var.f185377b) && this.f185378c.equals(q2Var.f185378c) && Intrinsics.f(this.d, q2Var.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f185378c, (this.f185377b.hashCode() + (this.f185376a.hashCode() * 31)) * 31, 31);
        p2 p2Var = this.d;
        return iB + (p2Var == null ? 0 : p2Var.hashCode());
    }
}
