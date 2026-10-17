package lj3;

import aii.e;
import aii.g;
import aii.p;
import com.revolut.feature.cms.stories.api.CmsStoriesApi$Toggles$CmsStories;
import com.revolut.feature.cms.stories.api.navigation.CmsStoriesControllerDescriptor;
import com.revolut.feature.cms.stories.api.navigation.CmsStoriesDestination;
import com.revolut.feature.cms.stories.impl.ui.offline.CmsStoriesOfflineDialogScreen;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreen;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p, nte.a {
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof CmsStoriesControllerDescriptor)) {
            return null;
        }
        CmsStoriesControllerDescriptor cmsStoriesControllerDescriptor = (CmsStoriesControllerDescriptor) descriptor;
        return cmsStoriesControllerDescriptor.a(new CmsStoriesScreen(new CmsStoriesScreenContract$InputData(cmsStoriesControllerDescriptor.f65936a, cmsStoriesControllerDescriptor.f65937b, cmsStoriesControllerDescriptor.f65938c, cmsStoriesControllerDescriptor.d, cmsStoriesControllerDescriptor.e)));
    }

    @Override // nte.a
    public final List e() {
        return u.c(CmsStoriesApi$Toggles$CmsStories.f65935c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CmsStoriesDestination.Story) {
            CmsStoriesDestination.Story story = (CmsStoriesDestination.Story) destination;
            return new CmsStoriesScreen(new CmsStoriesScreenContract$InputData(story.f65940a, story.f65941b, story.f65942c, false, false));
        }
        if (destination instanceof CmsStoriesDestination.OfflineDialog) {
            return new CmsStoriesOfflineDialogScreen();
        }
        return null;
    }
}
