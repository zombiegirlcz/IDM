package com.fourthline.kyc.internal;

import com.fourthline.kyc.KycInfoValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
public final class d {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KycInfoValidationError.values().length];
            try {
                iArr[KycInfoValidationError.INVALID_PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_PERSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_CONTACTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_ADDRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_SELFIE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_DOCUMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_DOCUMENTS_TO_SIGN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_SECONDARY_DOCUMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_METADATA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KycInfoValidationError.INVALID_TAX_INFO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String a(KycInfoValidationError kycInfoValidationError) {
        switch (a.$EnumSwitchMapping$0[kycInfoValidationError.ordinal()]) {
            case 1:
                return "provider";
            case 2:
                return "person";
            case 3:
                return "contacts";
            case 4:
                return "address";
            case 5:
                return "selfie";
            case 6:
                return "document";
            case 7:
                return "documents_to_sign";
            case 8:
                return "secondary_document";
            case 9:
                return "metadata";
            case 10:
                return "tax_info";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String a(Enum r3) {
        String strName = r3.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final void a(Map errors) {
        Pair pair;
        Intrinsics.checkNotNullParameter(errors, "errors");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : errors.entrySet()) {
            List list = (List) entry.getValue();
            if (list == null || !(!list.isEmpty())) {
                pair = null;
            } else {
                String strA = a((KycInfoValidationError) entry.getKey());
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(a((Enum) it8.next()));
                }
                pair = new Pair(strA, arrayList2);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapT = r0.t(arrayList);
        ib.h hVar = hb.a.f150532a;
        hb.a.c(r0.k(new Pair("errors", mapT), new Pair("isPublic", Boolean.TRUE)), "kyc_info_validation_errors", 2);
    }
}
