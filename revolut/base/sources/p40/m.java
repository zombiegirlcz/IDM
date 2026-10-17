package p40;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kw0.g f232785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f232786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f232787c;
    public final List d;

    public m(kw0.g photoHeaderModel, AnimatedBackgroundType animatedBackgroundType, ArrayList items, List overflowMenuItems) {
        Intrinsics.checkNotNullParameter(photoHeaderModel, "photoHeaderModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(overflowMenuItems, "overflowMenuItems");
        this.f232785a = photoHeaderModel;
        this.f232786b = animatedBackgroundType;
        this.f232787c = items;
        this.d = overflowMenuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f232787c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f232785a.equals(mVar.f232785a) && Intrinsics.f(this.f232786b, mVar.f232786b) && this.f232787c.equals(mVar.f232787c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f232785a.hashCode() * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f232786b;
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f232787c, (iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode())) * 31, 31);
    }
}
