package ymk;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f315039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f315040c;
    public final p d;

    public q(List items, AnalyticsContext analyticsContext, int i, p itemsTransparencyOffset) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemsTransparencyOffset, "itemsTransparencyOffset");
        this.f315038a = items;
        this.f315039b = analyticsContext;
        this.f315040c = i;
        this.d = itemsTransparencyOffset;
    }

    @Override // cli.p
    public final List c() {
        return this.f315038a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f315038a, qVar.f315038a) && Intrinsics.f(this.f315039b, qVar.f315039b) && this.f315040c == qVar.f315040c && this.d == qVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f315038a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f315039b;
        return this.d.hashCode() + j6.a.b(this.f315040c, (iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31);
    }
}
