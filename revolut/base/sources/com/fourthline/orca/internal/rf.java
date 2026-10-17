package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModelKt;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.ocr.OcrBirthDateValidator;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rf implements bh {
    public static final int e = (OcrDocumentExpirationDateValidator.$stable | OcrCountryAndTypeValidator.$stable) | OcrBirthDateValidator.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OcrBirthDateValidator f32708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OcrCountryAndTypeValidator f32709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OcrDocumentExpirationDateValidator f32710c;
    private final bh d;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f32713c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f32714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f32715h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f32716j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32715h = obj2;
            this.f32716j |= Integer.MIN_VALUE;
            return rf.this.a(null, null, this);
        }
    }

    public rf(OcrBirthDateValidator birthDateValidator, OcrCountryAndTypeValidator countryAndTypeValidator, OcrDocumentExpirationDateValidator documentExpirationDateValidator, bh documentSelectionValidator) {
        Intrinsics.checkNotNullParameter(birthDateValidator, "birthDateValidator");
        Intrinsics.checkNotNullParameter(countryAndTypeValidator, "countryAndTypeValidator");
        Intrinsics.checkNotNullParameter(documentExpirationDateValidator, "documentExpirationDateValidator");
        Intrinsics.checkNotNullParameter(documentSelectionValidator, "documentSelectionValidator");
        this.f32708a = birthDateValidator;
        this.f32709b = countryAndTypeValidator;
        this.f32710c = documentExpirationDateValidator;
        this.d = documentSelectionValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.md1 r11, com.fourthline.orca.internal.nd1 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.rf.a(com.fourthline.orca.internal.md1, com.fourthline.orca.internal.nd1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final yhm.r a(md1 md1Var) {
        String strC;
        pd1 pd1VarB = md1Var.b();
        if (pd1VarB == null || (strC = pd1VarB.c()) == null) {
            return null;
        }
        String strB = md1Var.b().b();
        DocumentType documentType = strB != null ? CountryNetworkModelKt.toDocumentType(strB, strC) : null;
        od1 od1VarA = md1Var.a();
        return sf.b(strC, documentType, od1VarA != null ? od1VarA.c() : null);
    }
}
