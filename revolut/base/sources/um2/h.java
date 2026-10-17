package um2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281196a;

    public h(List chats) {
        Intrinsics.checkNotNullParameter(chats, "chats");
        this.f281196a = chats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f281196a, ((h) obj2).f281196a);
    }

    public final int hashCode() {
        return this.f281196a.hashCode();
    }
}
