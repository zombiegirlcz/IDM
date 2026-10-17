package vb2;

import aw0.n6;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.apm.payto.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb2.b f287372a;

    public q(xb2.b inputValidator) {
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        this.f287372a = inputValidator;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.i model;
        boolean z;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        String str = domainState.f287360a;
        h hVar = h.PAY_ID;
        FixedTabs.Item item = new FixedTabs.Item(hVar.getId(), hVar.a(), (AnalyticsContext) null, 12);
        h hVar2 = h.BANK_DETAILS;
        eVarB.add(new FixedTabsDelegate.Model("LIST_ID_TABS", v.k(item, new FixedTabs.Item(hVar2.getId(), hVar2.a(), (AnalyticsContext) null, 12)), str, false, null, SyslogConstants.LOG_CLOCK));
        String str2 = domainState.f287360a;
        if (Intrinsics.f(str2, hVar.getId())) {
            model = new InputTextDelegate.Model("LIST_ID_INPUT_PAYID", new TextClause(domainState.f287361b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.topup_linked_account_email_phone_label, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -12, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            qv0.i model2 = new InputDualTextDelegate.Model("LIST_ID_INPUT_BANK_DETAILS", new InputTextDelegate.Model("LIST_ID_INPUT_BANK_DETAILS_BSB", new TextClause(domainState.f287362c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.topup_linked_account_bsb_label, null, null, 14), new TextClause("###-###", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, false, false, 0, true, 0, false, false, false, null, false, false, 0, false, false, null, -16777232, 131071), new InputTextDelegate.Model("LIST_ID_INPUT_BANK_DETAILS_ACCOUNT_NUMBER", new TextClause(domainState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.topup_linked_account_account_number_label, null, null, 14), null, null, null, null, false, null, false, false, 0, true, 0, false, false, false, null, false, false, 0, false, false, null, -16777224, 131071), new InputDualTextView.b.a(0), 40);
            yp0.b.r(model2, 0, 0, 0, 0, 15);
            model = model2;
        }
        eVarB.add(model);
        aim.e eVarA = u.a(eVarB);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_linked_account_footer, u.c(new TextLocalisedClause(R$string.topup_linked_account_footer_personal_terms, null, new Click(30, (Integer) null, (Object) null, "ID_CLICKABLE_FOOTER", false), 10)), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.topup_linked_account_footer_action_send_request, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        xb2.b bVar = this.f287372a;
        zzl.b bVar2 = bVar.f303970a;
        if (Intrinsics.f(str2, hVar.getId())) {
            String value = domainState.f287361b;
            Intrinsics.checkNotNullParameter(value, "value");
            if (!((zzl.c) bVar2).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", value)) {
                Intrinsics.checkNotNullParameter(value, "value");
                z80.b bVar3 = bVar.f303971b;
                wi0.b.Companion.getClass();
                if (bVar3.k(value, "AU")) {
                }
            }
        } else {
            if (Intrinsics.f(str2, hVar2.getId())) {
                String value2 = domainState.f287362c;
                Intrinsics.checkNotNullParameter(value2, "value");
                zzl.c cVar = (zzl.c) bVar2;
                if (cVar.a("^\\d{6}$", value2)) {
                    String value3 = domainState.d;
                    Intrinsics.checkNotNullParameter(value3, "value");
                    z = cVar.a("^\\d{5,10}$", value3);
                }
            }
        }
        return new o(eVarA, new aw0.e(false, textLocalisedClause, null, new n6(textLocalisedClause2, defaultFilledButton, null, null, z, null, null, 988), null, null, 53));
    }
}
