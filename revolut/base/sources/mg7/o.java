package mg7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f205177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f205178c;
    public final Clause d;

    public o(List menuItems, ResourceImage resourceImage, TextClause textClause, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f205176a = menuItems;
        this.f205177b = resourceImage;
        this.f205178c = textClause;
        this.d = compositeClause;
    }

    @Override // mg7.q
    public final Image a() {
        return this.f205177b;
    }

    @Override // mg7.q
    public final List b() {
        return this.f205176a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f205176a, oVar.f205176a) && Intrinsics.f(this.f205177b, oVar.f205177b) && Intrinsics.f(this.f205178c, oVar.f205178c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f205176a.hashCode() * 31;
        Image image = this.f205177b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.f205178c;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return iHashCode3 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
