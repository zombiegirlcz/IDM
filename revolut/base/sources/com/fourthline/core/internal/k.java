package com.fourthline.core.internal;

import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f26360a;

    public k(c checksumValidator) {
        Intrinsics.checkNotNullParameter(checksumValidator, "checksumValidator");
        this.f26360a = checksumValidator;
    }

    private final IdlMrzInfoValidationError b(w wVar) {
        if (this.f26360a.a(wVar.c(), wVar.b())) {
            return null;
        }
        return IdlMrzInfoValidationError.INVALID_TOTAL_CHECKSUM;
    }

    @Override // com.fourthline.core.internal.i0
    public List a(y parsedMrz) {
        Intrinsics.checkNotNullParameter(parsedMrz, "parsedMrz");
        if (!(parsedMrz instanceof w)) {
            throw new IllegalArgumentException("This PARSED MRZ type is not supported.");
        }
        w wVar = (w) parsedMrz;
        IdlMrzInfoValidationError[] elements = {a(wVar), b(wVar)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public /* synthetic */ k(c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new c() : cVar);
    }

    private final IdlMrzInfoValidationError a(w wVar) {
        String strA = wVar.a();
        for (int i = 0; i < strA.length(); i++) {
            if (!Character.isDigit(strA.charAt(i))) {
                return IdlMrzInfoValidationError.INVALID_DOCUMENT_NUMBER;
            }
        }
        return null;
    }
}
