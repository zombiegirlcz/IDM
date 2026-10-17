package kaf;

import android.os.Parcelable;
import aw0.o9;
import cli.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements b {
    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = !domainState.e && domainState.d;
        TransferBroker transferBroker = domainState.f182480a;
        List listI = yp0.b.i(new RowDelegate.Model("REVIEW_CURRENT_BROKER", new RowDelegate.Model.MainImage.Image40(new UrlImage(transferBroker.f91501b, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null, null, false, null, false, 62), new TextClause(transferBroker.f91500a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(domainState.f182481b.getF91536a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new ListSubheaderDelegate.Model("REVIEW_CURRENT_BROKER_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_broker, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        List<TransferInSelectedAsset> list = domainState.f182482c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TransferInSelectedAsset transferInSelectedAsset : list) {
            TransferInInstrument transferInInstrument = transferInSelectedAsset.f91510a;
            arrayList.add(new RowDelegate.Model(j6.a.q("REVIEW_SELECTED_ASSET_", transferInInstrument.f91506a), new RowDelegate.Model.MainImage.Image40(new InstrumentImage(transferInInstrument.f91506a, 30, null, null), null, null, false, null, false, 62), new TextClause(transferInInstrument.f91507b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, aaf.a.a(transferInSelectedAsset), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        }
        return new d(w.u(v.k(listI, yp0.b.g(arrayList, new ListSubheaderDelegate.Model("REVIEW_CURRENT_SELECTED_ASSETS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_assets, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126))), z);
    }
}
