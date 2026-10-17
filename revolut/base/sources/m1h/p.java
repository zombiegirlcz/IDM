package m1h;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f201504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f201505b;

    public p(Clause clause, Image image) {
        this.f201504a = clause;
        this.f201505b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f201504a, pVar.f201504a) && Intrinsics.f(this.f201505b, pVar.f201505b);
    }

    public final int hashCode() {
        Clause clause = this.f201504a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Image image = this.f201505b;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }
}
