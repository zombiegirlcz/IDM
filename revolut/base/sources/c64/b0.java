package c64;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import dx4.b2;
import dx4.c5;
import dx4.h0;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.t;
import dx4.t0;
import dx4.u1;
import dx4.w1;
import dx4.x3;
import dx4.x4;
import dx4.z2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import mx4.a1;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import vkm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends oki.h implements o, ax4.d {

    @NotNull
    public static final t Companion = new t();
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cx4.a f21608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f21609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ow3.e f21610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e64.b f21611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CalculatorScreenContract$InputData f21612t;
    public final ha3.f u;
    public final f64.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f21613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f21614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j2 f21615y;
    public final AccountCellItemDelegate z;

    public b0(j60.a bottomDialogExtension, cx4.a creditScreenConstructorControllerExtension, q interactor, ow3.e cancellationInteractor, e64.b contractorMapper, CalculatorScreenContract$InputData inputData, ha3.f cardsConfigInteractor, f64.a repaymentTypeSelectionDialogFactory, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(cancellationInteractor, "cancellationInteractor");
        Intrinsics.checkNotNullParameter(contractorMapper, "contractorMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(repaymentTypeSelectionDialogFactory, "repaymentTypeSelectionDialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = bottomDialogExtension;
        this.f21608p = creditScreenConstructorControllerExtension;
        this.f21609q = interactor;
        this.f21610r = cancellationInteractor;
        this.f21611s = contractorMapper;
        this.f21612t = inputData;
        this.u = cardsConfigInteractor;
        this.v = repaymentTypeSelectionDialogFactory;
        this.f21614x = mra.d.b(this, new k(0), stateMapper, null, false, 12);
        cv3.u.Companion.getClass();
        this.f21615y = vkm.q.c(cv3.t.a());
        this.z = new AccountCellItemDelegate();
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        h0 h0Var = bannerItem.e;
        if ((h0Var == null ? -1 : u.f21648a[h0Var.ordinal()]) == 1) {
            l2(new y(this, null), new yi5.b(26));
            return;
        }
        zhm.h0 h0Var2 = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CalculatorScreenModel", "Can't support this action " + h0Var, null, h0Var2);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f21608p.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f21608p).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f21608p).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f21608p.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f21608p).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(dx4.w amountInputScreen) {
        String str;
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        dx4.t tVar = amountInputScreen.f;
        if (tVar instanceof dx4.s) {
            str = "amountRequested";
        } else {
            if (!(tVar instanceof t.a) && !(tVar instanceof t.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "durationRequested";
        }
        f2(new CreditAmountInputScreen(com.revolut.feature.credit.application.plugins.impl.ui.amount_input.a.c(amountInputScreen, str, false)), ModalDestination.Style.POPUP.f98311a, new c1g.o(amountInputScreen, this, str, 7));
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f21608p).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f21608p.c3(), null, null, new btk.j(this, null, 23), 3);
        AccountCellItemDelegate accountCellItemDelegate = this.z;
        yji.l.a1(this, rd0.e.b(accountCellItemDelegate.f51551c.f53218h), null, null, new a0(this, null), 3);
        this.o.d(zhm.v.k(accountCellItemDelegate, new PlainTextDelegate()));
    }

    public final void I2() {
        a2 a2Var = this.f21613w;
        if (a2Var != null) {
            a2Var.f(null);
        }
        cv3.u.Companion.getClass();
        this.f21613w = yji.l.b1(this, K2(cv3.t.a()), null, new v(this, null, 0), 3);
    }

    public final k J2() {
        return (k) ((j2) this.f21614x.f22677a).getValue();
    }

    public final q0 K2(cv3.u uVar) {
        Long lB;
        Long lC;
        fu3.a aVarA;
        CalculatorScreenContract$InputData calculatorScreenContract$InputData = this.f21612t;
        Continuation continuation = null;
        if (uVar != null) {
            eu3.c cVarC = J2().c();
            if (cVarC == null || (lB = cVarC.b()) == null) {
                lB = calculatorScreenContract$InputData.f67187b;
            }
            Object orDefault = uVar.f109270a.getOrDefault("amountRequested", lB);
            if (!(orDefault instanceof Long)) {
                orDefault = null;
            }
            Long l2 = (Long) orDefault;
            if (l2 != null) {
                lB = l2;
            }
        } else {
            lB = null;
        }
        if (uVar != null) {
            eu3.c cVarC2 = J2().c();
            if (cVarC2 == null || (lC = cVarC2.c()) == null) {
                lC = calculatorScreenContract$InputData.f67188c;
            }
            Object orDefault2 = uVar.f109270a.getOrDefault("durationRequested", lC);
            if (!(orDefault2 instanceof Long)) {
                orDefault2 = null;
            }
            Long l3 = (Long) orDefault2;
            if (l3 != null) {
                lC = l3;
            }
        } else {
            lC = null;
        }
        fu3.c cVar = J2().f21632c;
        if (cVar == null || (aVarA = cVar.a()) == null) {
            aVarA = calculatorScreenContract$InputData.d;
        }
        return new q0(pyd.c.m(rd0.e.b(nim.a.w(kli.a.h(this.f21609q.b(new eu3.d(lB, lC, aVarA), w0.F(calculatorScreenContract$InputData.f)), this.u.b(false)), new c42.j(17)))), new a2c.c(2, 20, continuation), 1);
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f21608p.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f21608p).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f21608p.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (J2().c() == null) {
            I2();
        }
        yji.l.b1(this, pyd.c.m(rd0.e.n(vkm.q.Q(vkm.q.q(new bbk.z(this.f21615y, 21)), new a67.c((Continuation) null, this, 9)), zhm.h0.f322473a)), null, new v(this, null, 1), 3);
    }

    @Override // ax4.d
    public final void U(String str) {
        fu3.c cVar = J2().f21632c;
        if (cVar != null) {
            this.v.getClass();
            this.o.x(f64.a.a(cVar));
        }
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f21608p).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        InputSliderDelegate.Model model = (InputSliderDelegate.Model) value.f186385a;
        cy0.a aVar = (cy0.a) value.f186386b;
        Object obj2 = model.f52567m;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.credit.core.constructor.api.items.SliderItem");
        x4 item = (x4) obj2;
        long j2 = aVar.f110014a;
        boolean z = aVar.f110016c;
        ((e64.c) this.f21611s).getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        long jA = a1.a(j2, z, item);
        U1(new r(item, new ax4.l(item.f120841m, aVar.f110014a, jA), 0));
        String str = model.f52560a;
        boolean zF = Intrinsics.f(str, "id_borrow_amount_seek_bar");
        cli.y yVar = this.f21614x;
        if (zF) {
            H2(yVar, new a82.r(jA, 7));
        } else if (Intrinsics.f(str, "id_month_seek_bar")) {
            H2(yVar, new a82.r(jA, 8));
        }
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f21608p.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f21608p).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f21608p.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f21608p.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f21608p).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f21608p.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f21614x;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f21608p).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f21608p.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f21608p).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f21608p.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f21608p).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f21608p.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f21608p).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        this.f21608p.q1(expandableCheckboxItem);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f21608p.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f21608p.x1(document);
    }
}
