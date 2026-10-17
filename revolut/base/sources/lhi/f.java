package lhi;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptDestination;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptFlowInputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f195276b;

    public /* synthetic */ f(h hVar, int i) {
        this.f195275a = i;
        this.f195276b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f195275a;
        h hVar = this.f195276b;
        Boolean locked = (Boolean) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(locked, "locked");
                if (locked.booleanValue()) {
                    ufm.b bVarM = efm.d0.m(locked);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                efm.b bVarP = efm.b.p(((cpj.b) hVar.f195281a).i(), ((ik3.c) hVar.f195282b).j());
                ufm.b bVarM2 = efm.d0.m(locked);
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                return bVarP.f(bVarM2);
            default:
                if (!locked.booleanValue()) {
                    return Unit.f186387a;
                }
                k9 k9Var = k9.Onboarding;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                hVar.e.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new VerifyAccountPromptDestination(new VerifyAccountPromptFlowInputData(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var))), false, (Integer) null, 335577088, 45)));
                return Unit.f186387a;
        }
    }
}
