package com.fourthline.orca.internal;

import com.fourthline.nfc.NfcScannerSecurityKey;
import com.fourthline.orca.internal.kf0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k9 implements tf0 {
    @Override // com.fourthline.orca.internal.tf0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public kf0.b a(gj bundle, xj0 personBundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        String strD = bundle.d();
        if (strD != null) {
            return new kf0.b(NfcScannerSecurityKey.Companion.createWithMrtdCanNumber(strD));
        }
        return null;
    }
}
