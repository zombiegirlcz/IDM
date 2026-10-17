package uv1;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.p2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import nii.g0;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import tof.f7;
import tof.h7;
import tof.i7;
import tof.q6;
import tx0.g4;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 extends oki.h implements w {

    @NotNull
    public static final y Companion = new y();
    public final sv1.d A;
    public final cli.y B;
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h12.a f283268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lx1.d f283269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vz1.j f283270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ugc.a f283271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tsk.t f283272t;
    public final zu1.a u;
    public final pn3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i4b.f f283273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c70.a f283274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tqi.g f283275y;
    public final rv1.v z;

    public d0(m mVar, h12.a apmAreaHandler, lx1.d apmContactsInteractor, vz1.j apmPreferencesRepository, ugc.a brebAreaContactsProvider, tsk.t brebAreaTransactionsProvider, zu1.a brebInteractor, pn3.a contactsPermissionsController, i4b.f legalEntityContextProvider, c70.a clipboard, tqi.g shareNaviCommandFactory, rv1.v qrCodeInteractor, sv1.d dialogsProvider, gig.t stateMapper) {
        Intrinsics.checkNotNullParameter(apmAreaHandler, "apmAreaHandler");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(apmPreferencesRepository, "apmPreferencesRepository");
        Intrinsics.checkNotNullParameter(brebAreaContactsProvider, "brebAreaContactsProvider");
        Intrinsics.checkNotNullParameter(brebAreaTransactionsProvider, "brebAreaTransactionsProvider");
        Intrinsics.checkNotNullParameter(brebInteractor, "brebInteractor");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(qrCodeInteractor, "qrCodeInteractor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mVar;
        this.f283268p = apmAreaHandler;
        this.f283269q = apmContactsInteractor;
        this.f283270r = apmPreferencesRepository;
        this.f283271s = brebAreaContactsProvider;
        this.f283272t = brebAreaTransactionsProvider;
        this.u = brebInteractor;
        this.v = contactsPermissionsController;
        this.f283273w = legalEntityContextProvider;
        this.f283274x = clipboard;
        this.f283275y = shareNaviCommandFactory;
        this.z = qrCodeInteractor;
        this.A = dialogsProvider;
        this.B = mra.d.b(this, new l(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f283273w.j(md6.g.f204489a), null, null, new b0(this, null, 2), 3);
        yji.l.a1(this, rd0.e.b(te0.w.l(((pn3.b) this.v).b(), this.f283270r.a(n02.b.BREB))), null, null, new b0(this, null, 3), 3);
        rv1.v vVar = this.z;
        yji.l.a1(this, vkm.q.Q(new exe.j(new a44.c(ue0.e.R(vVar.f257681b.f138309a, "BREB_MAIN_ALIAS_KEY", wim.z.d(o0.b(iv1.a.class))), 2), 4), new r3k.c(continuation, vVar, 14)), null, null, new b0(this, null, 4), 3);
        yji.l.a1(this, ((rv1.r) this.u).c(), null, null, new b0(this, null, 0), 3);
        yji.l.a1(this, nim.a.v(((u12.c) ((h12.h) this.f283271s.f279998b)).c(BrebContact.class), b.f), null, null, new b0(this, null, 1), 3);
        yji.l.a1(this, nim.a.v(h12.h.a((h12.h) this.f283272t.f274170b, tof.n.BREB_ALIAS, tof.l.BREB_ALIAS, null, null, 12), new c(3)), null, null, new b0(this, null, 5), 3);
        l2(new a0(this, continuation, 3), new yi5.b(26));
        if (this.o == m.BLOCK_EXTENSION) {
            n2(new a0(this, continuation, 1), new whi.b(6));
        }
    }

    public final void I2(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.f(event.a(), "ID_QR_WIDGET")) {
            if (event instanceof p2) {
                Object obj2 = ((p2) event).f55467c.f55203g;
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null) {
                    this.f283274x.c(null, str, false, new us4.b(18));
                    return;
                }
                return;
            }
            if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
                av1.d dVar = (av1.d) ((l) ((j2) this.B.f22677a).getValue()).f283279a.getContent();
                List list = dVar != null ? dVar.f9874b : null;
                Alias alias = dVar != null ? dVar.f9873a : null;
                if (list == null || alias == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (Intrinsics.f(((Alias) obj3).f61880c, AliasStatus.ACTIVE.f61885b)) {
                        arrayList.add(obj3);
                    }
                }
                C2(new u(alias, arrayList));
                return;
            }
            return;
        }
        h12.g gVarC = ((u12.a) this.f283268p).c(event);
        if (gVarC == null) {
            return;
        }
        if (gVarC.equals(h12.b.f148445a)) {
            J2(a.NewContact);
            return;
        }
        if (gVarC.equals(h12.e.f148448a)) {
            C1(new TransferDestination.PaymentsSearch(WhoToTransferFilter.ApmBreb.f79988a, 29));
            return;
        }
        if (gVarC.equals(h12.f.f148449a)) {
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {new f7(tof.l.BREB_ALIAS), new h7(tof.n.BREB_ALIAS)};
            cVar.getClass();
            C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(i7.c.b(i7VarArr), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65519)));
            return;
        }
        if (gVarC instanceof h12.d) {
            C1(((h12.d) gVarC).f148447a);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("BrebArea: " + event + " not supported.");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void J2(a model) {
        Alias alias;
        String str;
        Alias alias2;
        String str2;
        Alias alias3;
        Alias alias4;
        Intrinsics.checkNotNullParameter(model, "model");
        int i = z.f283292a[model.ordinal()];
        Continuation continuation = null;
        cli.y yVar = this.B;
        switch (i) {
            case 1:
                av1.d dVar = (av1.d) ((l) ((j2) yVar.f22677a).getValue()).f283279a.getContent();
                if (dVar == null || (alias = dVar.f9873a) == null || (str = alias.f61879b) == null) {
                    return;
                }
                this.f283274x.c(null, str, false, new us4.b(18));
                return;
            case 2:
                av1.d dVar2 = (av1.d) ((l) ((j2) yVar.f22677a).getValue()).f283279a.getContent();
                if (dVar2 == null || (alias2 = dVar2.f9873a) == null || (str2 = alias2.f61879b) == null) {
                    return;
                }
                m70.a.c(t0.f186434a);
                C1(u0.b(this.f283275y.f(0, "", str2)));
                return;
            case 3:
                C2(o.f283283a);
                return;
            case 4:
                C2(p.f283284a);
                return;
            case 5:
                av1.d dVar3 = (av1.d) ((l) ((j2) yVar.f22677a).getValue()).f283279a.getContent();
                if (dVar3 == null || (alias3 = dVar3.f9873a) == null) {
                    return;
                }
                C2(new q(alias3));
                return;
            case 6:
                C2(s.f283287a);
                return;
            case 7:
                C2(r.f283286a);
                return;
            case 8:
                C2(t.f283288a);
                return;
            case 9:
                yji.l.a1(this, X1(new y0("PENDING_DIALOG_ID", new g0(new TextLocalisedClause(R$string.apm_alias_unfreeze_dialog_pending_title, null, null, 14), new TextLocalisedClause(R$string.apm_alias_unfreeze_dialog_pending_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 4)), null, null, new a0(this, continuation, 2), 3);
                return;
            case 10:
                av1.d dVar4 = (av1.d) ((l) ((j2) yVar.f22677a).getValue()).f283279a.getContent();
                if (dVar4 == null || (alias4 = dVar4.f9873a) == null) {
                    return;
                }
                l2(new un8.j(this, alias4, continuation, 12), new g4(1, this, d0.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 27));
                return;
            case 11:
                C2(n.f283282a);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        ((pn3.b) this.v).e();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
