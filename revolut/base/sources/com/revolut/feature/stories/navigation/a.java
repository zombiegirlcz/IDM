package com.revolut.feature.stories.navigation;

import android.content.Context;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.stories.StoriesContract$Configuration;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.navigation.StoriesFeatureConfig;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import v3e.i;
import z3e.c;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f88857a;

    public a(c storiesInteractor) {
        Intrinsics.checkNotNullParameter(storiesInteractor, "storiesInteractor");
        this.f88857a = storiesInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof StoriesFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        StoriesFeatureConfig config = (StoriesFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        ActivityAnimation.System system = config.getE() ? new ActivityAnimation.System(Integer.valueOf(R$anim.fade_in), Integer.valueOf(R$anim.no_animation)) : null;
        if (config instanceof StoriesFeatureConfig.Tutorial) {
            StoriesFeatureConfig.Tutorial tutorial = (StoriesFeatureConfig.Tutorial) config;
            StoriesModel storiesModel = tutorial.f88854a;
            String storyKey = storiesModel.f88785b;
            Intrinsics.checkNotNullParameter(storyKey, "storyKey");
            if (!((Boolean) this.f88857a.f319258a.v0(Boolean.FALSE, j6.a.q("STORY_KEY_SHOWN_", storyKey), Boolean.TYPE)).booleanValue()) {
                i.Companion.getClass();
                navigator.c(new ActivityNavigateCommand(v3e.a.f285876b, new StoriesContract$Configuration(u.c(storiesModel), tutorial.f88855b, null, tutorial.f88856c, tutorial.d, null, true, false, tutorial.f, null), null, null, 0, null, null, null, system, false, 764));
                return;
            }
            NaviCommand naviCommand = tutorial.f88855b;
            if (naviCommand == null) {
                naviCommand = tutorial.f88856c;
            }
            if (naviCommand != null) {
                navigator.c(naviCommand);
                return;
            }
            return;
        }
        if (!(config instanceof StoriesFeatureConfig.Story)) {
            throw new NoWhenBranchMatchedException();
        }
        i.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = v3e.a.f285876b;
        StoriesFeatureConfig.Story story = (StoriesFeatureConfig.Story) config;
        NaviCommand naviCommand2 = story.d;
        AnalyticsProduct analyticsProduct = story.f88852j;
        NaviCommand activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, new StoriesContract$Configuration(story.f88847a, story.f88848b, story.f88849c, naviCommand2, story.e, story.f, story.f88850g, story.f88851h, analyticsProduct, story.k), null, null, 0, null, null, null, system, false, 764);
        if (story.i) {
            activityNavigateCommand = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, FinishCommand.Mode.FinishAffinity.f98645a, 3), activityNavigateCommand);
        }
        navigator.c(activityNavigateCommand);
    }
}
