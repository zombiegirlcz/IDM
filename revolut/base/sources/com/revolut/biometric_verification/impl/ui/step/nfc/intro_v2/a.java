package com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2;

import android.content.Intent;
import android.os.Parcelable;
import au.a0;
import au.c0;
import au.f0;
import au.k;
import au.m;
import au.n;
import au.o;
import au.p;
import au.r;
import au.s;
import au.t;
import au.u;
import au.x;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import cu.e;
import cu.g;
import d8l.d;
import hu.c;
import hu.f;
import iy.b;
import java.util.concurrent.CopyOnWriteArrayList;
import kmi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.g0;
import nii.h0;
import nii.j;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import oki.h;
import skm.a2;
import te0.w;
import vkm.j2;
import vkm.q;
import vkm.y;
import vkm.z1;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends h implements u {
    public final z1 A;
    public final Object B;
    public final i C;
    public final BiometricVerificationNfcV2ConsolidatedScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yt.a f50633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ny.a f50634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f50635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f50636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f50637t;
    public final e u;
    public final cu.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f50638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cu.b f50639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f50640y;
    public final z1 z;

    public a(f0 stateMapper, BiometricVerificationNfcV2ConsolidatedScreenContract$InputData inputData, yt.a documentType, ny.a nfcExtension, j reader, c controllerFactory, b experimentsInteractor, e readyToScanDialogMapper, cu.c readingDialogMapper, g successDialogMapper, cu.b readFailDialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(nfcExtension, "nfcExtension");
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(controllerFactory, "controllerFactory");
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        Intrinsics.checkNotNullParameter(readyToScanDialogMapper, "readyToScanDialogMapper");
        Intrinsics.checkNotNullParameter(readingDialogMapper, "readingDialogMapper");
        Intrinsics.checkNotNullParameter(successDialogMapper, "successDialogMapper");
        Intrinsics.checkNotNullParameter(readFailDialogMapper, "readFailDialogMapper");
        this.o = inputData;
        this.f50633p = documentType;
        this.f50634q = nfcExtension;
        this.f50635r = reader;
        this.f50636s = controllerFactory;
        this.f50637t = experimentsInteractor;
        this.u = readyToScanDialogMapper;
        this.v = readingDialogMapper;
        this.f50638w = successDialogMapper;
        this.f50639x = readFailDialogMapper;
        this.z = q.b(1, 5, null);
        this.A = q.b(1, 5, null);
        this.B = w.y0(new at4.b(this, stateMapper, 1));
        this.C = d.a(this, new anc.b(this, 15));
    }

    public static final void I2(a aVar, f fVar) {
        int i;
        int i2;
        aVar.getClass();
        if (Intrinsics.f(fVar, hu.d.f155472a)) {
            aVar.M2();
            return;
        }
        if (!Intrinsics.f(fVar, hu.e.f155473a)) {
            throw new NoWhenBranchMatchedException();
        }
        au.h domainState = (au.h) ((j2) aVar.getState().f22677a).getValue();
        if (domainState instanceof au.f) {
            aVar.f50638w.getClass();
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            au.f fVar2 = (au.f) domainState;
            int i3 = cu.f.f108704a[fVar2.f9111a.ordinal()];
            if (i3 == 1) {
                i2 = R$string.vision_nfc_scan_success_reading_passport;
            } else if (i3 == 2) {
                i2 = R$string.vision_nfc_scan_success_reading_identity_card;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.vision_nfc_scan_success_reading_residence_permit;
            }
            l.a1(aVar, aVar.X1(new y0(null, new j0(new TextLocalisedClause(i2, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, fVar2.d, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4062), fVar2.d, 1)), null, null, new au.w(aVar, null, 0), 3);
            return;
        }
        if (domainState instanceof au.e) {
            aVar.f50639x.getClass();
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vision_nfc_error_scan_failed_title, null, null, 14);
            au.e eVar = (au.e) domainState;
            int i5 = cu.a.f108702a[eVar.f9107a.ordinal()];
            if (i5 == 1) {
                i = R$string.vision_nfc_error_incorrect_mrz_check_passport_details;
            } else if (i5 == 2) {
                i = R$string.vision_nfc_error_incorrect_mrz_check_identity_card_details;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.vision_nfc_error_incorrect_mrz_description;
            }
            l.a1(aVar, aVar.X1(new y0(null, new z(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R$string.vision_error_generic_action_try_again, null, null, 14), eVar.f9109c ? new TextLocalisedClause(R$string.vision_error_bad_submission_action_request_manual_review, null, null, 14) : null, null, null, eVar.d, null, null, null, null, null, null, 32468), eVar.d, 1)), null, null, new x(aVar, null, 0), 3);
        }
    }

    public static final void J2(a aVar, hu.j jVar) {
        aVar.getClass();
        if (Intrinsics.f(jVar, hu.h.f155474a)) {
            aVar.M2();
            return;
        }
        if (!Intrinsics.f(jVar, hu.i.f155475a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object value = ((j2) aVar.getState().f22677a).getValue();
        au.g gVar = value instanceof au.g ? (au.g) value : null;
        if (gVar != null) {
            aVar.O2(gVar.e);
        }
    }

    public static final au.h K2(a aVar, au.h hVar, boolean z) {
        if (hVar instanceof au.d) {
            au.d dVar = (au.d) hVar;
            yt.a documentType = dVar.f9104a;
            boolean z3 = dVar.f9106c;
            boolean z4 = dVar.d;
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            return new au.d(documentType, z, z3, z4);
        }
        if (hVar instanceof au.g) {
            au.g gVar = (au.g) hVar;
            yt.a documentType2 = gVar.f9115a;
            boolean z6 = gVar.f9117c;
            boolean z11 = gVar.d;
            short s2 = gVar.e;
            Intrinsics.checkNotNullParameter(documentType2, "documentType");
            return new au.g(documentType2, z, z6, z11, s2);
        }
        if (hVar instanceof au.f) {
            au.f fVar = (au.f) hVar;
            yt.a documentType3 = fVar.f9111a;
            boolean z12 = fVar.f9113c;
            boolean z29 = fVar.d;
            NfcDocument$PassportRaw documentRawData = fVar.e;
            Intrinsics.checkNotNullParameter(documentType3, "documentType");
            Intrinsics.checkNotNullParameter(documentRawData, "documentRawData");
            return new au.f(documentType3, z, z12, z29, documentRawData);
        }
        if (!(hVar instanceof au.e)) {
            throw new NoWhenBranchMatchedException();
        }
        au.e eVar = (au.e) hVar;
        yt.a documentType4 = eVar.f9107a;
        boolean z31 = eVar.f9109c;
        boolean z41 = eVar.d;
        Intrinsics.checkNotNullParameter(documentType4, "documentType");
        return new au.e(documentType4, z, z31, z41);
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.e) {
            l.a1(this, this.z, null, null, new au.w(this, null, 1), 3);
            l.a1(this, this.A, null, null, new au.w(this, null, 2), 3);
        }
    }

    public final BiometricVerificationNfcFlowContract$AuthData.ICAO L2() {
        BiometricVerificationNfcFlowContract$AuthData biometricVerificationNfcFlowContract$AuthData = this.o.f50630c;
        if (biometricVerificationNfcFlowContract$AuthData instanceof BiometricVerificationNfcFlowContract$AuthData.ICAO) {
            return (BiometricVerificationNfcFlowContract$AuthData.ICAO) biometricVerificationNfcFlowContract$AuthData;
        }
        return null;
    }

    @Override // yki.j
    public final void M0() {
    }

    public final void M2() {
        a2 a2Var = this.f50640y;
        if (a2Var != null) {
            a2Var.f(null);
        }
        H2(getState(), new arf.h(26));
        s1();
    }

    public final void N2(t event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.equals(o.f9125a)) {
            if (L2() != null) {
                P2(true);
                return;
            }
            return;
        }
        if (event.equals(p.f9126a)) {
            C2(new au.i(this.o.d));
            return;
        }
        if (event.equals(m.f9123a)) {
            B2();
            return;
        }
        if (event.equals(n.f9124a)) {
            M2();
            return;
        }
        if (event.equals(s.f9129a)) {
            Object value = ((j2) getState().f22677a).getValue();
            au.f fVar = value instanceof au.f ? (au.f) value : null;
            if (fVar != null) {
                C2(new au.j(fVar.e));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("UploadData called without pending success");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (!event.equals(au.q.f9127a)) {
            if (!event.equals(r.f9128a)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(new ExternalDestination.ByIntent(new Intent("android.settings.NFC_SETTINGS"), null));
        } else {
            BiometricVerificationNfcFlowContract$AuthData.ICAO icaoL2 = L2();
            if (icaoL2 == null) {
                return;
            }
            C2(new k(icaoL2.f50614a, icaoL2.f50615b, icaoL2.f50616c, this.f50633p));
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public final void O2(short s2) {
        if (!this.o.e) {
            h.w2(this.C, new BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep.Reading(s2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        Object value = ((j2) getState().f22677a).getValue();
        au.g domainState = value instanceof au.g ? (au.g) value : null;
        if (domainState == null) {
            return;
        }
        this.v.getClass();
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vision_nfc_dialog_title, null, null, 14);
        int i = R$string.vision_nfc_dialog_reading;
        String str = (String) hu.a.f155469a.get(Short.valueOf(domainState.e));
        if (str == null) {
            str = "";
        }
        y0 y0Var = new y0(null, new g0(textLocalisedClause, new TextLocalisedClause(i, zhm.u.c(str), null, 12), null, new TextLocalisedClause(R$string.vision_common_text_cancel, null, null, 14), null, null, null, j.b.f216170a, true, null, false, new GlyphImage(R$drawable.uikit_icn_24_contactless, null, null, 6), 3700), domainState.d, 1);
        l.a1(this, X1(y0Var), null, null, new a0(y0Var, this, null, 0), 3);
    }

    public final void P2(boolean z) {
        int i;
        BiometricVerificationNfcFlowContract$AuthData.ICAO icaoL2 = L2();
        if (icaoL2 == null) {
            return;
        }
        a2 a2Var = this.f50640y;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        H2(getState(), new arf.h(27));
        if (z) {
            if (this.o.e) {
                au.h domainState = (au.h) ((j2) getState().f22677a).getValue();
                this.u.getClass();
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vision_nfc_dialog_title, null, null, 14);
                int i2 = cu.d.f108703a[domainState.getDocumentType().ordinal()];
                if (i2 == 1) {
                    i = R$string.vision_nfc_intro_passport_description;
                } else if (i2 == 2) {
                    i = R$string.vision_nfc_intro_identity_card_description;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.vision_nfc_intro_residence_permit_description;
                }
                y0 y0Var = new y0(null, new g0(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, new TextLocalisedClause(R$string.vision_common_text_cancel, null, null, 14), null, null, null, j.b.f216170a, true, null, false, new GlyphImage(R$drawable.uikit_icn_24_contactless, null, null, 6), 3700), domainState.J(), 1);
                l.a1(this, X1(y0Var), null, null, new a0(y0Var, this, null, 1), 3);
            } else {
                h.w2(this.C, BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep.ReadyToScan.f50632a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        kmi.g gVar = this.f50634q.f220588c;
        gVar.getClass();
        this.f50640y = l.a1(this, q.Q(q.j(q.m(new kmi.f(gVar, continuation, 2)), -1, 2), new a32.b(continuation, this, icaoL2, 6)), null, null, new c0(0, continuation, this, z), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow yVar;
        kmi.g gVar = this.f50634q.f220588c;
        Continuation continuation = null;
        if (gVar.b() == null) {
            yVar = new go.g(kmi.h.UNAVAILABLE, 2);
        } else {
            yVar = new y(new kmi.f(gVar, continuation, 1), q.q(q.j(q.k(new kmi.f(gVar, continuation, 0)), -1, 2)));
        }
        l.b1(this, yVar, null, new x(this, null, 1), 3);
        if (L2() == null || !this.f50637t.a(px.a.i)) {
            return;
        }
        a2 a2Var = this.f50640y;
        if (a2Var == null || !a2Var.d()) {
            P2(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.B.getValue();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.C;
    }
}
