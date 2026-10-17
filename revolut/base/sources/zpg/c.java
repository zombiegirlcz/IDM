package zpg;

import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final SavingsDocumentToAccept a(bqg.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new SavingsDocumentToAccept(bVar.getId(), bVar.getTitle(), bVar.getDescription(), new SavingsDocument.DocumentType(bVar.getType()), bVar.getUrl());
    }

    public static final SavingsDocumentToAccept b(fqg.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new SavingsDocumentToAccept(aVar.getId(), aVar.getTitle(), aVar.getDescription(), new SavingsDocument.DocumentType(aVar.getType()), aVar.getUrl());
    }
}
