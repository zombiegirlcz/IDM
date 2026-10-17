package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.NfcData;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.PersonalDetails;
import com.fourthline.orca.internal.tg;
import com.fourthline.vision.document.DocumentScannerResult;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m81 f32680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f32681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f32682c;

    public rb1(m81 tinBundle, gj documentFlowDataBundle, Set documentsWithTinInMrz) {
        Intrinsics.checkNotNullParameter(tinBundle, "tinBundle");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        Intrinsics.checkNotNullParameter(documentsWithTinInMrz, "documentsWithTinInMrz");
        this.f32680a = tinBundle;
        this.f32681b = documentFlowDataBundle;
        this.f32682c = documentsWithTinInMrz;
    }

    private final String a() {
        DocumentScannerResult documentScannerResultA = this.f32681b.a();
        if (documentScannerResultA != null && this.f32682c.contains(documentScannerResultA.getDocumentType())) {
            MrzInfo mrzInfo = documentScannerResultA.getMrzInfo();
            MrtdMrzInfo mrtdMrzInfo = mrzInfo instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrzInfo : null;
            if (mrtdMrzInfo != null) {
                return mrtdMrzInfo.getOptionalData();
            }
        }
        return null;
    }

    public final void b(x71 taxationCountry) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        fd fdVarG = this.f32681b.g();
        if (Intrinsics.f(fdVarG != null ? fdVarG.c() : null, taxationCountry.d())) {
            String strA = a(taxationCountry);
            if (strA != null) {
                this.f32680a.h().a(taxationCountry.d());
                this.f32680a.h().b(strA);
                return;
            }
            String strB = b();
            if (strB != null) {
                this.f32680a.i().a(taxationCountry.d());
                this.f32680a.i().b(strB);
                return;
            }
            String strA2 = a();
            if (strA2 != null) {
                this.f32680a.f().a(taxationCountry.d());
                this.f32680a.f().b(strA2);
            }
        }
    }

    private final String a(x71 x71Var) {
        DocumentType documentTypeC;
        gj gjVar = this.f32681b;
        ad0 ad0VarI = gjVar.i();
        bd0 bd0Var = ad0VarI instanceof bd0 ? (bd0) ad0VarI : null;
        NfcScannerResult nfcScannerResultA = bd0Var != null ? bd0Var.a() : null;
        di diVarO = gjVar.o();
        if (diVarO == null || (documentTypeC = diVarO.c()) == null || nfcScannerResultA == null) {
            return null;
        }
        return a(nfcScannerResultA, documentTypeC, x71Var);
    }

    private final String a(NfcScannerResult nfcScannerResult, DocumentType documentType, x71 x71Var) {
        Object data = nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        MrtdMrzInfo mrtdMrzInfo = data instanceof MrtdMrzInfo ? (MrtdMrzInfo) data : null;
        if (!Intrinsics.f(mrtdMrzInfo != null ? mrtdMrzInfo.getIssuingCountry() : null, x71Var.d())) {
            return null;
        }
        Object data2 = nfcScannerResult.getData(NfcData.NfcDataType.PERSONAL_DETAILS);
        PersonalDetails personalDetails = data2 instanceof PersonalDetails ? (PersonalDetails) data2 : null;
        x71 x71Var2 = x71.f34915b;
        DocumentType documentType2 = DocumentType.ID_CARD;
        DocumentType documentType3 = DocumentType.PASSPORT;
        DocumentType[] elements = {documentType2, DocumentType.RESIDENCE_PERMIT, documentType3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Pair pair = new Pair(x71Var2, kotlin.collections.d.y0(elements));
        x71 x71Var3 = x71.d;
        DocumentType[] elements2 = {documentType2, documentType3};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Map mapK = zhm.r0.k(pair, new Pair(x71Var3, kotlin.collections.d.y0(elements2)));
        if ((personalDetails != null ? personalDetails.getPersonalNumber() : null) != null) {
            return personalDetails.getPersonalNumber();
        }
        Set set = (Set) mapK.get(x71Var);
        if (set == null || !set.contains(documentType)) {
            return null;
        }
        return mrtdMrzInfo.getOptionalData();
    }

    private final String b() {
        gg0 gg0VarC;
        tg tgVarC = this.f32681b.c();
        tg.a aVar = tgVarC instanceof tg.a ? (tg.a) tgVarC : null;
        if (aVar == null || (gg0VarC = aVar.c()) == null) {
            return null;
        }
        return gg0VarC.getTaxIdentificationNumber();
    }
}
