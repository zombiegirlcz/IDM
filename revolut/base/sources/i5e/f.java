package i5e;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.R$string;
import i2l.n0;
import i4h.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {
    public static PlainTextDelegate.Model a(int i, int i2, String str) {
        PlainTextDelegate.Model model = new PlainTextDelegate.Model(str, (Clause) new TextLocalisedClause(i, null, null, 14), (Clause) new TextLocalisedClause(i2, null, null, 14), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i2 = e.f158818a[domainState.f158813a.ordinal()];
        if (i2 == 1) {
            i = R$string.trading_structured_notes_attributes_dictionary_issue_title;
        } else if (i2 == 2) {
            i = R$string.trading_structured_notes_attributes_dictionary_coupon_title;
        } else if (i2 == 3) {
            i = R$string.trading_structured_notes_attributes_dictionary_call_title;
        } else if (i2 == 4) {
            i = R$string.trading_structured_notes_attributes_dictionary_capital_protection_title;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.trading_structured_notes_attributes_dictionary_final_payout_title;
        }
        List list = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        Data data = domainState.f158814b;
        Data data2 = domainState.f158815c;
        if (data != null && data2 != null) {
            list = (List) iii.c.f(t1.t(data, data2), new q(18), new n0(12), new hnc.a(18, domainState, this));
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new d(textLocalisedClause, list);
    }
}
