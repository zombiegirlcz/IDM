package kw0;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f190187a;

    public e(AvatarModel.Default avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.f190187a = avatar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f190187a.equals(((e) obj2).f190187a);
    }

    @Override // kw0.f
    public final NavBarWithContainerBackground getBackground() {
        return null;
    }

    public final int hashCode() {
        return this.f190187a.hashCode();
    }

    @Override // kw0.f
    public final AvatarModel v() {
        return this.f190187a;
    }
}
