package qc4;

import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import pwb.p;
import q43.m;
import qc4.e;
import rp0.m;
import rp0.t;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements f {

    @NotNull
    public static final g Companion = new g();
    public final DeclineInvitationPopupScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xq3.d f244559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final skd.i f244560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f244561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f244562s;

    public j(k stateMapper, DeclineInvitationPopupScreenContract$InputData inputData, xq3.d creditApplicationDeclineInvitationInteractor, skd.i slotManagerInteractor, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationDeclineInvitationInteractor, "creditApplicationDeclineInvitationInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.o = inputData;
        this.f244559p = creditApplicationDeclineInvitationInteractor;
        this.f244560q = slotManagerInteractor;
        this.f244561r = bottomDialogExtension;
        this.f244562s = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        j60.a aVar = this.f244561r;
        l.a1(this, rd0.e.b(aVar.E()), null, null, new m(this, null, 21), 3);
        m.b bVar = rp0.m.Companion;
        int i = R$string.family_credit_card_decline_invitation_dialog_title;
        DeclineInvitationPopupScreenContract$InputData declineInvitationPopupScreenContract$InputData = this.o;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(declineInvitationPopupScreenContract$InputData.f67798b.f117192a), null, 12);
        int i2 = R$string.family_credit_card_decline_invitation_dialog_description;
        ds3.c cVar = declineInvitationPopupScreenContract$InputData.f67798b;
        String str = cVar.f117193b;
        ds3.b bVar2 = cVar.f117194c;
        t tVar = new t(textLocalisedClause, new TextLocalisedClause(i2, u.c(str), null, 12), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        ds3.b bVar3 = cVar.d;
        ds3.a aVar2 = bVar3.f117191b;
        tm0 tm0Var = new tm0(defaultFilledButton, null, new TextLocalisedClause(R$string.family_credit_card_decline_invitation_dialog_primary_button, u.c(bVar3.f117190a), null, 12), false, null, aVar2 != null ? aVar2.name() : null, 24);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58725a;
        ds3.a aVar3 = bVar2.f117191b;
        aVar.x(dy4.b.b(bVar, u.c(new um0("DECLINE_BOTTOM_SHEET_ID", tm0Var, new tm0(defaultFilledButton2, null, new TextLocalisedClause(R$string.family_credit_card_decline_invitation_dialog_primary_button, u.c(bVar2.f117190a), null, 12), false, null, aVar3 != null ? aVar3.name() : null, 24), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), tVar, null, null, null, null, 1020));
    }

    public final void I2(String actionId) {
        Continuation continuation;
        ds3.a aVar;
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        ds3.a[] aVarArrValues = ds3.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            continuation = null;
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), actionId, true)) {
                break;
            } else {
                i++;
            }
        }
        int i2 = aVar == null ? -1 : h.f244558a[aVar.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                l2(new p(this, continuation, 28), new yi5.b(26));
                return;
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        C2(e.a.f244556a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244562s;
    }
}
