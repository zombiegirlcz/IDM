package iw6;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserAvatarImage f168972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f168973b;

    public g(TextClause titleClause, UserAvatarImage avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f168972a = avatar;
        this.f168973b = titleClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f168972a.equals(gVar.f168972a) && this.f168973b.equals(gVar.f168973b);
    }

    public final int hashCode() {
        return this.f168973b.hashCode() + (this.f168972a.hashCode() * 31);
    }
}
