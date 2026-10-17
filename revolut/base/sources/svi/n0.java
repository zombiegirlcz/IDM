package svi;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f265955c;
    public final int d;
    public final int e;

    public n0(dj0.d passPrice, String str, ArrayList quotes, int i, int i2) {
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        this.f265953a = passPrice;
        this.f265954b = str;
        this.f265955c = quotes;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f265953a.equals(n0Var.f265953a) && Intrinsics.f(this.f265954b, n0Var.f265954b) && this.f265955c.equals(n0Var.f265955c) && this.d == n0Var.d && this.e == n0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f265953a.hashCode() * 31;
        String str = this.f265954b;
        return Integer.hashCode(this.e) + j6.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f265955c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }
}
