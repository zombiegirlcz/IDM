package mx0;

import android.content.Context;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.k;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircleProgressBar f209708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagView f209709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f209710c;
    public int d;
    public final com.revolut.core.ui_kit.internal.views.k e;

    public g1(CircleProgressBar progress, TagView tagView) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        this.f209708a = progress;
        this.f209709b = tagView;
        com.revolut.core.ui_kit.internal.views.k kVar = new com.revolut.core.ui_kit.internal.views.k();
        kVar.f57226l = new f1(this);
        this.e = kVar;
    }

    public final void a(int i) {
        k.a aVar = com.revolut.core.ui_kit.internal.views.k.Companion;
        int i2 = this.f209710c;
        aVar.getClass();
        int i3 = (i2 <= 0 || i >= i2 / 4) ? R$attr.uikit_colorWhite : R$attr.uikit_colorOrange;
        int i5 = this.d;
        CircleProgressBar circleProgressBar = this.f209708a;
        if (i3 != i5) {
            this.d = i3;
            Context context = circleProgressBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(i3, context);
            circleProgressBar.setStartColor(iS);
            circleProgressBar.setEndColor(iS);
        }
        circleProgressBar.setProgress(i);
    }

    public final void b(int i) {
        TagViewData.Companion companion = TagViewData.INSTANCE;
        TimeClause timeClause = new TimeClause(((long) i) * 1000, new TimeClause.Format.Duration(0), null, null, 12);
        AvatarModel.TimeProgress.INSTANCE.getClass();
        int i2 = AvatarModel.TimeProgress.f58040j;
        int i3 = AvatarModel.TimeProgress.k;
        companion.getClass();
        this.f209709b.setContent(TagViewData.Companion.b(i2, i3, timeClause, null));
    }
}
