package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class je extends ReferralContactDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircleBadgeModel f54332a;

    public je(CircleBadgeModel badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f54332a = badge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof je) && Intrinsics.f(this.f54332a, ((je) obj2).f54332a);
    }

    public final int hashCode() {
        return this.f54332a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public je(Image image) {
        this(new RawImageBadge(image));
        Intrinsics.checkNotNullParameter(image, "image");
    }
}
