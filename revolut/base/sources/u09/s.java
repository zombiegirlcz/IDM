package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276155a;

    public s(String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        t tVar = t.VIDEO;
        this.f276155a = videoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f276155a, ((s) obj2).f276155a);
    }

    public final int hashCode() {
        return this.f276155a.hashCode();
    }
}
