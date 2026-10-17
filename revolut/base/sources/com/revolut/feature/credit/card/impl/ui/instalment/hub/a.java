package com.revolut.feature.credit.card.impl.ui.instalment.hub;

import al4.m;
import al4.n;
import ang.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import ds4.q;
import ds4.t;
import ds4.w;
import fs4.c;
import hx7.e;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jhi.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ll4.u;
import mra.d;
import oki.h;
import om4.g3;
import om4.h3;
import om4.k0;
import om4.r1;
import om4.x2;
import org.jetbrains.annotations.NotNull;
import ql4.f0;
import ql4.g0;
import ql4.h0;
import ql4.i;
import ql4.i0;
import ql4.j0;
import ql4.l;
import ql4.l0;
import ql4.m0;
import ql4.n0;
import vkm.v1;
import w4l.j;
import wli.x;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements q {

    @NotNull
    public static final t Companion = new t();
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final CreditCardInstalmentHubScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f69390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f69391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f69392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f69393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fm4.a f69394t;
    public final f u;
    public final h3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f69395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g3 f69396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k0 f69397y;
    public final y z;

    public a(CreditCardInstalmentHubScreenContract$InputData inputData, j60.a bottomDialogExtension, c instalmentHubDialogMapper, m creditCardInstalmentInteractor, n creditCardInteractor, fm4.a creditCardInstalmentProvider, f userInteractor, h3 creditCardMsiInteractor, x deeplinkHandler, g3 creditCardMsiAdsUrlDecoratorInteractor, k0 creditCardFeatureInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(instalmentHubDialogMapper, "instalmentHubDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentProvider, "creditCardInstalmentProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardMsiInteractor, "creditCardMsiInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(creditCardMsiAdsUrlDecoratorInteractor, "creditCardMsiAdsUrlDecoratorInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69390p = bottomDialogExtension;
        this.f69391q = instalmentHubDialogMapper;
        this.f69392r = creditCardInstalmentInteractor;
        this.f69393s = creditCardInteractor;
        this.f69394t = creditCardInstalmentProvider;
        this.u = userInteractor;
        this.v = creditCardMsiInteractor;
        this.f69395w = deeplinkHandler;
        this.f69396x = creditCardMsiAdsUrlDecoratorInteractor;
        this.f69397y = creditCardFeatureInteractor;
        this.z = d.b(this, new ds4.h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.A = e.a(this, new dmb.m(22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.card.impl.ui.instalment.hub.a r5, java.lang.Object r6, gim.c r7) {
        /*
            com.revolut.kompot.navigable.vc.modal.a r0 = r5.A
            boolean r1 = r7 instanceof ds4.v
            if (r1 == 0) goto L15
            r1 = r7
            ds4.v r1 = (ds4.v) r1
            int r2 = r1.f117221w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f117221w = r2
            goto L1a
        L15:
            ds4.v r1 = new ds4.v
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f117221w
            r4 = 1
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2a
            yhm.o.b(r7)
            goto Lc1
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof cm4.e
            if (r7 == 0) goto L75
            cm4.e r6 = (cm4.e) r6
            boolean r7 = r6 instanceof cm4.d
            if (r7 == 0) goto L4d
            ds4.n r7 = new ds4.n
            cm4.d r6 = (cm4.d) r6
            java.lang.String r6 = r6.f25123b
            r7.<init>(r6)
            r5.C2(r7)
            goto Lc1
        L4d:
            boolean r7 = r6 instanceof cm4.b
            if (r7 == 0) goto L5e
            ds4.l r7 = new ds4.l
            cm4.b r6 = (cm4.b) r6
            java.lang.String r6 = r6.f25119b
            r7.<init>(r6)
            r5.C2(r7)
            goto Lc1
        L5e:
            boolean r7 = r6 instanceof cm4.c
            if (r7 == 0) goto L6f
            ds4.m r7 = new ds4.m
            cm4.c r6 = (cm4.c) r6
            java.lang.String r6 = r6.f25121b
            r7.<init>(r6)
            r5.C2(r7)
            goto Lc1
        L6f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L75:
            boolean r7 = r6 instanceof sl4.c
            if (r7 == 0) goto La5
            sl4.c r6 = (sl4.c) r6
            r1.f117221w = r4
            om4.g3 r7 = r5.f69396x
            java.lang.String r0 = r6.e
            java.lang.String r6 = r6.f
            r7.getClass()
            java.lang.String r3 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            xn.c r7 = r7.f226586a
            java.lang.String r3 = "9b8f8d3e-d6c1-4b86-8400-3573593aae7d"
            java.lang.String r6 = r7.a(r0, r3, r6)
            wli.x r5 = r5.f69395w
            lg0.a r7 = lg0.a.OPEN_BROWSER
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r5 = r5.L1(r6, r7, r0, r1)
            if (r5 != r2) goto La0
            goto La2
        La0:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        La2:
            if (r5 != r2) goto Lc1
            return r2
        La5:
            boolean r5 = r6 instanceof fs4.e
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            if (r5 == 0) goto Lb8
            com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$ModalStep$DueThisMonth r5 = new com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$ModalStep$DueThisMonth
            fs4.e r6 = (fs4.e) r6
            java.time.LocalDate r6 = r6.f137591a
            r5.<init>(r6)
            oki.h.v2(r0, r5, r7)
            goto Lc1
        Lb8:
            boolean r5 = r6 instanceof fs4.f
            if (r5 == 0) goto Lc4
            com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$ModalStep$TotalLeftToPay r5 = com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreenContract$ModalStep.TotalLeftToPay.f69389a
            oki.h.v2(r0, r5, r7)
        Lc1:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        Lc4:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.instalment.hub.a.I2(com.revolut.feature.credit.card.impl.ui.instalment.hub.a, java.lang.Object, gim.c):java.lang.Object");
    }

    public static ds4.f J2(n0 n0Var, List list, u uVar, List list2) {
        Long l2 = uVar.o;
        dj0.d dVar = new dj0.d(l2 != null ? l2.longValue() : 0L, uVar.f196542m);
        String str = uVar.f196535a;
        LocalDate localDate = oi0.d.d0(uVar.k).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        boolean z = true;
        if (!(n0Var instanceof ql4.k0)) {
            if (n0Var instanceof l0) {
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        l lVar = ((i) it8.next()).i;
                        if ((lVar != null ? lVar.f247146a : null) == ql4.m.MAX_TDPD_EXCEEDED && lVar.f247147b.isAfter(localDate)) {
                            break;
                        }
                    }
                }
            } else if (!(n0Var instanceof h0) && !(n0Var instanceof g0) && !(n0Var instanceof j0) && !(n0Var instanceof f0) && !(n0Var instanceof i0) && !(n0Var instanceof m0)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        } else if (list.isEmpty()) {
            z = false;
        }
        return new ds4.f(n0Var, dVar, str, z);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardInstalmentHubScreenContract$InputData creditCardInstalmentHubScreenContract$InputData = this.o;
        String str = creditCardInstalmentHubScreenContract$InputData.f69387a;
        r1 r1Var = (r1) this.f69392r;
        w4l.i iVar = w4l.i.f294643c;
        Flow flowM = r1Var.m(str, iVar);
        String facilityId = creditCardInstalmentHubScreenContract$InputData.f69387a;
        x2 x2Var = (x2) this.f69393s;
        w4l.h loadingStrategy = w4l.h.f294642c;
        vkm.d dVarP = x2Var.p(facilityId, loadingStrategy);
        k kVarA = ((xt4.c) this.f69394t).a(facilityId, iVar);
        akg.n nVarC = this.f69397y.c(facilityId, yw4.f.POST_PURCHASE_INSTALMENT_PLANS, loadingStrategy);
        akg.n nVarV = nim.a.v(this.u.j(j.f294644c), w.f);
        h3 h3Var = this.v;
        h3Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.q(nim.a.u(new ds4.x(this, continuation, 0), nim.a.u(new d4f.m(2, 7, continuation), u0.m(u0.i(flowM, dVarP, kVarA), u0.i(nVarC, nVarV, new v1(new of6.d(h3Var, facilityId, loadingStrategy, (Continuation) null))))))), zhm.h0.f322473a), null, null, new ds4.x(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
