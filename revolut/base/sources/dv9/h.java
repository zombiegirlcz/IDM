package dv9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f118069c;
    public final String d;
    public final boolean e;
    public final List f;

    public h(String parentMessageId, String relatedEntityId, t relatedEntityType, String relatedChatId, boolean z, List reactions) {
        Intrinsics.checkNotNullParameter(parentMessageId, "parentMessageId");
        Intrinsics.checkNotNullParameter(relatedEntityId, "relatedEntityId");
        Intrinsics.checkNotNullParameter(relatedEntityType, "relatedEntityType");
        Intrinsics.checkNotNullParameter(relatedChatId, "relatedChatId");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        this.f118067a = parentMessageId;
        this.f118068b = relatedEntityId;
        this.f118069c = relatedEntityType;
        this.d = relatedChatId;
        this.e = z;
        this.f = reactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f118067a, hVar.f118067a) && Intrinsics.f(this.f118068b, hVar.f118068b) && this.f118069c == hVar.f118069c && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(p.a.c((this.f118069c.hashCode() + p.a.c(this.f118067a.hashCode() * 31, 31, this.f118068b)) * 31, 31, this.d), 31, this.e);
    }
}
