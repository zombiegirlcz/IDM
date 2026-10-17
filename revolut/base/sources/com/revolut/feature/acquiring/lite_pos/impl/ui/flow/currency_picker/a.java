package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.currency_picker;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.currency_picker.LitePosCurrencyPickerFlowContract$Step;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import s7a.x;
import v25.k;
import vd1.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LitePosCurrencyPickerFlowContract$InputData f60723t;
    public final wd1.a u;
    public final LitePosCurrencyPickerFlowContract$Step.Select v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EmptyFlowState f60724w;

    public a(LitePosCurrencyPickerFlowContract$InputData inputData, wd1.a cardPresentCurrencyPickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardPresentCurrencyPickerInteractor, "cardPresentCurrencyPickerInteractor");
        this.f60723t = inputData;
        this.u = cardPresentCurrencyPickerInteractor;
        this.v = LitePosCurrencyPickerFlowContract$Step.Select.f60722a;
        this.f60724w = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        LitePosCurrencyPickerFlowContract$Step step = (LitePosCurrencyPickerFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, LitePosCurrencyPickerFlowContract$Step.Select.f60722a)) {
            throw new NoWhenBranchMatchedException();
        }
        LitePosCurrencyPickerFlowContract$InputData litePosCurrencyPickerFlowContract$InputData = this.f60723t;
        PickerController pickerController = new PickerController(new x(new TextLocalisedClause(R$string.product_catalogue_change_currency_title, null, null, 14), litePosCurrencyPickerFlowContract$InputData.f60721a.f306286a, null, null, true, null, null, null, null, false, null, litePosCurrencyPickerFlowContract$InputData.f60721a.f306286a, null, null, false, null, null, null, null, null, 2147352440), this.u);
        k block = new k(this, 28);
        Intrinsics.checkNotNullParameter(block, "block");
        pickerController.H = block;
        return pickerController;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f60724w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
