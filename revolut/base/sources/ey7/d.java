package ey7;

import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import kotlin.jvm.internal.Intrinsics;
import nhi.j;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final pfm.a a(PolicyDocument.Pdf document, j featuresRegistry, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(featuresRegistry, "featuresRegistry");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        pfm.a aVar = new pfm.a(w.o0(p0.f264003c, new b(featuresRegistry, document, null)), new a(new c(1, 0, ln.a.class, navigationCommandsDispatcher, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;"), 0), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
