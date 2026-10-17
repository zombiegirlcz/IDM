package m25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201710a;

    public m(String boletoId) {
        Intrinsics.checkNotNullParameter(boletoId, "boletoId");
        this.f201710a = boletoId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f201710a, ((m) obj2).f201710a);
    }

    public final int hashCode() {
        return this.f201710a.hashCode();
    }
}
