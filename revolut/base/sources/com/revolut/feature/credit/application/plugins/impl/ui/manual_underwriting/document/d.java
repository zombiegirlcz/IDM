package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document;

import android.os.Build;
import android.os.Parcelable;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentWithValidation;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import gld.e0;
import hw3.d0;
import hw3.g0;
import hw3.i0;
import hw3.s;
import hx7.e;
import ip0.u00;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pd4.i;
import pd4.k;
import pd4.m;
import pd4.n;
import pd4.p;
import pd4.r;
import pd4.w;
import t80.f;
import vkm.j2;
import vkm.q0;
import yji.l;
import zhm.f0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends h implements k {

    @NotNull
    private static final p Companion = new p();
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f67931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final py3.b f67932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pd4.b f67933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f67934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i0 f67935t;
    public final g0 u;
    public final zd4.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sf0.h f67936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final UploadDocumentsScreenContract$InputData f67937x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f67938y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public d(d0 manualUnderwritingInteractor, e60.a mediaPickerControllerExtension, py3.b creditApplicationErrorHandlerChecker, pd4.b statusDialogFactory, s documentValidationInteractor, i0 validationConfigMatcher, g0 pdfPasswordUnlockAvailabilityProvider, zd4.a localDocumentDeleter, sf0.h serverErrorParser, UploadDocumentsScreenContract$InputData inputData, m saveStateDelegate, w stateMapper) {
        Intrinsics.checkNotNullParameter(manualUnderwritingInteractor, "manualUnderwritingInteractor");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        Intrinsics.checkNotNullParameter(statusDialogFactory, "statusDialogFactory");
        Intrinsics.checkNotNullParameter(documentValidationInteractor, "documentValidationInteractor");
        Intrinsics.checkNotNullParameter(validationConfigMatcher, "validationConfigMatcher");
        Intrinsics.checkNotNullParameter(pdfPasswordUnlockAvailabilityProvider, "pdfPasswordUnlockAvailabilityProvider");
        Intrinsics.checkNotNullParameter(localDocumentDeleter, "localDocumentDeleter");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = manualUnderwritingInteractor;
        this.f67931p = mediaPickerControllerExtension;
        this.f67932q = creditApplicationErrorHandlerChecker;
        this.f67933r = statusDialogFactory;
        this.f67934s = documentValidationInteractor;
        this.f67935t = validationConfigMatcher;
        this.u = pdfPasswordUnlockAvailabilityProvider;
        this.v = localDocumentDeleter;
        this.f67936w = serverErrorParser;
        this.f67937x = inputData;
        this.f67938y = mra.d.b(this, new i(inputData.f67920a, inputData.f67921b, inputData.d, f0.f322471a, r0.g(), null), stateMapper, saveStateDelegate, false, 8);
        this.z = e.a(this, new p5f.c(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pd4.q
            if (r0 == 0) goto L13
            r0 = r7
            pd4.q r0 = (pd4.q) r0
            int r1 = r0.f235085y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235085y = r1
            goto L18
        L13:
            pd4.q r0 = new pd4.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f235083w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235085y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r2 = r0.v
            java.util.Iterator r4 = r0.u
            yhm.o.b(r7)
            goto L75
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            aim.e r7 = zhm.u.b()
            cli.y r2 = r6.f67938y
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            pd4.i r2 = (pd4.i) r2
            java.util.Map r2 = r2.e
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L52:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r2.next()
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentWithValidation r4 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentWithValidation) r4
            java.lang.String r5 = r4.f67948a
            r7.add(r5)
            java.lang.String r4 = r4.d
            if (r4 == 0) goto L52
            r7.add(r4)
            goto L52
        L6b:
            aim.e r7 = zhm.u.a(r7)
            r2 = 0
            java.util.ListIterator r7 = r7.listIterator(r2)
            r4 = r7
        L75:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L93
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            zd4.a r5 = r6.v
            r0.u = r4
            r0.v = r2
            r0.f235085y = r3
            r5.getClass()
            java.lang.Object r7 = zd4.a.a(r7, r0)
            if (r7 != r1) goto L75
            return r1
        L93:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d.I2(com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d, gim.c):java.lang.Object");
    }

    public static final void J2(d dVar, Function0 function0) {
        dVar.f67933r.getClass();
        l.a1(dVar, dVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_status_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4062), false, 5)), null, null, new e0(4, null, function0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final DocumentValidationConfig K2() {
        Object next;
        y yVar = this.f67938y;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        String referralFlagName = ((i) j2Var.getValue()).f235073b.f66476b;
        if (referralFlagName == null) {
            referralFlagName = "";
        }
        List configs = ((i) j2Var2.getValue()).d;
        this.f67935t.getClass();
        Intrinsics.checkNotNullParameter(referralFlagName, "referralFlagName");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Iterator it8 = configs.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((DocumentValidationConfig) next).f66468a, referralFlagName, true)) {
                break;
            }
        }
        DocumentValidationConfig documentValidationConfig = (DocumentValidationConfig) next;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.INFO;
        int size = ((i) j2Var2.getValue()).d.size();
        boolean z = documentValidationConfig != null;
        StringBuilder sbK = v0.a.k(size, "Looking for validation config for referral: '", referralFlagName, "', available configs: ", ", found: ");
        sbK.append(z);
        rd0.d.b(cVar, "DocumentValidation", sbK.toString(), null, null, 16);
        if (documentValidationConfig != null) {
            rd0.d.b(cVar, "DocumentValidation", a0.d.s("Using config: referralFlagName='", documentValidationConfig.f66468a, "', keywords=", zhm.d0.k0(documentValidationConfig.f66469b, null, null, null, 0, r.f235086a, 31)), null, null, 16);
        }
        return documentValidationConfig;
    }

    public final void L2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        if (Intrinsics.f(str, "ITEM_ID_DESCRIPTION_ACTION")) {
            C2(a.c.f67929a);
            return;
        }
        if (Intrinsics.f(str, "action-id-add-password")) {
            Object obj2 = clickData.d;
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                this.u.getClass();
                if (Build.VERSION.SDK_INT >= 35) {
                    DocumentWithValidation documentWithValidation = (DocumentWithValidation) ((i) ((j2) this.f67938y.f22677a).getValue()).e.get(str2);
                    DocumentValidationConfig documentValidationConfigK2 = K2();
                    if (documentValidationConfigK2 == null || documentWithValidation == null) {
                        return;
                    }
                    h.v2(this.z, new UploadDocumentsScreenContract$ModalStep.PasswordInput(str2, documentWithValidation.f67949b, documentValidationConfigK2), ModalDestination.Style.POPUP.f98311a);
                }
            }
        }
    }

    public final void M2() {
        ((e60.s) this.f67931p).T(new e60.i(null, new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_media_picker_title, null, null, 14), null, true, 0, 0, v.k(f.JPEG, f.PNG, f.PDF), null, false, u00.BACK, null, 15797));
    }

    public final void N2() {
        n2(new b(this, null, 1), new n(this, 0));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, rd0.e.b(((e60.s) this.f67931p).f122868g), null, new pd4.s(this, continuation, 1), 3);
        String applicationId = this.f67937x.d.f66892b;
        d0 d0Var = this.o;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        q34.d dVar = (q34.d) d0Var.f156059a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        l.b1(this, new q0(dVar.e.b(applicationId, w4l.i.f294643c), new pd4.s(this, continuation, 0), 1), null, null, 7);
    }

    @Override // cli.z
    public final g getState() {
        return this.f67938y;
    }
}
