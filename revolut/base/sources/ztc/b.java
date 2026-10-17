package ztc;

import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f325091b;

    public /* synthetic */ b(f fVar, int i) {
        this.f325090a = i;
        this.f325091b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f325090a) {
            case 0:
                i it8 = (i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.d()) {
                    this.f325091b.f325095a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) it8.c(), false, (Integer) null, 0, 61)));
                }
                break;
            default:
                SecurityHubDestination destination = (SecurityHubDestination) obj2;
                Intrinsics.checkNotNullParameter(destination, "destination");
                this.f325091b.f325095a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) destination, false, (Integer) null, 0, 61)));
                break;
        }
        return Boolean.TRUE;
    }
}
