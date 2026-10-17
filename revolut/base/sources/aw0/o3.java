package aw0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f10451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarModel f10452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.h f10453c;

    public o3(TextClause label, AvatarModel.Default r3, yy0.h hVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f10451a = label;
        this.f10452b = r3;
        this.f10453c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return this.f10451a.equals(o3Var.f10451a) && Intrinsics.f(this.f10452b, o3Var.f10452b) && this.f10453c.equals(o3Var.f10453c);
    }

    public final int hashCode() {
        int iHashCode = this.f10451a.hashCode() * 31;
        AvatarModel avatarModel = this.f10452b;
        return Boolean.hashCode(true) + ((this.f10453c.hashCode() + ((iHashCode + (avatarModel == null ? 0 : avatarModel.hashCode())) * 31)) * 31);
    }
}
