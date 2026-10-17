package v3e;

import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.models.StoryPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    default efm.b C1(StoryPage storyPage, StoriesModel story) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        Intrinsics.checkNotNullParameter(story, "story");
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    default efm.b E1(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    efm.b I2(StoryPage storyPage, StoriesModel storiesModel);

    efm.b M2(StoryPage storyPage);

    efm.b V2();

    efm.d0 W0();

    efm.b m2(StoryPage storyPage, StoriesModel storiesModel);
}
