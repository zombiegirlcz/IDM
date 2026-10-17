package qt0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PercentageClause f248888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f248889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f248890c;
    public final Clause d;
    public final Clause e;
    public final Image f;

    public b(PercentageClause label, float f, int i, Clause clause, Clause clause2, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f248888a = label;
        this.f248889b = f;
        this.f248890c = i;
        this.d = clause;
        this.e = clause2;
        this.f = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f248888a.equals(bVar.f248888a) && Float.compare(this.f248889b, bVar.f248889b) == 0 && this.f248890c == bVar.f248890c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f248890c, m72.b.b(this.f248889b, this.f248888a.hashCode() * 31, 31), 31);
        Clause clause = this.d;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.f;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}
