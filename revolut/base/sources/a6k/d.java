package a6k;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import cu8.r0;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f1705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f1706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rq9.a f1707c;
    public final c9e.c d;

    public d(f01.c uiKitResources, r0 kycTransformer, o chooserCommandFactory, rq9.a groupBillsNaviCommandProvider, c9e.c subscriptionNavigationProvider) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        Intrinsics.checkNotNullParameter(chooserCommandFactory, "chooserCommandFactory");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        this.f1705a = uiKitResources;
        this.f1706b = kycTransformer;
        this.f1707c = groupBillsNaviCommandProvider;
        this.d = subscriptionNavigationProvider;
    }

    public static ufm.b a(FeatureConfig featureConfig) {
        ufm.b bVarM = d0.m(new FeatureCommand(featureConfig));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
