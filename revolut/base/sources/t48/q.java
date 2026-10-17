package t48;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f267931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f267932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f267933c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f267934g;

    public q(TextLocalisedClause title, TextLocalisedClause description, ContactImage contactImage, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f267931a = title;
        this.f267932b = description;
        this.f267933c = contactImage;
        this.d = textLocalisedClause;
        this.e = textLocalisedClause2;
        this.f = z;
        this.f267934g = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f267934g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f267931a.equals(qVar.f267931a) && this.f267932b.equals(qVar.f267932b) && Intrinsics.f(this.f267933c, qVar.f267933c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && this.f == qVar.f && this.f267934g.equals(qVar.f267934g);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f267931a.hashCode() * 31, 31, this.f267932b);
        Image image = this.f267933c;
        int iHashCode = (iA + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return this.f267934g.hashCode() + j6.a.c((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f);
    }
}
