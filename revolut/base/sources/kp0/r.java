package kp0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Media f188065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color.Solid f188066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.d0 f188067c;

    public r(Media video, Color.Solid solid, aw0.d0 d0Var) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f188065a = video;
        this.f188066b = solid;
        this.f188067c = d0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f188065a.equals(rVar.f188065a) && this.f188066b.equals(rVar.f188066b) && this.f188067c.equals(rVar.f188067c);
    }

    public final int hashCode() {
        return this.f188067c.hashCode() + j6.a.b(this.f188066b.f51464b, this.f188065a.hashCode() * 31, 31);
    }
}
