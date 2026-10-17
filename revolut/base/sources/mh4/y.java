package mh4;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreenContract$InputData;
import dx4.b2;
import dx4.c5;
import dx4.i0;
import dx4.l2;
import dx4.m4;
import dx4.q3;
import dx4.r0;
import dx4.r5;
import dx4.t0;
import dx4.u1;
import dx4.w1;
import dx4.x3;
import dx4.z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import zh9.u0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends oki.h implements p, ax4.d {

    @NotNull
    public static final s Companion = new s();
    public final CreditToRefinanceSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f205411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f205412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cx4.a f205413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f205414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f205415t;

    public y(cli.n stateMapper, CreditToRefinanceSelectionScreenContract$InputData inputData, j60.a bottomExpandableDialogControllerExtension, r creditToRefinanceSelectionScreenInteractor, cx4.a creditScreenConstructorControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(creditToRefinanceSelectionScreenInteractor, "creditToRefinanceSelectionScreenInteractor");
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        this.o = inputData;
        this.f205411p = bottomExpandableDialogControllerExtension;
        this.f205412q = creditToRefinanceSelectionScreenInteractor;
        this.f205413r = creditScreenConstructorControllerExtension;
        boolean z = inputData.f68297b;
        mv3.k kVar = inputData.f68298c;
        this.f205414s = mra.d.b(this, new k(new ax4.b(0), z, false, new Data(null, null, false, 3, null), null, null, kVar, null), stateMapper, null, false, 12);
    }

    @Override // ax4.d
    public final void B0(i0 bannerItem) {
        Intrinsics.checkNotNullParameter(bannerItem, "bannerItem");
        ((kx4.a) this.f205413r).B0(bannerItem);
    }

    @Override // ax4.d
    public final void B1(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f205413r.B1(config);
    }

    @Override // ax4.d
    public final void C(ax4.j maskedText) {
        Intrinsics.checkNotNullParameter(maskedText, "maskedText");
        ((kx4.a) this.f205413r).C(maskedText);
    }

    @Override // ax4.d
    public final void D1(c5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f205413r).D1(item);
    }

    @Override // ax4.d
    public final void E1(String uploadUrl, List allowedFileTypes) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
        this.f205413r.E1(uploadUrl, allowedFileTypes);
    }

    @Override // ax4.d
    public final void G0(ax4.i maskedDate) {
        Intrinsics.checkNotNullParameter(maskedDate, "maskedDate");
        ((kx4.a) this.f205413r).G0(maskedDate);
    }

    @Override // ax4.d
    public final void H1(dx4.w amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f205413r.H1(amountInputScreen);
    }

    @Override // ax4.d
    public final void I(z2 info, Function1 function1) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f205413r).I(info, null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f205413r.c3(), null, null, new v(this, null, 2), 3);
    }

    public final k I2() {
        return (k) ((j2) this.f205414s.f22677a).getValue();
    }

    public final void J2(ArrayList arrayList, mv3.g gVar) {
        Long lValueOf;
        H2(this.f205414s, new md0.c(29));
        CreditToRefinanceSelectionScreenContract$InputData creditToRefinanceSelectionScreenContract$InputData = this.o;
        mv3.k kVar = creditToRefinanceSelectionScreenContract$InputData.f68298c;
        Continuation continuation = null;
        boolean zF = Intrinsics.f(kVar != null ? d0.O0(u0.v(kVar.f209134a)) : null, d0.O0(arrayList));
        a2 a2Var = this.f205415t;
        if (a2Var != null) {
            a2Var.f(null);
        }
        mv3.k kVar2 = I2().f205395g;
        Long lValueOf2 = zF ? kVar2 != null ? Long.valueOf(kVar2.f209135b) : null : null;
        Long lValueOf3 = gVar != null ? Long.valueOf(gVar.f209123a) : null;
        mv3.k kVar3 = I2().f205395g;
        Long lValueOf4 = kVar3 != null ? Long.valueOf(kVar3.f209136c) : null;
        if (lValueOf3 == null && lValueOf4 == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(Math.max(lValueOf3 != null ? lValueOf3.longValue() : Long.MIN_VALUE, lValueOf4 != null ? lValueOf4.longValue() : Long.MIN_VALUE));
        }
        mv3.k kVar4 = I2().f205395g;
        this.f205415t = yji.l.b1(this, pyd.c.m(this.f205412q.h(new mv3.i(arrayList, lValueOf2, lValueOf, zF ? kVar4 != null ? kVar4.d : null : null, 8), w0.F(creditToRefinanceSelectionScreenContract$InputData.d))), null, new v(this, continuation, 0), 3);
    }

    @Override // ax4.d
    public final void Q0(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.f205413r.Q0(categoryId);
    }

    @Override // ax4.d
    public final void S(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        ((kx4.a) this.f205413r).S(listId);
    }

    @Override // ax4.d
    public final void T0(x3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f205413r.T0(item);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (pyd.c.E(I2().d)) {
            J2(I2().c(), null);
        }
        yji.l.b1(this, new lt.d(rd0.e.b(this.f205411p.C()), 16), null, new v(this, continuation, 1), 3);
    }

    @Override // ax4.d
    public final void U(String str) {
        this.f205413r.U(str);
    }

    @Override // ax4.d
    public final void U1(Function1 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ((kx4.a) this.f205413r).U1(body);
    }

    @Override // ax4.d
    public final void V(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f205413r).V(value);
    }

    @Override // ax4.d
    public final void Z(l2 infoActionCell) {
        Intrinsics.checkNotNullParameter(infoActionCell, "infoActionCell");
        this.f205413r.Z(infoActionCell);
    }

    @Override // ax4.d
    public final void Z1(String title, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        ((kx4.a) this.f205413r).Z1(title, url2);
    }

    @Override // ax4.d
    public final void a0(String deleteUrl) {
        Intrinsics.checkNotNullParameter(deleteUrl, "deleteUrl");
        this.f205413r.a0(deleteUrl);
    }

    @Override // ax4.d
    public final void a2(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f205413r.a2(deeplink);
    }

    @Override // ax4.d
    public final void d1(String listId, String text) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        ((kx4.a) this.f205413r).d1(listId, text);
    }

    @Override // ax4.d
    public final void e2(q3 documentItem) {
        Intrinsics.checkNotNullParameter(documentItem, "documentItem");
        this.f205413r.e2(documentItem);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f205414s;
    }

    @Override // ax4.d
    public final void h2(Pair value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((kx4.a) this.f205413r).h2(value);
    }

    @Override // ax4.d
    public final void i0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f205413r.i0(actionId);
    }

    @Override // ax4.d
    public final void k0(b2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        ((kx4.a) this.f205413r).k0(info);
    }

    @Override // ax4.d
    public final void k1(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f205413r.k1(model);
    }

    @Override // ax4.d
    public final void m(m4 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f205413r).m(item);
    }

    @Override // ax4.d
    public final void n1(dx4.y amountInputScreen) {
        Intrinsics.checkNotNullParameter(amountInputScreen, "amountInputScreen");
        this.f205413r.n1(amountInputScreen);
    }

    @Override // ax4.d
    public final void p1(t0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ((kx4.a) this.f205413r).p1(item);
    }

    @Override // ax4.d
    public final void q1(w1 expandableCheckboxItem) {
        ArrayList arrayListF0;
        i iVar;
        Iterable iterable;
        Object next;
        Intrinsics.checkNotNullParameter(expandableCheckboxItem, "expandableCheckboxItem");
        if (I2().f205396h != null || I2().d.getLoading()) {
            return;
        }
        mv3.g gVar = null;
        if (!expandableCheckboxItem.f120812g) {
            z2 z2Var = expandableCheckboxItem.i;
            if (z2Var != null) {
                I(z2Var, null);
                return;
            }
            return;
        }
        if (I2().f205396h != null) {
            return;
        }
        d0(true, true);
        ArrayList arrayListC = I2().c();
        String str = expandableCheckboxItem.f120809a;
        boolean zContains = arrayListC.contains(str);
        if (zContains) {
            arrayListF0 = d0.A0(arrayListC, str);
            iVar = i.UNSELECT;
        } else {
            arrayListF0 = d0.F0(str, arrayListC);
            iVar = i.SELECT;
        }
        H2(this.f205414s, new ma2.s(str, iVar, 16));
        mv3.k kVar = I2().f205395g;
        if (kVar == null || (iterable = kVar.f209134a) == null) {
            iterable = f0.f322471a;
        }
        if (!zContains) {
            Iterator it8 = iterable.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (Intrinsics.f(((mv3.f) next).f209120a, str)) {
                        break;
                    }
                }
            }
            mv3.f fVar = (mv3.f) next;
            if (fVar != null) {
                gVar = fVar.d;
            }
        }
        J2(arrayListF0, gVar);
    }

    @Override // ax4.d
    public final void x0(r0 cellItem) {
        Intrinsics.checkNotNullParameter(cellItem, "cellItem");
        this.f205413r.x0(cellItem);
    }

    @Override // ax4.d
    public final void x1(u1 document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f205413r.x1(document);
    }
}
