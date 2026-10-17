package rc7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements csh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4g.g f253211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f253212b;

    public k(h4g.g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f253211a = shopsFeatureAvailabilityInteractor;
        this.f253212b = yhm.j.b(new r1a.a(this, 9));
    }

    @Override // csh.d
    public final Clause a() {
        return ((Boolean) this.f253212b.getValue()).booleanValue() ? new TextLocalisedClause(R$string.widgets_catalogue_cashback_title_loyalty, null, null, 14) : new TextLocalisedClause(R$string.widgets_catalogue_cashback_title, null, null, 14);
    }

    @Override // csh.d
    public final List c() {
        return u.c("CashbackLarge");
    }

    @Override // csh.d
    public final Clause d(String widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return ((Boolean) this.f253212b.getValue()).booleanValue() ? new TextLocalisedClause(R$string.widgets_catalogue_cashback_large_description_loyalty, null, null, 14) : new TextLocalisedClause(R$string.widgets_catalogue_cashback_large_description, null, null, 14);
    }

    @Override // csh.d
    public final String e(List availableWidgetTypes) {
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        String str = availableWidgetTypes.contains("CashbackLarge") ? "CashbackLarge" : null;
        return str == null ? (String) d0.b0(availableWidgetTypes) : str;
    }
}
