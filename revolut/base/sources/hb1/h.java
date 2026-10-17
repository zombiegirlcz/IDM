package hb1;

import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker.AccountPickerScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f150555p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, AccountPickerScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f150555p = new c(inputData.f60597a, inputData.f60598b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f150555p;
    }
}
