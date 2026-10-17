package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g31 implements b31 {
    @Override // com.fourthline.orca.internal.b31
    public boolean a(fd fdVar, x71 taxationCountry, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        if (Intrinsics.f(fdVar != null ? fdVar.c() : null, taxationCountry.d())) {
            return documentType == DocumentType.PASSPORT || documentType == DocumentType.ID_CARD || documentType == DocumentType.RESIDENCE_PERMIT || documentType == DocumentType.DRIVERS_LICENSE;
        }
        return false;
    }
}
