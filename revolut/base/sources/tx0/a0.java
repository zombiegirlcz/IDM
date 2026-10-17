package tx0;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f275078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f275079b;

    public a0(r model, Parcelable payload) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f275078a = model;
        this.f275079b = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f275078a, a0Var.f275078a) && Intrinsics.f(this.f275079b, a0Var.f275079b);
    }

    public final int hashCode() {
        return this.f275079b.hashCode() + (this.f275078a.hashCode() * 31);
    }
}
