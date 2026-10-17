package zba;

import aw0.o9;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f320864a;

    public k(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f320864a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f320855a;
        boolean z = dVar.f115082a > 0;
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, new bw0.h(this.f320864a.e(dVar), o.b(new u80.g(domainState.f320855a, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), true, null, Boolean.TRUE, false, false, false, false, null, 6100), null, null, null, null, false, false, null, null, 2042);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ITEM_AMOUNT_DESCRIPTION_ID", new TextClause(domainState.f320857c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pix_qr_request_description_label, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return new h(v.k(model, model2), z);
    }
}
