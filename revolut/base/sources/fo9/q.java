package fo9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f136853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f136854c;
    public final Clause d;
    public final Image e;

    public q(List items, List actions, TextClause textClause, TextClause textClause2, ContactImage contactImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f136852a = items;
        this.f136853b = actions;
        this.f136854c = textClause;
        this.d = textClause2;
        this.e = contactImage;
    }

    @Override // cli.p
    public final List c() {
        return this.f136852a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f136852a, qVar.f136852a) && Intrinsics.f(this.f136853b, qVar.f136853b) && Intrinsics.f(this.f136854c, qVar.f136854c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f136852a.hashCode() * 31, 31, this.f136853b);
        Clause clause = this.f136854c;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.e;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }

    public q(List list) {
        this(list, f0.f322471a, null, null, null);
    }
}
