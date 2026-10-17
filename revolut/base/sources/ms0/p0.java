package ms0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f208360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarModel f208361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TagViewData f208362c;

    public p0(AvatarModel.Default start, AvatarModel end2, TagViewData tag2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f208360a = start;
        this.f208361b = end2;
        this.f208362c = tag2;
    }
}
