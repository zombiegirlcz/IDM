package a6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f1682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f1683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f1684c;
    public final Image d;
    public final Clause e;

    public a(TextLocalisedClause title, TextLocalisedClause description, Integer num, Image image, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f1682a = title;
        this.f1683b = description;
        this.f1684c = num;
        this.d = image;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f1682a.equals(aVar.f1682a) && this.f1683b.equals(aVar.f1683b) && this.f1684c.equals(aVar.f1684c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f1684c.hashCode() + t61.a.a(this.f1682a.hashCode() * 31, 31, this.f1683b)) * 31;
        Image image = this.d;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
