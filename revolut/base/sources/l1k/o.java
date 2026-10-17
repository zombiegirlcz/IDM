package l1k;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import jki.p;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import kye.l0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f191573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o9h.a f191574b;

    public o(jbh.e performanceAssetMapper, o9h.a footerDelegateMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(footerDelegateMapper, "footerDelegateMapper");
        this.f191573a = performanceAssetMapper;
        this.f191574b = footerDelegateMapper;
    }

    public static List b() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NEWS_ARTICLE_ERROR_DELEGATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31680);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f191561a, new l0g.a(21), new l0(this, 16), new y(this, domainState, 6));
    }
}
