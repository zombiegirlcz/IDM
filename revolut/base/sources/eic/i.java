package eic;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tx0.q1;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AvatarModel.Default f126472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f126473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f126474c;
    public final CompositeClause d;
    public final Clause e;

    public i(AvatarModel.Default logo, q1 avatarVariant, TextClause title, CompositeClause subtitle, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(avatarVariant, "avatarVariant");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f126472a = logo;
        this.f126473b = avatarVariant;
        this.f126474c = title;
        this.d = subtitle;
        this.e = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f126472a.equals(iVar.f126472a) && this.f126473b == iVar.f126473b && this.f126474c.equals(iVar.f126474c) && this.d.equals(iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = h30.l.c(this.d, v7.b((this.f126473b.hashCode() + (this.f126472a.hashCode() * 31)) * 31, 31, this.f126474c), 31);
        Clause clause = this.e;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
