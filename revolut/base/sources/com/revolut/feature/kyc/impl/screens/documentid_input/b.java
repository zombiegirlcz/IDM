package com.revolut.feature.kyc.impl.screens.documentid_input;

import bx8.d;
import bx8.f;
import bx8.l;
import bx8.n;
import bx8.q;
import bx8.s;
import bx8.t;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mre.c;
import my8.j;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.f0;
import zhm.r0;
import zhm.w;
import zpc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements q {

    @NotNull
    public static final s Companion = new s();
    public static final Object v = r0.k(new Pair("ACT", Integer.valueOf(R$string.kyc_document_id_field_hint_text_act)), new Pair("NSW", Integer.valueOf(R$string.kyc_document_id_field_hint_text_nsw)), new Pair("NT", Integer.valueOf(R$string.kyc_document_id_field_hint_text_nt)), new Pair("QLD", Integer.valueOf(R$string.kyc_document_id_field_hint_text_qld)), new Pair("SA", Integer.valueOf(R$string.kyc_document_id_field_hint_text_sa)), new Pair("TAS", Integer.valueOf(R$string.kyc_document_id_field_hint_text_tas)), new Pair("VIC", Integer.valueOf(R$string.kyc_document_id_field_hint_text_vic)), new Pair("WA", Integer.valueOf(R$string.kyc_document_id_field_hint_text_wa)));
    public final KYCDocumentIdInputScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f77868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bx8.c f77869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f77870r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f77871s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f77872t;
    public final y u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    public b(t stateMapper, KYCDocumentIdInputScreenContract$InputData inputData, c termsNavigationFactory, bx8.c consentProvider, f inputValidator, m regionPickerScreenIntegratorInteractor) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(consentProvider, "consentProvider");
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        Intrinsics.checkNotNullParameter(regionPickerScreenIntegratorInteractor, "regionPickerScreenIntegratorInteractor");
        this.o = inputData;
        this.f77868p = termsNavigationFactory;
        this.f77869q = consentProvider;
        this.f77870r = inputValidator;
        this.f77871s = regionPickerScreenIntegratorInteractor;
        this.f77872t = e.a(this, new bwd.a(this, 3));
        List list = inputData.f77864b.i;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(new l((String) it8.next(), false));
            }
        } else {
            arrayList = f0.f322471a;
        }
        List<my8.b> list3 = this.o.f77864b.f210388j;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        for (my8.b bVar : list3) {
            m70.a.c(t0.f186434a);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.kyc_document_id_field_hint_text_default, null, null, 14);
            f.Companion.getClass();
            arrayList2.add(new KYCDocumentIdInputScreenContract$FormField(bVar, "", null, false, d.a(bVar) ? textLocalisedClause : null, null));
        }
        this.u = mra.d.b(this, new bx8.m(arrayList, arrayList2), stateMapper, null, false, 12);
    }

    public final void I2() {
        String str;
        y yVar = this.u;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        List list = ((bx8.m) j2Var.getValue()).f19521a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!((l) it8.next()).f19520b) {
                    for (l lVar : ((bx8.m) j2Var2.getValue()).f19521a) {
                        if (!lVar.f19520b) {
                            h.v2(this.f77872t, new KYCDocumentIdInputScreenContract$ModalStep.ShowConsent(lVar.f19519a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        List list2 = ((bx8.m) j2Var2.getValue()).f19521a;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList.add(((l) it9.next()).f19519a);
        }
        List<KYCDocumentIdInputScreenContract$FormField> list3 = ((bx8.m) j2Var2.getValue()).f19522b;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        for (KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField : list3) {
            my8.b bVar = kYCDocumentIdInputScreenContract$FormField.f77860a;
            String str2 = bVar.e;
            if (bVar.f210370c == j.TEXT) {
                str = kYCDocumentIdInputScreenContract$FormField.f77861b;
            } else {
                str = kYCDocumentIdInputScreenContract$FormField.f77862c;
                if (str == null) {
                    str = "";
                }
            }
            arrayList2.add(new KYCDocumentIdInputScreenContract$FieldResult(str2, str, bVar.d));
        }
        C2(new n(arrayList, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ef  */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J2(com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField r19, com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField r20) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.screens.documentid_input.b.J2(com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField, com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FormField):void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f77872t;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
