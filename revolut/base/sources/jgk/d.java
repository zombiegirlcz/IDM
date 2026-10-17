package jgk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f174068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f174069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f174070c;
    public final Clause d;
    public final ResourceImage e;
    public final CdnImage f;

    public d(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryActionLabel, TextLocalisedClause textLocalisedClause, ResourceImage closeButtonImage, CdnImage media) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        Intrinsics.checkNotNullParameter(media, "media");
        this.f174068a = title;
        this.f174069b = description;
        this.f174070c = primaryActionLabel;
        this.d = textLocalisedClause;
        this.e = closeButtonImage;
        this.f = media;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f174068a.equals(dVar.f174068a) && this.f174069b.equals(dVar.f174069b) && this.f174070c.equals(dVar.f174070c) && Intrinsics.f(this.d, dVar.d) && this.e.equals(dVar.e) && this.f.equals(dVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(this.f174068a.hashCode() * 31, 31, this.f174069b), 31, this.f174070c);
        Clause clause = this.d;
        return (this.f.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.e, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31)) * 31;
    }
}
