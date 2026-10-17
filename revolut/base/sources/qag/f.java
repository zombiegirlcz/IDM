package qag;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCancellationOptions;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.youTransactor.uCube.rpc.Constants;
import h9g.m;
import ip0.wu;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tul.b f244032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8g.c f244033b;

    public f(tul.b compactNumberFormatter, p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(compactNumberFormatter, "compactNumberFormatter");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f244032a = compactNumberFormatter;
        this.f244033b = travelHotelsFeatureInteractor;
    }

    public static wu a(HotelsProperty hotelsProperty) {
        Clause textClause;
        MoneyClause moneyClause;
        Pricing pricing = hotelsProperty.i;
        if (pricing != null) {
            dj0.d dVarJ = m.j(pricing);
            if (dVarJ != null) {
                MoneyClause.Format.Shorts shorts = new MoneyClause.Format.Shorts(false, 51);
                db dbVar = db.BODY1;
                List list = hotelsProperty.f97994t;
                moneyClause = new MoneyClause(dVarJ, shorts, new Custom(Integer.valueOf((list == null || list.isEmpty()) ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorRed), true, dbVar, false, null, Constants.TAG_FULL_SVPP_IDENTIFICATION), o9.NON_SENSITIVE);
            } else {
                moneyClause = null;
            }
            t0 t0Var = t0.f186434a;
            m70.a.t(t0Var);
            TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (moneyClause == null) {
                textClause2 = null;
            }
            MoneyClause moneyClause2 = new MoneyClause(boh.f.k(pricing), new MoneyClause.Format.Shorts(false, 51), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, db.HEADING3, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), o9.NON_SENSITIVE);
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            TextClause textClause3 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            HotelsPropertyCancellationOptions hotelsPropertyCancellationOptions = hotelsProperty.k;
            Clause[] elements = {moneyClause, textClause2, moneyClause2, textClause3, hotelsPropertyCancellationOptions != null ? hotelsPropertyCancellationOptions.f98010a : false ? new TextLocalisedClause(R$string.hotels_property_room_selection_free_cancellation, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            textClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new wu(textClause);
    }
}
