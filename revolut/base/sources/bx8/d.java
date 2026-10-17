package bx8;

import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private d() {
    }

    public static boolean a(my8.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return Intrinsics.f(bVar.e, "CARD_NUMBER");
    }

    public static boolean b(my8.b bVar, DocType docType) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(docType, "docType");
        DocType.INSTANCE.getClass();
        return docType.equals(DocType.f77923b) && Intrinsics.f(bVar.e, "DOCUMENT_NUMBER");
    }
}
