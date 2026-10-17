package yw0;

import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends n14.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f317254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlVideo f317255b;

    public d(boolean z, UrlVideo video) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f317254a = z;
        this.f317255b = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f317254a == dVar.f317254a && this.f317255b.equals(dVar.f317255b);
    }

    public final int hashCode() {
        return this.f317255b.hashCode() + (Boolean.hashCode(this.f317254a) * 31);
    }

    @Override // n14.e
    public final boolean q() {
        return this.f317254a;
    }
}
