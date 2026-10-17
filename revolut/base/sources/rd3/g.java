package rd3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od3.f0;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends d {
    @Override // rd3.d
    public final List g(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "<this>");
        f0 f0Var = domainState.e;
        if (!(f0Var instanceof od3.w)) {
            f0Var = null;
        }
        od3.w wVar = (od3.w) f0Var;
        if (wVar != null) {
            return b(domainState, wVar.f224311a);
        }
        throw new NullPointerException("For " + domainState.f224276a + " ProductData should be instance of " + od3.w.class.getSimpleName() + " but it was " + domainState.e.getClass().getSimpleName());
    }

    @Override // rd3.d
    public final od3.o h(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_product_gifts_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cashback_product_gifts_caption, null, null, 14);
        List listL = zhm.v.l(d.a(domainState));
        dd3.g.Companion.getClass();
        return new od3.n(textLocalisedClause, textLocalisedClause2, listL, com.revolut.core.ui_kit_core.displayers.image.models.b.c("", new ImageTransformations(null, null, null, null, 11, null, null, LDSFile.EF_DG15_TAG), null, null, 28));
    }
}
