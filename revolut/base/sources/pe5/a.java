package pe5;

import aii.u;
import com.revolut.feature.crypto.documents.api.navigation.destinations.CryptoDocumentsDestination;
import com.revolut.feature.crypto.documents.impl.ui.crypto_documents_screen.CryptoDocumentsScreen;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return le5.a.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoDocumentsDestination) {
            return new CryptoDocumentsScreen();
        }
        return null;
    }
}
