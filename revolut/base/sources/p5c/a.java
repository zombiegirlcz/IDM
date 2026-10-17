package p5c;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import t5c.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static k5c.a a(c cryptoExchangeEligibilityDto) {
        k5c.b bVar;
        Intrinsics.checkNotNullParameter(cryptoExchangeEligibilityDto, "cryptoExchangeEligibilityDto");
        String str = cryptoExchangeEligibilityDto.f268050a;
        k5c.b[] bVarArrValues = k5c.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (a0.z(bVar.name(), str, true)) {
                break;
            }
            i++;
        }
        if (bVar == null) {
            bVar = k5c.b.NOT_ELIGIBLE;
        }
        return new k5c.a(bVar);
    }
}
