package ew2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class x0 implements mm.b, g3l.d {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f130065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3l.a f130066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f130067c;
    public final l93.f d;

    public x0(ln.a navigationCommandsDispatcher, g3l.a statusDialogViewConfigurationDispatcher, f state, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f130065a = navigationCommandsDispatcher;
        this.f130066b = statusDialogViewConfigurationDispatcher;
        this.f130067c = state;
        this.d = revolutCardsInteractor;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        d action = (d) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        pfm.a aVarE = ue0.e.v(((ha3.x) this.d).B(((h93.f0) ((v) this.f130067c).w0().get()).f150110a)).e(this.f130066b.c0(new StatusViewConfiguration.Success("CARD_ADDED_TO_GP_STATUS_VIEW_ID", new TextLocalisedClause(R$string.card_add_to_gpay_screen_success_virtual_title, null, null, 14), new TextLocalisedClause(R$string.card_add_to_gpay_screen_success_subtitle, null, null, 14), null, null, 2040)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // g3l.d
    public final efm.d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.f(result.a().getF104385a(), "CARD_ADDED_TO_GP_STATUS_VIEW_ID")) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        v vVar = (v) this.f130067c;
        pfm.h hVarA = this.f130065a.a((NaviCommand) vVar.d.getValue(vVar, v.f130055j[2]).get());
        ufm.b bVarM2 = efm.d0.m(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return hVarA.f(bVarM2);
    }
}
