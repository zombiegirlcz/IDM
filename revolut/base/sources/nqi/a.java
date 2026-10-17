package nqi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f218467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f218469c;

    public a(String formattedAmountInput, boolean z, Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(formattedAmountInput, "formattedAmountInput");
        this.f218467a = model;
        this.f218468b = formattedAmountInput;
        this.f218469c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f218467a, aVar.f218467a) && Intrinsics.f(this.f218468b, aVar.f218468b) && this.f218469c == aVar.f218469c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218469c) + p.a.c(this.f218467a.hashCode() * 31, 31, this.f218468b);
    }
}
