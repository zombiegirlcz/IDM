package nxa;

import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel f220514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au0.r0 f220515b;

    public q() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f220514a, qVar.f220514a) && this.f220515b == qVar.f220515b;
    }

    public final int hashCode() {
        AvatarModel avatarModel = this.f220514a;
        return this.f220515b.hashCode() + ((avatarModel == null ? 0 : avatarModel.hashCode()) * 31);
    }

    public q(AvatarModel.Default r2, au0.r0 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f220514a = r2;
        this.f220515b = style;
    }

    public /* synthetic */ q(int i) {
        this(null, au0.r0.DEFAULT);
    }
}
