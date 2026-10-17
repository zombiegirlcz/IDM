package nfc;

import com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat.VatInputScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f214895p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(VatInputScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f214895p = new e(inputData.f84761a, inputData.f84762b, null);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f214895p;
    }
}
