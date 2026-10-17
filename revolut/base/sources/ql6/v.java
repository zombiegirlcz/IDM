package ql6;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.ConsentType;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_list.ConsentsListScreenContract$InputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import q87.z;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsentsListScreenContract$InputData f247220a;

    public v(ConsentsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f247220a = inputData;
    }

    public static RowDelegate.Model.MainImage.Image40 a(ConsentType consentType, String str) {
        int i;
        if (str != null && str.length() != 0) {
            return new RowDelegate.Model.MainImage.Image40(new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60);
        }
        int i2 = u.f247219a[consentType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R$drawable.uikit_icn_24_wallet;
        } else if (i2 == 3) {
            i = R$drawable.uikit_icn_24_arrow_right_left;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_coins;
        }
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
    }

    public static TextLocalisedClause b(OpenBankingConsent.Default r102) {
        ConsentType consentType = r102.f60383b;
        DateTime dateTime = r102.f60384c;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        if (lValueOf != null) {
            return new TextLocalisedClause(R$string.consent_expiry_format, zhm.u.c(new TimeClause(lValueOf.longValue(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12);
        }
        if (consentType == ConsentType.ACCOUNTS) {
            return new TextLocalisedClause(R$string.open_banking_consents_type_account, null, null, 14);
        }
        if (consentType == ConsentType.PAYMENTS) {
            return new TextLocalisedClause(R$string.open_banking_consents_type_payment, null, null, 14);
        }
        if (consentType == ConsentType.FUND_CONFIRMATIONS) {
            return new TextLocalisedClause(R$string.consent_fund_confirmations_title, null, null, 14);
        }
        return null;
    }

    public static TextLocalisedClause d(OpenBankingConsent openBankingConsent) {
        int i = u.f247219a[openBankingConsent.getF60383b().ordinal()];
        if (i == 1 || i == 2) {
            return new TextLocalisedClause(R$string.open_banking_consents_accounts_title, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.open_banking_consents_payments_title, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.open_banking_consents_fund_confirmations_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        OpenBankingConsentsFlowContract$FlowType openBankingConsentsFlowContract$FlowType = this.f247220a.f72782b;
        if (Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Default.f72742a)) {
            list = (List) iii.c.f(domainState.f247213c, new qg7.v(29), new qjj.g(5), new qbg.j(this, domainState, 7));
        } else {
            if (!Intrinsics.f(openBankingConsentsFlowContract$FlowType, OpenBankingConsentsFlowContract$FlowType.Australia.f72741a)) {
                throw new NoWhenBranchMatchedException();
            }
            Data data = domainState.f247213c;
            Data data2 = domainState.d;
            if (data2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Inactive consents data wasn't initialized for Australia flow");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                data2 = new Data(null, null, true, 3, null);
            }
            list = (List) iii.c.f(t1.t(data, data2), new s(0), new qjj.g(6), new z(this, domainState, 10));
        }
        return new o(list);
    }
}
