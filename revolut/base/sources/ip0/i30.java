package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i30 implements m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.w2 f164635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n30 f164636b;

    public i30(aw0.w2 item, n30 model) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f164635a = item;
        this.f164636b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i30)) {
            return false;
        }
        i30 i30Var = (i30) obj2;
        return Intrinsics.f(this.f164635a, i30Var.f164635a) && Intrinsics.f(this.f164636b, i30Var.f164636b);
    }

    public final int hashCode() {
        return this.f164636b.hashCode() + (this.f164635a.hashCode() * 31);
    }
}
