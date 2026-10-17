package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f318570c;
    public final u0 d;

    public v0(Links links, hel.b context, Instant recommendationTimestamp, u0 suggestionType) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recommendationTimestamp, "recommendationTimestamp");
        Intrinsics.checkNotNullParameter(suggestionType, "suggestionType");
        this.f318568a = links;
        this.f318569b = context;
        this.f318570c = recommendationTimestamp;
        this.d = suggestionType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f318568a, v0Var.f318568a) && this.f318569b == v0Var.f318569b && Intrinsics.f(this.f318570c, v0Var.f318570c) && this.d == v0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.c((this.f318569b.hashCode() + (this.f318568a.hashCode() * 31)) * 31, 31, this.f318570c);
    }
}
