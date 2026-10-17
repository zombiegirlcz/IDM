package gf5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenController;
import com.revolut.feature.staking.api.model.StakingProduct;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EarnAssetsPreviewScreenController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EarnAssetsPreviewScreenController earnAssetsPreviewScreenController, Continuation continuation) {
        super(2, continuation);
        this.v = earnAssetsPreviewScreenController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StakingProduct stakingProduct;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.N.getValue();
        Object obj3 = model.u;
        hVar.getClass();
        EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel earnAssetsPreviewScreenContract$Parcel$StakingProductParcel = obj3 instanceof EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel ? (EarnAssetsPreviewScreenContract$Parcel$StakingProductParcel) obj3 : null;
        if (earnAssetsPreviewScreenContract$Parcel$StakingProductParcel != null && (stakingProduct = earnAssetsPreviewScreenContract$Parcel$StakingProductParcel.f70803a) != null) {
            hVar.f143351q.Z2(stakingProduct);
        }
        return Unit.f186387a;
    }
}
