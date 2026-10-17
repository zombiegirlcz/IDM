package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ub implements ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlVideo f54827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb f54828b;

    public ub(UrlVideo media, zb variant) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f54827a = media;
        this.f54828b = variant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj2;
        return this.f54827a.equals(ubVar.f54827a) && this.f54828b == ubVar.f54828b;
    }

    public final int hashCode() {
        return this.f54828b.hashCode() + (this.f54827a.hashCode() * 31);
    }
}
