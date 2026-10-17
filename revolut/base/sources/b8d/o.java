package b8d;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends com.revolut.feature.shared.help_centre.impl.faq.screens.article.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f13181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13182b;

    public o(UUID callRequestId, String str) {
        Intrinsics.checkNotNullParameter(callRequestId, "callRequestId");
        this.f13181a = callRequestId;
        this.f13182b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f13181a, oVar.f13181a) && Intrinsics.f(this.f13182b, oVar.f13182b);
    }

    public final int hashCode() {
        int iHashCode = this.f13181a.hashCode() * 31;
        String str = this.f13182b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
