package au0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f9319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarModel f9320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TagViewData f9321c;

    public q0(AvatarModel.Default start, AvatarModel end2, TagViewData tag2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f9319a = start;
        this.f9320b = end2;
        this.f9321c = tag2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f9319a.equals(q0Var.f9319a) && this.f9320b.equals(q0Var.f9320b) && this.f9321c.equals(q0Var.f9321c);
    }

    public final int hashCode() {
        return this.f9321c.hashCode() + ((this.f9320b.hashCode() + (this.f9319a.hashCode() * 31)) * 31);
    }
}
