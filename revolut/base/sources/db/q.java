package db;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f112626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f112627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f112628c;
    public final UserAvatarImage d;

    public q(TextClause title, TextClause textClause, AccentCircleBadge accentCircleBadge, UserAvatarImage userAvatarImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f112626a = title;
        this.f112627b = textClause;
        this.f112628c = accentCircleBadge;
        this.d = userAvatarImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f112626a.equals(qVar.f112626a) && Intrinsics.f(this.f112627b, qVar.f112627b) && Intrinsics.f(this.f112628c, qVar.f112628c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f112626a.hashCode() * 31;
        Clause clause = this.f112627b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f112628c;
        int iHashCode3 = (iHashCode2 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
        UserAvatarImage userAvatarImage = this.d;
        return iHashCode3 + (userAvatarImage != null ? userAvatarImage.hashCode() : 0);
    }

    public final String toString() {
        return "Content(title=" + this.f112626a + ", subtitle=" + this.f112627b + ", cameraBadge=" + this.f112628c + ", image=" + this.d + ")";
    }
}
