package w6b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public static ArrayList a(ArrayList inputFields, Map inputFieldToText, Map inputFieldErrorMatches, boolean z) {
        boolean z3;
        Intrinsics.checkNotNullParameter(inputFields, "inputFields");
        Intrinsics.checkNotNullParameter(inputFieldToText, "inputFieldToText");
        Intrinsics.checkNotNullParameter(inputFieldErrorMatches, "inputFieldErrorMatches");
        if (inputFieldToText.isEmpty()) {
            z3 = false;
            break;
        }
        if (!inputFieldToText.isEmpty()) {
            for (Map.Entry entry : inputFieldToText.entrySet()) {
                if (!Intrinsics.f(entry.getValue(), inputFieldErrorMatches.get(entry.getKey()))) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        ArrayList arrayList = new ArrayList(w.t(inputFields, 10));
        int i = 0;
        for (Object obj2 : inputFields) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            r5b.f fVar = (r5b.f) obj2;
            String str = (String) inputFieldToText.get(fVar.f251568a);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean z4 = z3 && i == v.j(inputFields);
            boolean z6 = !z;
            String str3 = fVar.f251568a;
            TextClause textClause = new TextClause(fVar.f251569b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i3 = d.f295410a[fVar.d.ordinal()];
            int i5 = 2;
            if (i3 != 1) {
                if (i3 == 2) {
                    i5 = 33;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = 16385;
                }
            }
            InputTextDelegate.Model model = new InputTextDelegate.Model(str3, textClause2, textClause, null, false, z4 ? new TextLocalisedClause(R$string.cobrand_account_form_error_message, null, null, 14) : null, null, null, null, null, null, false, null, null, z3, z6, i5, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -539361416, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.r(model, 0, R$attr.uikit_dp0, 0, 0, 13);
            arrayList.add(model);
            i = i2;
        }
        return arrayList;
    }
}
