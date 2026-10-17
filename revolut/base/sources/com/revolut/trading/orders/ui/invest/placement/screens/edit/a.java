package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import com.revolut.feature.trading_orders.api.ui.pocket_picker.SourcePocketPickerContract$OutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SourcePocketPickerContract$OutputData p0 = (SourcePocketPickerContract$OutputData) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        e eVar = (e) this.receiver;
        eVar.getClass();
        eVar.l2(new cuc.c(p0, eVar, (Continuation) null, 5), new yi5.b(26));
        return Unit.f186387a;
    }
}
