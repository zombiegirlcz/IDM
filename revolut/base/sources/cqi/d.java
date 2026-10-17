package cqi;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f108128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f108129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f108130c;
    public final Image d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f108131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f108132h;
    public final AnalyticsContext i;

    public d(Clause title, Clause description, ResourceImage closeButtonImage, Image contentImage, Clause primaryActionLabel, Clause secondaryActionLabel, Parcelable parcelable, c cVar, AnalyticsContext analyticsContext, int i) {
        parcelable = (i & 256) != 0 ? null : parcelable;
        cVar = (i & 512) != 0 ? c.VERTICAL : cVar;
        analyticsContext = (i & 1024) != 0 ? null : analyticsContext;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        Intrinsics.checkNotNullParameter(contentImage, "contentImage");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        Intrinsics.checkNotNullParameter(secondaryActionLabel, "secondaryActionLabel");
        this.f108128a = title;
        this.f108129b = description;
        this.f108130c = closeButtonImage;
        this.d = contentImage;
        this.e = primaryActionLabel;
        this.f = secondaryActionLabel;
        this.f108131g = parcelable;
        this.f108132h = cVar;
        this.i = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f108128a, dVar.f108128a) && Intrinsics.f(this.f108129b, dVar.f108129b) && Intrinsics.f(this.f108130c, dVar.f108130c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f108131g, dVar.f108131g) && this.f108132h == dVar.f108132h && Intrinsics.f(this.i, dVar.i);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(a10.b.c(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f108130c, p.a.a(this.f108128a.hashCode() * 31, 961, this.f108129b), 31), 31), 31, this.e), 961, this.f);
        Object obj2 = this.f108131g;
        int iHashCode = (iA + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        c cVar = this.f108132h;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.i;
        return iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
