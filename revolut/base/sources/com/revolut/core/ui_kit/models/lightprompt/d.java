package com.revolut.core.ui_kit.models.lightprompt;

import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlVideo f58113a;

    public d(UrlVideo video) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f58113a = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f58113a.equals(((d) obj2).f58113a);
    }

    public final int hashCode() {
        return this.f58113a.hashCode();
    }
}
