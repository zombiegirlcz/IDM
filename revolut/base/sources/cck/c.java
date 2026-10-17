package cck;

import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.mappers.PlanGiftingSenderDialogMapper$InsufficientFundsDialogPayload;
import dj0.d;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23125a;

    public c(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f23125a = serverErrorParser;
    }

    public final z a(Throwable th10) {
        ServerError serverErrorA = this.f23125a.a(th10);
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        Lazy lazyY0 = w.y0(new bvb.a(serverErrorA, 13));
        if (numValueOf == null || numValueOf.intValue() != 1006 || ((d) lazyY0.getValue()) == null) {
            return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
        }
        d dVar = (d) lazyY0.getValue();
        Intrinsics.i(dVar, "null cannot be cast to non-null type com.revolut.core.model.money.Money");
        return new z(new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.plan_gifting_insufficient_funds_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.plan_gifting_insufficient_funds_subtitle, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), new TextLocalisedClause(com.revolut.retail.feature.plan_gifting.impl.R$string.plan_gifting_insufficient_funds_top_up_button, null, null, 14), null, null, new PlanGiftingSenderDialogMapper$InsufficientFundsDialogPayload(dVar), false, null, null, null, null, null, null, 32628);
    }
}
