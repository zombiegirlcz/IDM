package fr8;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.AvatarByUserIdImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f137421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f137422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarByUserIdImage f137423c;
    public final LayeredImage d;

    public m(TextClause title, TextLocalisedClause subtitle, AvatarByUserIdImage endIconImage, LayeredImage endIconImageBadge) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(endIconImage, "endIconImage");
        Intrinsics.checkNotNullParameter(endIconImageBadge, "endIconImageBadge");
        this.f137421a = title;
        this.f137422b = subtitle;
        this.f137423c = endIconImage;
        this.d = endIconImageBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f137421a.equals(mVar.f137421a) && this.f137422b.equals(mVar.f137422b) && this.f137423c.equals(mVar.f137423c) && this.d.equals(mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f137423c.hashCode() + t61.a.a(this.f137421a.hashCode() * 31, 31, this.f137422b)) * 31);
    }
}
