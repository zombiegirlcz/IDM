package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class me extends RewardDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54477a;

    public me(Image image) {
        this.f54477a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof me) && Intrinsics.f(this.f54477a, ((me) obj2).f54477a);
    }

    public final int hashCode() {
        Image image = this.f54477a;
        if (image == null) {
            return 0;
        }
        return image.hashCode();
    }
}
