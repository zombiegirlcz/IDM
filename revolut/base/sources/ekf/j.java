package ekf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.payment_links.core.R$string;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends yji.n implements elf.s0 {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f127092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f127093n;
    public final bmf.b o;

    public j(klf.h0 commonDataSource, m1 juniorDataSource, com.revolut.domain.interactors.transactions.a transactionsInteractor, bmf.b modalFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        this.f127091l = commonDataSource;
        this.f127092m = juniorDataSource;
        this.f127093n = transactionsInteractor;
        this.o = modalFactory;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "CANCEL_PAYMENT_LINK_LIST_ID")) {
            return Boolean.FALSE;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_description, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_positive, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.payments_payment_links_action_cancel_confirmation_negative, null, null, 14);
        N2(bmf.a.a(this.o, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, textLocalisedClause4, LargeActionButton.ButtonStyle.f58726b, 328), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new ei8.d(this, 11));
        return Boolean.TRUE;
    }
}
