package mxl;

import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlVideo f210260a;

    public b(UrlVideo urlVideo) {
        Intrinsics.checkNotNullParameter(urlVideo, "urlVideo");
        this.f210260a = urlVideo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f210260a, ((b) obj2).f210260a);
    }

    public final int hashCode() {
        return this.f210260a.hashCode();
    }
}
