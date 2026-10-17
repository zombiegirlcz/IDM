package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j91 f26696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gh f26697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f26698c;
    private final b31 d;

    public a31(j91 tinFlowConfig, gh document, Function0 documentIssuingCountry, b31 skipDocumentScannerUseCaseEvaluator) {
        Intrinsics.checkNotNullParameter(tinFlowConfig, "tinFlowConfig");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(documentIssuingCountry, "documentIssuingCountry");
        Intrinsics.checkNotNullParameter(skipDocumentScannerUseCaseEvaluator, "skipDocumentScannerUseCaseEvaluator");
        this.f26696a = tinFlowConfig;
        this.f26697b = document;
        this.f26698c = documentIssuingCountry;
        this.d = skipDocumentScannerUseCaseEvaluator;
    }

    public final boolean a() {
        fd fdVar = (fd) this.f26698c.invoke();
        DocumentType documentTypeM = this.f26697b.m();
        return this.d.a(fdVar, this.f26696a.getTaxationCountry(), documentTypeM);
    }
}
