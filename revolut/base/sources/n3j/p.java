package n3j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f212150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f212151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f212152c;
    public final wi0.b d;
    public final List e;

    public p(Clause title, Clause clause, Image image, wi0.b bVar, List menuElements) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuElements, "menuElements");
        this.f212150a = title;
        this.f212151b = clause;
        this.f212152c = image;
        this.d = bVar;
        this.e = menuElements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f212150a.equals(pVar.f212150a) && Intrinsics.f(this.f212151b, pVar.f212151b) && Intrinsics.f(this.f212152c, pVar.f212152c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f212150a.hashCode() * 31;
        Clause clause = this.f212151b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f212152c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        wi0.b bVar = this.d;
        return this.e.hashCode() + ((iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31);
    }
}
