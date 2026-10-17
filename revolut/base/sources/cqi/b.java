package cqi;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f108124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f108125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f108126c;
    public final Image d;
    public final TextClause e;
    public final Parcelable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsContext f108127g;

    public b(TextClause title, Clause description, ResourceImage closeButtonImage, Image contentImage, TextClause primaryActionLabel, Parcelable parcelable, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        Intrinsics.checkNotNullParameter(contentImage, "contentImage");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        this.f108124a = title;
        this.f108125b = description;
        this.f108126c = closeButtonImage;
        this.d = contentImage;
        this.e = primaryActionLabel;
        this.f = parcelable;
        this.f108127g = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f108124a.equals(bVar.f108124a) && this.f108125b.equals(bVar.f108125b) && this.f108126c.equals(bVar.f108126c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.f108127g.equals(bVar.f108127g);
    }

    public final int hashCode() {
        return AnalyticsContext.a(this.f108127g.f50296a) + ((this.f.hashCode() + v7.b(a10.b.c(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f108126c, p.a.a(this.f108124a.hashCode() * 31, 961, this.f108125b), 31), 31), 961, this.e)) * 31);
    }
}
