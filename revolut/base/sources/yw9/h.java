package yw9;

import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserAvatarImage f317358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleBadgeModel f317359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f317360c;

    public h(UserAvatarImage userAvatarImage, AccentCircleBadge accentCircleBadge, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f317358a = userAvatarImage;
        this.f317359b = accentCircleBadge;
        this.f317360c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f317358a.equals(hVar.f317358a) && Intrinsics.f(this.f317359b, hVar.f317359b) && Intrinsics.f(this.f317360c, hVar.f317360c);
    }

    public final int hashCode() {
        int iHashCode = this.f317358a.hashCode() * 31;
        CircleBadgeModel circleBadgeModel = this.f317359b;
        return this.f317360c.hashCode() + ((iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31);
    }
}
