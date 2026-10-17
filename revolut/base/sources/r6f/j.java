package r6f;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q87.z;
import r38.m;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f251834a = new ListSubheaderDelegate.Model("ManagedPortfolioDetailsFeesExtensionMapper_fees_header", (Image) null, (Clause) new TextLocalisedClause(R$string.managed_portfolios_template_list_about_widget_fees_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458);

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f251829a, new m(this, 14), new i(this, 0), new z(domainState, this, 26)));
    }
}
