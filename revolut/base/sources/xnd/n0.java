package xnd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f307427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f307428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f307429c;

    public n0(ArrayList selectedAccounts, ArrayList pickerAccounts, boolean z) {
        Intrinsics.checkNotNullParameter(selectedAccounts, "selectedAccounts");
        Intrinsics.checkNotNullParameter(pickerAccounts, "pickerAccounts");
        this.f307427a = selectedAccounts;
        this.f307428b = pickerAccounts;
        this.f307429c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f307427a.equals(n0Var.f307427a) && this.f307428b.equals(n0Var.f307428b) && this.f307429c == n0Var.f307429c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f307429c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f307428b, this.f307427a.hashCode() * 31, 31);
    }
}
