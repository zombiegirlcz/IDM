package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;
import tx0.q1;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel f59533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f59534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59535c;

    public j(AvatarModel avatar, q1 avatarVariant, boolean z) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(avatarVariant, "avatarVariant");
        this.f59533a = avatar;
        this.f59534b = avatarVariant;
        this.f59535c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f59533a, jVar.f59533a) && this.f59534b == jVar.f59534b && this.f59535c == jVar.f59535c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59535c) + ((this.f59534b.hashCode() + (this.f59533a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ j(AvatarModel avatarModel, q1 q1Var, int i) {
        this(avatarModel, (i & 2) != 0 ? q1.AVATAR_LARGE : q1Var, false);
    }
}
