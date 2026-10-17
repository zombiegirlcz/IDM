package nza;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesActivity;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.remote_stories.models.keys.RemoteStoriesKey;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.feature.stories.navigation.StoriesFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof RemoteStoriesFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        int i;
        Parcelable id10;
        RemoteStoriesFeatureConfig config = (RemoteStoriesFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        ExplicitActivityDestination explicitActivityDestination = new ExplicitActivityDestination(RemoteStoriesActivity.class);
        int f82008j = config.getF82008j();
        if (config instanceof RemoteStoriesFeatureConfig.Deeplink) {
            RemoteStoriesFeatureConfig.Deeplink deeplink = (RemoteStoriesFeatureConfig.Deeplink) config;
            id10 = new RemoteStoriesContract$Config.Deeplink(deeplink.f81991a, deeplink.f81993c, deeplink.d, deeplink.e, deeplink.f, deeplink.f81995h, 32);
            i = f82008j;
        } else if (config instanceof RemoteStoriesFeatureConfig.Key) {
            RemoteStoriesFeatureConfig.Key key = (RemoteStoriesFeatureConfig.Key) config;
            RemoteStoriesKey remoteStoriesKey = key.f82003a;
            Map map = key.f82004b;
            NaviCommand naviCommand = key.f;
            NaviCommand naviCommand2 = key.f82005c;
            ModalFragmentNavigateCommand modalFragmentNavigateCommand = key.d;
            sza.a aVar = key.e;
            RemoteStoryModelParams remoteStoryModelParams = key.f82006g;
            boolean z = key.f82007h;
            boolean z3 = key.i;
            int i2 = key.f82008j;
            AnalyticsProduct analyticsProduct = key.f82009l;
            i = f82008j;
            RemoteStoriesFeatureConfig.AnalyticsData analyticsData = key.f82010m;
            id10 = new RemoteStoriesContract$Config.Key(remoteStoriesKey, map, naviCommand2, modalFragmentNavigateCommand, aVar, naviCommand, remoteStoryModelParams, z, z3, i2, analyticsProduct, new StoriesFeatureConfig.AnalyticsData(analyticsData != null ? analyticsData.getF81990a() : null));
        } else {
            i = f82008j;
            if (!(config instanceof RemoteStoriesFeatureConfig.Id)) {
                throw new NoWhenBranchMatchedException();
            }
            RemoteStoriesFeatureConfig.Id id11 = (RemoteStoriesFeatureConfig.Id) config;
            String f81996a = id11.getF81996a();
            boolean e = id11.getE();
            id10 = new RemoteStoriesContract$Config.Id(f81996a, id11.J(), id11.getF81998c(), id11.getD(), id11.getF(), id11.getF81999g(), id11.getF82000h(), id11.getI(), id11.getF82008j(), id11.getF82002l(), e);
        }
        ActivityNavigateCommand activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, id10, null, Integer.valueOf(i), 0, null, null, null, null, false, 1012);
        if (config.getK()) {
            activityNavigateCommand = com.revolut.retail.core.navigation.a.a(activityNavigateCommand);
        }
        navigator.c(activityNavigateCommand);
    }
}
