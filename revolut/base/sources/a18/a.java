package a18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x08.i f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FeedFilter f558b;

    public a(x08.i feedState, FeedFilter feedFilter) {
        Intrinsics.checkNotNullParameter(feedState, "feedState");
        Intrinsics.checkNotNullParameter(feedFilter, "feedFilter");
        this.f557a = feedState;
        this.f558b = feedFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f557a, aVar.f557a) && Intrinsics.f(this.f558b, aVar.f558b);
    }

    public final int hashCode() {
        return this.f558b.hashCode() + (this.f557a.hashCode() * 31);
    }
}
