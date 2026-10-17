package com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection;

import cli.n;
import cli.y;
import com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import plb.g;
import pt.f;
import pt.i;
import pt.j;
import pt.k;
import pt.l;
import pt.m;
import rt.b;
import vkm.j2;
import zhm.a0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends h implements m {
    public final BiometricVerificationManualDocumentSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f50606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d4m.a f50607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final st.a f50608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final st.b f50609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f50610t;
    public final y u;

    public a(BiometricVerificationManualDocumentSelectionScreenContract$InputData inputData, n stateMapper, b documentDialogMapper, d4m.a countryPickerInteractor, st.a countrySelectionHelper, st.b documentSelectionHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(documentDialogMapper, "documentDialogMapper");
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        Intrinsics.checkNotNullParameter(countrySelectionHelper, "countrySelectionHelper");
        Intrinsics.checkNotNullParameter(documentSelectionHelper, "documentSelectionHelper");
        this.o = inputData;
        this.f50606p = documentDialogMapper;
        this.f50607q = countryPickerInteractor;
        this.f50608r = countrySelectionHelper;
        this.f50609s = documentSelectionHelper;
        this.f50610t = e.a(this, new g(this, 27));
        ArrayList arrayList = inputData.f50601a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((BiometricVerificationAcceptedDocument) obj2).f50373b.isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = this.o.f50601a;
        ArrayList arrayList4 = new ArrayList();
        Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            a0.x(((BiometricVerificationAcceptedDocument) it8.next()).f50373b, arrayList4);
        }
        List listD1 = d0.d1(d0.i1(arrayList4));
        wi0.b bVar = listD1.contains(this.o.f50602b) ? this.o.f50602b : (wi0.b) d0.b0(listD1);
        ArrayList arrayList5 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList5.add(((BiometricVerificationAcceptedDocument) it9.next()).f50372a);
        }
        BiometricVerificationDocumentType biometricVerificationDocumentType = arrayList5.contains(this.o.f50603c) ? this.o.f50603c : ((BiometricVerificationAcceptedDocument) d0.b0(arrayList2)).f50372a;
        this.f50609s.getClass();
        this.u = d.b(this, new f(bVar, st.b.a(bVar, biometricVerificationDocumentType, arrayList2), arrayList2, listD1, this.o.d), stateMapper, null, false, 12);
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f50610t;
        if (z) {
            h.v2(aVar, BiometricVerificationManualDocumentSelectionScreenContract$ModalStep.DocumentSelection.f50605a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (event instanceof pt.h) {
            h.v2(aVar, BiometricVerificationManualDocumentSelectionScreenContract$ModalStep.CountrySelection.f50604a, ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (event instanceof pt.g) {
            BiometricVerificationManualDocumentSelectionScreenContract$InputData biometricVerificationManualDocumentSelectionScreenContract$InputData = this.o;
            C2(new l(biometricVerificationManualDocumentSelectionScreenContract$InputData.f50603c, biometricVerificationManualDocumentSelectionScreenContract$InputData.f50602b));
        } else {
            if (!(event instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            y yVar = this.u;
            C2(new l(((f) ((j2) yVar.f22677a).getValue()).f239556b, ((f) ((j2) yVar.f22677a).getValue()).f239555a));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f50610t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
