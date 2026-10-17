package iv9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168798c;
    public final String d;
    public final boolean e;
    public final List f;

    public m(String parentMessageId, String relatedEntityId, List reactions, String relatedEntityType, String chatId, boolean z) {
        Intrinsics.checkNotNullParameter(parentMessageId, "parentMessageId");
        Intrinsics.checkNotNullParameter(relatedEntityId, "relatedEntityId");
        Intrinsics.checkNotNullParameter(relatedEntityType, "relatedEntityType");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(reactions, "reactions");
        this.f168796a = parentMessageId;
        this.f168797b = relatedEntityId;
        this.f168798c = relatedEntityType;
        this.d = chatId;
        this.e = z;
        this.f = reactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f168796a, mVar.f168796a) && Intrinsics.f(this.f168797b, mVar.f168797b) && Intrinsics.f(this.f168798c, mVar.f168798c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(this.f168796a.hashCode() * 31, 31, this.f168797b), 31, this.f168798c), 31, this.d), 31, this.e);
    }
}
