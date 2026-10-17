package com.revolut.feature.spending_analytics.impl.ui.rev10.group_details;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$InputData;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import gmd.d;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l5i.q;
import le3.p;
import oki.h;
import q97.g3;
import qm2.c;
import qpb.i;
import qpd.f;
import qpd.g;
import qpd.m;
import qpd.o;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements g {
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GroupDetailsScreenContract$InputData f87706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f87707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f87708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ujf.h f87709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f87710t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f87711w;

    public a(q analyticsTransactionsInteractor, GroupDetailsScreenContract$InputData inputData, gte.a featureToggleInteractor, p categorisationTransactionFilterInteractor, ujf.h transactionSwipeActionHandler, d jointAccountParticipantsProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(categorisationTransactionFilterInteractor, "categorisationTransactionFilterInteractor");
        Intrinsics.checkNotNullParameter(transactionSwipeActionHandler, "transactionSwipeActionHandler");
        Intrinsics.checkNotNullParameter(jointAccountParticipantsProvider, "jointAccountParticipantsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = analyticsTransactionsInteractor;
        this.f87706p = inputData;
        this.f87707q = featureToggleInteractor;
        this.f87708r = categorisationTransactionFilterInteractor;
        this.f87709s = transactionSwipeActionHandler;
        this.f87710t = jointAccountParticipantsProvider;
        this.u = mra.d.b(this, new f(new Data(null, null, true, 3, null), null, GroupingExtraData.None.f87450a), stateMapper, null, false, 12);
        this.v = e.a(this, new c(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f87708r.a(this.f87706p.f87688b)), null, null, new o(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        he3.l lVar;
        Flow gVar;
        GroupDetailsScreenContract$InputData groupDetailsScreenContract$InputData = this.f87706p;
        CategorisationFilter categorisationFilter = groupDetailsScreenContract$InputData.f87688b;
        AnalyticsAccountsSelection analyticsAccountsSelection = groupDetailsScreenContract$InputData.f87689c;
        ge3.b bVar = new ge3.b(categorisationFilter, analyticsAccountsSelection);
        q qVar = this.o;
        akg.n nVarC = qVar.c(bVar);
        GroupDetailsScreenContract$InputData.Group group = groupDetailsScreenContract$InputData.f87687a;
        if (group == null || (group instanceof GroupDetailsScreenContract$InputData.Group.CategoryGroup)) {
            lVar = he3.l.CATEGORY;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.CountryGroup) {
            lVar = he3.l.COUNTRY;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.MerchantGroup) {
            lVar = he3.l.MERCHANT;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.CurrencyGroup) {
            lVar = he3.l.CURRENCY;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.CardholderGroup) {
            lVar = he3.l.CARDHOLDERS;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.ParticipantGroup) {
            lVar = he3.l.PARTICIPANTS;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.SavingsTransactionType) {
            lVar = he3.l.SAVINGS_TRANSACTION_TYPE;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.SavingsOperationType) {
            lVar = he3.l.SAVINGS_OPERATION_TYPE;
        } else if (group instanceof GroupDetailsScreenContract$InputData.Group.SourceAccountGroup) {
            lVar = he3.l.SOURCE_ACCOUNT;
        } else {
            if (!(group instanceof GroupDetailsScreenContract$InputData.Group.CardGroup)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = he3.l.CARD;
        }
        Continuation continuation = null;
        t38.e eVarM = u0.m(nVarC, nim.a.v(nim.a.v(nim.a.v(qVar.b(new ge3.c(groupDetailsScreenContract$InputData.f87688b, analyticsAccountsSelection, (Priority.HIGH) null, 12)), new qgf.o(lVar, 21)), m.f248362a), new qgf.o(group, 22)));
        int i = 1;
        l.b1(this, nim.a.v(eVarM, new i(i)), null, new o(this, continuation, i), 3);
        if (group instanceof GroupDetailsScreenContract$InputData.Group.ParticipantGroup) {
            gVar = new g3(mo3.a.e(this.f87710t.a(ind.a.b(analyticsAccountsSelection.getF99208a())), new qjj.g(22), new qjj.g(23)), 1);
        } else {
            gVar = new go.g(GroupingExtraData.None.f87450a, 2);
        }
        l.b1(this, gVar, null, new o(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
