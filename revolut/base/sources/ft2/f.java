package ft2;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f137786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f137787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f137788c;
    public final LayeredImage d;
    public final ProgressStyle e;

    public f(TextClause title, CompositeClause compositeClause, Image avatar, LayeredImage avatarBadge, ProgressStyle progressStyle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(avatarBadge, "avatarBadge");
        this.f137786a = title;
        this.f137787b = compositeClause;
        this.f137788c = avatar;
        this.d = avatarBadge;
        this.e = progressStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f137786a.equals(fVar.f137786a) && this.f137787b.equals(fVar.f137787b) && this.f137788c.equals(fVar.f137788c) && this.d.equals(fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iE = l.e(this.d, p.a.b(l.c(this.f137787b, this.f137786a.hashCode() * 31, 31), 31, this.f137788c), 31);
        ProgressStyle progressStyle = this.e;
        return iE + (progressStyle == null ? 0 : progressStyle.hashCode());
    }
}
