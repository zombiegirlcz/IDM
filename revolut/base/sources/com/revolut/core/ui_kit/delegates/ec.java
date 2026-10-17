package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ec extends ProductSelectionDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Media f54108a;

    public ec(Media media) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f54108a = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ec) && Intrinsics.f(this.f54108a, ((ec) obj2).f54108a);
    }

    public final int hashCode() {
        return this.f54108a.hashCode();
    }
}
