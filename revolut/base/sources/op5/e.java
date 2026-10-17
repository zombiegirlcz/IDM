package op5;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public static Clause a(CryptoAddressRecipientDetails recipientDetails) {
        Intrinsics.checkNotNullParameter(recipientDetails, "recipientDetails");
        wk5.i iVar = recipientDetails.f70985b;
        String str = recipientDetails.f70984a;
        int i = d.f227524a[iVar.ordinal()];
        if (i == 1 || i == 2) {
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = recipientDetails.f70986c;
            if (str2 != null) {
                return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textClause, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Unexpected recipient type");
        }
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
