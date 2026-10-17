package b94;

import bbk.d0;
import bo8.b0;
import buf.a1;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementNewsItem;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.sso.api.models.RevolutAccountSession;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f13661w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f13662x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Continuation continuation, yji.l lVar) {
        super(1, continuation);
        this.u = i;
        this.f13662x = lVar;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jei.b bVar = ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f13661w).u;
            gei.a tile = (gei.a) this.f13662x;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(tile, "tile");
            mei.g gVar = bVar.f173401a;
            String tileId = tile.f143299a;
            String strA = bVar.a(tile, "message_id");
            String strA2 = bVar.a(tile, "campaign_id");
            Intrinsics.checkNotNullParameter(tileId, "tileId");
            int i2 = 2;
            pfm.h hVar = new pfm.h(new mei.a(gVar, y0.b(tileId), 0), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            pfm.a aVarE = efm.b.r(v.k(hVar, gVar.f204691a.closeTile(tileId, new kei.d((strA == null && strA2 == null) ? null : new kei.h(tileId, strA, strA2))))).e(new pfm.h(new mei.c(gVar, 0), 2));
            la8.j jVar = new la8.j(gVar, tileId, 12);
            dfm.c cVar = mfm.f.d;
            en.a aVar2 = mfm.f.f205043c;
            pfm.a aVar3 = new pfm.a(new pfm.t(aVarE, cVar, cVar, aVar2, aVar2, aVar2, jVar), new ma1.v(27, new ma2.s(gVar, tileId, 9)), i2);
            Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
            pfm.a aVarV = ue0.e.v(w.g0(aVar3));
            this.v = 1;
            if (nim.a.a(aVarV, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) this.f13661w, (qu3.n) this.f13662x, continuation, 0);
            case 1:
                return new s((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f13661w, (String) this.f13662x, continuation, 1);
            case 2:
                return new s(2, continuation, (com.revolut.feature_retail_user_declarations.bank_terms.a) this.f13662x);
            case 3:
                return new s((ke9.i) this.f13661w, (com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b) this.f13662x, continuation, 3);
            case 4:
                return new s(4, continuation, (d0) this.f13662x);
            case 5:
                return new s(5, continuation, (be3.m) this.f13662x);
            case 6:
                return new s((com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a) this.f13661w, (Customer) this.f13662x, continuation, 6);
            case 7:
                return new s(7, continuation, (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) this.f13662x);
            case 8:
                return new s((com.revolut.feature.retail.salary_account.impl.flow.ui.d) this.f13661w, (bgb.c) this.f13662x, continuation, 8);
            case 9:
                return new s((bgg.b) this.f13661w, (String) this.f13662x, continuation, 9);
            case 10:
                return new s((bi2.o) this.f13661w, (Alias) this.f13662x, continuation, 10);
            case 11:
                return new s((bi2.o) this.f13661w, (RegisterAlias$Alias) this.f13662x, continuation, 11);
            case 12:
                return new s((com.revolut.feature.junior_onboarding.impl.ui.creation.a) this.f13661w, (ei8.c) this.f13662x, continuation, 12);
            case 13:
                return new s((com.revolut.feature.tab.invest.impl.ui.home.f) this.f13661w, (WealthAction) this.f13662x, continuation, 13);
            case 14:
                return new s((com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c) this.f13661w, (xl9.i) this.f13662x, continuation, 14);
            case 15:
                return new s((bmk.q) this.f13661w, (String) this.f13662x, continuation, 15);
            case 16:
                return new s((b0) this.f13661w, (bo8.d) this.f13662x, continuation, 16);
            case 17:
                return new s((bq8.e) this.f13661w, (v60.d) this.f13662x, continuation, 17);
            case 18:
                return new s((com.revolut.sso.impl.ui.signin_sessions_flow.a) this.f13661w, (RevolutAccountSession) this.f13662x, continuation, 18);
            case 19:
                return new s((com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) this.f13661w, (cqc.c) this.f13662x, continuation, 19);
            case 20:
                return new s(this.f13661w, (brf.f) this.f13662x, continuation, 20);
            case 21:
                return new s((bt2.k) this.f13661w, (RewardTargetAccount) this.f13662x, continuation, 21);
            case 22:
                return new s((bu4.m) this.f13661w, (dj0.d) this.f13662x, continuation, 22);
            case 23:
                return new s(23, continuation, (a1) this.f13662x);
            case 24:
                return new s((bvb.r) this.f13661w, (rub.i) this.f13662x, continuation, 24);
            case 25:
                return new s(25, continuation, (bvb.r) this.f13662x);
            case 26:
                return new s((com.revolut.feature.kyc.impl.screens.documentid_input.b) this.f13661w, (TermsScope) this.f13662x, continuation, 26);
            case 27:
                return new s((ChaosManagementNewsItem) this.f13661w, (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f13662x, continuation, 27);
            case 28:
                return new s((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f13661w, (gei.a) this.f13662x, continuation, 28);
            default:
                return new s((PopupMenuItem) this.f13661w, (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f13662x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:546:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b94.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f13661w = obj2;
        this.f13662x = obj3;
    }
}
