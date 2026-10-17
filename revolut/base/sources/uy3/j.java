package uy3;

import ht3.l0;
import kotlin.jvm.internal.Intrinsics;
import ny3.p;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f284070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f284071b;

    public j(l0 l0Var, p documentsUpload) {
        Intrinsics.checkNotNullParameter(documentsUpload, "documentsUpload");
        this.f284070a = l0Var;
        this.f284071b = documentsUpload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f284070a, jVar.f284070a) && Intrinsics.f(this.f284071b, jVar.f284071b);
    }

    public final int hashCode() {
        l0 l0Var = this.f284070a;
        return this.f284071b.hashCode() + ((l0Var == null ? 0 : l0Var.hashCode()) * 31);
    }
}
