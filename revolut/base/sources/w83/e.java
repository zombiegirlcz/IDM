package w83;

import cli.n;
import cli.y;
import com.revolut.feature.card_screen.impl.prompts.merchant_redirect.MerchantRedirectPromptScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends oki.h implements f {
    public final y o;

    public e(n stateMapper, MerchantRedirectPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new g(inputData.f65513a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
