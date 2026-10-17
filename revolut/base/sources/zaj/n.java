package zaj;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();
    public static final c d = new c(null, LargeActionButton.ButtonStyle.f58737s, 5);
    public static final c e = new c(null, null, 3);
    public static final c f = new c(new TextClause("Notify me", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.d, 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoPreLaunchDetailsContract$InputData f320735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f320736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df0.b f320737c;

    static {
        new c(new TextClause("Turn notification off", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58726b, 4);
    }

    public n(CryptoPreLaunchDetailsContract$InputData inputData, f01.c uiKitResources, df0.b syncedDateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        this.f320735a = inputData;
        this.f320736b = uiKitResources;
        this.f320737c = syncedDateProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c cVar;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = this.f320735a.f100032a;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_bitcoin;
        int i2 = R$attr.uikit_colorAccentNeutral;
        d dVar = new d(LayeredImage.Companion.a(companion, i, new Color.Solid(i2), new Color.ModifiedColor(new Color.Solid(i2), 0.1f), 8.0f, Float.valueOf(24.0f), 32), new TextClause("Crypto prelaunch mock", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        Data data = domainState.f320720a;
        if (data.getContent() != null) {
            cVar = f;
        } else {
            cVar = (data.getLoading() || data.getError() == null) ? d : e;
        }
        return new e(dVar, cVar, (List) iii.c.f(domainState.f320720a, new z8h.b(this, 22), new z8d.h(4), new y(this, 10)));
    }
}
