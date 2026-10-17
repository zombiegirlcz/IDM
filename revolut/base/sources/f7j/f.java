package f7j;

import com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityOrderKeyboardSuggestions;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$InputData;
import d7j.a0;
import d7j.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6j.a f132631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f132632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f132633c;
    public final zjh.c d;
    public final p e;
    public final vfl.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f132634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CommodityOrderEditScreenContract$InputData f132635h;
    public final boolean i;

    public f(y6j.a analyticsContextProvider, b0 navBarMapper, a0 inputMapper, i targetPriceSettingsMapper, zjh.c recurringBuySettingsMapper, p keyboardSuggestionsStateMapper, vfl.a keyboardSuggestionsMapper, g commodityKeyboardSuggestionMapper, gte.a featureToggleInteractor, CommodityOrderEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(inputMapper, "inputMapper");
        Intrinsics.checkNotNullParameter(targetPriceSettingsMapper, "targetPriceSettingsMapper");
        Intrinsics.checkNotNullParameter(recurringBuySettingsMapper, "recurringBuySettingsMapper");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsStateMapper, "keyboardSuggestionsStateMapper");
        Intrinsics.checkNotNullParameter(keyboardSuggestionsMapper, "keyboardSuggestionsMapper");
        Intrinsics.checkNotNullParameter(commodityKeyboardSuggestionMapper, "commodityKeyboardSuggestionMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f132631a = analyticsContextProvider;
        this.f132632b = navBarMapper;
        this.f132633c = inputMapper;
        this.d = recurringBuySettingsMapper;
        this.e = keyboardSuggestionsStateMapper;
        this.f = keyboardSuggestionsMapper;
        this.f132634g = commodityKeyboardSuggestionMapper;
        this.f132635h = inputData;
        this.i = ((jte.d) featureToggleInteractor).c(CommodityOrderFlowApi$Toggles$CommodityOrderKeyboardSuggestions.f99800c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0441  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.Map] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r39) {
        /*
            Method dump skipped, instruction units count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7j.f.c(cli.j):cli.o");
    }
}
