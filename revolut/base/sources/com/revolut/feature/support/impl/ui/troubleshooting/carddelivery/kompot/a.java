package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot;

import android.net.Uri;
import ang.f;
import cli.g;
import cli.y;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l93.e;
import mra.d;
import oki.h;
import q5g.f0;
import qee.k;
import qee.o;
import qee.u;
import qee.v;
import uz2.b;
import yf.c;
import z6l.s;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements qee.a {
    public final CardDeliveryDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f89437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f89438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f89439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f89440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f89441t;
    public final az2.b u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v f89442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f89443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f89444y;

    public a(CardDeliveryDetailsContract$InputData inputData, qee.s stateMapper, s cardsInteractor, b replaceCardInteractor, e changeAddressAllowanceInteractor, f userInteractor, c supportInteractor, az2.b terminateRevolutCardDialogProvider, j60.a bottomExpandableDialogControllerExtension, v retailRouter, u juniorRouter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(replaceCardInteractor, "replaceCardInteractor");
        Intrinsics.checkNotNullParameter(changeAddressAllowanceInteractor, "changeAddressAllowanceInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(supportInteractor, "supportInteractor");
        Intrinsics.checkNotNullParameter(terminateRevolutCardDialogProvider, "terminateRevolutCardDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(retailRouter, "retailRouter");
        Intrinsics.checkNotNullParameter(juniorRouter, "juniorRouter");
        this.o = inputData;
        this.f89437p = cardsInteractor;
        this.f89438q = replaceCardInteractor;
        this.f89439r = changeAddressAllowanceInteractor;
        this.f89440s = userInteractor;
        this.f89441t = supportInteractor;
        this.u = terminateRevolutCardDialogProvider;
        this.v = bottomExpandableDialogControllerExtension;
        int i = k.f245127a[inputData.f89434b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            retailRouter = juniorRouter;
        }
        this.f89442w = retailRouter;
        this.f89443x = d.b(this, new qee.b(null, inputData.e), stateMapper, null, false, 12);
        this.f89444y = hx7.e.a(this, new f0(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a r7, h93.f0 r8, gim.c r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof qee.n
            if (r0 == 0) goto L16
            r0 = r9
            qee.n r0 = (qee.n) r0
            int r1 = r0.f245134y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f245134y = r1
            goto L1b
        L16:
            qee.n r0 = new qee.n
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f245132w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f245134y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            l93.d r7 = r0.v
            h93.f0 r8 = r0.u
            yhm.o.b(r9)
            goto L85
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            h93.f0 r8 = r0.u
            yhm.o.b(r9)
            goto L6c
        L3f:
            yhm.o.b(r9)
            l93.e r9 = r7.f89439r
            l93.c r2 = l93.c.RETAIL
            ha3.m r9 = (ha3.m) r9
            efm.r r9 = r9.b(r2)
            qc8.a r2 = new qc8.a
            r5 = 14
            r2.<init>(r5)
            r5 = 0
            efm.r r9 = m70.a.g(r9, r5, r2, r4)
            efm.d0 r9 = r9.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r0.u = r8
            r0.f245134y = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L6c
            goto L81
        L6c:
            l93.d r9 = (l93.d) r9
            ang.f r7 = r7.f89440s
            r2 = 0
            efm.d0 r7 = r7.f(r2)
            r0.u = r8
            r0.v = r9
            r0.f245134y = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            r6 = r9
            r9 = r7
            r7 = r6
        L85:
            do3.n r9 = (do3.n) r9
            if (r7 != 0) goto L8b
            r7 = -1
            goto L93
        L8b:
            int[] r0 = qee.k.f245128b
            int r7 = r7.ordinal()
            r7 = r0[r7]
        L93:
            if (r7 == r4) goto Lab
            if (r7 != r3) goto La5
            h93.h r7 = r8.k
            com.revolut.feature.address.models.Address r7 = r7.f
            if (r7 != 0) goto La4
            kotlin.jvm.internal.Intrinsics.h(r9)
            com.revolut.feature.address.models.Address r7 = do3.q.x(r9)
        La4:
            return r7
        La5:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        Lab:
            kotlin.jvm.internal.Intrinsics.h(r9)
            com.revolut.feature.address.models.Address r7 = do3.q.x(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a.I2(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a, h93.f0, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
    
        if (r27.K2(r3, r4) == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a r27, h93.f0 r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a.J2(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a, h93.f0, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new o(this, null, 5), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f89444y;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(h93.f0 r23, gim.c r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            boolean r3 = r2 instanceof qee.m
            if (r3 == 0) goto L19
            r3 = r2
            qee.m r3 = (qee.m) r3
            int r4 = r3.f245131x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f245131x = r4
            goto L1e
        L19:
            qee.m r3 = new qee.m
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f245131x
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L39
            if (r5 != r7) goto L31
            h93.f0 r1 = r3.u
            yhm.o.b(r2)
            goto L51
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            yhm.o.b(r2)
            j60.a r2 = r0.v
            r5 = 3
            j60.a.v(r2, r6, r8, r5)
            java.lang.String r2 = r1.f150110a
            r3.u = r1
            r3.f245131x = r7
            z6l.s r5 = r0.f89437p
            java.lang.Object r2 = r5.c(r2, r3)
            if (r2 != r4) goto L51
            return r4
        L51:
            b93.j r2 = r1.f150114h
            java.lang.String r2 = r2.f13640b
            java.lang.String r2 = jli.g.c(r2)
            java.lang.String r1 = r1.f150115j
            java.lang.String r3 = " *"
            java.lang.String r1 = com.google.android.gms.internal.mlkit_vision_face.a.o(r2, r3, r1)
            nii.y0 r2 = new nii.y0
            nii.j0 r9 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.cards_core.R$string.delivery_details_cancel_order_dialog_success
            java.util.List r1 = zhm.u.c(r1)
            r4 = 12
            r10.<init>(r3, r1, r8, r4)
            r20 = 0
            r21 = 4094(0xffe, float:5.737E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1 = 5
            r2.<init>(r8, r9, r6, r1)
            kotlinx.coroutines.flow.Flow r1 = r0.X1(r2)
            olf.e r2 = new olf.e
            r3 = 28
            r2.<init>(r1, r3)
            q43.m r4 = new q43.m
            r1 = 29
            r4.<init>(r0, r8, r1)
            r5 = 3
            r1 = r2
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a.K2(h93.f0, gim.c):java.lang.Object");
    }

    public final void L2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String uri2 = clickData.f275445a;
        Object obj2 = clickData.d;
        Continuation continuation = null;
        if (Intrinsics.f(uri2, "ORDER_REPLACEMENT_LIST_ID")) {
            A1(new o(this, continuation, 3), new yi5.b(25));
            return;
        }
        boolean z = obj2 instanceof String;
        v vVar = this.f89442w;
        if (z && Intrinsics.f(uri2, "ACTION_ID_OPEN_TRACKING_LINK")) {
            String url2 = (String) obj2;
            vVar.getClass();
            Intrinsics.checkNotNullParameter(url2, "url");
            C1(new ExternalDestination.Browser(url2, null));
            return;
        }
        if (a0.H(uri2, "tel:", false) || a0.H(uri2, "mailto:", false)) {
            vVar.getClass();
            Intrinsics.checkNotNullParameter(uri2, "uri");
            C1(new ExternalDestination.ImplicitActivity(a0.H(uri2, "tel:", false) ? "android.intent.action.DIAL" : "android.intent.action.SENDTO", null, Uri.parse(uri2), 0, null, 494));
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f89443x;
    }
}
