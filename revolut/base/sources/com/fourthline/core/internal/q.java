package com.fourthline.core.internal;

import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f26374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f26375b;

    public q(Map supportedCountries, c checksumValidator) {
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        Intrinsics.checkNotNullParameter(checksumValidator, "checksumValidator");
        this.f26374a = supportedCountries;
        this.f26375b = checksumValidator;
    }

    private final MrtdMrzInfoValidationError b(x xVar) {
        if (xVar.d().length() == 0 || xVar.d().length() > 2 || c(xVar.d())) {
            return MrtdMrzInfoValidationError.INVALID_DOCUMENT_CODE;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError c(x xVar) {
        v vVarE = xVar.e();
        String strA = vVarE.a();
        int i = 0;
        while (true) {
            if (i < strA.length()) {
                if (strA.charAt(i) == '<') {
                    break;
                }
                i++;
            } else if (this.f26375b.a(vVarE.d(), vVarE.b())) {
                return null;
            }
        }
        return MrtdMrzInfoValidationError.INVALID_DOCUMENT_NUMBER;
    }

    private final MrtdMrzInfoValidationError d(x xVar) {
        if (Intrinsics.f(xVar.d() + xVar.k(), "IDFRA")) {
            return null;
        }
        if (xVar.f() != null) {
            String strH = xVar.h();
            if (strH.length() == 6 && !b(strH) && this.f26375b.a(strH, xVar.g())) {
                return null;
            }
        }
        return MrtdMrzInfoValidationError.INVALID_EXPIRATION_DATE;
    }

    private final MrtdMrzInfoValidationError e(x xVar) {
        if (a(xVar.i())) {
            return MrtdMrzInfoValidationError.INVALID_FIRST_NAMES;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError f(x xVar) {
        String strJ = xVar.j();
        for (int i = 0; i < strJ.length(); i++) {
            char cCharAt = strJ.charAt(i);
            if (cCharAt == 'F' || cCharAt == 'M' || cCharAt == '<') {
                return null;
            }
        }
        return MrtdMrzInfoValidationError.INVALID_GENDER;
    }

    private final MrtdMrzInfoValidationError g(x xVar) {
        if (a(xVar.k())) {
            return MrtdMrzInfoValidationError.INVALID_ISSUING_COUNTRY;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError h(x xVar) {
        if (a(xVar.l())) {
            return MrtdMrzInfoValidationError.INVALID_LAST_NAMES;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError i(x xVar) {
        if (a(xVar.m())) {
            return MrtdMrzInfoValidationError.INVALID_NATIONALITY;
        }
        return null;
    }

    private final MrtdMrzInfoValidationError j(x xVar) {
        if (this.f26375b.a(xVar.p(), xVar.o())) {
            return null;
        }
        return MrtdMrzInfoValidationError.INVALID_TOTAL_CHECKSUM;
    }

    private final MrtdMrzInfoValidationError k(x xVar) {
        if (xVar.q()) {
            return MrtdMrzInfoValidationError.TRUNCATED_NAMES;
        }
        return null;
    }

    @Override // com.fourthline.core.internal.i0
    public List a(y parsedMrz) {
        Intrinsics.checkNotNullParameter(parsedMrz, "parsedMrz");
        if (!(parsedMrz instanceof x)) {
            throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
        }
        x xVar = (x) parsedMrz;
        MrtdMrzInfoValidationError[] elements = {b(xVar), e(xVar), h(xVar), k(xVar), g(xVar), i(xVar), a(xVar), d(xVar), f(xVar), c(xVar), j(xVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final boolean b(String str) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            char cCharAt = str.charAt(i);
            if ('0' > cCharAt || cCharAt >= ':') {
                break;
            }
            i++;
        }
        return !z;
    }

    public /* synthetic */ q(Map map, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new u().a() : map, (i & 2) != 0 ? new c() : cVar);
    }

    private final boolean c(String str) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = true;
                break;
            }
            char cCharAt = str.charAt(i);
            if ('A' > cCharAt || cCharAt >= '[') {
                break;
            }
            i++;
        }
        return !z;
    }

    private final MrtdMrzInfoValidationError a(x xVar) {
        if (xVar.a() != null) {
            String strC = xVar.c();
            if (strC.length() <= 6 && !b(strC) && this.f26375b.a(strC, xVar.b())) {
                return null;
            }
        }
        return MrtdMrzInfoValidationError.INVALID_BIRTH_DATE;
    }

    private final boolean a(List list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            if (str.length() == 0 || c(str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean a(String str) {
        Map map = this.f26374a;
        if (map.isEmpty()) {
            return true;
        }
        Iterator it8 = map.entrySet().iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((Map.Entry) it8.next()).getValue(), str)) {
                return false;
            }
        }
        return true;
    }
}
