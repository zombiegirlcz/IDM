package m8b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f203462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f203463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f203464c;
    public final CircleBadgeModel d;
    public final c e;

    public e(Clause title, Clause clause, Image image, CircleBadgeModel circleBadgeModel, c cVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f203462a = title;
        this.f203463b = clause;
        this.f203464c = image;
        this.d = circleBadgeModel;
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f203462a, eVar.f203462a) && Intrinsics.f(this.f203463b, eVar.f203463b) && Intrinsics.f(this.f203464c, eVar.f203464c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f203462a.hashCode() * 31;
        Clause clause = this.f203463b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f203464c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.d;
        int iHashCode4 = (iHashCode3 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
        c cVar = this.e;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ e(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Image image, CircleIconBadge circleIconBadge, int i) {
        this(textLocalisedClause, (i & 2) != 0 ? null : textLocalisedClause2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : circleIconBadge, (c) null);
    }
}
