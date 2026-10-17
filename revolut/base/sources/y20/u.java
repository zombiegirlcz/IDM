package y20;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f310548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f310549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f310550c;

    public u(Map chatId, Map feedId, Map feedType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f310548a = chatId;
        this.f310549b = feedId;
        this.f310550c = feedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f310548a, uVar.f310548a) && Intrinsics.f(this.f310549b, uVar.f310549b) && Intrinsics.f(this.f310550c, uVar.f310550c);
    }

    public final int hashCode() {
        return this.f310550c.hashCode() + p.a.e(this.f310548a.hashCode() * 31, 31, this.f310549b);
    }
}
