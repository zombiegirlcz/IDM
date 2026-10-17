package i7j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f159328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f159329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f159330c;
    public final io3.d d;

    public f(Image icon, Clause title, Clause clause, io3.d pocket) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f159328a = icon;
        this.f159329b = title;
        this.f159330c = clause;
        this.d = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f159328a, fVar.f159328a) && Intrinsics.f(this.f159329b, fVar.f159329b) && Intrinsics.f(this.f159330c, fVar.f159330c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f159328a.hashCode() * 31, 31, this.f159329b);
        Clause clause = this.f159330c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
