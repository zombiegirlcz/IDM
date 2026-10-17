package bd2;

import com.revolut.feature.apm.services.ideal.api.navigation.IDealFeatureConfig;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.apm.services.ideal.impl.data.network.IDealService;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements ad2.a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDealService f14520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q06.d f14521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f14522c;

    public e(IDealService iDealService, q06.d deeplinkParser, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(iDealService, "iDealService");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f14520a = iDealService;
        this.f14521b = deeplinkParser;
        this.f14522c = uriHelper;
    }

    public static ufm.b a(IDealFlowDestination.StartType startType) {
        ufm.b bVarM = d0.m(new IDealFeatureConfig(new IDealFlowDestination(startType)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
