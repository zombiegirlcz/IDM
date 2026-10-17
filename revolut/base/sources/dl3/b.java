package dl3;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.BadgeModel f115695a;

    public b(AvatarModel.BadgeModel badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f115695a = badge;
    }

    public final AvatarModel.BadgeModel a() {
        return this.f115695a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f115695a, ((b) obj2).f115695a);
    }

    public final int hashCode() {
        return this.f115695a.hashCode();
    }
}
