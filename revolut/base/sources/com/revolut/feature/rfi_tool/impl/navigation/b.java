package com.revolut.feature.rfi_tool.impl.navigation;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.feedback.api.navigation.OneClickFeedbackFlowDescriptor;
import com.revolut.feature.rfi_tool.api.RfiToolFlowInputData;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$ModalStep;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import uxe.l;
import vkc.e;
import vkc.f;
import vkm.j2;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements e {

    @NotNull
    private static final vkc.h Companion = new vkc.h();
    public final RfiToolFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qkc.a f85016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ra0.h f85017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tkc.a f85018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f85019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85020t;
    public final i u;

    public b(RfiToolFlowInputData inputData, qkc.a rfiToolRepository, ra0.h backendFormRepository, tkc.a endDialogModelFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rfiToolRepository, "rfiToolRepository");
        Intrinsics.checkNotNullParameter(backendFormRepository, "backendFormRepository");
        Intrinsics.checkNotNullParameter(endDialogModelFactory, "endDialogModelFactory");
        this.o = inputData;
        this.f85016p = rfiToolRepository;
        this.f85017q = backendFormRepository;
        this.f85018r = endDialogModelFactory;
        this.f85019s = hx7.e.b(this, new RfiToolFlowContract$RfiToolFlowState(0));
        final int i = 0;
        this.f85020t = new com.revolut.kompot.navigable.vc.modal.a(this, new Function2(this) { // from class: vkc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.rfi_tool.impl.navigation.b f289907b;

            {
                this.f289907b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                com.revolut.feature.rfi_tool.impl.navigation.b bVar = this.f289907b;
                switch (i2) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        RfiToolFlowContract$ModalStep step = (RfiToolFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof RfiToolFlowContract$ModalStep.OneClickFeedback)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = ((RfiToolFlowContract$ModalStep.OneClickFeedback) step).f85008a;
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ViewController viewControllerE1 = bVar.e1(new OneClickFeedbackFlowDescriptor(new OneClickFeedbackFlowContract$InputData.OneClickFeedback(null, str)));
                        viewControllerE1.l2(new vd1.a(ref$ObjectRef, bVar, 16));
                        b79.i block = new b79.i(ref$ObjectRef, 13);
                        Intrinsics.checkNotNullParameter(block, "block");
                        viewControllerE1.H = block;
                        return viewControllerE1;
                    default:
                        yki.b LazyFlowCoordinator = (yki.b) obj2;
                        RfiToolFlowContract$Step step2 = (RfiToolFlowContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                        Intrinsics.checkNotNullParameter(step2, "step");
                        if (!(step2 instanceof RfiToolFlowContract$Step.Form)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RfiToolFlowContract$Step.Form form = (RfiToolFlowContract$Step.Form) step2;
                        BackendFlowInput.Source.Session session = new BackendFlowInput.Source.Session(form.f);
                        k9 value = k9.FinCrime;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        BackendFlowApiEndpoints.Companion companion = BackendFlowApiEndpoints.INSTANCE;
                        String str2 = form.f85014c;
                        companion.getClass();
                        BackendFlowApiEndpoints backendFlowApiEndpointsA = BackendFlowApiEndpoints.Companion.a(str2);
                        boolean z = form.d;
                        ViewController viewControllerE12 = bVar.e1(new n90.a(new BackendFlowInput(session, new AnalyticsProduct.Retail(value), null, z ? BackendFlowNavigationIcon.BackArrow.f63285a : BackendFlowNavigationIcon.Cross.f63286a, z, backendFlowApiEndpointsA, 36)));
                        vgk.f block2 = new vgk.f(bVar, form, 8);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        viewControllerE12.H = block2;
                        return viewControllerE12;
                }
            }
        });
        final int i2 = 1;
        this.u = d8l.d.a(this, new Function2(this) { // from class: vkc.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.rfi_tool.impl.navigation.b f289907b;

            {
                this.f289907b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                com.revolut.feature.rfi_tool.impl.navigation.b bVar = this.f289907b;
                switch (i22) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        RfiToolFlowContract$ModalStep step = (RfiToolFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof RfiToolFlowContract$ModalStep.OneClickFeedback)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = ((RfiToolFlowContract$ModalStep.OneClickFeedback) step).f85008a;
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ViewController viewControllerE1 = bVar.e1(new OneClickFeedbackFlowDescriptor(new OneClickFeedbackFlowContract$InputData.OneClickFeedback(null, str)));
                        viewControllerE1.l2(new vd1.a(ref$ObjectRef, bVar, 16));
                        b79.i block = new b79.i(ref$ObjectRef, 13);
                        Intrinsics.checkNotNullParameter(block, "block");
                        viewControllerE1.H = block;
                        return viewControllerE1;
                    default:
                        yki.b LazyFlowCoordinator = (yki.b) obj2;
                        RfiToolFlowContract$Step step2 = (RfiToolFlowContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                        Intrinsics.checkNotNullParameter(step2, "step");
                        if (!(step2 instanceof RfiToolFlowContract$Step.Form)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RfiToolFlowContract$Step.Form form = (RfiToolFlowContract$Step.Form) step2;
                        BackendFlowInput.Source.Session session = new BackendFlowInput.Source.Session(form.f);
                        k9 value = k9.FinCrime;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        BackendFlowApiEndpoints.Companion companion = BackendFlowApiEndpoints.INSTANCE;
                        String str2 = form.f85014c;
                        companion.getClass();
                        BackendFlowApiEndpoints backendFlowApiEndpointsA = BackendFlowApiEndpoints.Companion.a(str2);
                        boolean z = form.d;
                        ViewController viewControllerE12 = bVar.e1(new n90.a(new BackendFlowInput(session, new AnalyticsProduct.Retail(value), null, z ? BackendFlowNavigationIcon.BackArrow.f63285a : BackendFlowNavigationIcon.Cross.f63286a, z, backendFlowApiEndpointsA, 36)));
                        vgk.f block2 = new vgk.f(bVar, form, 8);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        viewControllerE12.H = block2;
                        return viewControllerE12;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r6.L2(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.rfi_tool.impl.navigation.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof vkc.j
            if (r0 == 0) goto L13
            r0 = r7
            vkc.j r0 = (vkc.j) r0
            int r1 = r0.f289909w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289909w = r1
            goto L18
        L13:
            vkc.j r0 = new vkc.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289909w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r7)
            goto L7f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            goto L4a
        L37:
            yhm.o.b(r7)
            uk9.h r7 = new uk9.h
            r2 = 17
            r7.<init>(r6, r3, r2)
            r0.f289909w = r5
            java.lang.Object r7 = r6.p2(r0, r7)
            if (r7 != r1) goto L4a
            goto L7e
        L4a:
            ukc.a r7 = (ukc.a) r7
            ukc.c r2 = r7.f280722b
            ukc.c r5 = ukc.c.CHAT
            if (r2 != r5) goto L6a
            com.revolut.chat.navigation.ChatFlowDestination r7 = new com.revolut.chat.navigation.ChatFlowDestination
            com.revolut.chat.domain.model.ChatTarget$Messages r0 = new com.revolut.chat.domain.model.ChatTarget$Messages
            com.revolut.chat.domain.model.ChatFeed$Support r1 = new com.revolut.chat.domain.model.ChatFeed$Support
            r2 = 7
            r1.<init>(r3, r3, r3, r2)
            r2 = 6
            r0.<init>(r1, r3, r3, r2)
            r1 = 0
            r7.<init>(r0, r1)
            r6.C1(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6a:
            qki.d r2 = r6.f85019s
            vh2.j r3 = new vh2.j
            r5 = 13
            r3.<init>(r7, r5)
            r6.H2(r2, r3)
            r0.f289909w = r4
            java.lang.Object r6 = r6.L2(r0)
            if (r6 != r1) goto L7f
        L7e:
            return r1
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rfi_tool.impl.navigation.b.I2(com.revolut.feature.rfi_tool.impl.navigation.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.rfi_tool.impl.navigation.b r11, java.lang.String r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof vkc.m
            if (r0 == 0) goto L13
            r0 = r13
            vkc.m r0 = (vkc.m) r0
            int r1 = r0.f289913x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289913x = r1
            goto L18
        L13:
            vkc.m r0 = new vkc.m
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289913x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            java.lang.String r12 = r0.u
            yhm.o.b(r13)
        L29:
            r6 = r12
            goto L48
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            yhm.o.b(r13)
            vc2.s r13 = new vc2.s
            r2 = 20
            r13.<init>(r11, r12, r3, r2)
            r0.u = r12
            r0.f289913x = r4
            java.lang.Object r13 = r11.p2(r0, r13)
            if (r13 != r1) goto L29
            return r1
        L48:
            r10 = r13
            java.util.UUID r10 = (java.util.UUID) r10
            yki.i r12 = r11.u
            com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$Step$Form r4 = new com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlowContract$Step$Form
            com.revolut.feature.rfi_tool.api.RfiToolFlowInputData r13 = r11.o
            java.lang.String r5 = r13.f84996a
            r8 = 0
            r9 = 1
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r13 = 6
            oki.h.u2(r11, r12, r4, r3, r13)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rfi_tool.impl.navigation.b.J2(com.revolut.feature.rfi_tool.impl.navigation.b, java.lang.String, gim.c):java.lang.Object");
    }

    public final void K2() {
        if (!((RfiToolFlowContract$RfiToolFlowState) ((j2) this.f85019s.f22677a).getValue()).f85011c) {
            h.D2(this.u);
            return;
        }
        h.v2(this.f85020t, new RfiToolFlowContract$ModalStep.OneClickFeedback(this.o.f84996a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0188, code lost:
    
        if (r0 == r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b8, code lost:
    
        if (L2(r6) == r7) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r28) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rfi_tool.impl.navigation.b.L2(gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        n2(new l(this, null, 28), new f(this, 0));
    }

    public final void M2() {
        yji.l.a1(this, X1(new y0("ID_STATUS_DIALOG_ERROR", new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, new vkc.l(this, null, 1), 3);
    }

    @Override // qki.e
    public final d getState() {
        return this.f85019s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
