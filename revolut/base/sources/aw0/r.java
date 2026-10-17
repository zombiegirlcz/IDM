package aw0;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.SegmentedProgress f10499a;

    public r(AvatarModel.SegmentedProgress avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.f10499a = avatar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f10499a.equals(((r) obj2).f10499a);
    }

    public final int hashCode() {
        return this.f10499a.hashCode();
    }
}
