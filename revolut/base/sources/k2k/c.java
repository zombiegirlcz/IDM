package k2k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f180610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f180611b;

    public c(TextLocalisedClause planName, dj0.d planFee) {
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(planFee, "planFee");
        this.f180610a = planName;
        this.f180611b = planFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f180610a.equals(cVar.f180610a) && this.f180611b.equals(cVar.f180611b);
    }

    public final int hashCode() {
        return this.f180611b.hashCode() + (this.f180610a.hashCode() * 31);
    }
}
