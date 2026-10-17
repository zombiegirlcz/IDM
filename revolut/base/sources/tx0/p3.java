package tx0;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f275223a;

    public p3(AvatarModel.Default avatarModel) {
        Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
        this.f275223a = avatarModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p3) && this.f275223a.equals(((p3) obj2).f275223a);
    }

    public final int hashCode() {
        return this.f275223a.hashCode();
    }
}
