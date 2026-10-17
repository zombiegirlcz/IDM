package ise;

import au0.u0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends com.revolut.feature.three_ds_verification.impl.ui.sceen.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f168208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarModel.TimeProgress f168209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.k f168210c;
    public final u0 d;

    public k0(TextLocalisedClause toolbarTitle, AvatarModel.TimeProgress avatar, aw0.k label, u0 page) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(page, "page");
        this.f168208a = toolbarTitle;
        this.f168209b = avatar;
        this.f168210c = label;
        this.d = page;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f168208a.equals(k0Var.f168208a) && this.f168209b.equals(k0Var.f168209b) && this.f168210c.equals(k0Var.f168210c) && this.d.equals(k0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f168210c.hashCode() + ((this.f168209b.hashCode() + (this.f168208a.hashCode() * 31)) * 31)) * 31);
    }
}
