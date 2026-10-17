package kkf;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i5 extends yji.n implements elf.s0 {

    @NotNull
    public static final f5 Companion = new f5();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f184747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.m1 f184748n;
    public final thf.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l93.f f184749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r10.q f184750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bmf.b f184751r;

    public i5(klf.h0 commonDataSource, vlf.b commonUiMapper, klf.m1 juniorDataSource, thf.m transactionTextResourcesMapper, l93.f revolutCardsInteractor, r10.q revolutPayManagementInteractor, bmf.b modalFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(revolutPayManagementInteractor, "revolutPayManagementInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        this.f184746l = commonDataSource;
        this.f184747m = commonUiMapper;
        this.f184748n = juniorDataSource;
        this.o = transactionTextResourcesMapper;
        this.f184749p = revolutCardsInteractor;
        this.f184750q = revolutPayManagementInteractor;
        this.f184751r = modalFactory;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        tof.j5 j5Var;
        boolean z = false;
        if (!Intrinsics.f(str, "ID_REV_PAY_AUTH_PAYMENT_FROM")) {
            if (Intrinsics.f(str, "ID_REV_PAY_AUTH_LINKED_ON_INFO")) {
                tof.a3 a3VarB = this.f184746l.b();
                String str2 = (a3VarB == null || (j5Var = a3VarB.f272605o1) == null) ? null : j5Var.d;
                if (str2 == null) {
                    str2 = "";
                }
                yji.n.P2(this, bmf.a.c(this.f184751r, new TextLocalisedClause(R$string.transaction_details_linked_merchant_title, null, null, 14), new TextLocalisedClause(R$string.transaction_details_linked_merchant_description, zhm.u.c(str2), null, 12), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, 56), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            }
            return Boolean.valueOf(z);
        }
        A2(new CardsCarouselFlowDestination(null, n63.b.RETAIL, b93.d.ALL, AccountId.Personal.f51414a, new CardScreenAction.Select("REVOLUT_PAY_MANAGEMENT", 4, false, false), null, 32));
        z = true;
        return Boolean.valueOf(z);
    }
}
