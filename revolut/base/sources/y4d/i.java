package y4d;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f310882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f310883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f310884c;
    public final AnalyticsProduct.Retail d;

    public i(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonText, AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f310882a = title;
        this.f310883b = description;
        this.f310884c = buttonText;
        this.d = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f310882a.equals(iVar.f310882a) && this.f310883b.equals(iVar.f310883b) && this.f310884c.equals(iVar.f310884c) && this.d.equals(iVar.d);
    }

    public final int hashCode() {
        return this.d.f50300a.hashCode() + t61.a.a(t61.a.a(this.f310882a.hashCode() * 31, 31, this.f310883b), 31, this.f310884c);
    }
}
