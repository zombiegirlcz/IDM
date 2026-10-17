package com.revolut.feature.credit.card.impl.ui.autopay.flow.setup;

import al4.n;
import ang.f;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$SimpleAutoPay;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$Step;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import oki.h;
import qki.d;
import un8.j;
import vkm.j2;
import vkm.t0;
import yhm.m;
import yhm.o;
import yji.l;
import yki.i;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements up4.a {
    public final i A;
    public final CreditCardSetupAutopayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lb5.b f69089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt4.b f69090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf0.h f69091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i1j.a f69092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ck4.b f69093t;
    public final f u;
    public final bp4.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zwc.a f69094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f69095x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vj4.a f69096y;
    public final d z;

    public c(CreditCardSetupAutopayFlowContract$InputData flowInput, lb5.b autopayInteractor, vt4.b creditCardDialogMapper, sf0.h serverErrorParser, i1j.a balancesFilterInteractor, ck4.b autopaySourceProvider, f userInteractor, bp4.a creditCardAutopayLocalizationProvider, zwc.a selectPaymentFlowProvider, n creditCardInteractor, vj4.a autopaySetAmountFlowUIConfigMapper) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(autopayInteractor, "autopayInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(autopaySourceProvider, "autopaySourceProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardAutopayLocalizationProvider, "creditCardAutopayLocalizationProvider");
        Intrinsics.checkNotNullParameter(selectPaymentFlowProvider, "selectPaymentFlowProvider");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(autopaySetAmountFlowUIConfigMapper, "autopaySetAmountFlowUIConfigMapper");
        this.o = flowInput;
        this.f69089p = autopayInteractor;
        this.f69090q = creditCardDialogMapper;
        this.f69091r = serverErrorParser;
        this.f69092s = balancesFilterInteractor;
        this.f69093t = autopaySourceProvider;
        this.u = userInteractor;
        this.v = creditCardAutopayLocalizationProvider;
        this.f69094w = selectPaymentFlowProvider;
        this.f69095x = creditCardInteractor;
        this.f69096y = autopaySetAmountFlowUIConfigMapper;
        this.z = e.b(this, CreditCardSetupAutopayFlowContract$State.Loading.f69080a);
        this.A = d8l.d.a(this, new umd.n(this, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r7.J2(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c r7, t61.g r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof up4.l
            if (r0 == 0) goto L13
            r0 = r9
            up4.l r0 = (up4.l) r0
            int r1 = r0.f281847y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f281847y = r1
            goto L18
        L13:
            up4.l r0 = new up4.l
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f281845w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f281847y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L70
        L2b:
            r7 = move-exception
            goto L75
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.v
            com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2b
            r6 = r7
            r7 = r8
            goto L63
        L3f:
            yhm.o.b(r9)
            if (r8 != 0) goto L47
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L47:
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            al4.n r9 = r7.f69095x     // Catch: java.lang.Throwable -> L2b
            com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$InputData r2 = r7.o     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r2.getF69072a()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = r8.f268137a     // Catch: java.lang.Throwable -> L2b
            r0.u = r7     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            r0.v = r6     // Catch: java.lang.Throwable -> L2b
            r0.f281847y = r4     // Catch: java.lang.Throwable -> L2b
            om4.x2 r9 = (om4.x2) r9     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r9.w(r2, r8, r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 != r1) goto L63
            goto L6f
        L63:
            r0.u = r5     // Catch: java.lang.Throwable -> L2b
            r0.v = r6     // Catch: java.lang.Throwable -> L2b
            r0.f281847y = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r7.J2(r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L7b
        L75:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L7b:
            java.lang.Throwable r7 = yhm.m.a(r7)
            if (r7 == 0) goto L8a
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            rd0.d.a(r9, r5, r5, r7, r8)
        L8a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c.I2(com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c, t61.g, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.d(new t0(this.z.B(new umc.c(20)), 1), h0.f322473a), null, null, new j(this, (Continuation) null, 4), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (((yb5.e) r8).i(r1, r11, r2) == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[EDGE_INSN: B:41:0x0094->B:30:0x0094 BREAK  A[LOOP:0: B:25:0x007e->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r20) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c.J2(gim.c):java.lang.Object");
    }

    public final void K2() {
        CreditCardSetupAutopayFlowContract$InputData creditCardSetupAutopayFlowContract$InputData = this.o;
        CreditCardSetupAutopayFlowContract$InputData.Create create = creditCardSetupAutopayFlowContract$InputData instanceof CreditCardSetupAutopayFlowContract$InputData.Create ? (CreditCardSetupAutopayFlowContract$InputData.Create) creditCardSetupAutopayFlowContract$InputData : null;
        up4.c cVar = create != null ? create.f69071b : null;
        int i = cVar == null ? -1 : up4.f.f281840b[cVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                C2(up4.b.f281834a);
                return;
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        h.D2(this.A);
    }

    public final boolean L2() {
        nb5.e f70734a;
        Object next;
        CreditCardSetupAutopayFlowContract$State.Content contentW7 = ((CreditCardSetupAutopayFlowContract$State) ((j2) this.z.f22677a).getValue()).W7();
        CreditCardAutopayType creditCardAutopayType = contentW7.d;
        if (creditCardAutopayType == null || (f70734a = creditCardAutopayType.getF70734a()) == null) {
            return false;
        }
        Iterator it8 = contentW7.f69074a.f70693a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof CreditCardAutopayType.BackupCard) {
                break;
            }
        }
        CreditCardAutopayType.BackupCard backupCard = (CreditCardAutopayType.BackupCard) next;
        if (backupCard == null) {
            return false;
        }
        ArrayList arrayList = backupCard.f70727c;
        if (backupCard.f70726b.contains(f70734a)) {
            return false;
        }
        return arrayList.isEmpty() || arrayList.contains(f70734a);
    }

    @Override // yki.j
    public final void M0() {
        l2(new up4.j(this, null, 1), new up4.d(this, 0));
    }

    public final void M2(CreditCardSetupAutopayFlowContract$Step creditCardSetupAutopayFlowContract$Step) {
        com.revolut.feature.credit_card.autopay.api.models_v3.a aVar;
        ArrayList arrayList = N2().f69074a.f70693a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            CreditCardAutopayType creditCardAutopayType = (CreditCardAutopayType) obj2;
            if (creditCardAutopayType.getF70734a() == nb5.e.DIRECT_DEBIT || creditCardAutopayType.getF70734a() == nb5.e.REVOLUT_POCKET) {
                arrayList2.add(obj2);
            }
        }
        CreditCardSetupAutopayFlowContract$Step.ProductArticle productArticle = CreditCardSetupAutopayFlowContract$Step.ProductArticle.f69084a;
        boolean zF = Intrinsics.f(creditCardSetupAutopayFlowContract$Step, productArticle);
        CreditCardSetupAutopayFlowContract$Step.SelectPaymentMethod selectPaymentMethod = CreditCardSetupAutopayFlowContract$Step.SelectPaymentMethod.f69085a;
        i iVar = this.A;
        if (zF) {
            wi0.b bVar = N2().f69079j;
            wi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, wi0.b.O)) {
                M2(selectPaymentMethod);
                return;
            } else {
                h.t2(this, iVar, productArticle, false, null, false, 12);
                return;
            }
        }
        CreditCardSetupAutopayFlowContract$Step creditCardSetupAutopayFlowContract$Step2 = CreditCardSetupAutopayFlowContract$Step.DirectDebit.f69082a;
        if (Intrinsics.f(creditCardSetupAutopayFlowContract$Step, creditCardSetupAutopayFlowContract$Step2)) {
            h.t2(this, iVar, creditCardSetupAutopayFlowContract$Step2, true, null, false, 12);
            return;
        }
        CreditCardSetupAutopayFlowContract$Step.SetDate setDate = CreditCardSetupAutopayFlowContract$Step.SetDate.f69087a;
        boolean zF2 = Intrinsics.f(creditCardSetupAutopayFlowContract$Step, setDate);
        CreditCardSetupAutopayFlowContract$Step.SetAmount setAmount = CreditCardSetupAutopayFlowContract$Step.SetAmount.f69086a;
        lb5.b bVar2 = this.f69089p;
        if (zF2) {
            CreditCardAutopayType creditCardAutopayType2 = (CreditCardAutopayType) d0.b0(arrayList2);
            i = (arrayList2.size() == 1 && (creditCardAutopayType2 instanceof CreditCardAutopayType.RevolutPocket)) ? 1 : 0;
            boolean zContains = creditCardAutopayType2.l9().contains(nb5.b.FIXED);
            if (!((jte.d) ((yb5.e) bVar2).f312203c).c(CreditCardApi$Toggles$SimpleAutoPay.f68692c) || i == 0 || zContains) {
                h.t2(this, iVar, setDate, true, null, false, 12);
                return;
            }
            final CreditCardAutopayType creditCardAutopayType3 = (CreditCardAutopayType) d0.b0(arrayList2);
            O2(new Function1() { // from class: up4.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i) {
                        case 0:
                            CreditCardSetupAutopayFlowContract$State.Content updateContent = (CreditCardSetupAutopayFlowContract$State.Content) obj3;
                            Intrinsics.checkNotNullParameter(updateContent, "$this$updateContent");
                            nb5.b bVar3 = nb5.b.DUE_DATE;
                            Integer f = creditCardAutopayType3.getF();
                            return CreditCardSetupAutopayFlowContract$State.Content.a(updateContent, null, null, new CreditCardAutopayPayment.PaymentDay(bVar3, f != null ? f.intValue() : 0, true), null, null, YearClass.CLASS_2015);
                        default:
                            CreditCardSetupAutopayFlowContract$State.Content updateContent2 = (CreditCardSetupAutopayFlowContract$State.Content) obj3;
                            Intrinsics.checkNotNullParameter(updateContent2, "$this$updateContent");
                            return CreditCardSetupAutopayFlowContract$State.Content.a(updateContent2, creditCardAutopayType3, null, null, null, null, 2039);
                    }
                }
            });
            M2(setAmount);
            return;
        }
        boolean zF3 = Intrinsics.f(creditCardSetupAutopayFlowContract$Step, setAmount);
        CreditCardSetupAutopayFlowContract$Step.ConfirmAutoPay confirmAutoPay = CreditCardSetupAutopayFlowContract$Step.ConfirmAutoPay.f69081a;
        if (zF3) {
            CreditCardAutopayType creditCardAutopayType4 = (CreditCardAutopayType) d0.b0(arrayList2);
            List e = creditCardAutopayType4.getE();
            boolean z = e != null && e.contains(com.revolut.feature.credit_card.autopay.api.models_v3.a.FIXED);
            List e2 = creditCardAutopayType4.getE();
            if (((!((jte.d) ((yb5.e) bVar2).f312203c).c(CreditCardApi$Toggles$SimpleAutoPay.f68692c) || z || ((e2 != null ? e2.size() : 0) > 1)) ? 0 : 1) == 0) {
                h.t2(this, iVar, setAmount, iVar.c(), null, false, 12);
                return;
            }
            List e4 = creditCardAutopayType4.getE();
            if (e4 != null && (aVar = (com.revolut.feature.credit_card.autopay.api.models_v3.a) d0.d0(e4)) != null) {
                O2(new um7.d(aVar, 17));
            }
            M2(confirmAutoPay);
            return;
        }
        if (Intrinsics.f(creditCardSetupAutopayFlowContract$Step, confirmAutoPay)) {
            h.t2(this, iVar, confirmAutoPay, false, null, false, 12);
            return;
        }
        if (!Intrinsics.f(creditCardSetupAutopayFlowContract$Step, selectPaymentMethod)) {
            if (creditCardSetupAutopayFlowContract$Step instanceof CreditCardSetupAutopayFlowContract$Step.Picker) {
                h.w2(iVar, creditCardSetupAutopayFlowContract$Step, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                return;
            }
            if (!(creditCardSetupAutopayFlowContract$Step instanceof CreditCardSetupAutopayFlowContract$Step.SetupBackupCard)) {
                if (creditCardSetupAutopayFlowContract$Step != null) {
                    throw new NoWhenBranchMatchedException();
                }
                h.D2(iVar);
                return;
            } else if (L2()) {
                h.t2(this, iVar, creditCardSetupAutopayFlowContract$Step, false, null, false, 12);
                return;
            } else {
                M2(confirmAutoPay);
                return;
            }
        }
        if ((arrayList2.size() == 1 ? 1 : 0) == 0) {
            h.t2(this, iVar, selectPaymentMethod, false, null, false, 12);
            return;
        }
        if (arrayList2.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("AutopayTypes cannot be empty");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            h.D2(iVar);
        }
        final CreditCardAutopayType creditCardAutopayType5 = (CreditCardAutopayType) d0.b0(arrayList2);
        O2(new Function1() { // from class: up4.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i) {
                    case 0:
                        CreditCardSetupAutopayFlowContract$State.Content updateContent = (CreditCardSetupAutopayFlowContract$State.Content) obj3;
                        Intrinsics.checkNotNullParameter(updateContent, "$this$updateContent");
                        nb5.b bVar3 = nb5.b.DUE_DATE;
                        Integer f = creditCardAutopayType5.getF();
                        return CreditCardSetupAutopayFlowContract$State.Content.a(updateContent, null, null, new CreditCardAutopayPayment.PaymentDay(bVar3, f != null ? f.intValue() : 0, true), null, null, YearClass.CLASS_2015);
                    default:
                        CreditCardSetupAutopayFlowContract$State.Content updateContent2 = (CreditCardSetupAutopayFlowContract$State.Content) obj3;
                        Intrinsics.checkNotNullParameter(updateContent2, "$this$updateContent");
                        return CreditCardSetupAutopayFlowContract$State.Content.a(updateContent2, creditCardAutopayType5, null, null, null, null, 2039);
                }
            }
        });
        if (!(creditCardAutopayType5 instanceof CreditCardAutopayType.DirectDebit)) {
            if (creditCardAutopayType5 instanceof CreditCardAutopayType.RevolutPocket) {
                creditCardSetupAutopayFlowContract$Step2 = setDate;
            } else {
                if (!(creditCardAutopayType5 instanceof CreditCardAutopayType.BackupCard) && !(creditCardAutopayType5 instanceof CreditCardAutopayType.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    m.Companion companion = m.INSTANCE;
                    throw new IllegalArgumentException("Unsupported payment type: " + o0.f186429a.b(creditCardAutopayType5.getClass()).m());
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    Throwable thA = m.a(o.a(th10));
                    if (thA != null) {
                        e.n(thA);
                    }
                    creditCardSetupAutopayFlowContract$Step2 = null;
                }
            }
        }
        M2(creditCardSetupAutopayFlowContract$Step2);
    }

    public final CreditCardSetupAutopayFlowContract$State.Content N2() {
        return ((CreditCardSetupAutopayFlowContract$State) ((j2) this.z.f22677a).getValue()).W7();
    }

    public final void O2(Function1 function1) {
        H2(this.z, new js7.c(29, function1));
    }

    @Override // qki.e
    public final d getState() {
        return this.z;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
