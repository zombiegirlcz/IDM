package oqe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f227891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f227892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContactImage f227893c;

    public i(TextLocalisedClause title, CompositeClause compositeClause, ContactImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f227891a = title;
        this.f227892b = compositeClause;
        this.f227893c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f227891a.equals(iVar.f227891a) && Intrinsics.f(this.f227892b, iVar.f227892b) && this.f227893c.equals(iVar.f227893c);
    }

    public final int hashCode() {
        int iHashCode = this.f227891a.hashCode() * 31;
        Clause clause = this.f227892b;
        return this.f227893c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
