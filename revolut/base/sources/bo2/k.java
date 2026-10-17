package bo2;

import cli.n;
import cli.y;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements f {

    @NotNull
    public static final h Companion = new h();
    public final y o;

    public k(n stateMapper, BankAccountSwitchingCardDigitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        CardDigits.INSTANCE.getClass();
        this.o = mra.d.b(this, new d(CardDigits.f63893c, inputData.f63903a, false, inputData.f63904b), stateMapper, null, false, 12);
    }

    public static boolean I2(String str) {
        if (str.length() == 5) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
