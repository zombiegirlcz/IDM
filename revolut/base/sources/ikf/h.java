package ikf;

import akf.t1;
import akf.v1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mjf.u;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends n implements s0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f161949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f161950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f161951n;
    public final bmf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k71.i f161952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f161953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f161954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f161955s;

    public h(h0 commonDataSource, m1 juniorDataSource, u recallableInteractor, bmf.b modalFactory, k71.i transactionDescriptor, gte.a featureToggleInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(recallableInteractor, "recallableInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f161949l = commonDataSource;
        this.f161950m = juniorDataSource;
        this.f161951n = recallableInteractor;
        this.o = modalFactory;
        this.f161952p = transactionDescriptor;
        this.f161953q = featureToggleInteractor;
        this.f161954r = transactionsInteractor;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f161955s = z1VarB;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        ActionsBottomSheetController actionsBottomSheetControllerA;
        if (!a10.b.B(v1.Companion, t1.CANCEL, str)) {
            return Boolean.FALSE;
        }
        String str2 = (String) obj2;
        if (Intrinsics.f(str2, "awaiting_cardholder_verification")) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transactionUI_transaction_cancel_prompt_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.transactionUI_transaction_cancel_prompt_description, null, null, 14);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.transactionUI_transaction_cancel_prompt_button_confirm, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.transactionUI_transaction_cancel_prompt_button_cancel, null, null, 14);
            actionsBottomSheetControllerA = bmf.a.a(this.o, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, textLocalisedClause4, LargeActionButton.ButtonStyle.f58726b, 328);
        } else {
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.transactionUI_transaction_details_cancel_confirmation_title, null, null, 14);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.transactionUI_transaction_details_cancel_confirmation_description, null, null, 14);
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.transactionUI_transaction_details_cancel_confirmation_button_confirm, null, null, 14);
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.transactionUI_transaction_details_cancel_confirmation_button_cancel, null, null, 14);
            actionsBottomSheetControllerA = bmf.a.a(this.o, textLocalisedClause5, textLocalisedClause6, textLocalisedClause7, LargeActionButton.ButtonStyle.f58725a, textLocalisedClause8, LargeActionButton.ButtonStyle.f58726b, 328);
        }
        N2(actionsBottomSheetControllerA, ModalDestination.Style.BOTTOM_DIALOG.f98301a, new ijg.c(this, str2, 2));
        return Boolean.TRUE;
    }
}
