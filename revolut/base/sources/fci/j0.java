package fci;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f133783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f133785c;

    public j0(View view, boolean z, int i) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f133783a = view;
        this.f133784b = z;
        this.f133785c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f133783a, j0Var.f133783a) && this.f133784b == j0Var.f133784b && this.f133785c == j0Var.f133785c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133785c) + j6.a.c(this.f133783a.hashCode() * 31, 31, this.f133784b);
    }
}
