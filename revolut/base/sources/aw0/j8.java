package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes19.dex */
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel.Default f10377c;

    public j8(Clause title, Clause clause, AvatarModel.Default r4) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10375a = title;
        this.f10376b = clause;
        this.f10377c = r4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj2;
        return Intrinsics.f(this.f10375a, j8Var.f10375a) && Intrinsics.f(this.f10376b, j8Var.f10376b) && Intrinsics.f(this.f10377c, j8Var.f10377c);
    }

    public final int hashCode() {
        int iHashCode = this.f10375a.hashCode() * 31;
        Clause clause = this.f10376b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        AvatarModel.Default r2 = this.f10377c;
        return (iHashCode2 + (r2 != null ? r2.hashCode() : 0)) * 31;
    }

    public /* synthetic */ j8(Clause clause, Clause clause2, Image image, Image image2, int i) {
        this(clause, clause2, image, (i & 8) != 0 ? null : image2);
    }

    public j8(Clause title, Clause clause, Image image, Image image2) {
        Intrinsics.checkNotNullParameter(title, "title");
        AvatarModel.Default r06 = null;
        if (image != null) {
            r06 = new AvatarModel.Default(image, null, null, null, image2 != null ? new AvatarModel.BadgeModel(new RawImageBadge(image2), com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG);
        }
        this(title, clause, r06);
    }
}
