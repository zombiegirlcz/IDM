package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sh implements bh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33007b = OcrCountryAndTypeValidator.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OcrCountryAndTypeValidator f33008a;

    public sh(OcrCountryAndTypeValidator ocrValidator) {
        Intrinsics.checkNotNullParameter(ocrValidator, "ocrValidator");
        this.f33008a = ocrValidator;
    }

    @Override // com.fourthline.orca.internal.bh
    public Object a(md1 md1Var, nd1 nd1Var, Continuation continuation) {
        yhm.r rVarA = a(md1Var);
        if (rVarA == null) {
            return zhm.f0.f322471a;
        }
        List listD1 = zhm.d0.d1(this.f33008a.validate(rVarA));
        ArrayList arrayList = new ArrayList(zhm.w.t(listD1, 10));
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            arrayList.add(ch.a((OcrValidationError) it8.next()));
        }
        return arrayList;
    }

    private final yhm.r a(md1 md1Var) {
        String strC;
        String strB;
        DocumentType documentType;
        pd1 pd1VarB = md1Var.b();
        if (pd1VarB == null || (strC = pd1VarB.c()) == null || (strB = md1Var.b().b()) == null || (documentType = CountryNetworkModelKt.toDocumentType(strB, strC)) == null) {
            return null;
        }
        od1 od1VarA = md1Var.a();
        return new yhm.r(strC, documentType, od1VarA != null ? od1VarA.c() : null);
    }
}
