package vg7;

import cli.o;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import h30.l;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f288785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f288786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f288787c;
    public final TimeClause d;
    public final ResourceImage e;
    public final ResourceImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UrlImage f288788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f288789h;

    public f(TextClause cardTitle, UrlImage cardBackground, TextClause cardPayoutInto, TimeClause cardDate, ResourceImage cardIcon, ResourceImage cardRevolutLogo, UrlImage background, ArrayList actions) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(cardBackground, "cardBackground");
        Intrinsics.checkNotNullParameter(cardPayoutInto, "cardPayoutInto");
        Intrinsics.checkNotNullParameter(cardDate, "cardDate");
        Intrinsics.checkNotNullParameter(cardIcon, "cardIcon");
        Intrinsics.checkNotNullParameter(cardRevolutLogo, "cardRevolutLogo");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f288785a = cardTitle;
        this.f288786b = cardBackground;
        this.f288787c = cardPayoutInto;
        this.d = cardDate;
        this.e = cardIcon;
        this.f = cardRevolutLogo;
        this.f288788g = background;
        this.f288789h = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f288785a.equals(fVar.f288785a) && this.f288786b.equals(fVar.f288786b) && this.f288787c.equals(fVar.f288787c) && this.d.equals(fVar.d) && this.e.equals(fVar.e) && this.f.equals(fVar.f) && this.f288788g.equals(fVar.f288788g) && this.f288789h.equals(fVar.f288789h);
    }

    public final int hashCode() {
        return this.f288789h.hashCode() + v7.g(this.f288788g, org.bouncycastle.jcajce.provider.digest.a.b(this.f, org.bouncycastle.jcajce.provider.digest.a.b(this.e, l.d(this.d, v7.b(v7.g(this.f288786b, this.f288785a.hashCode() * 31, 31), 31, this.f288787c), 31), 31), 31), 31);
    }
}
