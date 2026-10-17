package hoj;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetClickData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f154344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f154345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f154346c;
    public final ProgressStyle d;
    public final EsimWidgetClickData.SubscriptionDetails e;
    public final CircleBadgeModel f;

    public a(Image avatarImage, Clause clause, TextLocalisedClause textLocalisedClause, ProgressStyle progressStyle, EsimWidgetClickData.SubscriptionDetails clickParcel, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        Intrinsics.checkNotNullParameter(clickParcel, "clickParcel");
        this.f154344a = avatarImage;
        this.f154345b = clause;
        this.f154346c = textLocalisedClause;
        this.d = progressStyle;
        this.e = clickParcel;
        this.f = circleBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f154344a.equals(aVar.f154344a) && Intrinsics.f(this.f154345b, aVar.f154345b) && Intrinsics.f(this.f154346c, aVar.f154346c) && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f154344a.hashCode() * 31;
        Clause clause = this.f154345b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f154346c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        ProgressStyle progressStyle = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31)) * 31;
        CircleBadgeModel circleBadgeModel = this.f;
        return iHashCode4 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0);
    }
}
