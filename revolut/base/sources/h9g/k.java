package h9g;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import com.revolut.feature_travel_hotels_models.property.search.PropertyType;
import com.revolut.feature_travel_hotels_models.property.search.SimplifiedLocationType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k {
    public static final CompositeClause a(LocationType locationType) {
        Intrinsics.checkNotNullParameter(locationType, "<this>");
        return new CompositeClause(v.k(new TextClause(locationType.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(locationType.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10);
    }

    public static final TextClause b(PropertyType propertyType) {
        Intrinsics.checkNotNullParameter(propertyType, "<this>");
        return new TextClause(propertyType.f98138c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
    }

    public static final TextClause c(SimplifiedLocationType simplifiedLocationType) {
        Intrinsics.checkNotNullParameter(simplifiedLocationType, "<this>");
        return new TextClause(simplifiedLocationType.d, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
    }
}
