package zv6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import ehe.n;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f325590a;

    public l(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f325590a = regexMatcher;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_ID_NAME_INPUT", new TextClause(domainState.f325576b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.freelancer_common_word_name, null, null, 14), null, null, null, null, false, null, false, false, 0, false, 0, false, true, true, n.w(50), false, false, 0, false, false, null, 922746872, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ITEM_ID_EMAIL_INPUT", new TextClause(domainState.f325577c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.freelancer_common_word_email, null, null, 14), null, null, null, null, false, null, false, false, 0, false, 0, false, false, true, n.w(50), false, false, 0, false, false, null, 922746872, 131071);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        String str = domainState.d;
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("ITEM_ID_PHONE_INPUT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.freelancer_phone_number, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_word_optional, null, null, 14), null, null, false, null, false, false, 0, false, 0, false, false, true, n.w(50), false, false, 0, false, false, null, 922746744, 131071);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        String str2 = domainState.e;
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("ITEM_ID_VAT_INPUT", str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.freelancer_vat_number, null, null, 14), null, new TextLocalisedClause(R$string.freelancer_common_word_optional, null, null, 14), null, null, false, null, false, false, 0, false, 0, false, false, true, n.w(50), false, false, 0, false, false, null, 922746744, 131071);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        List listK = v.k(model, model2, model3, model4);
        String str3 = domainState.f325576b;
        String str4 = domainState.f325577c;
        if (!d0.W(str3) && !d0.W(str4)) {
            boolean z = ((zzl.c) this.f325590a).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str4);
            return new g(listK, z);
        }
        return new g(listK, z);
    }
}
