package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentType;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.IdlBasicInfo;
import com.fourthline.nfc.NfcData;
import com.fourthline.nfc.NfcDataGroup;
import com.fourthline.nfc.NfcScannerResult;
import com.fourthline.nfc.PersonalDetails;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class cd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gh f27441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj0 f27442b;

    public cd0(gh documentBundle, yj0 personBundle) {
        Intrinsics.checkNotNullParameter(documentBundle, "documentBundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        this.f27441a = documentBundle;
        this.f27442b = personBundle;
    }

    public final void a(ad0 capabilityResult, DocumentType selectedDocumentType) {
        NfcScannerResult nfcScannerResultA;
        Intrinsics.checkNotNullParameter(capabilityResult, "capabilityResult");
        Intrinsics.checkNotNullParameter(selectedDocumentType, "selectedDocumentType");
        bd0 bd0Var = capabilityResult instanceof bd0 ? (bd0) capabilityResult : null;
        if (bd0Var == null || (nfcScannerResultA = bd0Var.a()) == null) {
            return;
        }
        a(this.f27441a.i(), nfcScannerResultA);
        a(this.f27442b.r(), nfcScannerResultA);
    }

    private final void a(fh fhVar, NfcScannerResult nfcScannerResult) {
        Bitmap bitmap = (Bitmap) nfcScannerResult.getData(NfcData.NfcDataType.PHOTO);
        MrzInfo mrzInfo = (MrzInfo) nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        Long lValueOf = Long.valueOf(nfcScannerResult.getMetadata().getTimestamp().getTime());
        Coordinate location = nfcScannerResult.getMetadata().getLocation();
        List<NfcDataGroup> dataGroups = nfcScannerResult.getDataGroups();
        int iB = zhm.q0.b(zhm.w.t(dataGroups, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (NfcDataGroup nfcDataGroup : dataGroups) {
            linkedHashMap.put(Integer.valueOf(nfcDataGroup.getGroupNumber()), nfcDataGroup.getRawData());
        }
        fhVar.a(new ub0(bitmap, mrzInfo, lValueOf, location, linkedHashMap, nfcScannerResult.getAuthenticationChecks()));
        MrzInfo mrzInfo2 = (MrzInfo) nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        if (mrzInfo2 != null && (mrzInfo2 instanceof MrtdMrzInfo)) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo2;
            fhVar.a(mrtdMrzInfo.getDocumentNumber());
            fhVar.a(mrtdMrzInfo.getExpirationDate());
        }
        IdlBasicInfo idlBasicInfo = (IdlBasicInfo) nfcScannerResult.getData(NfcData.NfcDataType.IDL_BASIC_INFO);
        if (idlBasicInfo != null) {
            fhVar.a(idlBasicInfo.getDocumentNumber());
            fhVar.a(idlBasicInfo.getExpirationDate());
            fhVar.b(idlBasicInfo.getIssueDate());
        }
    }

    private final void a(zj0 zj0Var, NfcScannerResult nfcScannerResult) {
        MrzInfo mrzInfo = (MrzInfo) nfcScannerResult.getData(NfcData.NfcDataType.MRZ_INFO);
        if (mrzInfo != null && (mrzInfo instanceof MrtdMrzInfo)) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo;
            String nationality = mrtdMrzInfo.getNationality();
            if (Intrinsics.f(nationality, "D")) {
                nationality = "DEU";
            }
            zj0Var.d(nationality);
            zj0Var.b(a(mrtdMrzInfo.getFirstNames()));
            zj0Var.c(a(mrtdMrzInfo.getLastNames()));
            zj0Var.a(mrtdMrzInfo.getGender());
            zj0Var.a(mrtdMrzInfo.getBirthDate());
        }
        PersonalDetails personalDetails = (PersonalDetails) nfcScannerResult.getData(NfcData.NfcDataType.PERSONAL_DETAILS);
        if (personalDetails != null) {
            List placeOfBirth = personalDetails.getPlaceOfBirth();
            zj0Var.a(placeOfBirth != null ? zhm.d0.k0(placeOfBirth, ", ", null, null, 0, null, 62) : null);
        }
        IdlBasicInfo idlBasicInfo = (IdlBasicInfo) nfcScannerResult.getData(NfcData.NfcDataType.IDL_BASIC_INFO);
        if (idlBasicInfo != null) {
            zj0Var.b(idlBasicInfo.getFirstName());
            zj0Var.c(idlBasicInfo.getLastName());
            zj0Var.a(idlBasicInfo.getBirthDate());
            zj0Var.a(idlBasicInfo.getBirthPlace());
        }
    }

    private final String a(List list) {
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            while (it8.hasNext()) {
                next = ((String) next) + " " + ((String) it8.next());
            }
            return (String) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
