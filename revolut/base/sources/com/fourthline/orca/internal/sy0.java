package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.NfcScannerSecurityKey;
import com.fourthline.orca.internal.kf0;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sy0 implements tf0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.tf0
    public kf0 a(gj bundle, xj0 personBundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        di diVarO = bundle.o();
        DocumentType documentTypeC = diVarO != null ? diVarO.c() : null;
        if ((documentTypeC == null ? -1 : a.$EnumSwitchMapping$0[documentTypeC.ordinal()]) == 1) {
            MrzInfo mrzInfoG = bundle.f().g();
            IdlMrzInfo idlMrzInfo = mrzInfoG instanceof IdlMrzInfo ? (IdlMrzInfo) mrzInfoG : null;
            String rawMrz = (idlMrzInfo == null || !idlMrzInfo.getValidationErrors().isEmpty()) ? null : idlMrzInfo.getRawMrz();
            if (rawMrz != null) {
                return new kf0.a(NfcScannerSecurityKey.Companion.createWithIdlMrz(rawMrz));
            }
            return null;
        }
        String strK = bundle.f().k();
        Date dateC = bundle.f().c();
        Date dateD = personBundle.d();
        if (strK == null || dateC == null || dateD == null) {
            return null;
        }
        NfcScannerSecurityKey.Companion companion = NfcScannerSecurityKey.Companion;
        String upperCase = strK.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new kf0.b(companion.createWithMrtdData(upperCase, dateD, dateC));
    }
}
