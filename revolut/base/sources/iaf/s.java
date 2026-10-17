package iaf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements k {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f160005c;
        List listC = u.c(new RowDelegate.Model("NEW_ASSET_SELECTION_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, Float.valueOf(20.0f), null, 32), null, null, false, null, false, 62), new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_add, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, i.f160002a, null, 0, 0, 0, 0, 532676600));
        Collection<TransferInSelectedAsset> collectionValues = domainState.f160003a.values();
        ArrayList arrayList = new ArrayList(w.t(collectionValues, 10));
        for (TransferInSelectedAsset transferInSelectedAsset : collectionValues) {
            String strQ = j6.a.q("TRANSFER_IN_SELECTED_ASSET_ID_", transferInSelectedAsset.f91510a.f91506a);
            TransferInInstrument transferInInstrument = transferInSelectedAsset.f91510a;
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(new InstrumentImage(transferInInstrument.f91506a, 30, null, null), null, null, false, null, false, 62), new TextClause(transferInInstrument.f91507b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, aaf.a.a(transferInSelectedAsset), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, new h(transferInSelectedAsset), null, 0, 0, 0, 0, 532675544));
        }
        ArrayList arrayListU = w.u(v.k(listC, arrayList));
        yp0.b.k(arrayListU, 0, 0, 0, 0, 31);
        return new n(arrayListU, z);
    }
}
