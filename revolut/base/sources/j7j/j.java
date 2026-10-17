package j7j;

import cli.p;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContext f171934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f171935b;

    public j(AnalyticsContext analyticsContext, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171934a = analyticsContext;
        this.f171935b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f171935b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f171934a.equals(jVar.f171934a) && this.f171935b.equals(jVar.f171935b);
    }

    public final int hashCode() {
        return this.f171935b.hashCode() + (AnalyticsContext.a(this.f171934a.f50296a) * 31);
    }
}
