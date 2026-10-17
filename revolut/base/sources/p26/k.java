package p26;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.asset_details.impl.R$string;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.t0;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function3 {
    public /* synthetic */ g u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f232090w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Continuation continuation) {
        super(3, continuation);
        this.f232090w = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k kVar = new k(this.f232090w, (Continuation) obj4);
        kVar.u = (g) obj2;
        kVar.v = (Data) obj3;
        return kVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TrendViewDelegate.a aVar;
        Double d;
        Clause textClause;
        Image userAvatarImage;
        DefiCurrency defiCurrency;
        DefiCurrency defiCurrency2;
        g gVar = this.u;
        Data data = this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Data data2 = gVar.f232082a;
        qta.f fVar = gVar.f232083b;
        TrendViewDelegate.a aVar3 = gVar.f232084c;
        Data data3 = gVar.d;
        Data data4 = gVar.e;
        n nVar = this.f232090w;
        o9j.b bVar = nVar.e;
        DeFiAssetDetailsScreenContract$InputData deFiAssetDetailsScreenContract$InputData = nVar.f232095a;
        qta.d dVar = (qta.d) data2.getContent();
        xi0.b bVar2 = dVar != null ? dVar.f249053c : null;
        List list = (List) data3.getContent();
        if (list == null) {
            list = f0.f322471a;
        }
        n9l.a aVar4 = (n9l.a) data4.getContent();
        List listA = o9j.b.a(bVar, bVar2, fVar, aVar3, data2, list, aVar4 != null ? new Double(aVar4.f213663c) : null, deFiAssetDetailsScreenContract$InputData.f71679a, null, null, null, new TextLocalisedClause(R$string.crypto_defi_asset_details_chart_disclaimer, null, null, 14), 1792);
        o9j.b bVar3 = nVar.e;
        xi0.b bVar4 = deFiAssetDetailsScreenContract$InputData.f71679a;
        qta.d dVar2 = (qta.d) data2.getContent();
        xi0.b bVar5 = dVar2 != null ? dVar2.f249053c : null;
        n9l.a aVar5 = (n9l.a) data4.getContent();
        if (aVar5 != null) {
            aVar = aVar3;
            d = new Double(aVar5.f213663c);
        } else {
            aVar = aVar3;
            d = null;
        }
        DeFiAssetDetails deFiAssetDetails = (DeFiAssetDetails) data.getContent();
        if (deFiAssetDetails == null || (defiCurrency2 = deFiAssetDetails.f71665a) == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = v1.c.f(v.k(new TextClause(defiCurrency2.f71673c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(defiCurrency2.f71672b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null);
        }
        DeFiAssetDetails deFiAssetDetails2 = (DeFiAssetDetails) data.getContent();
        if (deFiAssetDetails2 == null || (defiCurrency = deFiAssetDetails2.f71665a) == null) {
            userAvatarImage = ShimmerImage.f60002a;
        } else {
            String str = defiCurrency.f;
            if (str != null) {
                ImageTransformations imageTransformations = new ImageTransformations(null, HexagonalTransformation.f60062a, null, null, null, null, null, ISO781611.SMT_TAG);
                userAvatarImage = new UrlImage(str, (String) null, (UrlImageDrawable) new UrlImageDrawable.Shimmering.Transformable(imageTransformations), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, imageTransformations, (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
            } else {
                userAvatarImage = new UserAvatarImage(new UserNamePlaceholder.Default(defiCurrency.f71672b, 0), null, null, 6);
            }
        }
        return new h(listA, ((u9j.e) bVar3).d(bVar4, bVar5, d, fVar, aVar, data2, textClause, userAvatarImage));
    }
}
