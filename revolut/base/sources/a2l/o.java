package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f921b;

    public o(String label, p action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f920a = label;
        this.f921b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f920a, oVar.f920a) && this.f921b == oVar.f921b;
    }

    public final int hashCode() {
        return this.f921b.hashCode() + (this.f920a.hashCode() * 31);
    }
}
