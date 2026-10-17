package ll9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_with_photo.api.scanflow.ScanFlowFileTooLargeException;
import com.revolut.feature.pay_with_photo.impl.PayWithPhotoTaskException;
import com.revolut.feature.pay_with_photo.impl.R$string;
import e60.i;
import e60.s;
import ip0.u00;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.g;
import oli.m;
import skm.a2;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends al9.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e60.a f196679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fn2.c f196680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kl9.d f196681n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f196682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kl9.c f196683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f196684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f196685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f196686t;

    public f(e60.a mediaPickerControllerExtension, fn2.c payWithPhotoInteractor, kl9.d scanFlowProgressProducer, Set scanResultHandlers, a payWithPhotoDialogsFactory, kl9.c scanFlowFileFactory) {
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(payWithPhotoInteractor, "payWithPhotoInteractor");
        Intrinsics.checkNotNullParameter(scanFlowProgressProducer, "scanFlowProgressProducer");
        Intrinsics.checkNotNullParameter(scanResultHandlers, "scanResultHandlers");
        Intrinsics.checkNotNullParameter(payWithPhotoDialogsFactory, "payWithPhotoDialogsFactory");
        Intrinsics.checkNotNullParameter(scanFlowFileFactory, "scanFlowFileFactory");
        this.f196679l = mediaPickerControllerExtension;
        this.f196680m = payWithPhotoInteractor;
        this.f196681n = scanFlowProgressProducer;
        this.o = scanResultHandlers;
        this.f196682p = payWithPhotoDialogsFactory;
        this.f196683q = scanFlowFileFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008c -> B:12:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(ll9.f r9, il9.y r10, com.revolut.feature.transfer.models.ScannedBillDetails r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof ll9.d
            if (r0 == 0) goto L13
            r0 = r12
            ll9.d r0 = (ll9.d) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            ll9.d r0 = new ll9.d
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            int r9 = r0.z
            java.util.Iterator r10 = r0.f196677y
            il9.c r11 = r0.f196676x
            il9.v r2 = r0.f196675w
            com.revolut.feature.transfer.models.ScannedBillDetails r5 = r0.v
            il9.y r6 = r0.u
            yhm.o.b(r12)
            r8 = r2
            r2 = r11
            r11 = r6
        L36:
            r6 = r8
            goto L90
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            yhm.o.b(r12)
            il9.v r12 = r10.f162203a
            java.util.List r2 = r12.f162202a
            java.lang.Object r2 = zhm.d0.b0(r2)
            il9.c r2 = (il9.c) r2
            java.util.Set r9 = r9.o
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r5 = r9 instanceof java.util.Collection
            if (r5 == 0) goto L60
            r5 = r9
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L60
            r3 = r4
            goto L9f
        L60:
            java.util.Iterator r9 = r9.iterator()
            r5 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r4
        L69:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r10.next()
            gl9.f r6 = (gl9.f) r6
            il9.l r7 = r11.f162204b
            r0.u = r11
            r0.v = r12
            r0.f196675w = r5
            r0.f196676x = r2
            r0.f196677y = r10
            r0.z = r9
            r0.C = r3
            java.lang.Object r6 = r6.Z2(r2, r12, r7, r0)
            if (r6 != r1) goto L8c
            return r1
        L8c:
            r8 = r5
            r5 = r12
            r12 = r6
            goto L36
        L90:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9a
            r12 = r6
            goto L9f
        L9a:
            r12 = r5
            r5 = r6
            goto L69
        L9d:
            r3 = r4
            r12 = r5
        L9f:
            if (r3 == 0) goto La4
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        La4:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.util.List r10 = r12.f162202a
            int r10 = r10.size()
            java.lang.String r11 = "Unable to handle result: itemCount="
            java.lang.String r10 = a0.d.n(r11, r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ll9.f.b3(ll9.f, il9.y, com.revolut.feature.transfer.models.ScannedBillDetails, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(ll9.f r5, java.io.File r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof ll9.e
            if (r0 == 0) goto L13
            r0 = r7
            ll9.e r0 = (ll9.e) r0
            int r1 = r0.f196678w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196678w = r1
            goto L18
        L13:
            ll9.e r0 = new ll9.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196678w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28
            goto L45
        L28:
            r6 = move-exception
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            lai.d r7 = new lai.d     // Catch: java.lang.Exception -> L28
            r2 = 10
            r7.<init>(r5, r6, r4, r2)     // Catch: java.lang.Exception -> L28
            r0.f196678w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r5.Y2(r0, r7)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L45
            return r1
        L45:
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Exception -> L28
            goto L50
        L48:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L74
            r5.e3(r6)
            r7 = r4
        L50:
            if (r7 != 0) goto L55
            kotlin.Unit r5 = kotlin.Unit.f186387a
            goto L73
        L55:
            com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData r6 = new com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.pay_with_photo.impl.R$string.payments_pay_with_photo_review_disclaimer
            r2 = 14
            r0.<init>(r1, r4, r4, r2)
            r6.<init>(r7, r0)
            com.revolut.feature.pay_with_photo.impl.ui.preview.PayWithPhotoPreviewController r0 = new com.revolut.feature.pay_with_photo.impl.ui.preview.PayWithPhotoPreviewController
            r0.<init>(r6)
            kp0.m r6 = new kp0.m
            r1 = 7
            r6.<init>(r5, r7, r1)
            yji.n.S2(r5, r0, r6, r3)
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L73:
            return r5
        L74:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ll9.f.c3(ll9.f, java.io.File, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        Iterator it8 = this.o.iterator();
        while (true) {
            Continuation continuation = null;
            if (!it8.hasNext()) {
                n.j2(this, rd0.e.b(((s) this.f196679l).f122868g), null, new c(this, continuation, 1), 3);
                return;
            }
            w2((gl9.f) it8.next(), null);
        }
    }

    @Override // al9.a
    public final void Z2() {
        d3();
        a2 a2Var = this.f196685s;
        if (a2Var != null) {
            a2Var.f(null);
        }
        ((s) this.f196679l).T(new i(null, new TextLocalisedClause(R$string.payments_pay_with_photo_title, null, null, 14), new TextLocalisedClause(R$string.payments_pay_with_photo_scan_bills_cta, null, null, 14), true, 0, 0, null, null, false, u00.BACK, m.DOCUMENT_SCANNER, 7665));
    }

    public final void d3() {
        g gVar = this.f196686t;
        if (gVar != null) {
            gVar.pop();
        }
        this.f196686t = null;
    }

    public final void e3(Throwable error) {
        this.f196682p.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        n.j2(this, L2(new y0("ERROR_DIALOG_ID", error instanceof ScanFlowFileTooLargeException ? new z(new TextLocalisedClause(R$string.payments_pay_with_photo_error_file_too_large_title, null, null, 14), new TextLocalisedClause(R$string.payments_pay_with_photo_error_file_too_large_subtitle, u.c(20L), null, 12), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500) : error instanceof PayWithPhotoTaskException ? new z(new TextLocalisedClause(R$string.payments_pay_with_photo_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.payments_pay_with_photo_error_generic_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500) : new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), null, new c(this, null, 2), 3);
    }
}
