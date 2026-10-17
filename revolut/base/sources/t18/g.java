package t18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FeedFilter f267216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f267217c;

    public g(List feedElementTypes, FeedFilter feedFilter, Instant instant) {
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(feedFilter, "feedFilter");
        this.f267215a = feedElementTypes;
        this.f267216b = feedFilter;
        this.f267217c = instant;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF71990a() {
        return 50;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f267215a, gVar.f267215a) && Intrinsics.f(this.f267216b, gVar.f267216b) && Intrinsics.f(this.f267217c, gVar.f267217c);
    }

    public final int hashCode() {
        int iHashCode = (this.f267216b.hashCode() + (this.f267215a.hashCode() * 31)) * 31;
        Instant instant = this.f267217c;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }
}
