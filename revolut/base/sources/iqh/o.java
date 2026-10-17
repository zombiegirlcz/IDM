package iqh;

import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker.ScreenerFilterOptionsPickerScreenContract$Input;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends oki.h implements h {
    public final y o;

    public o(ScreenerFilterOptionsPickerScreenContract$Input inputData, i3g.k stateMapper) {
        List list;
        Set setI1;
        List list2;
        Set setI12;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        ScreenerFilter$Options screenerFilter$Options = inputData.f96263a;
        ScreenerSelectedFilter.Options options = inputData.f96264b;
        this.o = mra.d.b(this, new i(screenerFilter$Options, (options == null || (list2 = options.f105166b) == null || (setI12 = d0.i1(list2)) == null) ? h0.f322473a : setI12, (options == null || (list = options.f105166b) == null || (setI1 = d0.i1(list)) == null) ? h0.f322473a : setI1), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
