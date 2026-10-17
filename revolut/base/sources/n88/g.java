package n88;

import com.revolut.core.ui_kit.delegates.widgets.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f213283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f213284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f213285c;

    public g(Clause clause, p pVar, Image image) {
        this.f213283a = clause;
        this.f213284b = pVar;
        this.f213285c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f213283a, gVar.f213283a) && Intrinsics.f(this.f213284b, gVar.f213284b) && Intrinsics.f(this.f213285c, gVar.f213285c);
    }

    public final int hashCode() {
        Clause clause = this.f213283a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        p pVar = this.f213284b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.f55461a.hashCode())) * 31;
        Image image = this.f213285c;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }
}
