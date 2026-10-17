package xoh;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f307843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f307844b;

    public o(Clause label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f307843a = label;
        this.f307844b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f307843a.equals(oVar.f307843a) && this.f307844b == oVar.f307844b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f307844b) + (this.f307843a.hashCode() * 31);
    }
}
