package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerStep;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final qa b(DocumentScannerStep documentScannerStep) {
        return new qa(documentScannerStep.getFileSide(), documentScannerStep.isAngled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final md1 b(jn jnVar) {
        fo value = jnVar.getValue();
        return new md1(value != null ? new pd1(value.getIssuingCountry(), value.getDocumentType(), null, value.getDocumentSide(), 4, null) : null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nd1 b(g51 g51Var) {
        String strB = g51Var.b();
        if (strB != null) {
            return new nd1(strB, g51Var.a(), g51Var.c().getFileSide(), Boolean.valueOf(g51Var.c().isAngled()));
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + ((Object) strB) + " must not be null."))).toString());
    }
}
