package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f163701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e90 f163702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f90 f163703c;

    public c90(int i, e90 item, f90 model) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f163701a = i;
        this.f163702b = item;
        this.f163703c = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj2;
        return this.f163701a == c90Var.f163701a && Intrinsics.f(this.f163702b, c90Var.f163702b) && Intrinsics.f(this.f163703c, c90Var.f163703c);
    }

    public final int hashCode() {
        return this.f163703c.hashCode() + ((this.f163702b.hashCode() + (Integer.hashCode(this.f163701a) * 31)) * 31);
    }
}
