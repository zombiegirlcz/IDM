package sci;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountControllerContract$InputData;
import ip0.pr;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpectedAmountControllerContract$InputData f261756a;

    public k(ExpectedAmountControllerContract$InputData inputData, xci.b frequencyMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(frequencyMapper, "frequencyMapper");
        this.f261756a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        long j2 = domainState.f261750a;
        Long lValueOf = Long.valueOf(j2);
        if (j2 == 0) {
            lValueOf = null;
        }
        ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = this.f261756a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("AMOUNT_VALUE_ID", lValueOf != null ? new MoneyClause(new dj0.d(lValueOf.longValue(), expectedAmountControllerContract$InputData.f97765b), new MoneyClause.Format.Editable(), null, null, 12) : null, null, new TextLocalisedClause(R$string.transaction_countries_expected_amount_input_title, null, null, 14), false, null, null, null, null, null, null, false, null, null, false, false, 8194, 0, null, false, true, null, true, null, false, false, false, new dj0.d(lValueOf != null ? lValueOf.longValue() : 0L, expectedAmountControllerContract$InputData.f97765b), null, 0, -606076940, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("FREQUENCY_VALUE_ID", xci.b.a(domainState.f261751b), new TextLocalisedClause(R$string.transaction_countries_frequency_bottom_sheet_title, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, pr.f165860a, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -16777224, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, R$attr.uikit_dp8, 0, 0, null, false, 61);
        return new i(v.k(model, r.a(model2)), lValueOf != null);
    }
}
