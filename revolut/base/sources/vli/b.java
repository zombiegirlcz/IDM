package vli;

import android.content.Context;
import com.revolut.feature.cms.stories.api.CmsStoriesApi$Toggles$CmsStories;
import com.revolut.feature.cms.stories.api.navigation.CmsStoriesDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements jf0.d, q06.k {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f290449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b80.c f290450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f290451c;
    public final z70.a d;

    public b(sri.m navigator, b80.c networkStateRepository, gte.a featureToggleInteractor, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f290449a = navigator;
        this.f290450b = networkStateRepository;
        this.f290451c = featureToggleInteractor;
        this.d = contextProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        if (y.D(cVar, "deeplink", 1, "stories") && Intrinsics.f(cVar.d.get("version"), "2")) {
            return ((Intrinsics.f(cVar.e(2), "v2") ? cVar.e(3) : cVar.e(2)).length() == 0 || this.f290451c.a(CmsStoriesApi$Toggles$CmsStories.f65935c)) ? false : true;
        }
        return false;
    }

    public final FeatureCommand b(jf0.c cVar) {
        if (!this.f290450b.b()) {
            return vhi.c.c(CmsStoriesDestination.OfflineDialog.f65939a, yhi.b.BOTTOM_DIALOG, null, false, 12);
        }
        CmsStoriesDestination.Companion companion = CmsStoriesDestination.INSTANCE;
        Context context = this.d.getContext();
        String managedCampaignReference = Intrinsics.f(cVar.e(2), "v2") ? cVar.e(3) : cVar.e(2);
        Map queryParameters = r0.l("version", cVar.d);
        companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(managedCampaignReference, "managedCampaignReference");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        fj3.f.Companion.getClass();
        fj3.f theme = fj3.e.a(context) ? fj3.f.DARK : fj3.f.LIGHT;
        Intrinsics.checkNotNullParameter(managedCampaignReference, "managedCampaignReference");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CmsStoriesDestination.Story(managedCampaignReference, theme, queryParameters), false, (Integer) null, 0, 61));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(b(cVar)), new q06.b(ibb.c.f160140a, null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 17), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
