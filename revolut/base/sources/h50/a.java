package h50;

import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f149408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149410c;

    public a(UUID messageId, boolean z, List negativeTags) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(negativeTags, "negativeTags");
        this.f149408a = messageId;
        this.f149409b = z;
        this.f149410c = negativeTags;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f149408a, aVar.f149408a) && this.f149409b == aVar.f149409b && Intrinsics.f(this.f149410c, aVar.f149410c);
    }

    public final int hashCode() {
        return this.f149410c.hashCode() + j6.a.c(this.f149408a.hashCode() * 31, 31, this.f149409b);
    }
}
