package az;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11278b;

    public f(Clause hintText, e eVar) {
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        this.f11277a = hintText;
        this.f11278b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f11277a.equals(fVar.f11277a) && Intrinsics.f(this.f11278b, fVar.f11278b);
    }

    public final int hashCode() {
        int iHashCode = this.f11277a.hashCode() * 31;
        e eVar = this.f11278b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
