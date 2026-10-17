package iek;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends com.revolut.retail.feature.pod_nominees.impl.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f160754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserAvatarImage f160755b;

    public f(TextClause title, UserAvatarImage avatar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.f160754a = title;
        this.f160755b = avatar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f160754a.equals(fVar.f160754a) && this.f160755b.equals(fVar.f160755b);
    }

    public final int hashCode() {
        return this.f160755b.hashCode() + (this.f160754a.hashCode() * 31);
    }
}
