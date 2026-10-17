package lh6;

import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsMode;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreenContract$InputData;
import ip0.kr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpdateLimitsScreenContract$InputData f195173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bh6.h f195174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0.b f195175c;
    public final b d;

    public n(UpdateLimitsScreenContract$InputData inputData, bh6.h termsAndConditionsMapper, qd0.b languageProvider, b helperTextMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsAndConditionsMapper, "termsAndConditionsMapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(helperTextMapper, "helperTextMapper");
        this.f195173a = inputData;
        this.f195174b = termsAndConditionsMapper;
        this.f195175c = languageProvider;
        this.d = helperTextMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a aVar;
        a aVar2;
        Iterable iterableC;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ((c) this.d).getClass();
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f;
        dj0.d dVar2 = domainState.f195167c;
        dj0.d dVar3 = domainState.f195166b;
        dj0.d dVar4 = domainState.f195165a;
        if (dVar != null ? dVar4.f(dVar) : false) {
            aVar = new a(new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_month_upper_limit_exceeded, u.c(new MoneyClause(pyd.c.M(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), true);
        } else if (dVar3.i(dVar4)) {
            aVar = new a(new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_transfer_max_per_month_exceeded, null, null, 14), true);
        } else {
            aVar = dVar2 != null ? dVar4.i(dVar2) : false ? new a(new TextLocalisedClause(R$string.open_banking_mandate_limits_error_message, null, null, 14), true) : domainState.d ? new a(new TextLocalisedClause(R$string.open_banking_mandate_limits_suggested_value, null, null, 14), false) : new a(null, false);
        }
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (dVar != null ? dVar3.f(dVar) : false) {
            aVar2 = new a(new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_month_upper_limit_exceeded, u.c(new MoneyClause(pyd.c.M(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), true);
        } else {
            aVar2 = dVar2 != null ? dVar3.i(dVar2) : false ? new a(new TextLocalisedClause(R$string.open_banking_mandate_limits_error_message, null, null, 14), true) : domainState.e ? new a(new TextLocalisedClause(R$string.open_banking_mandate_limits_suggested_value, null, null, 14), false) : new a(null, false);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_transfer, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(domainState.f195165a, new MoneyClause.Format.Editable(), null, null, 12);
        s80.b bVar = (s80.b) this.f195175c;
        m mVar = new m(bVar.b());
        Clause clause = aVar.f195159a;
        boolean z = aVar.f195160b;
        kr krVar = kr.f165065a;
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_MAX_PER_TRANSFER", moneyClause, textLocalisedClause, null, false, null, false, clause, null, null, null, null, null, false, null, null, z, false, false, false, krVar, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, mVar, null, null, 0, 0, 0, 0, -539099272, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_MAX_PER_MONTH", new MoneyClause(domainState.f195166b, new MoneyClause.Format.Editable(), null, null, 12), new TextLocalisedClause(R$string.open_banking_mandate_limits_max_per_month, null, null, 14), null, false, null, false, aVar2.f195159a, null, null, null, null, null, false, null, null, aVar2.f195160b, false, false, false, krVar, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, new m(bVar.b()), null, null, 0, 0, 0, 0, -539099272, 65023);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        List listK = v.k(model, model2);
        UpdateLimitsMode updateLimitsMode = this.f195173a.f72468a;
        if (updateLimitsMode instanceof UpdateLimitsMode.ReturnNewLimits) {
            iterableC = f0.f322471a;
        } else {
            boolean z3 = updateLimitsMode instanceof UpdateLimitsMode.UpdateMandate;
            bh6.h hVar = this.f195174b;
            if (z3) {
                iterableC = u.c(((bh6.i) hVar).a(bh6.g.UPDATE_SCREEN));
            } else {
                if (!(updateLimitsMode instanceof UpdateLimitsMode.UpdateStoredMethodLimits)) {
                    throw new NoWhenBranchMatchedException();
                }
                iterableC = u.c(((bh6.i) hVar).a(bh6.g.UPDATE_SCREEN));
            }
        }
        return new j(d0.E0(iterableC, listK), (aVar.f195160b || aVar2.f195160b) ? false : true);
    }
}
