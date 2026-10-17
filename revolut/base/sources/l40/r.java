package l40;

import com.revolut.chat.domain.model.ChatMode;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatMode f192021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f192022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f192023c;
    public final String d;

    public r(ChatMode chatMode, c0 feedType, UUID uuid, String str) {
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f192021a = chatMode;
        this.f192022b = feedType;
        this.f192023c = uuid;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f192021a, rVar.f192021a) && this.f192022b == rVar.f192022b && Intrinsics.f(this.f192023c, rVar.f192023c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f192022b.hashCode() + (this.f192021a.hashCode() * 31)) * 31;
        UUID uuid = this.f192023c;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
