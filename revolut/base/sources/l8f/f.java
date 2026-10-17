package l8f;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.List;
import koe.y;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;
import l5a.u;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f192980a;

    public f(nmc.d roboPortfolioUiMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        this.f192980a = roboPortfolioUiMapper;
    }

    public static TagViewData a(int i, int i2) {
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
        int i3 = R$attr.uikit_colorAccent;
        return new TagViewData(resourceImage, textLocalisedClause, new Color.Solid(i3), i3, null, 1000);
    }

    @Override // cli.n
    public final o c(j jVar) {
        List list;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f192975a;
        if (data == null || (list = (List) iii.c.f(data, new u(16), new v(22), new y(this, domainState, 8))) == null) {
            list = f0.f322471a;
        }
        return new d(list);
    }
}
