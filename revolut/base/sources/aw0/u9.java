package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel.Default f10567c;

    public u9(Clause title, Clause subtitle, AvatarModel.Default avatarModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(avatarModel, "avatarModel");
        this.f10565a = title;
        this.f10566b = subtitle;
        this.f10567c = avatarModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj2;
        return this.f10565a.equals(u9Var.f10565a) && this.f10566b.equals(u9Var.f10566b) && this.f10567c.equals(u9Var.f10567c);
    }

    public final int hashCode() {
        return this.f10567c.hashCode() + p.a.b(this.f10565a.hashCode() * 31, 31, this.f10566b);
    }
}
