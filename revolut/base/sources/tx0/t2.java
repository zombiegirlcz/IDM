package tx0;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f275246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275247b;

    public t2(AvatarModel.Default avatarModel, boolean z) {
        Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
        this.f275246a = avatarModel;
        this.f275247b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return Intrinsics.f(this.f275246a, t2Var.f275246a) && this.f275247b == t2Var.f275247b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275247b) + (this.f275246a.hashCode() * 31);
    }
}
