package v3e;

import com.revolut.core.ui_kit.storiesdelegates.StoryColours;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.stories.models.ColourScheme;
import com.revolut.feature.stories.models.PageBackground;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes13.dex */
public final class k {
    public static LargeActionButton.ButtonStyle a(a4e.a aVar, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        int i = aVar == null ? -1 : j.f285900b[aVar.ordinal()];
        if (i == -1) {
            return defaultFilledButton;
        }
        if (i == 1) {
            return LargeActionButton.ButtonStyle.d;
        }
        if (i == 2) {
            return LargeActionButton.ButtonStyle.f58727c;
        }
        if (i == 3) {
            return LargeActionButton.ButtonStyle.f58725a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ LargeActionButton.ButtonStyle b(k kVar, a4e.a aVar) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.d;
        kVar.getClass();
        return a(aVar, defaultFilledButton);
    }

    public static bx0.c0 c(PageBackground pageBackground) {
        if (pageBackground instanceof PageBackground.SolidColor) {
            PageBackground.SolidColor solidColor = (PageBackground.SolidColor) pageBackground;
            return new bx0.a0(solidColor.f88778a, solidColor.f88779b, solidColor.f88780c);
        }
        if (pageBackground instanceof PageBackground.ImageSource) {
            PageBackground.ImageSource imageSource = (PageBackground.ImageSource) pageBackground;
            return new bx0.z(imageSource.f88776b, imageSource.f88775a, imageSource.f88777c);
        }
        if (!(pageBackground instanceof PageBackground.VideoSource)) {
            throw new NoWhenBranchMatchedException();
        }
        PageBackground.VideoSource videoSource = (PageBackground.VideoSource) pageBackground;
        return new bx0.b0(videoSource.f88781a, videoSource.f88782b, videoSource.f88783c, videoSource.d, videoSource.e);
    }

    public static StoryColours d(ColourScheme colourScheme) {
        return new StoryColours(colourScheme.f88758a, colourScheme.f88759b, colourScheme.f88760c, colourScheme.d, colourScheme.e, colourScheme.f, colourScheme.f88761g, colourScheme.f88762h, colourScheme.i, colourScheme.f88763j, colourScheme.k);
    }

    public static bx0.e e(a4e.b bVar) {
        int i = j.f285901c[bVar.ordinal()];
        if (i == 1) {
            return bx0.e.VERTICAL;
        }
        if (i == 2) {
            return bx0.e.HORIZONTAL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
