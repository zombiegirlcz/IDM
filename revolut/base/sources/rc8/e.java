package rc8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.junior_close_account.common.R$string;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import jul.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r4k.x;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f253221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f253222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te8.e f253223n;
    public final hj8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sc8.a f253224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sc8.b f253225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q78.e f253226r;

    public e(o cancelAccountClosureInteractor, n walletsInteractor, te8.e juniorAccountInteractor, hj8.a juniorProfileInteractor, sc8.a closeAccountResultDialogProvider, sc8.b closeConfirmationDialogProvider, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(cancelAccountClosureInteractor, "cancelAccountClosureInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(closeAccountResultDialogProvider, "closeAccountResultDialogProvider");
        Intrinsics.checkNotNullParameter(closeConfirmationDialogProvider, "closeConfirmationDialogProvider");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f253221l = cancelAccountClosureInteractor;
        this.f253222m = walletsInteractor;
        this.f253223n = juniorAccountInteractor;
        this.o = juniorProfileInteractor;
        this.f253224p = closeAccountResultDialogProvider;
        this.f253225q = closeConfirmationDialogProvider;
        this.f253226r = juniorAccountDestinationResolver;
    }

    @Override // rc8.g
    public final void Z2(String juniorId, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Continuation continuation = null;
        if (!z) {
            T2(new a(this, juniorId, continuation, 1), new yi5.b(27));
            return;
        }
        this.f253225q.getClass();
        N2(new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.junior_account_close_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.rev_u18_account_close_confirmation_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, new TextLocalisedClause(R$string.rev_u18_account_close_confirmation_action_cancel, null, null, 14), new TextLocalisedClause(R$string.junior_account_close_confirmation_action_proceed, null, null, 14), false, null, null, null, false, 16774092)), ModalDestination.Style.POPUP.f98311a, new x(this, juniorId, 22));
    }
}
