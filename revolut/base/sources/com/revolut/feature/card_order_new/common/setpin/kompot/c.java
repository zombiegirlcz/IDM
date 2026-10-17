package com.revolut.feature.card_order_new.common.setpin.kompot;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import com.revolut.feature.cards_core.R$string;
import i13.i;
import i13.m;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SetPinScreenContract$InputData f65022a;

    public c(SetPinScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f65022a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SetPinScreenContract$InputData setPinScreenContract$InputData = this.f65022a;
        if (setPinScreenContract$InputData instanceof SetPinScreenContract$InputData.CreatePin) {
            SetPinScreenContract$InputData.CreatePin createPin = (SetPinScreenContract$InputData.CreatePin) setPinScreenContract$InputData;
            textLocalisedClause = new TextLocalisedClause(createPin.f65014b, null, null, 14);
            String str = createPin.f65015c;
            if (str == null || d0.W(str)) {
                str = null;
            }
            int i = str != null ? R$string.card_pin_set_subtitle_owner_name : R$string.card_pin_set_subtitle_new;
            List listC = str != null ? u.c(str) : null;
            if (listC == null) {
                listC = f0.f322471a;
            }
            textLocalisedClause2 = new TextLocalisedClause(i, listC, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        } else {
            if (!(setPinScreenContract$InputData instanceof SetPinScreenContract$InputData.ConfirmPin)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.card_pin_set_title_new_confirm, null, null, 14);
            String str2 = ((SetPinScreenContract$InputData.ConfirmPin) setPinScreenContract$InputData).f65012c;
            if (str2 == null || d0.W(str2)) {
                str2 = null;
            }
            textLocalisedClause2 = new TextLocalisedClause(str2 != null ? R$string.card_pin_set_subtitle_owner_name_confirm : R$string.card_pin_set_subtitle_new_confirm, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        return new m(textLocalisedClause, textLocalisedClause2, domainState.f157535b, domainState.f157536c);
    }
}
