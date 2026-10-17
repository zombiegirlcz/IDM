package itb;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f168357a;

    public a(AvatarModel.Default avatarModel) {
        Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
        this.f168357a = avatarModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f168357a, ((a) obj2).f168357a);
    }

    public final int hashCode() {
        return this.f168357a.hashCode();
    }
}
