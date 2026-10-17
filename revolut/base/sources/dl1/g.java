package dl1;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.FlagCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.alipay.impl.ui.supportedqrs.SupportedQRsScreenContract$SupportedQR;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<SupportedQRsScreenContract$SupportedQR> list = domainState.f115691a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (SupportedQRsScreenContract$SupportedQR supportedQRsScreenContract$SupportedQR : list) {
            arrayList.add(new RowDelegate.Model(j6.a.q("LIST_ID_", supportedQRsScreenContract$SupportedQR.f61089a), new RowDelegate.Model.MainImage.Image40(new UrlImage(supportedQRsScreenContract$SupportedQR.f61091c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), new FlagCircleBadge(supportedQRsScreenContract$SupportedQR.d.f297794a), null, false, null, false, 60), new TextClause(supportedQRsScreenContract$SupportedQR.f61090b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, supportedQRsScreenContract$SupportedQR, null, 0, 0, 0, 0, 532674552));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new d(arrayList);
    }
}
