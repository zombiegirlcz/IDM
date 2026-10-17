package lk4;

import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f196216p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SelectAmountTypeScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f196216p = new c(inputData.f68616a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f196216p;
    }
}
