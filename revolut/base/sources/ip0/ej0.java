package ip0;

import com.revolut.core.ui_kit.delegates.SwipeableCardVideoItemDelegate;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ej0 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlVideo f164113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0 f164114b;

    public ej0(UrlVideo video, dj0 subtitlesTrackSelection) {
        Intrinsics.checkNotNullParameter("VIDEO_ITEM_ID", "listId");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(subtitlesTrackSelection, "subtitlesTrackSelection");
        this.f164113a = video;
        this.f164114b = subtitlesTrackSelection;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SwipeableCardVideoItemDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51641a() {
        return "VIDEO_ITEM_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ej0)) {
            return false;
        }
        ej0 ej0Var = (ej0) obj2;
        return this.f164113a.equals(ej0Var.f164113a) && Intrinsics.f(this.f164114b, ej0Var.f164114b);
    }

    public final int hashCode() {
        return this.f164114b.hashCode() + ((this.f164113a.hashCode() - 307575171) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof ej0) {
            ej0 ej0Var = (ej0) oldItem;
            return new fj0(!ej0Var.f164113a.equals(this.f164113a), !Intrinsics.f(ej0Var.f164114b, this.f164114b));
        }
        super.z(oldItem);
        return null;
    }
}
