package bpl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.RevolutBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f17636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f17637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.l f17638c;
    public final RevolutBadge d;

    public g(TextClause title, Clause description, yy0.l avatar, RevolutBadge avatarBadge) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(avatarBadge, "avatarBadge");
        this.f17636a = title;
        this.f17637b = description;
        this.f17638c = avatar;
        this.d = avatarBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f17636a.equals(gVar.f17636a) && this.f17637b.equals(gVar.f17637b) && this.f17638c.equals(gVar.f17638c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f17638c.hashCode() + p.a.a(this.f17636a.hashCode() * 31, 31, this.f17637b)) * 31);
    }
}
