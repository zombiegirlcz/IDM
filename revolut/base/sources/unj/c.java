package unj;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public c(ynj.e commonUiBuilder) {
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
    }

    public final EsimCountryPickerScreen a(EsimCoverage.Global globalCoverage) {
        Intrinsics.checkNotNullParameter(globalCoverage, "globalCoverage");
        String str = globalCoverage.f100207b;
        return new EsimCountryPickerScreen(new EsimCountryPickerScreenContract$InputData.DisplayCountries(str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : ynj.e.l(globalCoverage.getF100209b()), new TextLocalisedClause(R$string.esim_country_picker_included_countries_title, null, null, 14), globalCoverage.f100206a));
    }

    public final EsimCountryPickerScreen b(EsimCoverage.Regional regionalCoverage) {
        Intrinsics.checkNotNullParameter(regionalCoverage, "regionalCoverage");
        return new EsimCountryPickerScreen(new EsimCountryPickerScreenContract$InputData.DisplayCountries(ynj.e.l(regionalCoverage.f100209b), new TextLocalisedClause(R$string.esim_country_picker_included_countries_title, null, null, 14), regionalCoverage.f100208a));
    }
}
