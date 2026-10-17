package v3e;

import com.revolut.feature.stories.models.ButtonAction;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.models.StoryPage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements b {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f285902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f285903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wli.x f285904c;

    public m(d state, ln.a navigationDispatcher, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f285902a = state;
        this.f285903b = navigationDispatcher;
        this.f285904c = deeplinkHandler;
    }

    @Override // v3e.b
    public final efm.b C1(StoryPage storyPage, StoriesModel story) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        Intrinsics.checkNotNullParameter(story, "story");
        boolean z = storyPage instanceof StoryPage.WithSticker;
        ButtonAction.NoAction noAction = ButtonAction.NoAction.f88754a;
        ln.a aVar = this.f285903b;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            ButtonAction buttonAction = ((StoryPage.WithSticker) storyPage).f88837l;
            if (buttonAction instanceof ButtonAction.Deeplink) {
                return E1(((ButtonAction.Deeplink) buttonAction).f88752a);
            }
            if (buttonAction instanceof ButtonAction.NavigationCommand) {
                return aVar.a(((ButtonAction.NavigationCommand) buttonAction).f88753a);
            }
            if (!Intrinsics.f(buttonAction, noAction) && buttonAction != null) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(storyPage instanceof StoryPage.Metadata)) {
            super.C1(storyPage, story);
            return mVar;
        }
        ButtonAction buttonAction2 = ((StoryPage.Metadata) storyPage).f88799g;
        if (buttonAction2 instanceof ButtonAction.Deeplink) {
            return E1(((ButtonAction.Deeplink) buttonAction2).f88752a);
        }
        if (buttonAction2 instanceof ButtonAction.NavigationCommand) {
            return aVar.a(((ButtonAction.NavigationCommand) buttonAction2).f88753a);
        }
        if (!Intrinsics.f(buttonAction2, noAction)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // v3e.b
    public final efm.b E1(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return pd.b.n(p0.f264003c, new v06.i(this, deeplink, null, 6));
    }

    @Override // v3e.b
    public final efm.b I2(StoryPage storyPage, StoriesModel story) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        Intrinsics.checkNotNullParameter(story, "story");
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // v3e.b
    public final efm.b M2(StoryPage storyPage) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // v3e.b
    public final efm.b V2() {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // v3e.b
    public final efm.d0 W0() {
        efm.d0 d0VarFirstOrError = this.f285902a.S().c(te0.s.f270018a).firstOrError();
        v20.t tVar = new v20.t(new v2g.i(7), 28);
        d0VarFirstOrError.getClass();
        ufm.f fVar = new ufm.f(d0VarFirstOrError, tVar, 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }

    @Override // v3e.b
    public final efm.b m2(StoryPage storyPage, StoriesModel story) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        Intrinsics.checkNotNullParameter(story, "story");
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
