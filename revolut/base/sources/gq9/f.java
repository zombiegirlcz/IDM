package gq9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_with_photo.api.scanflow.ScanFlowFileTooLargeException;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.groups.api.R$string;
import e60.s;
import g2e.t;
import ip0.u00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import nii.z;
import oli.m;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import wp9.h0;
import yji.n;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e60.a f145603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f145604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kl9.d f145605n;
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kl9.c f145606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i90.b f145607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SplitBillInputData f145608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h0 f145609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h0 f145610t;
    public a2 u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public oki.g f145611w;

    public f(e60.a mediaPickerControllerExtension, t scanBillInteractor, kl9.d scanFlowProgressProducer, i scanBillDialogsFactory, kl9.c scanFlowFileFactory, i90.b uuidUtils, SplitBillInputData inputData) {
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(scanBillInteractor, "scanBillInteractor");
        Intrinsics.checkNotNullParameter(scanFlowProgressProducer, "scanFlowProgressProducer");
        Intrinsics.checkNotNullParameter(scanBillDialogsFactory, "scanBillDialogsFactory");
        Intrinsics.checkNotNullParameter(scanFlowFileFactory, "scanFlowFileFactory");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f145603l = mediaPickerControllerExtension;
        this.f145604m = scanBillInteractor;
        this.f145605n = scanFlowProgressProducer;
        this.o = scanBillDialogsFactory;
        this.f145606p = scanFlowFileFactory;
        this.f145607q = uuidUtils;
        this.f145608r = inputData;
    }

    public static final boolean Z2(f fVar, List list) {
        Iterator it8 = list.iterator();
        long j2 = 0;
        while (it8.hasNext()) {
            j2 += ((jp9.c) it8.next()).f177235b;
        }
        List list2 = fVar.f145608r.f79198b;
        dj0.d.Companion.getClass();
        dj0.d dVarA = dj0.d.e;
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarA = i == 0 ? com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a() : pyd.c.O(dVarA, com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a());
            i = i2;
        }
        return j2 == dVarA.f115082a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(gq9.f r12, java.io.File r13, gim.c r14) {
        /*
            boolean r0 = r14 instanceof gq9.c
            if (r0 == 0) goto L13
            r0 = r14
            gq9.c r0 = (gq9.c) r0
            int r1 = r0.f145598w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145598w = r1
            goto L18
        L13:
            gq9.c r0 = new gq9.c
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f145598w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)     // Catch: java.lang.Exception -> L28
            goto L46
        L28:
            r0 = move-exception
            r13 = r0
            goto L49
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r14)
            gi2.i r14 = new gi2.i     // Catch: java.lang.Exception -> L28
            r2 = 8
            r14.<init>(r12, r13, r4, r2)     // Catch: java.lang.Exception -> L28
            r0.f145598w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r14 = r12.Y2(r0, r14)     // Catch: java.lang.Exception -> L28
            if (r14 != r1) goto L46
            return r1
        L46:
            java.io.File r14 = (java.io.File) r14     // Catch: java.lang.Exception -> L28
            goto L51
        L49:
            boolean r14 = r13 instanceof java.util.concurrent.CancellationException
            if (r14 != 0) goto L92
            r12.f3(r13)
            r14 = r4
        L51:
            if (r14 != 0) goto L56
            kotlin.Unit r12 = kotlin.Unit.f186387a
            goto L91
        L56:
            com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData r13 = new com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.payments.groups.api.R$string.split_bill_scan_bill_ai_disclaimer
            com.revolut.core.ui_kit.models.TextLocalisedClause r2 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r5 = com.revolut.feature.payments.groups.api.R$string.action_common_learn_more
            com.revolut.core.ui_kit.models.Click r6 = new com.revolut.core.ui_kit.models.Click
            r8 = 0
            r7 = 30
            r9 = 0
            java.lang.String r10 = "split_bill_itemize_scan_preview_learn_more"
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r7 = 10
            r2.<init>(r5, r4, r6, r7)
            java.util.List r2 = zhm.u.c(r2)
            r5 = 12
            r0.<init>(r1, r2, r4, r5)
            r13.<init>(r14, r0)
            al9.h r0 = new al9.h
            r0.<init>(r13)
            com.revolut.kompot.navigable.vc.ViewController r13 = r12.o2(r0)
            fb.c r0 = new fb.c
            r1 = 7
            r0.<init>(r12, r14, r1)
            yji.n.S2(r12, r13, r0, r3)
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L91:
            return r12
        L92:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gq9.f.b3(gq9.f, java.io.File, gim.c):java.lang.Object");
    }

    public static final void c3(f fVar, ArrayList arrayList, ItemizedBillData.ScanData scanData) {
        fVar.o.getClass();
        n.j2(fVar, fVar.L2(new y0("SCAN_BILL_AMOUNT_MISMATCH_DIALOG_ID", new l0(new TextLocalisedClause(R$string.split_bill_scan_bill_amount_missmatch_title, null, null, 14), new TextLocalisedClause(R$string.split_bill_scan_bill_amount_missmatch_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.split_bill_scan_bill_amount_missmatch_action_primary, null, null, 14), new TextLocalisedClause(R$string.split_bill_scan_bill_amount_missmatch_action_secondary, null, null, 14), null, true, null, 932), false, 4)), null, new d(fVar, arrayList, scanData, null), 3);
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, rd0.e.b(((s) this.f145603l).f122868g), null, new b(this, null, 1), 3);
    }

    public final void d3() {
        oki.g gVar = this.f145611w;
        if (gVar != null) {
            gVar.pop();
        }
        this.f145611w = null;
    }

    public final void e3() {
        d3();
        a2 a2Var = this.v;
        if (a2Var != null) {
            a2Var.f(null);
        }
        ((s) this.f145603l).T(new e60.i(null, new TextLocalisedClause(R$string.split_bill_itemize_camera_title, null, null, 14), null, true, 0, 0, null, null, false, u00.BACK, m.DOCUMENT_SCANNER, 7669));
    }

    public final void f3(Throwable error) {
        this.o.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        n.j2(this, L2(new y0("SCAN_BILL_ERROR_DIALOG_ID", error instanceof ScanFlowFileTooLargeException ? new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502) : new z(new TextLocalisedClause(R$string.split_bill_itemize_scan_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.split_bill_itemize_scan_error_generic_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4)), null, new b(this, null, 2), 3);
    }
}
