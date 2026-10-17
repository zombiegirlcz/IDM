package m8e;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.subaccount.impl.ui.invite.screen.decline.VaultInvitationDeclineScreenContract$InputData;
import com.revolut.feature.vaults.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultInvitationDeclineScreenContract$InputData f203537a;

    public k(VaultInvitationDeclineScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f203537a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(new cii.a(new lw0.a(new TextLocalisedClause(R$string.subaccount_group_invite_dialog_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.subaccount_group_invite_dialog_confirmation_description, u.c(this.f203537a.f89097a.d.d), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.subaccount_group_invite_dialog_action_confirm_decline, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CANCEL_INVITATION_TAG", false, null, b.f203531a, 492), new n6(new TextLocalisedClause(R$string.subaccount_group_invite_dialog_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, c.f203532a, 508), null, null, null, 121)));
    }
}
