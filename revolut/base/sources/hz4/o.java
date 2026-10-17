package hz4;

import cli.y;
import com.revolut.feature.credit.direct.debit.set_account.DirectDebitSetAccountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends oki.h implements j {

    @NotNull
    public static final n Companion = new n();
    public final y o;

    public o(cli.n stateMapper, DirectDebitSetAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = mra.d.b(this, new f(inputData.f69917a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
