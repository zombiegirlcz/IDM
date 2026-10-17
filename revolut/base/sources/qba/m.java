package qba;

import aw0.j8;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.f3;
import mx0.h3;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import u80.o;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f244165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f244166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vo9.a f244167c;
    public final l80.e d;

    public m(yof.d transferAmountMapper, o moneyPrefixFormatter, w80.b amountFormatter, vo9.a pocketMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f244165a = transferAmountMapper;
        this.f244166b = amountFormatter;
        this.f244167c = pocketMapper;
        this.d = dateProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String string = o.b(new u80.g(domainState.f244154a, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        io3.d dVar = domainState.e;
        PaymentPocketInfo paymentPocketInfoB = vo9.a.b(this.f244167c, dVar, null, 6);
        dj0.d dVar2 = domainState.f244154a;
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("ITEM_AMOUNT_INPUT_ID", null, new bw0.h(this.f244166b.e(dVar2), string, null, true, ((ppf.c) this.f244165a).f238600b, Boolean.TRUE, false, false, null, null, null, null, 32708), new f3(paymentPocketInfoB.f79169a, paymentPocketInfoB.f79170b, paymentPocketInfoB.f79171c, false, h3.ACTIVE_NOT_CLICKABLE, true), null, null, null, false, false, null, null, 2034);
        String str = domainState.f;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ITEM_NOTE_INPUT_ID", new TextClause(domainState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.pix_refund_reference_hint, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, !d0.W(domainState.d), f0.f322471a, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610612744, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        List listK = v.k(model, model2);
        j8 j8Var = new j8(new TextClause(domainState.f244155b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(domainState.f244156c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, domainState.f244155b, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, 16);
        long j2 = dVar2.f115082a;
        boolean z = j2 > 0 && j2 <= dVar.i;
        return new k(listK, j8Var, new g(z, z, domainState.f244158h, epf.b.b(domainState.i, ((l80.f) this.d).e(), false)));
    }
}
