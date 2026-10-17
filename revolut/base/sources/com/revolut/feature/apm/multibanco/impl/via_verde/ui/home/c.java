package com.revolut.feature.apm.multibanco.impl.via_verde.ui.home;

import cli.n;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeContract$Action;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeContract$Step;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import klf.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l5a.u;
import l92.g;
import l92.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tof.q6;
import ukm.f;
import vkm.q;
import vkm.z1;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements l92.d {

    @NotNull
    public static final o Companion = new o();
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e92.a f62662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f62664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f62665s;

    public c(g provider, e92.a addEnrollmentMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(addEnrollmentMapper, "addEnrollmentMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = provider;
        this.f62662p = addEnrollmentMapper;
        this.f62663q = e.a(this, new v(this, 17));
        this.f62664r = mra.d.b(this, new l92.a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f62665s = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f62665s, new a3(continuation, this, 23)), null, null, new l1g.e(this, continuation, 14), 3);
    }

    public final void I2(Object obj2) {
        boolean z = obj2 instanceof ViaVerdeHomeContract$Action;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f62663q;
        ModalDestination.Style.FULLSCREEN_FADE fullscreen_fade = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        if (!z) {
            if (obj2 instanceof ViaVerdeEnrollment) {
                h.v2(aVar, new ViaVerdeHomeContract$Step.Details((ViaVerdeEnrollment) obj2), fullscreen_fade);
                return;
            }
            if (obj2 instanceof tof.a3) {
                C1(u0.c(new TransactionsFeatureConfig.Details(ofm.q.P((tof.a3) obj2), null, null, null, 126)));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "Unknown ViaVerde parcel: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        ViaVerdeHomeContract$Action viaVerdeHomeContract$Action = (ViaVerdeHomeContract$Action) obj2;
        if (viaVerdeHomeContract$Action instanceof ViaVerdeHomeContract$Action.AddEnrollment) {
            f92.b bVar = ((ViaVerdeHomeContract$Action.AddEnrollment) viaVerdeHomeContract$Action).f62653a;
            if (bVar == null) {
                h.v2(aVar, ViaVerdeHomeContract$Step.AddEnrollmentDialog.f62659a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            } else {
                h.v2(aVar, new ViaVerdeHomeContract$Step.AddEnrollment(bVar), fullscreen_fade);
                return;
            }
        }
        if (viaVerdeHomeContract$Action instanceof ViaVerdeHomeContract$Action.SeeAllEnrollments) {
            h.v2(aVar, ViaVerdeHomeContract$Step.SeeAllEnrollments.f62661a, fullscreen_fade);
            return;
        }
        if (viaVerdeHomeContract$Action instanceof ViaVerdeHomeContract$Action.SeeAllTransactions) {
            this.o.getClass();
            C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(g.a(), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65519)));
        } else if (viaVerdeHomeContract$Action instanceof ViaVerdeHomeContract$Action.Retry) {
            H2(this.f62664r, new u(20));
            this.f62665s.k(Unit.f186387a);
        } else {
            if (!(viaVerdeHomeContract$Action instanceof ViaVerdeHomeContract$Action.Help)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(u0.c(new FaqFeatureConfig.Starter("c2f78b3f-48a2-483d-9609-ea1974970f5f", 2)));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62663q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f62664r;
    }
}
