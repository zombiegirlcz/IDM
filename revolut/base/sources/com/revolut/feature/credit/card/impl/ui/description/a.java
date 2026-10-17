package com.revolut.feature.credit.card.impl.ui.description;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import xq4.d;
import xq4.e;
import xq4.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends g implements xq4.g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditCardDescriptionScreenContract$InputData f69212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f69213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f69214r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CreditCardDescriptionScreenContract$InputData inputData, x deeplinkHandler, p stateMapper) {
        f eVar;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f69212p = inputData;
        this.f69213q = deeplinkHandler;
        if (inputData instanceof CreditCardDescriptionScreenContract$InputData.Local) {
            eVar = new d(((CreditCardDescriptionScreenContract$InputData.Local) inputData).f69209a);
        } else {
            if (!(inputData instanceof CreditCardDescriptionScreenContract$InputData.Remote)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = new e(((CreditCardDescriptionScreenContract$InputData.Remote) inputData).f69211b);
        }
        this.f69214r = eVar;
    }

    @Override // jki.g
    public final i r2() {
        return this.f69214r;
    }

    public final void y2(String str, String str2) {
        C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(str2, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, true, true, true, 65436))));
    }
}
