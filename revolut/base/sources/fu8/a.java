package fu8;

import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    efm.b a();

    efm.b b(CellDetailsListDelegate.Model model);

    efm.b c(RowDelegate.Model model);

    efm.r d(my8.r rVar);

    efm.r e(xpi.g gVar, my8.r rVar);

    default efm.b f() {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    void g(iqi.h hVar);

    void h(RowDelegate.Model model);
}
