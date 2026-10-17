package y20;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310506c;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f310504a, iVar.f310504a) && Intrinsics.f(this.f310505b, iVar.f310505b) && Intrinsics.f(this.f310506c, iVar.f310506c);
    }

    public final int hashCode() {
        return this.f310506c.hashCode() + p.a.d(this.f310504a.hashCode() * 31, 31, this.f310505b);
    }

    public i(List forChatId, List forFeedId, List forFeedType) {
        Intrinsics.checkNotNullParameter(forChatId, "forChatId");
        Intrinsics.checkNotNullParameter(forFeedId, "forFeedId");
        Intrinsics.checkNotNullParameter(forFeedType, "forFeedType");
        this.f310504a = forChatId;
        this.f310505b = forFeedId;
        this.f310506c = forFeedType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(int i) {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this(f0Var, f0Var, f0Var);
    }
}
