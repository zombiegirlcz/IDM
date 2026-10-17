package tmf;

import akf.x0;
import amf.o;
import blf.i;
import blf.k;
import cmf.p;
import hmf.k0;
import kkf.a5;
import kkf.d0;
import kkf.e;
import kkf.i9;
import kkf.k1;
import kkf.l8;
import kkf.o1;
import kkf.o2;
import kkf.x;
import kkf.y0;
import kkf.y1;
import kkf.z3;
import klf.h0;
import klf.z1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final olf.c f272198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f272199h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f272200j;
    public final y1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k1 f272201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l8 f272202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f272203n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f272204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final blf.b f272205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a5 f272206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i9 f272207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f272208t;
    public final o1 u;
    public final y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o2 f272209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z3 f272210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final clf.a f272211y;
    public final x0 z;

    public c(h0 commonDataSource, jt0.b commonHeaderProvider, olf.c arrowTitleHeaderDecorator, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, i savingsStatusWithNoteBlockProvider, y1 initiatorBlockProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, d0 confirmationBlockProvider, x chargesBlockProvider, k savingsWithdrawalTaxBlockProvider, blf.b savingsFundInfoBlockProvider, a5 recurringTransferBlockProvider, i9 userCommentBlockProvider, e analyticsBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, z3 originalTransactionBlockProvider, clf.a slotBlockProvider, x0 moveAgainActionsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(arrowTitleHeaderDecorator, "arrowTitleHeaderDecorator");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(savingsStatusWithNoteBlockProvider, "savingsStatusWithNoteBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(savingsWithdrawalTaxBlockProvider, "savingsWithdrawalTaxBlockProvider");
        Intrinsics.checkNotNullParameter(savingsFundInfoBlockProvider, "savingsFundInfoBlockProvider");
        Intrinsics.checkNotNullParameter(recurringTransferBlockProvider, "recurringTransferBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(originalTransactionBlockProvider, "originalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(moveAgainActionsProvider, "moveAgainActionsProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f272198g = arrowTitleHeaderDecorator;
        this.f272199h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f272200j = savingsStatusWithNoteBlockProvider;
        this.k = initiatorBlockProvider;
        this.f272201l = fromBlockProvider;
        this.f272202m = toAccountBlockProvider;
        this.f272203n = confirmationBlockProvider;
        this.o = chargesBlockProvider;
        this.f272204p = savingsWithdrawalTaxBlockProvider;
        this.f272205q = savingsFundInfoBlockProvider;
        this.f272206r = recurringTransferBlockProvider;
        this.f272207s = userCommentBlockProvider;
        this.f272208t = analyticsBlockProvider;
        this.u = getHelpBlockProvider;
        this.v = equivalentBlockProvider;
        this.f272209w = limitExceededBlockProvider;
        this.f272210x = originalTransactionBlockProvider;
        this.f272211y = slotBlockProvider;
        this.z = moveAgainActionsProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f272211y.Z2();
        p pVarZ22 = this.f272209w.Z2();
        p pVarA = this.v.a();
        p pVarA2 = k0.a(this.f272200j.a());
        p pVarA3 = k0.a(this.k.a(), this.f272201l.Z2(), this.f272202m.Z2(), this.f272203n.a());
        p pVarD = this.o.d(new kjk.x(7));
        p pVarC3 = this.f272210x.c3(new kjk.x(15));
        k kVar = this.f272204p;
        SharedFlow sharedFlowD = kVar.f16631a.d();
        z1 z1Var = kVar.f16632b;
        p pVar = new p(ta6.a.h(sharedFlowD, (SharedFlow) z1Var.f.getValue(), (SharedFlow) z1Var.f185619h.getValue(), new b9k.a(4, kVar, k.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/shared/savings/models/SavingsAccountDetails;Lcom/revolut/retail/taxes_models/models/Taxes;)Ljava/util/List;", 4, 2)), new bkd.a(11), u.c(kVar.f16633c), "SavingsWithdrawalTax");
        blf.b bVar = this.f272205q;
        h0 h0Var = bVar.f16617a;
        return h(v.k(pVarZ2, pVarZ22, pVarA, pVarA2, pVarA3, pVarD, pVarC3, pVar, new p(ta6.a.h(h0Var.d(), h0Var.j(), (SharedFlow) bVar.f16618b.f.getValue(), new b9k.a(4, bVar, blf.b.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/core/model/domain/user/User;Lcom/revolut/feature/shared/savings/models/SavingsAccountDetails;)Ljava/util/List;", 4, 1)), new bkd.a(8), f0.f322471a, "SavingsFundInfo"), this.f272206r.a(), this.f272208t.Z2(), this.f272207s.a(), this.u.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f272198g.c(this.f.A0(false));
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.z.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f272199h.a(new ah1.p(29)), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
