package xo8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f307721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f307722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactImage f307723c;
    public final List d;

    public o(TextLocalisedClause title, CompositeClause compositeClause, ContactImage contactImage, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f307721a = title;
        this.f307722b = compositeClause;
        this.f307723c = contactImage;
        this.d = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f307721a.equals(oVar.f307721a) && Intrinsics.f(this.f307722b, oVar.f307722b) && this.f307723c.equals(oVar.f307723c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f307721a.hashCode() * 31;
        Clause clause = this.f307722b;
        return this.d.hashCode() + ((this.f307723c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }
}
