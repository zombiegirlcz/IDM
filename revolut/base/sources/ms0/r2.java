package ms0;

import android.os.Parcelable;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.video.Video;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f208393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f208394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Video f208395c;
    public final TagViewData d;
    public final Parcelable e;

    public r2(Clause title, Clause subtitle, Video background, TagViewData tagViewData, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f208393a = title;
        this.f208394b = subtitle;
        this.f208395c = background;
        this.d = tagViewData;
        this.e = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f208393a, r2Var.f208393a) && Intrinsics.f(this.f208394b, r2Var.f208394b) && Intrinsics.f(this.f208395c, r2Var.f208395c) && Intrinsics.f(this.d, r2Var.d) && Intrinsics.f(this.e, r2Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f208395c.hashCode() + p.a.a(this.f208393a.hashCode() * 31, 31, this.f208394b)) * 31;
        TagViewData tagViewData = this.d;
        int iHashCode2 = (iHashCode + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
        Parcelable parcelable = this.e;
        return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }
}
