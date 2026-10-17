package ule;

import aii.p;
import aii.u;
import com.revolut.feature.lifestyle.core.api.navigation.TabLifestyleDocuments;
import com.revolut.feature.tab.lifestyle.impl.ui.documents.LifestyleDocumentsScreen;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TabLifestyleDocuments) {
            return new LifestyleDocumentsScreen();
        }
        return null;
    }
}
