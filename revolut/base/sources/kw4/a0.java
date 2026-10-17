package kw4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ku1.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw4.f f190213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mw4.i f190214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mw4.l f190215c;
    public final cm4.r d;

    public a0(mw4.f topupMenuItemMapper, mw4.i topupMoneyInputMapper, mw4.l topupSliderMapper, cm4.r paymentsItemMapper, nw4.d balanceValidator) {
        Intrinsics.checkNotNullParameter(topupMenuItemMapper, "topupMenuItemMapper");
        Intrinsics.checkNotNullParameter(topupMoneyInputMapper, "topupMoneyInputMapper");
        Intrinsics.checkNotNullParameter(topupSliderMapper, "topupSliderMapper");
        Intrinsics.checkNotNullParameter(paymentsItemMapper, "paymentsItemMapper");
        Intrinsics.checkNotNullParameter(balanceValidator, "balanceValidator");
        this.f190213a = topupMenuItemMapper;
        this.f190214b = topupMoneyInputMapper;
        this.f190215c = topupSliderMapper;
        this.d = paymentsItemMapper;
    }

    public static m a(List list) {
        return new m(new TextLocalisedClause(R$string.credit_topup_screen_header, null, null, 14), new TextLocalisedClause(R$string.credit_topup_header_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_topup_screen_header, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), list);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f190230b, new kv7.g(this, 3), new f0(this, 16), new kcg.j(this, 17));
    }
}
