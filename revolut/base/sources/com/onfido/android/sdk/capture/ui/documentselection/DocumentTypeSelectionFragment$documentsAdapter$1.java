package com.onfido.android.sdk.capture.ui.documentselection;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.DocumentPages;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class DocumentTypeSelectionFragment$documentsAdapter$1 extends q implements Function3 {
    public DocumentTypeSelectionFragment$documentsAdapter$1(Object obj2) {
        super(3, 0, DocumentTypeSelectionFragment.class, obj2, "onDocumentSelected", "onDocumentSelected(Lcom/onfido/android/sdk/capture/DocumentType;Ljava/lang/String;Lcom/onfido/android/sdk/capture/document/DocumentPages;)V");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
        invoke((DocumentType) obj2, (String) obj3, (DocumentPages) obj4);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull DocumentType p0, String str, DocumentPages documentPages) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((DocumentTypeSelectionFragment) this.receiver).onDocumentSelected(p0, str, documentPages);
    }
}
