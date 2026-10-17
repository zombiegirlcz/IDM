package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up0 f166383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166384b;

    public sp0(up0 model, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f166383a = model;
        this.f166384b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sp0)) {
            return false;
        }
        sp0 sp0Var = (sp0) obj2;
        return Intrinsics.f(this.f166383a, sp0Var.f166383a) && this.f166384b == sp0Var.f166384b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166384b) + (this.f166383a.hashCode() * 31);
    }
}
