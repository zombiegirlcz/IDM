package wj7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f297983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f297984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f297985c;

    public j(Clause description, Clause clause, Image image) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f297983a = description;
        this.f297984b = clause;
        this.f297985c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f297983a, jVar.f297983a) && Intrinsics.f(this.f297984b, jVar.f297984b) && Intrinsics.f(this.f297985c, jVar.f297985c);
    }

    public final int hashCode() {
        int iHashCode = this.f297983a.hashCode() * 31;
        Clause clause = this.f297984b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f297985c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}
